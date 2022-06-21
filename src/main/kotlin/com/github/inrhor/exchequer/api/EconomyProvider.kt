package com.github.inrhor.exchequer.api

import com.github.inrhor.exchequer.api.account.Account
import com.github.inrhor.exchequer.api.economy.Currency
import java.util.*

/**
 * 经济提供商
 */
interface EconomyProvider {

    /**
     * @param name 账户名称，默认为""
     *
     * @return 是否有该账户
     */
    fun UUID.hasAccount(name: String = ""): Boolean

    /**
     * @param name 账户名称，默认为""
     *
     * 创建账户
     */
    fun UUID.createAccount(name: String = "")

    /**
     * @param name 账户名称，默认为""
     *
     * @return 返回账户
     */
    fun UUID.getAccount(name: String = ""): Account

    /**
     * @param name 账户名称，默认为""
     *
     * 删除账户
     */
    fun UUID.deleteAccount(name: String = "")

    /**
     * @return 货币集合
     */
    fun getCurrencies(): MutableSet<Currency>

    /**
     * @return 根据编号寻访货币
     */
    fun String.getCurrency(): Currency

}