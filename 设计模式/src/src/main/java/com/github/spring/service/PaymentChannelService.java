package com.github.spring.service;

import com.github.framework.core.Result;
import com.github.spring.enums.ChannelEnums;

public interface PaymentChannelService {


    ChannelEnums channelEnums();


    Result payment(String amount);



}
