package org.std.spider;

import java.util.Timer;
import java.util.TimerTask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpiderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpiderApplication.class, args);
		// Spider spider=Spider.create(new CountryProcesser());
		// spider.addUrl("http://mm.httpcn.com/Mingli/Num/GuojiaCode.html");
		// spider.addPipeline(new CountryPipeline());
		// spider.thread(5);
		// spider.setExitWhenComplete(true);
		// spider.start();
		
//		Timer timer = new Timer();// 实例化Timer类
//		timer.schedule(new TimerTask() {
//			public void run() {
//				CountryProcesser.main(null);
//				this.cancel();
//				System.out.println("----cancel----");
//			}
//		}, 500);// 五百毫秒
	}
}
