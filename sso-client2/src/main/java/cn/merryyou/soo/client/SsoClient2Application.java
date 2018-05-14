package cn.merryyou.soo.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2017/12/26.
 *
 * @author zlf
 * @since 1.0
 */
@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class SsoClient2Application {
    @Value("${spring.application.name}")
    private String app;
    
    @GetMapping("/user")
    public Authentication user(Authentication user) {
        return user;
    }

    @GetMapping("/hello")
    public String hello() {
      return "hello from " + app;
    }

    public static void main(String[] args) {
        SpringApplication.run(SsoClient2Application.class, args);
    }
}
