# SimpleFlatWorldGen
A simple but customizable flat world generator for minecraft

# Setup
- Download the plugin [here](https://github.com/PenT1x/SimpleFlatWorldGen/releases/latest) and add it as normal
- Choose the plugin as the world generator by adding this to the bukkit.yml file
```yml
worlds:
  world:
    generator: SimpleFlatWorldGen
  world_nether:
    generator: SimpleFlatWorldGen
  world_the_end:
    generator: SimpleFlatWorldGen
```

# Config
```yml
# At what y-level should the first block be placed at
height: 32

# Set a bedrock block at 0,64,0 to spawn on (Forced on void worlds)
set_bedrock_spawn_block: false

# Default layer if world settings can't be found.
default:
  - Bedrock

world:
  - Grass
  - Dirt
  - Dirt
  - Bedrock

world_nether:
  - Netherrack
  - Netherrack
  - Bedrock

world_the_end:
  - Ender_stone
  - Bedrock

# Make a void world like this
void:
  - void

# name_of_your_world:
# - Block1
# - Block2
```
