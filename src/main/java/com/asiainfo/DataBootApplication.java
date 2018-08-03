package com.asiainfo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableTransactionManagement
@ServletComponentScan
@MapperScan("com.asiainfo.*.dao")
@SpringBootApplication
@EnableCaching
public class DataBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(DataBootApplication.class, args);
        System.out.println("ヾ(◍°∇°◍)ﾉﾞ    boot启动成功      ヾ(◍°∇°◍)ﾉﾞ\n" +
                " ______                    _    \n" +
                "|_   _ \\                  / |_   \n" +
                "  | |_) |   .--.    .--. `| |-'  \n" +
                "  |  __'. / .'`\\ \\/ .'`\\ \\| |  \n" +
                " _| |__) || \\__. || \\__. || |,  \n" +
                "|_______/  '.__.'  '.__.' \\__/  ");
    }
}
