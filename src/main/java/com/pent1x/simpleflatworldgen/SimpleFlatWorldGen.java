package com.pent1x.simpleflatworldgen;

import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

public final class SimpleFlatWorldGen extends JavaPlugin {
    static SimpleFlatWorldGen instance;

    @Override
    public void onEnable() {
        instance = this;

        saveDefaultConfig();
    }

    public static SimpleFlatWorldGen getInstance() {
        return instance;
    }

    @Override
    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        if (worldName == null) worldName = "world";

        return new Chunk(worldName);
    }
}
