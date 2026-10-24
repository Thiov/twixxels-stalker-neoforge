package com.thestalker.registry;

import com.thestalker.entity.StalkerEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, "stalker");

    public static final RegistryObject<EntityType<StalkerEntity>> STALKER =
            ENTITIES.register("stalker", () ->
                    EntityType.Builder.<StalkerEntity>of(StalkerEntity::new, MobCategory.MISC)
                            .sized(0.6F, 0.7F)
                            .clientTrackingRange(64)
                            .build("stalker"));
}
