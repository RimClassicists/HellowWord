package com.github.spring.service.impl;

import com.github.framework.core.Result;
import com.github.spring.entrity.SysLog;
import com.github.spring.service.AopLog;
import com.github.spring.service.SysLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("SysLogServiceImpl")
@Slf4j
public class SysLogServiceImpl implements SysLogService {


    private static final String FAIL = "10004";
    private static final String FAIL_MESSAGE = "操作失败";

    @AopLog(meta = "添加日志操作")
    @Override
    public Result insertSysLog(SysLog sysLog) {
        log.info("请求参数为空");
        if (sysLog == null){
            return Result.fail(FAIL,FAIL_MESSAGE);
        }

        return Result.ok();
    }

    @Override
    @AopLog(meta = "根据id查询")
    public Result daleteById(Long id) {
        return null;
    }

    @Override
    @AopLog(meta = "编辑操作")
    public Result editSysLog(SysLog sysLog) {
        return null;
    }

    @Override
    @AopLog(meta = "查询所有日志")
    public Result<List<String>> findAll() {
        return null;
    }
}
