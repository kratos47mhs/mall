package com.macro.mall.search.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 * Product attribute information in search
 * Created by macro on 2018/6/27.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class EsProductAttributeValue implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Long productAttributeId;
    //Attribute value
    @Field(type = FieldType.Keyword)
    private String value;
    //Attribute parameters: 0-> specifications; 1-> parameters
    private Integer type;
    //Attribute name
    @Field(type=FieldType.Keyword)
    private String name;
}
