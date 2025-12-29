package com.oirehm.playerless;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Playerless implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("playerless");

    @Override
    public void onInitialize() {
        LOGGER.info("Playerless mod initialized - mobs will now drop loot and XP regardless of death cause!");
    }
}
