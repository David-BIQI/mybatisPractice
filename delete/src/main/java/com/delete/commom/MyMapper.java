package com.delete.commom;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
import tk.mybatis.mapper.common.yryc.LogicDeleteByPrimaryKey;

public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> ,LogicDeleteByPrimaryKey<T> {
    //FIXME 特别注意，该接口不能被扫描到，否则会出错
}
