package com.github.spring.service.impl;

import com.github.framework.core.Result;
import com.github.spring.enums.ChannelEnums;
import com.github.spring.service.PaymentChannelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AliPayPaymentChannelServiceImpl implements PaymentChannelService {


    @Override
    public ChannelEnums channelEnums() {
        return ChannelEnums.ALIPAY;
    }

    @Override
    public Result payment(String amount) {
        log.info("支付宝扫码支付用户金额amount = {}",amount);
        return Result.ok();
    }
}
