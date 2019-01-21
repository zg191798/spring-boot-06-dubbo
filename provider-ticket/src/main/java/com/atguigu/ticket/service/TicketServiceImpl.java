package com.atguigu.ticket.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author zhangge
 * @date 2019/1/21 - 13:33
 */
@Component
@Service
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "<厉害了，我的国>";
    }
}
