package play.ai.dragonrealm.geiloutils.discord.listener;

import net.dv8tion.jda.core.entities.Guild;
import net.dv8tion.jda.core.events.ReadyEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import play.ai.dragonrealm.geiloutils.GeiloUtils;
import play.ai.dragonrealm.geiloutils.config.ConfigurationManager;
import play.ai.dragonrealm.geiloutils.discord.main.GeiloBot;

public class ReadyListener extends ListenerAdapter{
	public void onReady(ReadyEvent event) {
		GeiloUtils.getLogger().info("The bot is running on the following servers: ");
		for (Guild g : event.getJDA().getGuilds()) {
			GeiloUtils.getLogger().info(("Name: " + g.getName() + " ID: " + g.getId()));
			GeiloBot.channelCommands = g.getTextChannelById(ConfigurationManager.getDiscordConfig().getChannelIDCommands());
			GeiloBot.channelIRC = g.getTextChannelById(ConfigurationManager.getDiscordConfig().getChannelIDRelay());
			
			//TODO: Reenable in the final release
			//GeiloBot.channelIRC.sendMessage("Server Online!").queue();
		}
	}
}