package com.thestalker.registry;

import com.thestalker.entity.StalkerEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(Registries.ENTITY_TYPE, "stalker");

    public static final ResourceKey<EntityType<?>> STALKER_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath("stalker", "stalker"));

    public static final DeferredHolder<EntityType<?>, EntityType<StalkerEntity>> STALKER =
            ENTITIES.register("stalker", () ->
                    EntityType.Builder.<StalkerEntity>of(StalkerEntity::new, MobCategory.MISC)
                            .sized(0.6F, 0.7F)
                            .clientTrackingRange(64)
                            .build(STALKER_KEY));
}
