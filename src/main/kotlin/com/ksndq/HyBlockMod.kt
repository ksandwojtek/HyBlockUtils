package com.ksndq

import com.ksndq.commands.CommandManager
import com.ksndq.config.ConfigManager
import com.ksndq.config.categories.HyBlockConfig
import com.ksndq.features.EmeraldRingSilencer
import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.fml.common.Loader
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent

@Mod(modid = HyBlockMod.MOD_ID, useMetadata = true)
class HyBlockMod {

    @Mod.EventHandler
    fun init(event: FMLInitializationEvent) {
        configManager = ConfigManager()
        MinecraftForge.EVENT_BUS.register(configManager)
    }

    @Mod.EventHandler
    fun preInit(event: FMLPreInitializationEvent) {
        CommandManager()

        MinecraftForge.EVENT_BUS.register(EmeraldRingSilencer())
    }

    companion object {
        lateinit var configManager: ConfigManager
        const val MOD_ID = "examplemod"

        @JvmStatic
        val version: String
            get() = Loader.instance().indexedModList[MOD_ID]!!.version

        val config: HyBlockConfig
            get() = configManager.config ?: error("config is null")
    }
}
