package com.xrlj.apigateway.controller;

import com.xrlj.framework.base.BaseController;
import com.xrlj.apigateway.api.GenidApi;
import com.xrlj.apigateway.api.vo.resp.VIdResp;
import com.xrlj.apigateway.service.GenidService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class GenidController extends BaseController implements GenidApi {

    @Autowired
    private GenidService genidService;

    @Override
    protected void initBinder(WebDataBinder binder) {

    }

    @Override
    public long genId() {
        return genidService.genId();
    }

    @Override
    public VIdResp expId(long id) {
        VIdResp vIdResp = genidService.expId(id);
        return vIdResp;
    }
}
