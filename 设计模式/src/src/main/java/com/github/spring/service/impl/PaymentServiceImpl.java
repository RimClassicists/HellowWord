package com.github.spring.service.impl;

import com.github.framework.core.Result;
import com.github.spring.service.PaymentChannelService;
import com.github.spring.service.PaymentService;
import com.github.spring.service.context.ChannelContextLocal;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class PaymentServiceImpl implements PaymentService {
    
    @Resource
    private ChannelContextLocal channelContextLocal;

    @Override
    public Result process(String amount, String channelCode) {
        Result<PaymentChannelService> result = channelContextLocal.selectChannel(channelCode);
        if(!result.isSuccess()){
            log.error("获取支付渠道返回 code = {},message = {}",result.getCode(),result.getMessage());
            return Result.fail("10004","支付失败");
        }
        PaymentChannelService service = result.getData();
        return service.payment(amount);
    }
}
