package com.dnp.attend.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Description: 继承自己的mapper
 * 
 * @author xhxing
 * @since 2017年5月17日 下午1:48:51
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
