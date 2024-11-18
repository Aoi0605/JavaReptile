package com.aoi.javareptile.Controller;

import com.aoi.javareptile.Service.RentalCrawlerService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class StartupRunner implements ApplicationRunner {

    private final RentalCrawlerService rentalCrawlerService;

    public StartupRunner(RentalCrawlerService rentalCrawlerService) {
        this.rentalCrawlerService = rentalCrawlerService;
    }

    //設定啟動 SpringBoot 時啟動一次 run() 方法
    @Override
    public void run(ApplicationArguments args) throws Exception {
        rentalCrawlerService.fetchRentalData();
    }
}
