package com.macro.mall.dto;

import com.macro.mall.validator.FlagValidator;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * Add parameters to update product categories
 * Created by macro on 2018/4/26.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PmsProductCategoryParam {
    @ApiModelProperty("Parent category ID")
    private Long parentId;
    @ApiModelProperty(value = "Product category name",required = true)
    @NotEmpty(message = "Product category name cannot be empty")
    private String name;
    @ApiModelProperty("Product Unit")
    private String productUnit;
    @ApiModelProperty("Whether to show in the navigation bar")
    @FlagValidator(value = {"0","1"},message = "Status can only be 0 or 1")
    private Integer navStatus;
    @ApiModelProperty("Whether to display")
    @FlagValidator(value = {"0","1"},message = "Status can only be 0 or 1")
    private Integer showStatus;
    @ApiModelProperty("Sort")
    @Min(value = 0,message = "Sort minimum is 0")
    private Integer sort;
    @ApiModelProperty("Icon")
    private String icon;
    @ApiModelProperty("Keywords")
    private String keywords;
    @ApiModelProperty("Description")
    private String description;
    @ApiModelProperty("Product-related filtering attribute List")
    private List<Long> productAttributeIdList;
}
