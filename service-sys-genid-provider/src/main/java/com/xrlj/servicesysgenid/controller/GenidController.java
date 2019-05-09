package com.xrlj.servicesysgenid.controller;

import com.xrlj.framework.base.BaseController;
import com.xrlj.servicesysgenid.api.GenidApi;
import com.xrlj.servicesysgenid.api.vo.resp.VIdResp;
import com.xrlj.servicesysgenid.service.GenidService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

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

    @Override
    public String setSession() {
        HttpSession s = getSession();
        s.setAttribute("username","账目天");
        return s.getId();
    }

    @Override
    public String sessions() {
        return getSession().getAttribute("username") + "==" + getSession().getId();
    }
}
