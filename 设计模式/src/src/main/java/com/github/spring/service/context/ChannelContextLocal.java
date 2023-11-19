package com.github.spring.service.context;

import com.github.framework.core.Result;
import com.github.spring.enums.ChannelEnums;
import com.github.spring.service.PaymentChannelService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ChannelContextLocal implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }


    public Result<PaymentChannelService> selectChannel(String channelCode){
        if(StringUtils.isBlank(channelCode)){
            return Result.fail("100004","渠道编码为空");
        }
        ChannelEnums channelEnums = ChannelEnums.of(channelCode);
        if(channelEnums == null){
            return Result.fail("100004","当前渠道编码没有找到对应的渠道");
        }
        Map<String,PaymentChannelService> map = applicationContext.getBeansOfType(PaymentChannelService.class);
        for(Map.Entry<String, PaymentChannelService> entry:map.entrySet()){
            String key = entry.getKey();
            PaymentChannelService service = entry.getValue();
            if(service.channelEnums() == channelEnums){
                return Result.ok(service);
            }
        }
        return  Result.fail("100004","获取支付渠道失败");

    }
}
