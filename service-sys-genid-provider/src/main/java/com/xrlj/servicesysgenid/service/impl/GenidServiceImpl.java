package com.xrlj.servicesysgenid.service.impl;

import com.xrlj.servicesysgenid.api.vo.resp.VIdResp;
import com.xrlj.servicesysgenid.service.GenidService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class GenidServiceImpl implements GenidService {


    @Override
    public long genId() {
        return 0;
    }

    @Override
    public VIdResp expId(long id) {
        return null;
    }
}
