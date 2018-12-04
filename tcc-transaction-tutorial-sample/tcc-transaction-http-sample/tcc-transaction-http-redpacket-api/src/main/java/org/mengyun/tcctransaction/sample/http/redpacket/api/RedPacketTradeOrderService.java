package org.mengyun.tcctransaction.sample.http.redpacket.api;

import org.mengyun.tcctransaction.api.TransactionContext;
import org.mengyun.tcctransaction.sample.http.redpacket.api.dto.RedPacketTradeOrderDto;

/**
 * Created by changming.xie on 4/1/16.
 * 调整红包余额
 */
public interface RedPacketTradeOrderService {

    public String record(TransactionContext transactionContext, RedPacketTradeOrderDto tradeOrderDto);
}
