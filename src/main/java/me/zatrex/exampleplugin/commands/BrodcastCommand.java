package me.zatrex.exampleplugin.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandPermission;
import co.aikar.commands.annotation.Description;
import co.aikar.commands.annotation.Default;

import me.zatrex.exampleplugin.utils.CC;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

@CommandAlias("brodcast")
@CommandPermission("example.admin.brodcast")
@Description("brodcast message.")
public class BrodcastCommand extends BaseCommand {

    @Default
	public void execute(Player player, String message) {
		Bukkit.broadcastMessage(CC.translate(message));
	}
}