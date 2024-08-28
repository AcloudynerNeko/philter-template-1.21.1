package org.acnk.philter.types;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.acnk.philter.Philter;
import org.acnk.philter.items.potions.PhilterPotion;

public class MERModItemGroups {
    public static final RegistryKey<ItemGroup> ITEM_GROUP =
            RegistryKey.of(RegistryKeys.ITEM_GROUP,Identifier.of(Philter.MOD_ID,"philter_group"));
    public static final ItemGroup CUSTOM_ITEM_GROUP =
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.philter.philter_group")).icon(() ->new ItemStack(Items.APPLE)).build();
    public static void registerModItemGroups() {
        Philter.LOGGER.info("Registering Item Groups");
        Registry.register(Registries.ITEM_GROUP,ITEM_GROUP,CUSTOM_ITEM_GROUP);
        AddItemGroup();
    }

    public static void AddItemGroup(){
        registereItemGroup(PhilterPotion.PHILTER_POTION);
    }

    public static void registereItemGroup(Item item){
        ItemGroupEvents.modifyEntriesEvent(ITEM_GROUP).register(itemGroup -> itemGroup.add(item));
    }
}
