package cn.merryyou.sso;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2018/1/27 0027.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
@RestController
@SpringBootApplication
//@EnableOAuth2Sso
public class SsoResourceApplication {
  @Value("${spring.application.name}")
  private String app ;
    public static void main(String[] args) {
        SpringApplication.run(SsoResourceApplication.class, args);
    }
    @GetMapping("/api/{id}")
    public String get(@PathVariable("id") String id) {
        System.out.println("id=" + id);
        return "hello resource";
    }

    @GetMapping("/hello")
    public String hello() {
      return "hello from + " + app;
    }
}
