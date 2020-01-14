package cn.lijun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author lijun
 * @date 2020/1/14 15:47
 */
@EnableEurekaServer   //表示一个Eureka Server 服务注册中心
@SpringBootApplication
public class Eureka_6001 {
    public static void main(String[] args) {
        SpringApplication.run(Eureka_6001.class,args);
    }
}
