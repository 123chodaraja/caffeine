package com.caching.CaffeineExample;

import com.caching.CaffeineExample.config.CaffeineCacheConfig;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CaffeineCacheConfigTest {
    private CaffeineCacheConfig caffeineCacheConfig;
    @BeforeEach
    void setup() {
     this.caffeineCacheConfig = new CaffeineCacheConfig();
    }

    @Test
    void testCacheManager() {
        caffeineCacheConfig.cacheManager();
    }

}
