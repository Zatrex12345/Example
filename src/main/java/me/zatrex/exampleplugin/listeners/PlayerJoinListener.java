package me.zatrex.exampleplugin.listeners;

import me.zatrex.exampleplugin.utils.CC;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener  {
	
	@EventHandler
	public void onPlayerJoinEvent(PlayerJoinEvent event) {
	  Player player = event.getPlayer();
	  player.sendMessage(CC.translate("&fWelcome to &b&lExample Server"));
	}
}
