package org.std.spider;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.std.spider.model.Country;
import org.std.spider.repository.CountryRepository;

import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

public class CountryPipeline implements Pipeline {

	@Autowired
	private CountryRepository repository;

    public CountryPipeline(CountryRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
    public void process(ResultItems resultItems, Task task) {
        for (Map.Entry<String, Object> entry : resultItems.getAll().entrySet()) {
            if (entry.getKey().contains("country")) {
                Country country=(Country) entry.getValue();
                Country country_old = repository.findByName(country.getName());
                if (country_old != null) {//检查链接是否已存在
                	country_old.setTelephoneCode(country.getTelephoneCode());
                	country_old.setTimeZone(country.getTimeZone());
                    repository.save(country_old);
                }else{
                	System.out.println("没找到国家----" + country.getName()+","+country.getTelephoneCode()+","+country.getTimeZone());
                }
            }

        }
    }
}
