package play.ai.dragonrealm.geiloutils.config.discord;

import play.ai.dragonrealm.geiloutils.discord.utils.DiscordRank;

import java.util.List;
import java.util.Map;

public class ConfigDiscord {
	private boolean enabled;
	private boolean isSingleToMulti;
	private String token;
	private String channelIDCommands;
	private String channelIDRelay;
	private String minecraftChatPrefix;
	private String discordChatPrefix;
	private String discordCommandPrefix;
	private List<String> validColors;
	private String serverIP;
	private Map<Long, DiscordRank> adminMap;
	private Map<String, List<String>> patronRanks;
	private String patronGlobalRank;

	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getChannelIDCommands() {
		return channelIDCommands;
	}
	public void setChannelIDCommands(String channelIDCommands) {
		this.channelIDCommands = channelIDCommands;
	}
	public String getChannelIDRelay() {
		return channelIDRelay;
	}
	public void setChannelIDRelay(String channelIDRelay) {
		this.channelIDRelay = channelIDRelay;
	}
	public String getMinecraftChatPrefix() {
		return minecraftChatPrefix;
	}
	public void setMinecraftChatPrefix(String minecraftChatPrefix) {
		this.minecraftChatPrefix = minecraftChatPrefix;
	}
	public String getDiscordChatPrefix() {
		return discordChatPrefix;
	}
	public void setDiscordChatPrefix(String discordChatPrefix) {
		this.discordChatPrefix = discordChatPrefix;
	}
	public String getDiscordCommandPrefix() {
		return discordCommandPrefix;
	}
	public void setDiscordCommandPrefix(String discordCommandPrefix) {
		this.discordCommandPrefix = discordCommandPrefix;
	}

	public void setPatronRanks(Map<String, List<String>> patronRanks) {
		this.patronRanks = patronRanks;
	}
	public Map<String, List<String>> getPatronRanks() {
		return patronRanks;
	}
	public String getPatronGlobalRank(){return patronGlobalRank;}

	public void setPatronGlobalRank(String patronGlobalRank) {
		this.patronGlobalRank = patronGlobalRank;
	}

	public boolean isSingleToMulti() {
		return isSingleToMulti;
	}

	public void setSingleToMulti(boolean singleToMulti) {
		isSingleToMulti = singleToMulti;
	}

	public void setValidColors(List<String> validColors) {
		this.validColors = validColors;
	}

	public List<String> getValidColors() {
		return validColors;
	}

	public void setServerIP(String serverIP) {
		this.serverIP = serverIP;
	}

	public String getServerIP() {
		return serverIP;
	}

	public void setAdminMap(Map<Long, DiscordRank> adminMap) {
		this.adminMap = adminMap;
	}

	public Map<Long, DiscordRank> getAdminMap() {
		return adminMap;
	}
}
