package com.newt.boot.dal.impl;

import com.newt.boot.dal.entity.TBManagerInfo;
import com.newt.boot.dal.mapper.TBManagerInfoMapper;
import com.newt.boot.dal.service.ITBManagerInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 客户经理信息表 服务实现类
 * </p>
 *
 * @author hcg
 * @since 2022-07-15
 */
@Service
public class TBManagerInfoServiceImpl extends ServiceImpl<TBManagerInfoMapper, TBManagerInfo> implements ITBManagerInfoService {

}
