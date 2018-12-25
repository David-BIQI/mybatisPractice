package com.delete.web;

import com.common.result.ResultDto;
import com.delete.model.User;
import com.delete.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static com.common.check.CheckUtil.hasErrors;

/**   
 * Description: 用户管理的基础类
 * @Package com.biqi.web 
 * @author  xiebq @date    2018年6月6日 下午10:56:24 
 */
@RestController
@Slf4j
@Api(tags = {"用户管理的基础类Api文档"})
public class UserController {
	
	@Autowired
	private UserService userService;
	

	
	@PostMapping("/user/logicDelete")
    @ApiOperation(value = "删除用户")
	public ResultDto<Boolean> logicDelete(@RequestParam Integer id){
		ResultDto<Boolean> resultDto = new ResultDto<>();
		resultDto.setData(userService.logicDelete(id));
		return resultDto;
	}

	@PostMapping("/user/delete")
    @ApiOperation(value = "删除用户")
	public ResultDto<Boolean> deleteUser(@RequestParam Integer id){
		ResultDto<Boolean> resultDto = new ResultDto<>();
		resultDto.setData(userService.deleteUser(id));
		return resultDto;
	}

	
	@PostMapping("/user/update")
    @ApiOperation(value = "更新用户,使用@Validated分组{update}校验数据")
	public ResultDto<Boolean> updateUser(@RequestBody User user){
		ResultDto<Boolean> resultDto = new ResultDto<>();
		resultDto.setData(userService.updateUser(user));
		return resultDto;
	}
	
	






}
