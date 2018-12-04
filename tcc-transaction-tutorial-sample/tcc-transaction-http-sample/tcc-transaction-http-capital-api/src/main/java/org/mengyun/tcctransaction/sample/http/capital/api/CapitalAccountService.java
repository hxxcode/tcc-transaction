package org.mengyun.tcctransaction.sample.http.capital.api;

import java.math.BigDecimal;

/**
 * Created by twinkle.zhou on 16/11/11.
 * 获取用户余额
 */
public interface CapitalAccountService {

    BigDecimal getCapitalAccountByUserId(long userId);
}
