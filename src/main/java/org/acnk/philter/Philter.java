package org.acnk.philter;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.acnk.philter.Client.PhilterClient;
import org.acnk.philter.effects.Estrus;
import org.acnk.philter.items.potions.PhilterPotion;
import org.acnk.philter.types.MERModEffects;
import org.acnk.philter.types.MERModItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Philter implements ModInitializer {
	public static final String MOD_ID = "philter";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize() {
		MERModItemGroups.registerModItemGroups();
		PhilterPotion.registerModItems();
    }
}