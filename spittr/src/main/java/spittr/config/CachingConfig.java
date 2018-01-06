package spittr.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lssemail on 2018/1/6.
 */
@Configuration
@EnableCaching
public class CachingConfig {

    /**
     * 声明缓存管理器
     * @return
     */
    @Bean
    public CacheManager cacheManager(){

        return new ConcurrentMapCacheManager();
    }



}
