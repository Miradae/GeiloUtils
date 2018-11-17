package play.ai.dragonrealm.geiloutils.discord.command;

import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import play.ai.dragonrealm.geiloutils.discord.main.GeiloBot;

import javax.annotation.Nullable;

public class BotSender implements ICommandSender {

    public static BotSender INSTANCE = new BotSender();
    public static BotSender BLOCK_INSTANCE = new BotSender(true);



    private boolean useBlockResp = false;

    public BotSender(boolean useBlockResp) {
        this.useBlockResp = useBlockResp;
    }

    public BotSender(){}

    @Override
    public String getName() {
        return "[GeiloBot]";
    }

    @Override
    public boolean canUseCommand(int permLevel, String commandName) {
        return true;
    }

    @Override
    public World getEntityWorld() {
        return getServer().getWorld(0);
    }

    @Nullable
    @Override
    public MinecraftServer getServer() {
        return FMLCommonHandler.instance().getMinecraftServerInstance();
    }

    @Override
    public void sendMessage(ITextComponent component){
        if(useBlockResp){
            GeiloBot.channelIRC.sendMessage("```" + component.getUnformattedText() + "```").queue();
            return;
        }
        GeiloBot.channelIRC.sendMessage(component.getUnformattedText()).queue();
    }
}