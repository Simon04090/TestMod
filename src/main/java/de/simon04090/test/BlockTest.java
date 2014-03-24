package de.simon04090.test;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import de.simon04090.test.util.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class BlockTest extends Block {

	public BlockTest() {
		super(Material.sand);
		setStepSound(soundTypeSand);
		setHardness(10.0F);
		setCreativeTab(CreativeTabs.tabBlock);
	}

	@Override
	public int damageDropped(int par1) {
		return par1;
	}

	@SideOnly(Side.CLIENT)
	private IIcon[] icons;

	@Override
	public void registerBlockIcons(IIconRegister par1IconRegister) {
		icons = new IIcon[4];
		for (int i = 0; i < icons.length; i++) {
			icons[i] = par1IconRegister.registerIcon(Test.modid + ":"
					+ (this.getUnlocalizedName().substring(5)) + i);
		}
	}

	public IIcon getIcon(int par1, int par2) {
		switch (par2) {
		case 0:
			switch (par1) {
			case 0:
				return icons[0];
			case 1:
				return icons[1];
			default:
				return icons[2];
			}
		case 1: {
			return icons[3];

		}
		default: {
			LogHelper.addlogwarn("Invalid metadata for "
					+ this.getUnlocalizedName());
			return icons[0];

		}
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs,
			List par3List) {
		for (int i = 0; i < 2; i++) {
			par3List.add(new ItemStack(par1, 1, i));
		}
	}
}