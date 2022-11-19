package com.xxx.server.service.impl;

import com.xxx.server.pojo.Admin;
import com.xxx.server.mapper.AdminMapper;
import com.xxx.server.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 管理员表 服务实现类
 * </p>
 *
 * @author wang
 * @since 2022-11-19
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

}
