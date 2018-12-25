package com.delete.service;

import com.delete.dao.UserDao;
import com.delete.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import static com.common.check.CheckUtil.notNull;

/**   
 * @Package com.biqi.service 
 * @author  xiebq @date    2018年6月6日 下午11:17:48 
 */
@Service
@Slf4j
public class UserService {
	
	public static final Integer SUPER_USER_ID = 1;

	@Autowired
	private UserDao userDao;
	

    public Boolean logicDelete(Integer id) {
        User oldUser = userDao.selectByPrimaryKey(id);
        notNull(oldUser, "用户id:"+id+" 不存在");
        userDao.logicDeleteByPrimaryKey(id);
        return true;
    }

    public Boolean deleteUser(Integer id) {
        User oldUser = userDao.selectByPrimaryKey(id);
        notNull(oldUser, "用户id:"+id+" 不存在");
        userDao.deleteByPrimaryKey(id);
        return true;
    }

    public Boolean updateUser(User user) {
        User oldUser = userDao.selectByPrimaryKey(user.getId());
        notNull(oldUser, "用户id:"+user.getId()+" 不存在");
        user.setUpdateby(SUPER_USER_ID);
        user.setUpdated(new Date());
        userDao.updateByPrimaryKeySelective(user);
        return true;
    }
}
