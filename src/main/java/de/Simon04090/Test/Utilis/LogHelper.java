package de.Simon04090.Test.Utilis;

import org.apache.logging.log4j.Level;

import cpw.mods.fml.common.FMLLog;
import de.Simon04090.Test.Test;

public class LogHelper {
	public static void addLog(Level level, String message, Object... data) {
		FMLLog.log(Test.modid, level, message, data);
	}

	public static void addloginfo(String message, Object... data) {
		FMLLog.log(Test.modid, Level.INFO, message, data);
	}

	public static void addlogwarn(String message, Object... data) {
		FMLLog.log(Test.modid, Level.WARN, message, data);
	}
}
