package com.github.danta.kotlin

import org.bukkit.plugin.java.JavaPlugin

class Kotlin: JavaPlugin() {
    override fun onEnable() {
        logger.info("Hello Kotlin")
    }
}