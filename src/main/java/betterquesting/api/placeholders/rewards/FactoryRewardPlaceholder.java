package betterquesting.api.placeholders.rewards;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import betterquesting.api.enums.EnumSaveType;
import betterquesting.api.misc.IFactory;

public class FactoryRewardPlaceholder implements IFactory<RewardPlaceholder>
{
	public static final FactoryRewardPlaceholder INSTANCE = new FactoryRewardPlaceholder();
	
	private final ResourceLocation ID = new ResourceLocation("betterquesting:placeholder");
	
	private FactoryRewardPlaceholder()
	{
	}
	
	@Override
	public ResourceLocation getRegistryName()
	{
		return ID;
	}
	
	@Override
	public RewardPlaceholder createNew()
	{
		return new RewardPlaceholder();
	}
	
	@Override
	public RewardPlaceholder loadFromNBT(NBTTagCompound nbt)
	{
		RewardPlaceholder reward = createNew();
		reward.readFromNBT(nbt, EnumSaveType.CONFIG);
		return reward;
	}
}
