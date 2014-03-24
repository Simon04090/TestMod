package de.simon04090.test;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockTest extends ItemBlock {

	public ItemBlockTest(Block par1) {
		super(par1);
		setHasSubtypes(true);

	}

	@Override
	public String getUnlocalizedName(ItemStack par1ItemStack) {
		String name = "";
		switch (par1ItemStack.getItemDamage()) {
		case 0: {
			name = "world";
			break;
		}
		case 1: {
			name = "nether";
			break;
		}
		default:
			name = "broken";
		}
		return super.getUnlocalizedName(par1ItemStack) + "." + name;
	}

	@Override
	public int getMetadata(int par1) {
		return par1;
	}
}
