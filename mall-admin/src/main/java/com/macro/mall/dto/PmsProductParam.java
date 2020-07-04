package com.macro.mall.dto;

import com.macro.mall.model.*;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Parameters used when creating and modifying products
 * Created by macro on 2018/4/26.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PmsProductParam extends PmsProduct{
    @ApiModelProperty("Product ladder price setting")
    private List<PmsProductLadder> productLadderList;
    @ApiModelProperty("Product full price reduction setting")
    private List<PmsProductFullReduction> productFullReductionList;
    @ApiModelProperty("Product member price setting")
    private List<PmsMemberPrice> memberPriceList;
    @ApiModelProperty("Product sku inventory information")
    private List<PmsSkuStock> skuStockList;
    @ApiModelProperty("Product parameters and Attribute Value Lists")
    private List<PmsProductAttributeValue> productAttributeValueList;
    @ApiModelProperty("Subject and Product relations")
    private List<CmsSubjectProductRelation> subjectProductRelationList;
    @ApiModelProperty("Optimizing the relationship between the zone and the product")
    private List<CmsPrefrenceAreaProductRelation> prefrenceAreaProductRelationList;
}
