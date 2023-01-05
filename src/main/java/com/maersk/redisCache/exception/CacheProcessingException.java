package com.maersk.redisCache.exception;

public class CacheProcessingException extends RuntimeException{

    String str;

    public CacheProcessingException(String str){
        super(str);
        this.str = str;
    }
}
