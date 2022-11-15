package com.breze.common.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * @Author tylt6688
 * @Date 2022/11/15 11:10
 * @Description JWT异常处理机制
 * @Copyright(c) 2022 , 青枫网络工作室
 */

public class JwtBrezeException extends AuthenticationException {

    public JwtBrezeException(String msg) {
        super(msg);
    }
}
