package me.zatrex.exampleplugin.listeners;

import me.zatrex.exampleplugin.utils.CC;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDeathListener implements Listener  {

	@EventHandler
	public void onPlayerDeathEvent(PlayerDeathEvent event) {
	  Player player = event.getEntity();
	  Player killer = player.getKiller();
	  player.sendMessage(CC.translate("&c&lYOU DIED"));
	  event.setDeathMessage(CC.translate("&b&l" + player.getName() + " &fhas been killed by &b&l" + killer.getName()));
    }
}
