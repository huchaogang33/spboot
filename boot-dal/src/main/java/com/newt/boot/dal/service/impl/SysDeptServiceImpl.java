package com.newt.boot.dal.impl;

import com.newt.boot.dal.entity.SysDept;
import com.newt.boot.dal.mapper.SysDeptMapper;
import com.newt.boot.dal.service.ISysDeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 部门表 服务实现类
 * </p>
 *
 * @author hcg
 * @since 2022-07-15
 */
@Service
public class SysDeptServiceImpl extends ServiceImpl<SysDeptMapper, SysDept> implements ISysDeptService {

}
