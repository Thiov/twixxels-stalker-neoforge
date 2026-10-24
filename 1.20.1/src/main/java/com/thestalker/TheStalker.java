package com.thestalker;

import com.mojang.logging.LogUtils;
import com.thestalker.command.StalkerCommand;
import com.thestalker.entity.StalkerEntity;
import com.thestalker.events.StalkerScheduler;
import com.thestalker.registry.ModEntities;
import com.thestalker.registry.ModSounds;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.server.ServerStartedEvent;
import net.minecraftforge.event.server.ServerStoppingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(TheStalker.MOD_ID)
public class TheStalker {
    public static final String MOD_ID = "stalker";
    public static final Logger LOG = LogUtils.getLogger();

    private final StalkerScheduler scheduler = new StalkerScheduler();

    public TheStalker() {
        StalkerConfig.load();

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModSounds.SOUNDS.register(modEventBus);
        ModEntities.ENTITIES.register(modEventBus);

        modEventBus.addListener(this::createAttributes);

        MinecraftForge.EVENT_BUS.addListener((ServerStartedEvent e) -> scheduler.onServerStarted(e.getServer()));
        MinecraftForge.EVENT_BUS.addListener((ServerStoppingEvent e) -> scheduler.onServerStopping());
        MinecraftForge.EVENT_BUS.addListener((TickEvent.ServerTickEvent e) -> {
            if (e.phase == TickEvent.Phase.END) {
                scheduler.onServerTick(e.getServer());
            }
        });
        MinecraftForge.EVENT_BUS.addListener((RegisterCommandsEvent e) -> StalkerCommand.register(e.getDispatcher(), scheduler));
    }

    private void createAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.STALKER.get(), StalkerEntity.createAttributes().build());
    }
}
