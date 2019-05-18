package com.sanluna.model;

public class Info {

    private String tenant;
    private String memberUrl;
    private String tenantUrl;
    private String authUrl;
    private String productUrl;
    private String productCampaignUrl;
    private String productGroupUrl;
    private String productReviewUrl;

    private FunctionsAllowed functionsAllowed;

    public String getTenant() {
        return tenant;
    }

    public Info setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }

    public String getMemberUrl() {
        return memberUrl;
    }

    public Info setMemberUrl(String memberUrl) {
        this.memberUrl = memberUrl;
        return this;
    }

    public String getTenantUrl() {
        return tenantUrl;
    }

    public Info setTenantUrl(String tenantUrl) {
        this.tenantUrl = tenantUrl;
        return this;
    }

    public String getAuthUrl() {
        return authUrl;
    }

    public Info setAuthUrl(String authUrl) {
        this.authUrl = authUrl;
        return this;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public Info setProductUrl(String productUrl) {
        this.productUrl = productUrl;
        return this;
    }

    public String getProductCampaignUrl() {
        return productCampaignUrl;
    }

    public Info setProductCampaignUrl(String productCampaignUrl) {
        this.productCampaignUrl = productCampaignUrl;
        return this;
    }

    public String getProductGroupUrl() {
        return productGroupUrl;
    }

    public Info setProductGroupUrl(String productGroupUrl) {
        this.productGroupUrl = productGroupUrl;
        return this;
    }

    public String getProductReviewUrl() {
        return productReviewUrl;
    }

    public Info setProductReviewUrl(String productReviewUrl) {
        this.productReviewUrl = productReviewUrl;
        return this;
    }

    public FunctionsAllowed getFunctionsAllowed() {
        return functionsAllowed;
    }

    public Info setFunctionsAllowed(FunctionsAllowed functionsAllowed) {
        this.functionsAllowed = functionsAllowed;
        return this;
    }
}
