package me.zatrex.exampleplugin;

import co.aikar.commands.BukkitCommandCompletionContext;
import co.aikar.commands.CommandCompletions;
import co.aikar.commands.BukkitCommandManager;

import me.zatrex.exampleplugin.listeners.PlayerJoinListener;
import me.zatrex.exampleplugin.listeners.PlayerDeathListener;
import me.zatrex.exampleplugin.commands.BrodcastCommand;
import me.zatrex.exampleplugin.commands.FlyCommand;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;

public final class ExamplePlugin extends JavaPlugin {

    public static ExamplePlugin instance;
    private BukkitCommandManager commandManager;

    @Override
    public void onEnable() {
	getLogger().info("Loading Example plugin.");
	// set instance
	instance = this;

	getLogger().info("Loading Example plugin.");

	// config
	saveDefaultConfig();

	// load listeners
	getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
	getServer().getPluginManager().registerEvents(new PlayerDeathListener(), this);

        // load comands
	commandLoad();

	getLogger().info("Loaded Example plugin!");
    }

    private void commandLoad() {
        commandManager = new BukkitCommandManager(this);
        commands();
    }

    private void commands() {
        Arrays.asList(
		        new BrodcastCommand(),
		        new FlyCommand()
        ).forEach(command -> commandManager.registerCommand(command));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
	getLogger().info("Disabled Example plugin!");
    }

     public static ExamplePlugin get() {
	return instance;
     }
}