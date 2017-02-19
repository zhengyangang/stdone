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

    @Override
    public void process(ResultItems resultItems, Task task) {
        for (Map.Entry<String, Object> entry : resultItems.getAll().entrySet()) {
            if (entry.getKey().contains("country")) {
                Country country=(Country) entry.getValue();
                System.out.println(entry.getKey() + country.getName());
                if (repository.findByName(country.getName()) == null) {//检查链接是否已存在
                    //repository.save(news);
                	System.out.println(country.toString());
                }
            }

        }
    }
}
