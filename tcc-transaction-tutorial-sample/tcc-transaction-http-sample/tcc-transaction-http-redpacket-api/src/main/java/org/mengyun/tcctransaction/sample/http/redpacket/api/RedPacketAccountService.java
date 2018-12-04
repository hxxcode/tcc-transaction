package org.mengyun.tcctransaction.sample.http.redpacket.api;

import java.math.BigDecimal;

/**
 * Created by twinkle.zhou on 16/11/11.
 * 获取用户红包余额
 */
public interface RedPacketAccountService {
    BigDecimal getRedPacketAccountByUserId(long userId);
}
