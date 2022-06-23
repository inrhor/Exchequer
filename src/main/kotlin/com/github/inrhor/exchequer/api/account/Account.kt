package com.github.inrhor.exchequer.api.account

import com.github.inrhor.exchequer.api.economy.Currency
import java.util.*

/**
 * 账户接口
 */
interface Account {

    /**
     * @return 返回账户名称
     */
    fun getName(): String

    /**
     * 设置账户名称
     */
    fun setName()

    /**
     * @return 是否为账户主人
     */
    fun UUID.isOwner(name: String): Boolean

    /**
     * 存入指定额度
     */
    fun Double.depositBalance(currency: Currency, name: String)

    /**
     * 提取指定额度
     */
    fun Double.withdrawBalance(currency: Currency, name: String)

    /**
     * 设定指定额度
     */
    fun Double.setBalance(currency: Currency, name: String)

    /**
     * @return 返回额度
     */
    fun getBalance(currency: Currency, name: String): Double

}