package me.zatrex.exampleplugin.listeners;

import me.zatrex.exampleplugin.utils.CC;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuitListener implements Listener {

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        event.setQuitMessage(null); // remove default message
        Bukkit.broadcastMessage(CC.translate("&b&l" + player.getName() + " &fhas left the game."));
    }
}
