# Twixxel's Stalker — NeoForge 26.1.2 port

> This folder is the original, unchanged 26.1.2 build. See the [main README](../README.md) for the other supported Minecraft versions (26.3, 26.2, 26.1, 1.21.11, 1.21.10, and Forge 1.20.1).

A NeoForge port of **[Twixxel's Stalker](https://www.curseforge.com/minecraft/mc-mods/twixxels-stalker)** by **MrPerkasc** (original idea by Twixxel_lesgo, designs by LCrandom), for **NeoForge on Minecraft 26.1.2**. Sister project of the [Fabric port](https://github.com/Thiov/twixxels-stalker-fabric).

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

## Requirements

- Minecraft **26.1.2** · **NeoForge** 26.1.2.x · **Java 25**

## Building

The included `gradlew` downloads Gradle on first run. Build with **JDK 25**:

```bash
JAVA_HOME=/path/to/jdk-25 ./gradlew build
```

The mod jar is produced in `build/libs/`.

## Credits & license

Original mod and assets: **MrPerkasc** / Twixxel_lesgo / LCrandom. NeoForge 26.1.2 port: **Thiov**.
Licensed under the **MIT License** (matching the original); see [LICENSE](LICENSE). Unofficial fan port,
not affiliated with or endorsed by the original authors.
