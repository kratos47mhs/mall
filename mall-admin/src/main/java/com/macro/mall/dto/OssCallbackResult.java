package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * oss upload file callback result
 * Created by macro on 2018/5/17.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class OssCallbackResult {
    @ApiModelProperty("File Name")
    private String filename;
    @ApiModelProperty("File size")
    private String size;
    @ApiModelProperty("Mime Type of file")
    private String mimeType;
    @ApiModelProperty("Picture file width")
    private String width;
    @ApiModelProperty("Picture file height")
    private String height;
}
