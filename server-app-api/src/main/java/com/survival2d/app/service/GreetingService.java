package com.survival2d.app.service;

import com.survival2d.app.config.AppConfig;
import com.survival2d.common.service.CommonService;

import com.tvd12.ezyfox.bean.annotation.EzyAutoBind;
import com.tvd12.ezyfox.bean.annotation.EzySingleton;

@EzySingleton
public class GreetingService {

    @EzyAutoBind
    private AppConfig appConfig;

    @EzyAutoBind
    private CommonService commonService;

    public String hello(String nickName) {
        return appConfig.getHelloPrefix() + " " + nickName + "!";
    }

    public String go(String nickName) {
        return appConfig.getGoPrefix() + " " + nickName + "!";
    }
}
