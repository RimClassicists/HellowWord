package com.github.spring.entrity;

import lombok.Data;

import java.io.Serializable;


@Data
public class SysLog implements Serializable {

    private Long id;

    private String description;

    private String params;
}
