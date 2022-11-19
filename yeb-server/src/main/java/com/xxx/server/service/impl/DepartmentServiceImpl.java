package com.xxx.server.service.impl;

import com.xxx.server.pojo.Department;
import com.xxx.server.mapper.DepartmentMapper;
import com.xxx.server.service.DepartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 部门表 服务实现类
 * </p>
 *
 * @author wang
 * @since 2022-11-19
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements DepartmentService {

}
