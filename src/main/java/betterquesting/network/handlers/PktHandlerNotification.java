package betterquesting.network.handlers;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import betterquesting.api.network.IPacketHandler;
import betterquesting.client.QuestNotification;
import betterquesting.network.PacketTypeNative;

public class PktHandlerNotification implements IPacketHandler
{
	@Override
	public ResourceLocation getRegistryName()
	{
		return PacketTypeNative.NOTIFICATION.GetLocation();
	}
	
	@Override
	public void handleServer(NBTTagCompound data, EntityPlayerMP sender)
	{
	}
	
	@Override
	public void handleClient(NBTTagCompound data)
	{
		ItemStack stack = new ItemStack(data.getCompoundTag("Icon"));
		String mainTxt = data.getString("Main");
		String subTxt = data.getString("Sub");
		String sound = data.getString("Sound");
		QuestNotification.ScheduleNotice(mainTxt, subTxt, stack, sound);
	}
}
