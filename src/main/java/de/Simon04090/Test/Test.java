package de.Simon04090.Test;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import de.Simon04090.Test.Proxies.CommonProxy;

@Mod(modid = Test.modid, version = Test.version, name = "Test")

public class Test {
	
	public static final String modid = "Test";
	private static final String mcversion = "1.7.2";
	private static final String majorversion = "0";
	private static final String minorversion = "1";
	private static final String buildnumber = "1";
	public static final String version = mcversion + "." + majorversion + "." + minorversion  + "." + buildnumber;
	
	@Instance (value = modid)
	public static Test instance;
	
	@SidedProxy (clientSide = "de.Simon04090.Test.Proxies.ClientProxy", serverSide = "de.Simon04090.Test.Proxies.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit (FMLPreInitializationEvent event){	
	}
	
	@EventHandler
	public void Init (FMLInitializationEvent event){
		proxy.registerRenderes();
		
	
	}
	
	
	@EventHandler
	public void postInit (FMLPostInitializationEvent event){
		
	}
	
	
}
