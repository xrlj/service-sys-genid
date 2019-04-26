package com.xrlj.apigateway.service.impl;

import com.xrlj.framework.spring.Base;
import com.xrlj.apigateway.api.vo.resp.VIdResp;
import com.xrlj.apigateway.common.ID;
import com.xrlj.apigateway.common.SnowflakeIdWorker;
import com.xrlj.apigateway.service.GenidService;
import com.xrlj.utils.PrintUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class GenidServiceImpl extends Base implements GenidService {

    @Value("${snowflake.data-center-id}")
    private static long dataCenterId;
    @Value("${snowflake.worker-id}")
    private static long workerId;

    private static SnowflakeIdWorker snowflakeIdWorker = null;
    static {
        if (snowflakeIdWorker == null) {
            snowflakeIdWorker = new SnowflakeIdWorker(dataCenterId, workerId);
        }
    }

    @Override
    public long genId() {
        long id = snowflakeIdWorker.nextId();
        return id;
    }

    @Override
    public VIdResp expId(long id) {
        ID ID = snowflakeIdWorker.convert(id);
        VIdResp vIdResp = modelMapper.map(ID,VIdResp.class);
        PrintUtil.println(vIdResp.toString());
        return vIdResp;
    }
}
