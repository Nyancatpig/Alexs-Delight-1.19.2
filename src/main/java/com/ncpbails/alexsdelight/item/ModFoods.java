package com.ncpbails.alexsdelight.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import vectorwing.farmersdelight.common.FoodValues;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class ModFoods {

    //MEATS
    public static final FoodProperties RAW_BISON = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.5F).meat().fast().build();
    public static final FoodProperties COOKED_BISON = (new FoodProperties.Builder()).nutrition(10).saturationMod(1.0F).meat().fast().build();
    public static final FoodProperties RAW_BUNFUNGUS = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.4F).meat().fast().build();
    public static final FoodProperties COOKED_BUNFUNGUS = (new FoodProperties.Builder()).nutrition(7).saturationMod(0.7F).meat().fast().build();
    public static final FoodProperties COOKED_CENTIPEDE_LEG = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.7F).meat().fast().build();

    //CUTS
    public static final FoodProperties KANGAROO_SHANK = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.2F).meat().fast().build();
    public static final FoodProperties COOKED_KANGAROO_SHANK = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.4F).meat().fast().build();
    public static final FoodProperties LOOSE_MOOSE_RIB = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.2F).meat().fast().build();
    public static final FoodProperties COOKED_LOOSE_MOOSE_RIB = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.4F).meat().fast().build();
    public static final FoodProperties BISON_MINCE = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.2F).meat().fast().build();
    public static final FoodProperties BISON_PATTY = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.7F).meat().fast().build();
    public static final FoodProperties RAW_BUNFUNGUS_DRUMSTICK = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.2F).meat().fast().build();
    public static final FoodProperties COOKED_BUNFUNGUS_DRUMSTICK = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.4F).meat().fast().build();
    public static final FoodProperties RAW_CATFISH_SLICE = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.2F).meat().fast().build();
    public static final FoodProperties COOKED_CATFISH_SLICE = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.3F).meat().fast().build();

    //MEALS
    public static final FoodProperties GONGYLIDIA_BRUSCHETTA = (new FoodProperties.Builder()).nutrition(10).saturationMod(1.0F).build();
    public static final FoodProperties MAGGOT_SALAD = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.6F)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, FoodValues.SHORT_DURATION, 0), 1.0F).build();

    public static final FoodProperties KANGAROO_STEW = (new FoodProperties.Builder()).nutrition(10).saturationMod(0.8F)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), FoodValues.LONG_DURATION, 0), 1.0F).build();
    public static final FoodProperties ACACIA_BLOSSOM_SOUP = (new FoodProperties.Builder()).nutrition(12).saturationMod(0.8F)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), FoodValues.LONG_DURATION, 0), 1.0F).build();
    public static final FoodProperties LOBSTER_PASTA = (new FoodProperties.Builder()).nutrition(10).saturationMod(0.8F)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), FoodValues.LONG_DURATION, 0), 1.0F).build();
    public static final FoodProperties BISON_BURGER = (new FoodProperties.Builder()).nutrition(12).saturationMod(1.1F).build();
    public static final FoodProperties BUNFUNGUS_SANDWICH = (new FoodProperties.Builder()).nutrition(10).saturationMod(1.0F).build();
    public static final FoodProperties KANGAROO_PASTA = (new FoodProperties.Builder()).nutrition(10).saturationMod(0.8F)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), FoodValues.LONG_DURATION, 0), 1.0F).build();

}
