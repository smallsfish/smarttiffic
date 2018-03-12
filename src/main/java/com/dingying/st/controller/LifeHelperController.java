package com.dingying.st.controller;

import com.dingying.st.dto.AirDTO;
import com.dingying.st.po.Weather;
import com.dingying.st.util.ServerResponse;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Scope("prototype")
@RequestMapping("smart/traffic/api")
@Controller
@ResponseBody
public class LifeHelperController {

    private static Random random = new Random(47);

    @RequestMapping(value = "getWeather", method = RequestMethod.POST)
    public ServerResponse getWeather() {
        String[] ws = new String[]{"暴雨", "大雨", "中雨", "小雨", "雷阵雨", "阴天", "多云", "晴天"};
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date curDate = new Date();
        Calendar date = Calendar.getInstance();
        date.setTime(curDate);
        List<Weather> weathers = new ArrayList<>();
        Weather weather = null;
        for (int i = 0; i < 6; i++) {
            weather = new Weather();
            weather.setCo2(random.nextInt(10000));
            int cur_temp = random.nextInt(50);
            weather.setCurrentTemperature(cur_temp);
            weather.setHumidity(random.nextInt(101) + "");
            weather.setPm25(random.nextInt(200) + "");
            weather.setTemperatureRange((cur_temp - 3) + "-" + (cur_temp + 8));
            weather.setUltraviolet(random.nextInt(5000));
            weather.setWeatherStatus(ws[random.nextInt(8)]);
            weather.setWind(random.nextInt(12) + "级");
            try {
                if (i == 0) {
                    date.set(Calendar.DATE, date.get(Calendar.DATE) - 1);
                    weather.setCurrentTime(sdf.parse(sdf.format(date.getTime())));
                } else if (i == 1) {
                    date.set(Calendar.DATE, date.get(Calendar.DATE));
                    weather.setCurrentTime(sdf.parse(sdf.format(date.getTime())));
                } else {
                    date.set(Calendar.DATE, date.get(Calendar.DATE) +(i-1));
                    weather.setCurrentTime(sdf.parse(sdf.format(date.getTime())));
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
            weathers.add(weather);
        }
        return ServerResponse.createBySuccess("请求成功",weathers);
    }

    @RequestMapping(value = "getCurrentAir",method = RequestMethod.POST)
    public ServerResponse getCurrentAir(){
        AirDTO air=new AirDTO();
        air.setAirQuality(random.nextInt(150));
        air.setCo2(random.nextInt(10000));
        air.setHumidity(random.nextInt(101)+"");
        air.setTemperature(random.nextInt(50));
        return ServerResponse.createBySuccess("请求成功",air);
    }

}
