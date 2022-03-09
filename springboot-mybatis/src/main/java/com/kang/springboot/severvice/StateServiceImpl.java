package com.kang.springboot.severvice;

import com.kang.springboot.mapper.StateMapper;
import com.kang.springboot.model.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
* 1.控制层想要调用业务层的实现类，需要把业务接口实现类放在spring容器中，即添加@Service
* 2.业务接口实现类声明为service层，
* 3.业务层想要查询信息，需要调用dao，因此需要先把dao放在spring容器中，（使用@Mapper）
* 4.@Mapper作用，扫描dao接口到spring容器
* */
@Service
public class StateServiceImpl implements StateService {
    /*
    * 实现类想要获得数据，需要注入数据持久层对象
    * */
    @Autowired(required = false)
    private StateMapper statemapper;

    @Override
    public State queryStateById(Integer id) {
        return statemapper.selectByPrimaryKey(id);
    }
}
