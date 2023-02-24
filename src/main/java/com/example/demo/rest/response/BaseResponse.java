package com.example.demo.rest.response;

import com.example.demo.util.enums.ResponseStatusCodeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Map;

@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponse {
    @Builder.Default
//    @ApiModelProperty(value = "Mã lỗi xử lý", required = true)
    private String errorCode = ResponseStatusCodeEnum.SUCCESS.getCode();
//    @ApiModelProperty(value = "Danh sách các parameter của message")
    private Map<Object, Object> messageParam;
    private String errorMessage;

    public BaseResponse(String errorCode) {
        this.errorCode = errorCode;
    }
}
