package com.nightmare.boundless_ores.fabric;

import com.nightmare.boundless_ores.Boundless_ores;
import net.fabricmc.api.ModInitializer;

public final class Boundless_oresFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        Boundless_ores.init();
    }
}
