package com.sanluna.tenantselector;

import com.sanluna.model.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "configs", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class TenantSelectorController {

    @Value("${gwr.current-tenant}")
    public String tenant;
    @Value("${gwr.member.url}")
    public String memberUrl;
    @Value("${gwr.tenant.url}")
    public String tenantUrl;
    @Value("${gwr.auth.url}")
    public String authUrl;
    @Value("${gwr.product.url}")
    public String productUrl;

    @GetMapping
    public Info getConfigs() {
        System.out.println("sending config information... ");
        Info info = new Info();
        info
                .setTenant(tenant)
                .setMemberUrl(memberUrl)
                .setTenantUrl(tenantUrl)
                .setAuthUrl(authUrl)
                .setProductUrl(productUrl)
        ;
        return info;
    }

}
