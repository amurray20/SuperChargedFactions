package io.papermc.superChargedFactions

import net.kyori.adventure.text.Component
import org.bukkit.Bukkit
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.plugin.java.JavaPlugin

class SuperChargedFactions : JavaPlugin(), Listener {

    override fun onEnable() {
        saveResource("config.yml", /* replace */ false)
        Bukkit.getPluginManager().registerEvents(this, this)
    }

    @EventHandler
    fun onPlayerJoin(event: PlayerJoinEvent) {
        event.getPlayer().sendMessage(Component.text("Hello, " + event.getPlayer().getName() + "!"))
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
