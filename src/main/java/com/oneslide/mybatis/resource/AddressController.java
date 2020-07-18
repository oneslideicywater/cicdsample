package com.oneslide.mybatis.resource;

import com.oneslide.mybatis.mapper.AddressMapper;
import com.oneslide.mybatis.mapper.UsersMapper;
import com.oneslide.mybatis.model.Address;
import com.oneslide.mybatis.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("address")
public class AddressController {

    @Autowired
    AddressMapper mapper;

    @Autowired
    UsersMapper mapper2;

    @GetMapping("/basicSearch")
    public List<Users> searchAddress(){
        return mapper2.findAllNames();
    }



    @GetMapping("/healthCheck")
    public String checkHealth(){
        return "Hello world";
    }
}
