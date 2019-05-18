package com.sanluna.tenantselector;

import com.sanluna.commons.exceptions.NotFoundException;
import com.sanluna.model.FunctionsAllowed;
import com.sanluna.model.Info;
import com.sanluna.multitenancy.multitenancy.TenantContext;
import com.sanluna.service.FunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "configs", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class TenantSelectorController {

    @Autowired
    private FunctionService service;

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
    @Value("${gwr.product-campaign.url}")
    public String productCampaignUrl;
    @Value("${gwr.product-group.url}")
    public String productGroupUrl;
    @Value("${gwr.product-review.url}")
    public String productReviewUrl;

    @GetMapping()
    public Info getConfigs() {
        TenantContext.setCurrentTenant(tenant);
        System.out.println("sending config information... ");
        Info info = new Info();
        FunctionsAllowed func = null;
        try {
            func = service.fetchAll().get(0);
        } catch (NotFoundException e) {
            // create functions Allowed if doesn't exist
            func = new FunctionsAllowed();
            func.setBrowseMembers(true);
            func.setImportProducts(true);
            func = service.save(func);
        }
        info
                .setTenant(tenant)
                .setMemberUrl(memberUrl)
                .setTenantUrl(tenantUrl)
                .setAuthUrl(authUrl)
                .setProductUrl(productUrl)
                .setProductCampaignUrl(productCampaignUrl)
                .setProductGroupUrl(productGroupUrl)
                .setProductReviewUrl(productReviewUrl)
                .setFunctionsAllowed(func)
        ;
        return info;
    }

}
