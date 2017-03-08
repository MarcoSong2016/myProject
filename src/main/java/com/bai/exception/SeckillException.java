package com.bai.exception;

/**
 * 秒杀相关的所有业务异常
 * Created by 宋柏 on 2017/3/8.
 */
public class SeckillException extends RuntimeException{
    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
