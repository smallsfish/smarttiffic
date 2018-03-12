package com.dingying.st.controller;

import com.dingying.st.dto.AccountDTO;
import com.dingying.st.po.Cars;
import com.dingying.st.service.CarsService;
import com.dingying.st.service.UserService;
import com.dingying.st.util.MD5TUtils;
import com.dingying.st.util.ServerResponse;
import com.google.gson.Gson;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.dingying.st.po.User;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Scope("prototype")
@RequestMapping("smart/traffic/api")
@Controller
@ResponseBody
public class UserController {

    @Resource
    private UserService userService;

    @Resource
    private CarsService carsService;

    @RequestMapping(value = "user/login", method = RequestMethod.POST)
    public ServerResponse login(String requstJson, HttpServletRequest request) {
        HttpSession session = request.getSession();
        Gson gson = new Gson();
        User user = gson.fromJson(requstJson, User.class);
        User u = new User();
        u.setAccount(user.getAccount());
        User userT = userService.getOne(u);
        if (userT == null) {
            return ServerResponse.createByErrorMessage("用户名或密码错误");
        }
        if (!userT.getPassword().equals(MD5TUtils.threeMD5(user.getPassword()))) {
            return ServerResponse.createByErrorMessage("用户名或密码错误");
        }
        userT.setPassword(null);
        session.setAttribute("currentUser", userT);
        return ServerResponse.createBySuccess("登陆成功", userT);
    }


    @RequestMapping(value = "user/register", method = RequestMethod.POST)
    public ServerResponse register(String requstJson) {
        Gson gson = new Gson();
        User user = gson.fromJson(requstJson, User.class);

        User u = new User();
        u.setAccount(user.getAccount());

        User userT = userService.getOne(u);
        if (userT != null) {
            return ServerResponse.createByErrorMessage("用户名已存在");
        }
        user.setCreatedate(new Date());
        user.setStatus((byte) 1);
        user.setThreshold(10);
        user.setPassword(MD5TUtils.threeMD5(user.getPassword()));
        userService.save(user);
        return ServerResponse.createBySuccessMessage("注册成功");
    }

    @RequestMapping(value = "user/getAccountInfo", method = RequestMethod.POST)
    public ServerResponse getAccountInfo() {

        List<User> userList = userService.list(null, null);
        List<AccountDTO> accountDTOS = new ArrayList<>();
        AccountDTO accountDTO = null;
        for (int i = 0; i < userList.size(); i++) {
            accountDTO = new AccountDTO();
            accountDTO.setUid(userList.get(i).getId());
            accountDTO.setName(userList.get(i).getName());
            accountDTO.setOrderNumber(i + 1);
            Cars c = new Cars();
            c.setUid(userList.get(i).getId());
            Cars cars = carsService.getOne(c);
            if (cars != null) {
                accountDTO.setBalance(cars.getBalance());
                accountDTO.setPlate_number(cars.getPlateNumber());
            }
            accountDTOS.add(accountDTO);
        }
        return ServerResponse.createBySuccess("请求成功", accountDTOS);
    }


    @RequestMapping(value = "car/carBalanceRecharge",method = RequestMethod.POST)
    public ServerResponse carBalanceRecharge(String requstJson){
        Gson gson=new Gson();
        Cars cars=gson.fromJson(requstJson,Cars.class);
        synchronized (this){
            int balance=carsService.getById(cars.getId()).getBalance();
            balance=balance+cars.getBalance();
            cars.setBalance(balance);
            carsService.update(cars);
        }
        return ServerResponse.createBySuccess("充值成功",cars);
    }

    @RequestMapping(value = "user/updateUserInfo",method = RequestMethod.POST)
    public ServerResponse updateUserInfo(String requstJson){
        Gson gson=new Gson();
        User user=gson.fromJson(requstJson,User.class);
        userService.update(user);
        return ServerResponse.createBySuccessMessage("修改成功");
    }


}
