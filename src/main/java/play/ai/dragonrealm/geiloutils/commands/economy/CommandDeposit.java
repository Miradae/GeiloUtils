package play.ai.dragonrealm.geiloutils.commands.economy;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import play.ai.dragonrealm.geiloutils.utils.MoneyUtils;
import play.ai.dragonrealm.geiloutils.utils.PlayerUtils;

public class CommandDeposit extends CommandBase{

	@Override
	public String getName() {
	    return "deposit";
	}

	@Override
	public String getUsage(ICommandSender sender) {
	    return "Use this to deposit money from the Good ol' Currency mod on your digital bank account";
	}
	
	@Override
	public List<String> getAliases(){
	    ArrayList<String> al = new ArrayList<String>();
	    al.add("dep");
	    al.add("Deposit");
	    al.add("Dep");
	    return al;
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		if ((sender instanceof EntityPlayer))
	    {
	      EntityPlayer player = (EntityPlayer)sender;
	      Double tmp = Double.valueOf(MoneyUtils.getMoneyValueAndRemove(player));
	      PlayerUtils.addPlayerMoney(player, tmp.doubleValue());
	      ITextComponent msg = new TextComponentString("[GeiloEconomy] You made a deposit of " + tmp.toString() + "$. Your new balance is: " + PlayerUtils.getPlayerBalance(player));
	      player.sendMessage(msg);
	    }
	}
	
	@Override
	public boolean checkPermission(MinecraftServer server, ICommandSender sender)
    {
        return true;
    }
}
