package com.github.spring.service;


import com.github.framework.core.Result;
import com.github.spring.entrity.SysLog;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component("sysLogService")
public interface SysLogService {


    Result insertSysLog(SysLog sysLog);


    Result daleteById(Long id);

    Result editSysLog(SysLog sysLog);

    Result<List<String>> findAll();

}
