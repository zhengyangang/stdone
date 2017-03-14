package org.std.spider;

import java.util.List;

import org.apache.http.util.TextUtils;
import org.std.spider.model.Country;
import org.std.spider.repository.CountryRepository;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;
import us.codecraft.webmagic.selector.Selectable;

public class NewCountryProcesser implements PageProcessor {

    private Site site = Site.me()
            .setDomain("www.ailvxing.com")
            .setSleepTime(100)
            .setUserAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36");
    ;

    public static final String list = "http://www.ailvxing.com/";

    @Override
    public void process(Page page) {
    	Selectable pageSel = page.getUrl();
    	Selectable regexSel = pageSel.regex(list);
        if (regexSel.match()) {
        	Html html = page.getHtml();
        	Selectable selable = html.xpath("//tbody//tr");
            List<Selectable> list=selable.nodes();
            for (Selectable s : list) {
            	if(s.regex("<tr>").match()){
            		Selectable tmpList = s.xpath("//td");
	                if(tmpList.nodes().size() != 7) {
	                	continue;
	                }
	                String name=s.xpath("//td[2]/text()").toString();
	                String ename=s.xpath("//td[3]/text()").toString();
	                String code2=s.xpath("//td[4]/text()").toString();
	                String code3=s.xpath("//td[5]/text()").toString();
	                String id=s.xpath("//td[6]/text()").toString();
	                try{
	                	Integer.valueOf(id);
	                }catch(Exception e) {
	                	//System.out.println("exception:" + id);
	                	continue;
	                }
	                String full=s.xpath("//td[7]/text()").toString();
	                Country country=new Country();
	                country.setCountryId(Integer.valueOf(id));
	                country.setName(name);
	                String[] ename_arr = ename.split(",");
	                if(ename_arr.length > 1) {
	                	ename = ename_arr[1] + " " + ename_arr[0];
	                	ename = ename.trim();
	                }
	                country.setEname(ename);
	                country.setDomainCode(code2);
	                country.setCountryCode(code3);
	                String [] arr = full.split("\\s+");
	                country.setNameFull(arr[0]);
	                String ename_full = "";
	                for(int zzz=1;zzz<arr.length;zzz++){
	                	ename_full += arr[zzz];
	                	if(zzz < arr.length -1){
	                		ename_full += " ";
	                	}
	                }
	                country.setEnameFull(ename_full);
	                page.putField("country"+id, country);
            	}
            }
        }
    }

    @Override
    public Site getSite() {
        return site;
    }

//    public static void main(String[] args) {
//        Spider spider=Spider.create(new CountryProcesser());
//        spider.addUrl("http://mm.httpcn.com/Mingli/Num/GuojiaCode.html");
//        spider.addPipeline(new CountryPipeline());
//        spider.thread(5);
//        spider.setExitWhenComplete(true);
//        spider.start();
//    }
    public static void main1(CountryRepository repo) {
        Spider spider=Spider.create(new NewCountryProcesser());
        spider.addUrl("http://www.ailvxing.com/info-103-22671-0.html");
        spider.addPipeline(new NewCountryPipeline(repo));
        spider.thread(5);
        spider.setExitWhenComplete(true);
        spider.start();
    }
}
