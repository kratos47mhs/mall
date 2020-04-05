package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Confirm receipt delivery parameters
 * Created by macro on 2018/10/18.
 */
@Getter
@Setter
public class OmsUpdateStatusParam {
    @ApiModelProperty("Service ticket number")
    private Long id;
    @ApiModelProperty("Delivery address associated id")
    private Long companyAddressId;
    @ApiModelProperty("Confirm the return amount")
    private BigDecimal returnAmount;
    @ApiModelProperty("handle notes")
    private String handleNote;
    @ApiModelProperty("Handler")
    private String handleMan;
    @ApiModelProperty("Receipt notes")
    private String receiveNote;
    @ApiModelProperty("Receiver")
    private String receiveMan;
    @ApiModelProperty("Application status: 1-> returning Products; 2-> completed; 3-> rejected")
    private Integer status;
}
