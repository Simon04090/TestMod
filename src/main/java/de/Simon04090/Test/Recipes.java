package de.Simon04090.Test;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {

	public static void addShpedReceipe() {
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.cobblestone), new Object[]{"x", "x", "x", 'x', Blocks.dirt});	
	}

	public static void addShapelessRecipes() {
		GameRegistry.addShapelessRecipe(new ItemStack(Items.apple), Blocks.cobblestone, Blocks.cobblestone, Blocks.dirt);
	}

	public static void addFurnaceRecipes() {
		GameRegistry.addSmelting(Items.apple, new ItemStack(Items.leather),	7.0F);
	}

}
