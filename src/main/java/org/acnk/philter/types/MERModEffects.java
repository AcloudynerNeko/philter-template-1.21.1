package org.acnk.philter.types;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import org.acnk.philter.effects.Estrus;

public class MERModEffects {
    public static final Estrus ESTRUS = new Estrus();
    public static void register() {
        Registry.register(Registries.STATUS_EFFECT, net.minecraft.util.Identifier.of("philter", "estrus"), new Estrus());//注册发情效果

    }

}
