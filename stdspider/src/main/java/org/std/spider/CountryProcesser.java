package org.std.spider;

import java.util.List;

import org.apache.http.util.TextUtils;
import org.std.spider.model.Country;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;
import us.codecraft.webmagic.selector.Selectable;

public class CountryProcesser implements PageProcessor {

    private Site site = Site.me()
            .setDomain("mm.httpcn.com")
            .setSleepTime(100)
            .setUserAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36");
    ;

    public static final String list = "http://mm.httpcn.com/";

    @Override
    public void process(Page page) {
    	Selectable pageSel = page.getUrl();
    	Selectable regexSel = pageSel.regex(list);
        if (regexSel.match()) {
        	Html html = page.getHtml();
        	Selectable selable = html.xpath("//tbody[1]//tr");
            List<Selectable> list=selable.nodes();
            for (Selectable s : list) {
            	if(s.regex("<tr>").match()){
	                String ename=s.xpath("//td[1]/text()").toString();
	                if(TextUtils.isEmpty(ename)) {
	                	continue;
	                }
	                String name=s.xpath("//td[2]/text()").toString();
	                String ename_abbr=s.xpath("//td[3]/text()").toString();
	                String code=s.xpath("//td[4]/text()").toString();
	                String tz=s.xpath("//td[5]/text()").toString();
	                Country country=new Country();
	                country.setCountryId(Integer.valueOf(code));
	                country.setName(name);
	                country.setEname(ename);
	                country.setEnameAbbr(ename_abbr);
	                try{
	                	country.setTimeZone(Integer.valueOf(tz)*10+80);
	                }catch(Exception e) {
	                	double ftz = Double.parseDouble(tz);
	                	if(ftz < 0){
	                		ftz -= 0.2;
	                	}else {
	                		ftz += 0.2;
	                	}
	                	country.setTimeZone((int)(ftz*10) +80);
	                }
	                page.putField("country"+code, country);
            	}
            }
        }
    }

    @Override
    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {
        Spider spider=Spider.create(new CountryProcesser());
        spider.addUrl("http://mm.httpcn.com/Mingli/Num/GuojiaCode.html");
        spider.addPipeline(new CountryPipeline());
        spider.thread(5);
        spider.setExitWhenComplete(true);
        spider.start();
    }
}
