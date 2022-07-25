package com.newt.boot.dal.impl;

import com.newt.boot.dal.entity.TBAgentInfo;
import com.newt.boot.dal.mapper.TBAgentInfoMapper;
import com.newt.boot.dal.service.ITBAgentInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 代理机构信息正式表 服务实现类
 * </p>
 *
 * @author hcg
 * @since 2022-07-15
 */
@Service
public class TBAgentInfoServiceImpl extends ServiceImpl<TBAgentInfoMapper, TBAgentInfo> implements ITBAgentInfoService {

}
