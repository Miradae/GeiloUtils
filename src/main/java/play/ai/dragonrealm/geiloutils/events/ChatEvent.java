package play.ai.dragonrealm.geiloutils.events;

import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import play.ai.dragonrealm.geiloutils.config.ConfigurationManager;
import play.ai.dragonrealm.geiloutils.discord.main.DiscordBotMain;

public class ChatEvent {
	@SubscribeEvent
	public void onMessage(ServerChatEvent event) {
		if(ConfigurationManager.getDiscordConfig().isEnabled()) {
			String prefix = ConfigurationManager.getDiscordConfig().getDiscordChatPrefix();
			String finMsg = "";
			if(prefix.contains("%s")) {
				finMsg += String.format(prefix, event.getUsername());
			} else {
				finMsg += prefix + " " + event.getUsername() + " ";
			}
			finMsg += event.getMessage();
			DiscordBotMain.getInstance().sendMessageDiscord(finMsg);
			//GeiloUtils.getLogger().info("MSG: " + event.getMessage());
		}
	}

}
