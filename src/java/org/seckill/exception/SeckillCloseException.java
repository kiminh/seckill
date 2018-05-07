package org.seckill.exception;

import org.seckill.entity.Seckill;

//秒杀关闭异常
public class SeckillCloseException extends SeckillException{
    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
