package com.macro.mall.dto;

import com.macro.mall.validator.FlagValidator;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotEmpty;

/**
 * Product attribute parameters
 * Created by macro on 2018/4/26.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PmsProductAttributeParam {
    @ApiModelProperty("Attribute classification ID")
    @NotEmpty(message = "Attribute category cannot be empty")
    private Long productAttributeCategoryId;
    @ApiModelProperty("Attribute name")
    @NotEmpty(message = "Property name cannot be empty")
    private String name;
    @ApiModelProperty("Attribute selection type: 0-> Unique; 1-> Single selection; 2-> Multiple selection")
    @FlagValidator({"0","1","2"})
    private Integer selectType;
    @ApiModelProperty("Attribute entry method: 0-> manual entry; 1-> select from list")
    @FlagValidator({"0","1"})
    private Integer inputType;
    @ApiModelProperty("List of optional values, separated by commas")
    private String inputList;

    private Integer sort;
    @ApiModelProperty("Classification screening style: 0-> normal; 1-> color")
    @FlagValidator({"0","1"})
    private Integer filterType;
    @ApiModelProperty("Search type; 0-> No search required; 1-> Keyword search; 2-> Scope search")
    @FlagValidator({"0","1","2"})
    private Integer searchType;
    @ApiModelProperty("Whether products with the same attribute are related; 0-> not related; 1-> associated")
    @FlagValidator({"0","1"})
    private Integer relatedStatus;
    @ApiModelProperty("Whether to support manual addition; 0-> not supported; 1-> supported")
    @FlagValidator({"0","1"})
    private Integer handAddStatus;
    @ApiModelProperty("Type of attribute; 0-> specification; 1-> parameter")
    @FlagValidator({"0","1"})
    private Integer type;
}
