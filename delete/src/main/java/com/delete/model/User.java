package com.delete.model;
/**   
 * Description: 用户表
 * @Package com.biqi.model 
 * @author  xiebq @date    2018年6月6日 下午10:52:00 
 */

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Builder
@Data
@Table(name = "User")
@Api(value="用户表")
public class User {
	
	@Id
	private Integer id;

    @ApiModelProperty(value = "用户名",required = true)
	private String name;

    @ApiModelProperty(value = "密码")
	private String password;

    @ApiModelProperty(value = "电话")
	private String phone;

    @ApiModelProperty(value = "1代表男，0代表女")
	private Integer sex;

    @ApiModelProperty(value = "创建时间，系统填值")
	private Date created;

    @ApiModelProperty(value = "创建人，系统填值")
	private Integer createby;

    @ApiModelProperty(value = "更新时间，系统填值")
	private Date updated;

    @ApiModelProperty(value = "更新人，系统填值")
	private Integer updateby;
    
    

}
