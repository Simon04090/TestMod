package de.simon04090.test;

import net.minecraft.block.Block;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import de.simon04090.test.proxy.CommonProxy;
import de.simon04090.test.util.LogHelper;

@Mod(modid = Test.modid, version = Test.version, name = "Test")
public class Test {

	public static final String modid = "Test";
	private static final String mcversion = "1.7.2";
	private static final String majorversion = "0";
	private static final String minorversion = "1";
	private static final String buildnumber = "1";
	public static final String version = mcversion + "." + majorversion + "."
			+ minorversion + "." + buildnumber;

	@Instance(value = modid)
	public static Test instance;

	@SidedProxy(clientSide = "de.simon04090.test.proxy.ClientProxy", serverSide = "de.simon04090.test.proxy.CommonProxy")
	public static CommonProxy proxy;

	public Block BlockTest;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		BlockTest = new BlockTest().setBlockName("testBlock")
				.setBlockTextureName(modid + ":" + "Test").setHardness(1.0F)
				.setResistance(0.8F);
		GameRegistry.registerBlock(BlockTest, ItemBlockTest.class, modid + ":"
				+ BlockTest.getUnlocalizedName().substring(5));

	}

	@EventHandler
	public void Init(FMLInitializationEvent event) {
		proxy.registerRenderes();
		Recipes.addShpedReceipe();
		Recipes.addShapelessRecipes();
		Recipes.addFurnaceRecipes();
		LogHelper.addloginfo("All Recipes were succesful loaded!");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}
}
