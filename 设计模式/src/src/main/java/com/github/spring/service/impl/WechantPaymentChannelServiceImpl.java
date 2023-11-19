package com.github.spring.service.impl;

import com.github.framework.core.Result;
import com.github.spring.enums.ChannelEnums;
import com.github.spring.service.PaymentChannelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class WechantPaymentChannelServiceImpl implements PaymentChannelService {


    @Override
    public ChannelEnums channelEnums() {
        return ChannelEnums.WECHAT;
    }

    @Override
    public Result payment(String amount) {
        log.info("当前微信扫码用户支付金额amount = {}",amount);
        return Result.ok();
    }
}
