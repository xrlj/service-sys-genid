package com.xrlj.servicesysgenid.controller;

import com.xrlj.framework.base.BaseController;
import com.xrlj.servicesysgenid.api.GenidApi;
import com.xrlj.servicesysgenid.api.vo.resp.VIdResp;
import com.xrlj.servicesysgenid.service.GenidService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class GenidController extends BaseController implements GenidApi {

    private final GenidService genidService;

    @Autowired
    public GenidController(GenidService genidService) {
        this.genidService = genidService;
    }

    @Override
    protected void initBinder(WebDataBinder binder) {

    }

    @Override
    public long genId() {
        return genidService.genId();
    }

    @Override
    public Long[] genIds(int size) {
        Long[] ids = new Long[size];
        for (int i = 0; i < size; i++) {
            ids[i] = genidService.genId();
        }
        return ids;
    }


    @Override
    public VIdResp expId(long id) {
        VIdResp vIdResp = genidService.expId(id);
        return vIdResp;
    }
}
