package com.github.inrhor.exchequer

import taboolib.common.platform.Plugin
import taboolib.common.platform.function.info

/**
 * 入口
 */
object Exchequer : Plugin() {

    override fun onEnable() {
        info("\n" +
                " _______            _                                   \n" +
                "(_______)          | |                                  \n" +
                " _____   _   _ ____| |__  _____  ____ _   _ _____  ____ \n" +
                "|  ___) ( \\ / ) ___)  _ \\| ___ |/ _  | | | | ___ |/ ___)\n" +
                "| |_____ ) X ( (___| | | | ____| |_| | |_| | ____| |    \n" +
                "|_______|_/ \\_)____)_| |_|_____)\\__  |____/|_____)_|    \n" +
                "                                   |_|                  \n")
    }
}