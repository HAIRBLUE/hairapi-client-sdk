package com.hair.hairapiclientsdk;

import com.hair.hairapiclientsdk.client.HairApiClient;
import com.hair.hairapiclientsdk.model.User;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.print.attribute.standard.RequestingUserName;

@Configuration
@ConfigurationProperties("hairapi.client")
@Data
@ComponentScan
public class HairApiClientConfig {
    private String accessKey;
    private String secretKey;

    @Bean
    public HairApiClient hairApiClient() {
        return new HairApiClient(accessKey,secretKey);
    }
}
