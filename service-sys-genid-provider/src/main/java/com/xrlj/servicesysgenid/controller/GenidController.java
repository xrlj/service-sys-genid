package com.xrlj.servicesysgenid.controller;

import com.xrlj.framework.base.BaseController;
import com.xrlj.servicesysgenid.api.GenidApi;
import com.xrlj.servicesysgenid.api.vo.resp.VIdResp;
import com.xrlj.servicesysgenid.service.GenidService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
//@RefreshScope
public class GenidController extends BaseController implements GenidApi {

    @Autowired
    private GenidService genidService;

    @Override
    protected void initBinder(WebDataBinder binder) {

    }

    @Override
    public long genId() {
        return 0;
    }

    @Override
    public VIdResp expId(long id) {
        return null;
    }
}