package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Get the result of OSS upload file authorization return
 * Created by macro on 2018/5/17.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class OssPolicyResult {
    @ApiModelProperty("User ID used in access authentication")
    private String accessKeyId;
    @ApiModelProperty("User form upload Policy, base 64 encoded string")
    private String policy;
    @ApiModelProperty("String after signing policy")
    private String signature;
    @ApiModelProperty("Upload folder path prefix")
    private String dir;
    @ApiModelProperty("oss external service access domain name")
    private String host;
    @ApiModelProperty("Callback settings after successful upload")
    private String callback;
}
