package com.xxx.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxx.server.mapper.DepartmentMapper;
import com.xxx.server.pojo.Department;
import com.xxx.server.service.DepartmentService;
import com.xxx.server.utils.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 部门表 服务实现类
 * </p>
 *
 * @author Bing
 * @since 2021-01-13
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements DepartmentService {

    /**
     * 获取所有部门
     *
     * @return
     */
    @Override
    public List<Department> getAllDepartments() {
        return baseMapper.getAllDepartments(-1);
    }

    /**
     * 添加部门
     *
     * @param dep
     * @return
     */
    @Override
    public RespBean addDep(Department dep) {
        dep.setEnabled(true);
        baseMapper.addDep(dep);
        if (1 == dep.getResult()) {
            return RespBean.success("添加成功！");
        }
        return RespBean.error("添加失败！");
    }
}
