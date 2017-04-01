package sddtc.oauth2.authserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sddtc on 2017/3/31.
 */
@SpringBootApplication
@EnableAuthorizationServer
@EnableResourceServer
@RestController
public class OAuth2AuthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OAuth2AuthServerApplication.class, args);
    }
}
