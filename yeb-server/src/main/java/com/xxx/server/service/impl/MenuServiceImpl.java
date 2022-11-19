package com.xxx.server.service.impl;

import com.xxx.server.pojo.Menu;
import com.xxx.server.mapper.MenuMapper;
import com.xxx.server.service.MenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜单表 服务实现类
 * </p>
 *
 * @author wang
 * @since 2022-11-19
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements MenuService {

}
