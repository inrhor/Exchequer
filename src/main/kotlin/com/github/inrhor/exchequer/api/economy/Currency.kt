package com.github.inrhor.exchequer.api.economy

/**
 * 货币接口
 */
interface Currency {

    /**
     * @return 唯一货币编号
     */
    fun getId(): String

    /**
     * @return 货币符号
     */
    fun getSymbol(): String

    /**
     * @return 货币单数形式
     */
    fun getNameSingular(): String

    /**
     * @return 货币复数形式
     */
    fun getNamePlural(): String

    /**
     * @return 转换为用户可读的指定小位数余额格式
     */
    fun format(amount: Double, precision: Int): String

    /**
     * 兑换目的货币
     *
     * @param currency 目的货币
     * @param amount 目的额度
     */
    fun exchange(currency: Currency, amount: Double)

}