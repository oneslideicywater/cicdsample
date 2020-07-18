package com.oneslide.mybatis.resource;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oneslide.mybatis.mapper.AddressMapper;
import com.oneslide.mybatis.mapper.UsersMapper;
import com.oneslide.mybatis.model.Address;
import com.oneslide.mybatis.model.Users;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("address")
public class AddressController {
    Logger logger=LoggerFactory.getLogger(AddressController.class);

    @Autowired
    AddressMapper mapper;

    @Autowired
    UsersMapper mapper2;

    @GetMapping("/basicSearch")
    public List<Users> searchAddress(){

        return mapper2.findAllNames();
    }



    @GetMapping("/healthCheck")
    public String checkHealth(HttpServletRequest request)  throws JsonProcessingException {
        logger.info(String.format("request info:{ \"method\":\"%s\",\"path_info\":\"%s\",\"ip\":\"%s\"}",request.getMethod(),request.getRequestURL(),request.getRemoteHost()));
        return "Hello world";
    }
}
