package com.github.spring.service;

import com.github.framework.core.Result;

public interface PaymentService {

    public Result process(String amount,String channelCode);
}
