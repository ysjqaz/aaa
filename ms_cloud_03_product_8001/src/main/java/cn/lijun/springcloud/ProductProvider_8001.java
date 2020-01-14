package cn.lijun.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lijun
 * @date 2020/1/14 14:18
 */
@MapperScan("cn.lijun.springcloud.mapper")
@SpringBootApplication
public class ProductProvider_8001 {
    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_8001.class,args);
    }
}
