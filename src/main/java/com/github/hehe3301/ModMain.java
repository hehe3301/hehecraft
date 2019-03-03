package com.github.hehe3301;

import com.github.hehe3301.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ModMain.MODID, name = ModMain.NAME, version = ModMain.VERSION)
public class ModMain
{

    public static final String MODID = "hehecraft";
    public static final String NAME = "hehecraft";
    public static final String VERSION = "1.12.2-0.1";
    public static final String ACCEPTED_VERSIONS = "[1.12.2]";
    public static final String CLIENT_PROXY_CLASS = "com.github.hehe3301.proxy.ClientProxy";
    public static final String COMMON_PROXY_CLASS = "com.github.hehe3301.proxy.CommonProxy";

    private static Logger logger;

    @Instance
    public static ModMain instance;

    @SidedProxy(clientSide = CLIENT_PROXY_CLASS, serverSide = COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("THE LUMP LIVES!!!");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    }
}
