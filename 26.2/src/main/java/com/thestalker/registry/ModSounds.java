package com.thestalker.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(Registries.SOUND_EVENT, "stalker");

    public static final DeferredHolder<SoundEvent, SoundEvent> BREAK_EVENT_1 = register("break_event_1");
    public static final DeferredHolder<SoundEvent, SoundEvent> BREAK_EVENT_2 = register("break_event_2");
    public static final DeferredHolder<SoundEvent, SoundEvent> BREAK_EVENT_3 = register("break_event_3");
    public static final DeferredHolder<SoundEvent, SoundEvent> BREAK_EVENT_4 = register("break_event_4");

    private static DeferredHolder<SoundEvent, SoundEvent> register(String name) {
        return SOUNDS.register(name, () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("stalker", name)));
    }
}
