# Twixxel's Stalker — NeoForge 1.21.10

Self-contained NeoForge build of **[Twixxel's Stalker](https://www.curseforge.com/minecraft/mc-mods/twixxels-stalker)** (original by **MrPerkasc**, idea by Twixxel_lesgo, designs by LCrandom) for **Minecraft 1.21.10**. See the [main README](../README.md) for the feature list and the other supported versions.

NeoForge 21.10. Uses `ResourceLocation` (renamed `Identifier` in 1.21.11) and `RenderType` (`RenderTypes` in 1.21.11).

## Requirements

- Minecraft **1.21.10**
- **NeoForge** 21.10.64+
- **Java 21**

## Building

```bash
JAVA_HOME=/path/to/jdk-25 ./gradlew build   # Gradle 9.7.1 (via the wrapper)
# Output: build/libs/stalker-1.0.0-neoforge-1.21.10.jar
```

The JDK for the game side is provisioned automatically through Gradle toolchains.

## Credits & license

Original mod and assets: **MrPerkasc** / Twixxel_lesgo / LCrandom. NeoForge port: **Thiov**. MIT License, see [LICENSE](LICENSE). Unofficial fan port, not affiliated with the original author.
