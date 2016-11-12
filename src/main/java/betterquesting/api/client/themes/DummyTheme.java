package betterquesting.api.client.themes;

import java.awt.Color;
import net.minecraft.util.ResourceLocation;
import betterquesting.api.enums.EnumQuestState;
import betterquesting.api.quests.IQuest;

/**
 * A dummy theme used by GuiElements when BetterQuesting isn't loaded
 */
public final class DummyTheme implements IThemeBase
{
	public static final DummyTheme INSTANCE = new DummyTheme();
	
	private final ResourceLocation TEX = new ResourceLocation("missingno");
	private final ResourceLocation ID = new ResourceLocation("NULL");
	
	private DummyTheme()
	{
	}
	
	@Override
	public ResourceLocation getThemeID()
	{
		return ID;
	}
	
	@Override
	public String getDisplayName()
	{
		return "NULL";
	}
	
	@Override
	public ResourceLocation getGuiTexture()
	{
		return TEX;
	}
	
	@Override
	public int getQuestIconColor(IQuest quest, EnumQuestState state, int hoverState)
	{
		return Color.GRAY.getRGB();
	}
	
	@Override
	public int getQuestLineColor(IQuest quest, EnumQuestState state)
	{
		return Color.GRAY.getRGB();
	}
	
	@Override
	public int getTextColor()
	{
		return Color.BLACK.getRGB();
	}
	
	@Override
	public short getLineStipple(IQuest quest, EnumQuestState state)
	{
		return (short)0xAAAA;
	}
	
	@Override
	public float getLineWidth(IQuest quest, EnumQuestState state)
	{
		return 4F;
	}

	@Override
	public ResourceLocation getButtonSound()
	{
		return new ResourceLocation("gui.button.press");
	}
}