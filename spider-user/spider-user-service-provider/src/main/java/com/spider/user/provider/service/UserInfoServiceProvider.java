package com.spider.user.provider.service;

import com.spider.user.service.api.IUserInfoService;
import com.spider.user.service.dto.UserInfoDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceProvider implements IUserInfoService{

    private final static Logger logger = LoggerFactory.getLogger(UserInfoServiceProvider.class);

    @Override
    public UserInfoDTO findById(Long id){
        logger.info("-------------------------------我是提供方----------------------");
        System.out.println("我是提供方");
        UserInfoDTO userInfoDTO = new UserInfoDTO();
        userInfoDTO.setName("张胜男");
        return userInfoDTO;
    }
}
