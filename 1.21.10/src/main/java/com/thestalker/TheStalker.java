package com.thestalker;

import com.mojang.logging.LogUtils;
import com.thestalker.command.StalkerCommand;
import com.thestalker.entity.StalkerEntity;
import com.thestalker.events.StalkerScheduler;
import com.thestalker.registry.ModEntities;
import com.thestalker.registry.ModSounds;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.RegisterCommandsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.event.server.ServerStartedEvent;
import net.neoforged.neoforge.event.server.ServerStoppingEvent;
import net.neoforged.neoforge.event.tick.ServerTickEvent;
import org.slf4j.Logger;

@Mod(TheStalker.MOD_ID)
public class TheStalker {
    public static final String MOD_ID = "stalker";
    public static final Logger LOG = LogUtils.getLogger();

    private final StalkerScheduler scheduler = new StalkerScheduler();

    public TheStalker(IEventBus modEventBus) {
        StalkerConfig.load();

        ModSounds.SOUNDS.register(modEventBus);
        ModEntities.ENTITIES.register(modEventBus);

        modEventBus.addListener(this::createAttributes);

        NeoForge.EVENT_BUS.addListener((ServerStartedEvent e) -> scheduler.onServerStarted(e.getServer()));
        NeoForge.EVENT_BUS.addListener((ServerStoppingEvent e) -> scheduler.onServerStopping());
        NeoForge.EVENT_BUS.addListener((ServerTickEvent.Post e) -> scheduler.onServerTick(e.getServer()));
        NeoForge.EVENT_BUS.addListener((RegisterCommandsEvent e) -> StalkerCommand.register(e.getDispatcher(), scheduler));
    }

    private void createAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.STALKER.get(), StalkerEntity.createAttributes().build());
    }
}
