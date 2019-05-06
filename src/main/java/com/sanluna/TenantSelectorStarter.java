package com.sanluna;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@SpringBootApplication
@EnableResourceServer
@Import({BeansAndConfigurations.class})
public class TenantSelectorStarter {

    public static void main(String[] args) {
        SpringApplication.run(TenantSelectorStarter.class, args
        );
    }

    @Configuration
    public class AuthorizationSecurityConfigurer extends ResourceServerConfigurerAdapter {

        @Override
        public void configure(HttpSecurity http) throws Exception {
            http
                    .cors().and()
                    .authorizeRequests()
                    .antMatchers(HttpMethod.GET, "/status/**", "/configs**").permitAll()
                    .anyRequest().authenticated();
        }
    }
}
