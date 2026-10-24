# Twixxel's Stalker — NeoForge 26.1

Self-contained NeoForge build of **[Twixxel's Stalker](https://www.curseforge.com/minecraft/mc-mods/twixxels-stalker)** (original by **MrPerkasc**, idea by Twixxel_lesgo, designs by LCrandom) for **Minecraft 26.1**. See the [main README](../README.md) for the feature list and the other supported versions.

Same code era as 26.2 / 26.1.2; `LivingEntity.knockback(double, double, double)` is still the 3-argument form (26.2 reworked it).

## Requirements

- Minecraft **26.1**
- **NeoForge** 26.1.0.19-beta+
- **Java 25**

## Building

```bash
JAVA_HOME=/path/to/jdk-25 ./gradlew build   # Gradle 9.7.1 (via the wrapper)
# Output: build/libs/stalker-1.0.0-neoforge-26.1.jar
```

The JDK for the game side is provisioned automatically through Gradle toolchains.

## Credits & license

Original mod and assets: **MrPerkasc** / Twixxel_lesgo / LCrandom. NeoForge port: **Thiov**. MIT License, see [LICENSE](LICENSE). Unofficial fan port, not affiliated with the original author.
