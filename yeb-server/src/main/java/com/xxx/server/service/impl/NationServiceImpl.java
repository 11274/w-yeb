package com.xxx.server.service.impl;

import com.xxx.server.pojo.Nation;
import com.xxx.server.mapper.NationMapper;
import com.xxx.server.service.NationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 民族表 服务实现类
 * </p>
 *
 * @author wang
 * @since 2022-11-19
 */
@Service
public class NationServiceImpl extends ServiceImpl<NationMapper, Nation> implements NationService {

}
