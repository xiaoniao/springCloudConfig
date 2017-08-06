package com.liuzhuang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuzhuang on 2017/8/6.
 */
//@RefreshScope
@RestController
public class ConfigController {

    @Value("${from}")
    private String value;

    @RequestMapping("/from")
    public String form() {
        return this.value;
    }
}
