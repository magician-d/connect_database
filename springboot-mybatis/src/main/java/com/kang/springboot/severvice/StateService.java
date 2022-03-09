package com.kang.springboot.severvice;

import com.kang.springboot.model.State;

public interface StateService {
    /*
    * 根据id查询state信息
    * 参数：id
    * 返回值：state
    * */
    State queryStateById(Integer id);

}
