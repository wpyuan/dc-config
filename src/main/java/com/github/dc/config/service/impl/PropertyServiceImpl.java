package com.github.dc.config.service.impl;

import com.github.dc.common.base.service.impl.DefaultServiceImpl;
import com.github.dc.config.domain.entity.Config;
import com.github.dc.config.domain.entity.Property;
import com.github.dc.config.service.ConfigService;
import com.github.dc.config.service.PropertyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  属性值 service-impl
 *
 * @author wangpeiyuan
 * @date 2021-04-13 15:33:21
 */
@Service
@Slf4j
public class PropertyServiceImpl extends DefaultServiceImpl<Property> implements PropertyService {
    @Autowired
    private ConfigService configService;

    @Override
    public String getPropertyValue(String code, String propertyCode) {
        Property property = this.getProperty(code, propertyCode);
        if (property == null) {
            log.warn("查无此配置。Config Code: {}. Property Code: {}", code, propertyCode);
            return null;
        }
        return property.getValue();
    }

    @Override
    public Property getProperty(String code, String propertyCode) {
        Config config = configService.detail(Config.builder().code(code).isEnable(true).build());
        if (config == null) {
            return null;
        }
        Property property = this.detail(Property.builder().configId(config.getId()).code(propertyCode).isEnable(true).build());
        return property;
    }

    @Override
    public List<Property> getProperties(String code) {
        Config config = configService.detail(Config.builder().code(code).isEnable(true).build());
        if (config == null) {
            return null;
        }
        return this.list(Property.builder().configId(config.getId()).isEnable(true).build());
    }
}