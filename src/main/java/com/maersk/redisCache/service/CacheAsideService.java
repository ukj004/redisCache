package com.maersk.redisCache.service;

import reactor.core.publisher.Mono;

public interface CacheAsideService<K,V> {
    Mono<V> getCache(K key);

    Mono<Void> putCache(K id, V object);
}
