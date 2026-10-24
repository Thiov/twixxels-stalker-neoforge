# Twixxel's Stalker — NeoForge / Forge port (26.3, 26.2, 26.1.2, 26.1, 1.21.11, 1.21.10, 1.20.1)

A NeoForge port of **[Twixxel's Stalker](https://www.curseforge.com/minecraft/mc-mods/twixxels-stalker)** by **MrPerkasc** (original idea by Twixxel_lesgo, designs by LCrandom), for **NeoForge**. The repository root is the build for the newest Minecraft version, **26.3**. Sister project of the [Fabric port](https://github.com/Thiov/twixxels-stalker-fabric).

> **Looking for another Minecraft version?** The [`26.2/`](26.2/), [`26.1.2/`](26.1.2/), [`26.1/`](26.1/), [`1.21.11/`](1.21.11/), [`1.21.10/`](1.21.10/) and [`1.20.1/`](1.20.1/) subdirectories are self-contained builds for those Minecraft versions (own `build.gradle`, `gradle.properties` and `src/`). Pick the folder that matches your game version. **The 1.20.1 folder is a Forge build** (all others are NeoForge).

> *Something is watching you.* The Stalker is a silent hunter — a flat, unsettling figure that
> appears at the edge of your vision, stands motionless while you look, and closes in the moment you
> turn away.

## Features

- **The Stalker entity** — an invulnerable, camera-facing apparition with several poses.
- **Stalk / behind-scare / chase** events on minute-scale timers (halved in bad weather): it appears,
  stares, and vanishes (leaving Darkness if you get too close), pops up behind you, or chases by
  teleporting toward you *only while you aren't looking at it*, carving through blocks and striking in melee.
- **Ambient "break" sounds** played to all players on a timer.
- **Config file** (`config/twixxels_stalker.json`) for all of the original's tunables.
- **Command:** `/stalker trigger <close_stalk|distant_stalk|behind_scare|chase|break_event>` (permission level 2).

## Supported versions

| Minecraft | Folder | Loader | Java | Jar |
|---|---|---|---|---|
| **26.3** | (this folder) | NeoForge ≥ 26.3.0.97 | 25 | `stalker-1.0.0-neoforge-26.3.jar` |
| **26.2** | [`26.2/`](26.2/) | NeoForge ≥ 26.2.0.7-beta | 25 | `stalker-1.0.0-neoforge-26.2.jar` |
| **26.1.2** | [`26.1.2/`](26.1.2/) | NeoForge ≥ 26.1.2.75 | 25 | `stalker-1.0.0-neoforge-26.1.2.jar` |
| **26.1** | [`26.1/`](26.1/) | NeoForge ≥ 26.1.0.19-beta | 25 | `stalker-1.0.0-neoforge-26.1.jar` |
| **1.21.11** | [`1.21.11/`](1.21.11/) | NeoForge ≥ 21.11.42 | 21 | `stalker-1.0.0-neoforge-1.21.11.jar` |
| **1.21.10** | [`1.21.10/`](1.21.10/) | NeoForge ≥ 21.10.64 | 21 | `stalker-1.0.0-neoforge-1.21.10.jar` |
| **1.20.1** | [`1.20.1/`](1.20.1/) | Forge ≥ 47.1 | 17 | `stalker-1.0.0-forge-1.20.1.jar` |

## Requirements (this folder, Minecraft 26.3)

- Minecraft **26.3** · **NeoForge** 26.3.0.97+ · **Java 25**

## Building

The included `gradlew` downloads Gradle on first run (Gradle 9.7.1; the Forge 1.20.1 folder uses 8.14.5, which needs a JDK 17-21 to run Gradle). Build with **JDK 25**:

```bash
JAVA_HOME=/path/to/jdk-25 ./gradlew build
```

The mod jar is produced in `build/libs/`. The `1.21.x` folders run on Java 21 and `1.20.1` on Java 17; the JDK for the game side is provisioned through Gradle toolchains.

## Version notes

- **26.x** (NeoForge, ModDevGradle 2.0.141; 26.3 needs 2.0.148 to recompile the new Minecraft sources). 26.1 / 26.1.2 / 26.2 / 26.3 share the same source apart from API drift: 26.2+ reworked `LivingEntity.knockback` and 26.3 renamed `PoseStack.mulPose(Quaternionf)` to `rotate(...)`.
- **1.21.10 / 1.21.11** (NeoForge 21.10 / 21.11): 1.21.10 still names `ResourceLocation` (renamed `Identifier` in 1.21.11) and `RenderType` (`RenderTypes` in 1.21.11). Before 26.1 the camera render state only exposes a rotation quaternion, so the billboard uses `orientation * Ry(180°)`, which equals the 26.x `Ry(-yaw) * Rx(pitch)`.
- **1.20.1 is Forge** (ForgeGradle-free ModDevGradle *legacy* + Parchment, like the Cave Dweller port): Forge `DeferredRegister`/`RegistryObject`, `FMLJavaModLoadingContext`, no render states — the billboard is drawn straight from `EntityRenderer.render`, entity data uses `CompoundTag`.
- The 26.1.2 build keeps the original `SubmitNodeBufferSource` render shim; the other 26.x and 1.21.x builds submit the quad straight through `SubmitNodeCollector.submitCustomGeometry`.

## Credits & license

Original mod and assets: **MrPerkasc** / Twixxel_lesgo / LCrandom. NeoForge / Forge port: **Thiov**.
Licensed under the **MIT License** (matching the original); see [LICENSE](LICENSE). Unofficial fan port,
not affiliated with or endorsed by the original authors.
