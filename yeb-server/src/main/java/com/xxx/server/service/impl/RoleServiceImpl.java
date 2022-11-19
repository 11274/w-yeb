package com.xxx.server.service.impl;

import com.xxx.server.pojo.Role;
import com.xxx.server.mapper.RoleMapper;
import com.xxx.server.service.RoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author wang
 * @since 2022-11-19
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}
