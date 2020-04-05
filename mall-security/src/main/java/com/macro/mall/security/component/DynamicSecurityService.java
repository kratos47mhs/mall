package com.macro.mall.security.component;

import org.springframework.security.access.ConfigAttribute;

import java.util.Map;

/**
 * Dynamic Security Service business
 * Created by macro on 2020/2/7.
 */
public interface DynamicSecurityService {
    /**
     * Load resource ANT wildcard and resource corresponding MAP
     */
    Map<String, ConfigAttribute> loadDataSource();
}
