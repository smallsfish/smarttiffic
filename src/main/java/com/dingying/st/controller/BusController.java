package com.dingying.st.controller;


import com.dingying.st.dto.BusBearingCapacityDTO;
import com.dingying.st.dto.BusDTO;
import com.dingying.st.dto.BusRequestDTO;
import com.dingying.st.po.Station;
import com.dingying.st.service.StationService;
import com.dingying.st.util.ServerResponse;
import com.google.gson.Gson;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Scope("prototype")
@RequestMapping("smart/traffic/api")
@Controller
@ResponseBody
public class BusController {

    @Resource
    private StationService stationService;

    private static Random random = new Random(47);

    @RequestMapping(value = "bus/getBusInfo", method = RequestMethod.GET)
    public ServerResponse getBusInfo(String requestJson) {
        Gson gson = new Gson();
        BusRequestDTO busRequestDTO = gson.fromJson(requestJson, BusRequestDTO.class);
        Station station = stationService.getById(busRequestDTO.getStationNumber());
        BusDTO busDTO = new BusDTO();
        busDTO.setBusName(busRequestDTO.getBusRoute() + "路公交车");
        busDTO.setDistance(random.nextInt(5000));
        busDTO.setBusNumber(busRequestDTO.getBusNumber());
        busDTO.setCur_load(random.nextInt(105));
        busDTO.setStationName(station.getStationName());
        return ServerResponse.createBySuccess("请求成功", busDTO);
    }

    @RequestMapping(value = "bus/getBusBearingCapacityList", method = RequestMethod.GET)
    public ServerResponse getBusBearingCapacityList() {
        List<BusBearingCapacityDTO> list = new ArrayList<>();
        BusBearingCapacityDTO busBearingCapacityDTO = null;
        for (int i = 0; i < 15; i++) {
            busBearingCapacityDTO = new BusBearingCapacityDTO();
            busBearingCapacityDTO.setBusNumber(i+1);
            busBearingCapacityDTO.setCur_load(random.nextInt(105));
            list.add(busBearingCapacityDTO);
        }
        return ServerResponse.createBySuccess("请求成功",list);
    }

}
