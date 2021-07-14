package com.github.dc.config.service;



import com.github.dc.common.base.service.DefaultService;
import com.github.dc.config.domain.entity.Property;

import java.util.List;

/**
 *  属性值 service
 *
 * @author wangpeiyuan
 * @date 2021-04-13 15:33:21
 */
public interface PropertyService extends DefaultService<Property> {
    /**
     * 根据配置编码和属性代码获取属性值（只取启用的）
     * @param code 配置编码
     * @param propertyCode 属性代码
     * @return 对应的属性值
     */
    String getPropertyValue(String code, String propertyCode);

    /**
     * 根据配置编码和属性代码获取属性（只取启用的）
     * @param code 配置编码
     * @param propertyCode 属性代码
     * @return 对应的属性
     */
    Property getProperty(String code, String propertyCode);

    /**
     * 根据配置编码获取属性集合（只取启用的）
     * @param code 配置编码
     * @return 对应的属性
     */
    List<Property> getProperties(String code);
}