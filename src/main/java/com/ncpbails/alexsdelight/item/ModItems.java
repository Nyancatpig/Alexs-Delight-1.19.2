package com.ncpbails.alexsdelight.item;

import com.github.alexthe666.alexsmobs.AlexsMobs;
import com.github.alexthe666.alexsmobs.misc.AMItemGroup;
import com.ncpbails.alexsdelight.AlexsDelight;
import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AlexsDelight.MOD_ID);

    //CUTS
    public static final RegistryObject<Item> KANGAROO_SHANK = ITEMS.register("kangaroo_shank",
            () -> new Item(new Item.Properties().tab(AMItemGroup.INSTANCE).food(ModFoods.KANGAROO_SHANK)));

    public static final RegistryObject<Item> COOKED_KANGAROO_SHANK = ITEMS.register("cooked_kangaroo_shank",
            () -> new Item(new Item.Properties().tab(AMItemGroup.INSTANCE).food(ModFoods.COOKED_KANGAROO_SHANK)));

    public static final RegistryObject<Item> LOOSE_MOOSE_RIB = ITEMS.register("loose_moose_rib",
            () -> new Item(new Item.Properties().tab(AMItemGroup.INSTANCE).food(ModFoods.LOOSE_MOOSE_RIB)));

    public static final RegistryObject<Item> COOKED_LOOSE_MOOSE_RIB = ITEMS.register("cooked_loose_moose_rib",
            () -> new Item(new Item.Properties().tab(AMItemGroup.INSTANCE).food(ModFoods.COOKED_LOOSE_MOOSE_RIB)));

    public static final RegistryObject<Item> BISON_MINCE = ITEMS.register("bison_mince",
            () -> new Item(new Item.Properties().tab(AMItemGroup.INSTANCE).food(ModFoods.BISON_MINCE)));

    public static final RegistryObject<Item> BISON_PATTY = ITEMS.register("bison_patty",
            () -> new Item(new Item.Properties().tab(AMItemGroup.INSTANCE).food(ModFoods.BISON_PATTY)));

    public static final RegistryObject<Item> RAW_BUNFUNGUS_DRUMSTICK = ITEMS.register("raw_bunfungus_drumstick",
            () -> new Item(new Item.Properties().tab(AMItemGroup.INSTANCE).food(ModFoods.RAW_BUNFUNGUS_DRUMSTICK)));

    public static final RegistryObject<Item> COOKED_BUNFUNGUS_DRUMSTICK = ITEMS.register("cooked_bunfungus_drumstick",
            () -> new Item(new Item.Properties().tab(AMItemGroup.INSTANCE).food(ModFoods.COOKED_BUNFUNGUS_DRUMSTICK)));

    public static final RegistryObject<Item> COOKED_CATFISH_SLICE = ITEMS.register("cooked_catfish_slice",
            () -> new Item(new Item.Properties().tab(AMItemGroup.INSTANCE).food(ModFoods.COOKED_CATFISH_SLICE)));

    public static final RegistryObject<Item> RAW_CATFISH_SLICE = ITEMS.register("raw_catfish_slice",
            () -> new Item(new Item.Properties().tab(AMItemGroup.INSTANCE).food(ModFoods.RAW_CATFISH_SLICE)));



    //MEATS

    public static final RegistryObject<Item> RAW_BISON = ITEMS.register("raw_bison",
            () -> new Item(new Item.Properties().tab(AMItemGroup.INSTANCE).food(ModFoods.RAW_BISON)));

    public static final RegistryObject<Item> COOKED_BISON = ITEMS.register("cooked_bison",
            () -> new Item(new Item.Properties().tab(AMItemGroup.INSTANCE).food(ModFoods.COOKED_BISON)));

    public static final RegistryObject<Item> RAW_BUNFUNGUS = ITEMS.register("raw_bunfungus",
            () -> new Item(new Item.Properties().tab(AMItemGroup.INSTANCE).food(ModFoods.RAW_BUNFUNGUS)));

    public static final RegistryObject<Item> COOKED_BUNFUNGUS = ITEMS.register("cooked_bunfungus",
            () -> new Item(new Item.Properties().tab(AMItemGroup.INSTANCE).food(ModFoods.COOKED_BUNFUNGUS)));

    public static final RegistryObject<Item> COOKED_CENTIPEDE_LEG = ITEMS.register("cooked_centipede_leg",
            () -> new Item(new Item.Properties().tab(AMItemGroup.INSTANCE).food(ModFoods.COOKED_CENTIPEDE_LEG)));


    //MEALS
    public static final RegistryObject<Item> GONGYLIDIA_BRUSCHETTA = ITEMS.register("gongylidia_bruschetta",
            () -> new Item(new Item.Properties().tab(AMItemGroup.INSTANCE).food(ModFoods.GONGYLIDIA_BRUSCHETTA)));

    public static final RegistryObject<Item> MAGGOT_SALAD = ITEMS.register("maggot_salad",
            () -> new BowlFoodItem(new Item.Properties().stacksTo(16).tab(AMItemGroup.INSTANCE).food(ModFoods.MAGGOT_SALAD)));

    public static final RegistryObject<Item> KANGAROO_STEW = ITEMS.register("kangaroo_stew",
            () -> new BowlFoodItem(new Item.Properties().stacksTo(16).tab(AMItemGroup.INSTANCE).food(ModFoods.KANGAROO_STEW)));

    public static final RegistryObject<Item> ACACIA_BLOSSOM_SOUP = ITEMS.register("acacia_blossom_soup",
            () -> new BowlFoodItem(new Item.Properties().stacksTo(16).tab(AMItemGroup.INSTANCE).food(ModFoods.ACACIA_BLOSSOM_SOUP)));

    public static final RegistryObject<Item> LOBSTER_PASTA = ITEMS.register("lobster_pasta",
            () -> new BowlFoodItem(new Item.Properties().stacksTo(16).tab(AMItemGroup.INSTANCE).food(ModFoods.LOBSTER_PASTA)));

    public static final RegistryObject<Item> BISON_BURGER = ITEMS.register("bison_burger",
            () -> new Item(new Item.Properties().tab(AMItemGroup.INSTANCE).food(ModFoods.BISON_BURGER)));

    public static final RegistryObject<Item> BUNFUNGUS_SANDWICH = ITEMS.register("bunfungus_sandwich",
            () -> new Item(new Item.Properties().tab(AMItemGroup.INSTANCE).food(ModFoods.BUNFUNGUS_SANDWICH)));

    public static final RegistryObject<Item> KANGAROO_PASTA = ITEMS.register("kangaroo_pasta",
            () -> new BowlFoodItem(new Item.Properties().stacksTo(16).tab(AMItemGroup.INSTANCE).food(ModFoods.KANGAROO_PASTA)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
