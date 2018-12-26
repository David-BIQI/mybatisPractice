package com.biqi.common.base;

import com.sun.istack.internal.NotNull;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
public class BasePage {

    @ApiModelProperty(value = "当前显示页数" , required = true)
    @NotNull
    private Integer pageNum;

    @ApiModelProperty(value = "每页显示数量" , required = true)
    @NotNull
    private Integer pageSize;

    @ApiModelProperty(value = "排序列")
    private String orderByColumn;

    @ApiModelProperty(value = "排序的方向 desc或者 asc")
    private String order;
}
