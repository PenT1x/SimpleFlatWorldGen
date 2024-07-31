package com.pent1x.simpleflatworldgen;

import com.pent1x.simpleflatworldgen.SimpleFlatWorldGen;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.generator.ChunkGenerator;

import java.util.List;
import java.util.Random;

public class Chunk extends ChunkGenerator {
    int height;

    List<String> layers;

    public Chunk(String worldName) {
        // Get config
        FileConfiguration config = SimpleFlatWorldGen.getInstance().getConfig();
        height = config.getInt("height");

        layers = config.getStringList(worldName);

        if (layers.isEmpty()) layers = config.getStringList("default");
    }

    @Override
    public ChunkData generateChunkData(World world, Random random, int chunkX, int chunkZ, BiomeGrid biome) {
        ChunkData chunkData = createChunkData(world);

        if (layers.get(0).toLowerCase().equals("void")) return chunkData;

        for (int x = 0; x < 16; x++) {
            for (int z = 0; z < 16; z++) {
                int y = height - layers.size();
                for (int i = layers.size() - 1; i >= 0; i--) {
                    chunkData.setBlock(x, y, z, Material.getMaterial(layers.get(i).toUpperCase()));
                    y++;
                }
            }
        }

        return chunkData;
    }
}
