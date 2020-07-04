package com.macro.mall.portal.controller;

import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.portal.domain.MemberBrandAttention;
import com.macro.mall.portal.domain.MemberProductCollection;
import com.macro.mall.portal.service.MemberAttentionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Members follow brand management Controller
 * Created by macro on 2018/8/2.
 */
@Controller
@Api(tags = "MemberAttentionController", description = "Members pay attention to brand management")
@RequestMapping("/member/attention")
public class MemberAttentionController {
    @Autowired
    private MemberAttentionService memberAttentionService;
    @ApiOperation("Add brand attention")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult add(@RequestBody MemberBrandAttention memberBrandAttention) {
        int count = memberAttentionService.add(memberBrandAttention);
        if(count>0){
            return CommonResult.success(count);
        }else{
            return CommonResult.failed();
        }
    }

    @ApiOperation("Unsubscribe")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delete(Long brandId) {
        int count = memberAttentionService.delete(brandId);
        if(count>0){
            return CommonResult.success(count);
        }else{
            return CommonResult.failed();
        }
    }

    @ApiOperation("Show watchlist")
    @RequestMapping(value = "/list/{memberId}", method = RequestMethod.GET)
    @ApiOperation("Show watchlist")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<MemberBrandAttention>> list(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                               @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        Page<MemberBrandAttention> page = memberAttentionService.list(pageNum,pageSize);
        return CommonResult.success(CommonPage.restPage(page));
    }

    @ApiOperation("Show follow brand details")
    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<MemberBrandAttention> detail(@RequestParam Long brandId) {
        MemberBrandAttention memberBrandAttention = memberAttentionService.detail(brandId);
        return CommonResult.success(memberBrandAttention);
    }

    @ApiOperation("Clear watchlist")
    @RequestMapping(value = "/clear", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult clear() {
        memberAttentionService.clear();
        return CommonResult.success(null);
    }
}
