# Twixxel's Stalker — NeoForge 26.2

Self-contained NeoForge build of **[Twixxel's Stalker](https://www.curseforge.com/minecraft/mc-mods/twixxels-stalker)** (original by **MrPerkasc**, idea by Twixxel_lesgo, designs by LCrandom) for **Minecraft 26.2**. See the [main README](../README.md) for the feature list and the other supported versions.

Identical source to 26.3 except `PoseStack.mulPose(Quaternionf)` (26.3 renamed it to `rotate`). NeoForge 26.2 builds with ModDevGradle 2.0.141.

## Requirements

- Minecraft **26.2**
- **NeoForge** 26.2.0.7-beta+
- **Java 25**

## Building

```bash
JAVA_HOME=/path/to/jdk-25 ./gradlew build   # Gradle 9.7.1 (via the wrapper)
# Output: build/libs/stalker-1.0.0-neoforge-26.2.jar
```

The JDK for the game side is provisioned automatically through Gradle toolchains.

## Credits & license

Original mod and assets: **MrPerkasc** / Twixxel_lesgo / LCrandom. NeoForge port: **Thiov**. MIT License, see [LICENSE](LICENSE). Unofficial fan port, not affiliated with the original author.
