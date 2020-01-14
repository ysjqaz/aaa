package cn.lijun.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author lijun
 * @date 2020/1/14 14:52
 */
@Configuration
public class ConfigBean {
    //向容器添加RestTemplate组件  直接通过该组件可调用REST接口
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
