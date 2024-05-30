package me.zatrex.exampleplugin.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandPermission;
import co.aikar.commands.annotation.Description;
import co.aikar.commands.annotation.Default;

import me.zatrex.exampleplugin.utils.CC;

import org.bukkit.entity.Player;

@CommandAlias("fly")
@CommandPermission("example.donator.fly")
@Description("enable fly for player.")
public class FlyCommand extends BaseCommand {

    @Default
	public void execute(Player player) {
			if (player.getAllowFlight()) {
				player.setAllowFlight(false);
				player.setFlying(false);
				player.sendMessage(CC.RED + "Fly has been disabled.");
			} else {
				player.setAllowFlight(true);
				player.setFlying(true);
				player.sendMessage(CC.GREEN + "Fly has been enabled.");
		}
	}
}