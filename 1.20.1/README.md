# Twixxel's Stalker — Forge 1.20.1

Self-contained Forge build of **[Twixxel's Stalker](https://www.curseforge.com/minecraft/mc-mods/twixxels-stalker)** (original by **MrPerkasc**, idea by Twixxel_lesgo, designs by LCrandom) for **Minecraft 1.20.1**. See the [main README](../README.md) for the feature list and the other supported versions.

**Forge** build (Forge 47.x, ModDevGradle legacy with Parchment mappings), not NeoForge. No render states or submit pipeline on 1.20.1: the billboard is drawn straight from `EntityRenderer.render`.

## Requirements

- Minecraft **1.20.1**
- **Forge** 47.1+ (built against 47.4.20)
- **Java 17**

## Building

```bash
JAVA_HOME=/path/to/jdk-21 ./gradlew build   # Gradle 8.14.5 (via the wrapper; run it on JDK 17-21)
# Output: build/libs/stalker-1.0.0-forge-1.20.1.jar
```

The JDK for the game side is provisioned automatically through Gradle toolchains.

## Credits & license

Original mod and assets: **MrPerkasc** / Twixxel_lesgo / LCrandom. Forge port: **Thiov**. MIT License, see [LICENSE](LICENSE). Unofficial fan port, not affiliated with the original author.
