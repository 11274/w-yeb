package com.xxx.server.service.impl;

import com.xxx.server.pojo.MailLog;
import com.xxx.server.mapper.MailLogMapper;
import com.xxx.server.service.MailLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 邮件日志 服务实现类
 * </p>
 *
 * @author wang
 * @since 2022-11-19
 */
@Service
public class MailLogServiceImpl extends ServiceImpl<MailLogMapper, MailLog> implements MailLogService {

}
