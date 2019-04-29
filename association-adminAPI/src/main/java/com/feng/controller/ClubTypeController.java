package com.feng.controller;


import com.feng.entity.ClubType;
import com.feng.entity.ResponseResult;
import com.feng.service.ClubTypeService;
import com.feng.util.ResponseResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author rf
 * @since 2019-03-03
 */
@RestController
@RequestMapping("/clubTypes")
public class ClubTypeController {
    @Autowired
    private ClubTypeService clubTypeService;
    @GetMapping
    public ResponseResult list() {
        List<ClubType> clubTypeList= clubTypeService.selectList(null);
        return ResponseResultUtil.renderSuccess(clubTypeList);
    }
}

