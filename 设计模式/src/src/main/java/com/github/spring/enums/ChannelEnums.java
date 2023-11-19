package com.github.spring.enums;

import org.apache.commons.lang3.StringUtils;

public enum ChannelEnums {

    WECHAT("wechat_scan","微信扫码支付"),

    ALIPAY("alipay_san","支付宝扫码支付")

    ;

    ChannelEnums(String channelCode,String description){
        this.channelCode = channelCode;
        this.description = description;
    }

    private String channelCode;
    private String description;


    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public static ChannelEnums of(String channelCode){
        for(ChannelEnums channelEnums:ChannelEnums.values()){
            if(StringUtils.equals(channelEnums.channelCode,channelCode)){
                return channelEnums;
            }
        }
        return null;
    }



    public static void main(String[] args) {
        String channelCode = "wechat_scan";
        ChannelEnums enums = of(channelCode);

        System.out.println(enums.getChannelCode() + "," + enums.description);

    }
}
