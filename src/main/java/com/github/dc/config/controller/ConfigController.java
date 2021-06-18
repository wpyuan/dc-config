package com.github.dc.config.controller;

import com.github.dc.common.base.controller.DefaultController;
import com.github.dc.config.domain.entity.Config;
import com.github.dc.config.service.ConfigService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  系统配置 控制器
 *
 * @author wangpeiyuan
 * @date 2021-04-13 15:21:54
 */
@RestController
@RequestMapping("/config")
@Slf4j
public class ConfigController extends DefaultController<Config> {

    @Autowired
    private ConfigService service;

}