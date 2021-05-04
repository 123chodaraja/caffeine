package com.caching.CaffeineExample.config;

import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.Expiry;
import org.checkerframework.checker.index.qual.NonNegative;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.springframework.cache.CacheManager;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

@Configuration
public class CaffeineCacheConfig {
    @Bean
    public CacheManager cacheManager() {
        CaffeineCacheManager cacheManager = new CaffeineCacheManager("customer");
        cacheManager.setCaffeine(caffeineCacheBuilder());
        return cacheManager;
    }

    Caffeine<Object, Object> caffeineCacheBuilder() {
//        return Caffeine.newBuilder()
//                .initialCapacity(100)
//                .maximumSize(500)
//                .expireAfterAccess(10, TimeUnit.MINUTES)
//                .weakKeys()
//                .recordStats();
        return Caffeine.newBuilder().expireAfter(new Expiry<Object, Object>() {
            @Override
            public long expireAfterCreate(@NonNull Object o, @NonNull Object o2, long l) {
                return 0;
            }

            @Override
            public long expireAfterUpdate(@NonNull Object o, @NonNull Object o2, long l, @NonNegative long l1) {
                return 0;
            }

            @Override
            public long expireAfterRead(@NonNull Object o, @NonNull Object o2, long l, @NonNegative long l1) {
                return 0;
            }

        });
    }


}
