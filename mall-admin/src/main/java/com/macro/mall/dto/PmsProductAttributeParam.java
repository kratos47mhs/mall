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
    @NotEmpty
    @ApiModelProperty("Attribute category ID")
    private Long productAttributeCategoryId;
    @NotEmpty
    @ApiModelProperty("Attribute name")
    private String name;
    @FlagValidator({"0","1","2"})
    @ApiModelProperty("Attribute selection type：0-> Unique；1-> Single selection；2-> Multiple selection")
    private Integer selectType;
    @FlagValidator({"0","1"})
    @ApiModelProperty("Attribute entry method：0-> Manual input；1-> Select from list")
    private Integer inputType;
    @ApiModelProperty("List of optional values, separated by commas")
    private String inputList;
    private Integer sort;
    @ApiModelProperty("Classification filter style: 0->common; 1->color")
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
