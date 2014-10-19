package minechem.item.polytool.types;

import minechem.item.element.ElementEnum;
import minechem.item.polytool.PolytoolUpgradeType;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class PolytoolTypeSulfur extends PolytoolUpgradeType
{

	public PolytoolTypeSulfur()
	{
		super();
	}

	@Override
	public float getStrVsBlock(ItemStack itemStack, Block block)
	{

		return 0;
	}

	@Override
	public void hitEntity(ItemStack itemStack, EntityLivingBase target, EntityLivingBase player)
	{
		target.setFire((int) (power + 1));
	}

	@Override
	public void onBlockDestroyed(ItemStack itemStack, World world, Block block, int x, int y, int z, EntityLivingBase entityLiving)
	{
	}

	@Override
	public ElementEnum getElement()
	{

		return ElementEnum.S;
	}

	@Override
	public void onTick()
	{
	}

	@Override
	public String getDescription()
	{

		return "Sets entities on fire";
	}

}
