package org.jzp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Hongyi Zheng
 * @date 2018/8/9
 */
@SpringBootApplication
public class GroupChatApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(GroupChatApplication.class);
        springApplication.run(args);
    }
}
