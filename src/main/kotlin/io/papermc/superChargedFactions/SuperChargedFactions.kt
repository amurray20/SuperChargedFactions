package io.papermc.superChargedFactions

import org.bukkit.plugin.java.JavaPlugin

class SuperChargedFactions : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        Join()
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
