package io.papermc.superChargedFactions

import net.kyori.adventure.text.Component
import org.bukkit.Bukkit
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.plugin.java.JavaPlugin

class Join : JavaPlugin(), Listener {
    override fun onEnable() {
        logger.info { "Plugin Enabled" }
        Bukkit.getPluginManager().registerEvents(this, this)

        @EventHandler
        fun onPlayerJoin(event: PlayerJoinEvent) {
            event.getPlayer().sendMessage(Component.text("Hello, " + event.getPlayer().name + "!"))
        }
    }
}