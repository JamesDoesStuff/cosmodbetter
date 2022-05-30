
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cosmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.cosmod.item.TannedHideItem;
import net.mcreator.cosmod.item.SpearItem;
import net.mcreator.cosmod.item.MoonStaffItem;
import net.mcreator.cosmod.item.LeatherGauntletItem;
import net.mcreator.cosmod.item.IronbattleaxeItem;
import net.mcreator.cosmod.item.IronGauntletItem;
import net.mcreator.cosmod.item.GrenadeItem;
import net.mcreator.cosmod.item.GlockItem;
import net.mcreator.cosmod.item.FlamingoOysterSporesItem;
import net.mcreator.cosmod.item.FlamingoOysterItem;
import net.mcreator.cosmod.item.BrassKnucklesItem;
import net.mcreator.cosmod.item.ArmingBladeItem;
import net.mcreator.cosmod.item.AmethystDaggerItem;
import net.mcreator.cosmod.CosmodMod;

public class CosmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CosmodMod.MODID);
	public static final RegistryObject<Item> STACKOFOLDBOOKS = block(CosmodModBlocks.STACKOFOLDBOOKS, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> STACK_OF_LOGS = block(CosmodModBlocks.STACK_OF_LOGS, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> THICC_CAKE = block(CosmodModBlocks.THICC_CAKE, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> MUSHROOM_GROW_LOG = block(CosmodModBlocks.MUSHROOM_GROW_LOG, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> FLAMINGO_OYSTER = REGISTRY.register("flamingo_oyster", () -> new FlamingoOysterItem());
	public static final RegistryObject<Item> FLAMINGO_OYSTER_SPORES = REGISTRY.register("flamingo_oyster_spores",
			() -> new FlamingoOysterSporesItem());
	public static final RegistryObject<Item> FLAMINGO_OYSTER_GROW_LOG_1 = block(CosmodModBlocks.FLAMINGO_OYSTER_GROW_LOG_1, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> FLAMINGO_OYSTER_GROW_LOG_2 = block(CosmodModBlocks.FLAMINGO_OYSTER_GROW_LOG_2, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> FLAMINGO_OYSTER_GROW_LOG_3 = block(CosmodModBlocks.FLAMINGO_OYSTER_GROW_LOG_3, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> BOOKS_AND_BOTTLES = block(CosmodModBlocks.BOOKS_AND_BOTTLES, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> BRASS_KNUCKLES = REGISTRY.register("brass_knuckles", () -> new BrassKnucklesItem());
	public static final RegistryObject<Item> GRENADE = REGISTRY.register("grenade", () -> new GrenadeItem());
	public static final RegistryObject<Item> KIWI_ADULT = REGISTRY.register("kiwi_adult_spawn_egg",
			() -> new ForgeSpawnEggItem(CosmodModEntities.KIWI_ADULT, -6724096, -8370432, new Item.Properties().tab(CosmodModTabs.TAB_COSMOD)));
	public static final RegistryObject<Item> GLOCK = REGISTRY.register("glock", () -> new GlockItem());
	public static final RegistryObject<Item> CALLALILY = block(CosmodModBlocks.CALLALILY, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> LAVENDER_BUSH = doubleBlock(CosmodModBlocks.LAVENDER_BUSH, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> NATIVE_BLUE_LUPINE = doubleBlock(CosmodModBlocks.NATIVE_BLUE_LUPINE, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> LAVENDER_BUSH_SHORT = block(CosmodModBlocks.LAVENDER_BUSH_SHORT, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> CHERRY_BLOSSOM_LEAVES = block(CosmodModBlocks.CHERRY_BLOSSOM_LEAVES, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> AMETHYST_DAGGER = REGISTRY.register("amethyst_dagger", () -> new AmethystDaggerItem());
	public static final RegistryObject<Item> BROWN_MUSHLING = REGISTRY.register("brown_mushling_spawn_egg",
			() -> new ForgeSpawnEggItem(CosmodModEntities.BROWN_MUSHLING, -6737152, -10092544, new Item.Properties().tab(CosmodModTabs.TAB_COSMOD)));
	public static final RegistryObject<Item> RED_MUSHLING = REGISTRY.register("red_mushling_spawn_egg",
			() -> new ForgeSpawnEggItem(CosmodModEntities.RED_MUSHLING, -65485, -3394816, new Item.Properties().tab(CosmodModTabs.TAB_COSMOD)));
	public static final RegistryObject<Item> INKY_MUSHLING = REGISTRY.register("inky_mushling_spawn_egg",
			() -> new ForgeSpawnEggItem(CosmodModEntities.INKY_MUSHLING, -13369549, -6724096, new Item.Properties().tab(CosmodModTabs.TAB_COSMOD)));
	public static final RegistryObject<Item> IRON_BATTLE_AXE = REGISTRY.register("iron_battle_axe", () -> new IronbattleaxeItem());
	public static final RegistryObject<Item> BUTTERCUP_FLOWERS = block(CosmodModBlocks.BUTTERCUP_FLOWERS, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> ARMING_BLADE = REGISTRY.register("arming_blade", () -> new ArmingBladeItem());
	public static final RegistryObject<Item> RED_POPPY_BUSH = doubleBlock(CosmodModBlocks.RED_POPPY_BUSH, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> JUBILEE_ROSE_BUSH = block(CosmodModBlocks.JUBILEE_ROSE_BUSH, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> DESERT_MALLOW = doubleBlock(CosmodModBlocks.DESERT_MALLOW, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> LEATHER_GAUNTLET = REGISTRY.register("leather_gauntlet", () -> new LeatherGauntletItem());
	public static final RegistryObject<Item> BLUE_IRIS = doubleBlock(CosmodModBlocks.BLUE_IRIS, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> BLUE_PANSIES = block(CosmodModBlocks.BLUE_PANSIES, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> GOLDEN_PINK_PANSIES = block(CosmodModBlocks.GOLDEN_PINK_PANSIES, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> MAGENTA_PANSIES = block(CosmodModBlocks.MAGENTA_PANSIES, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> ORANGE_PANSIES = block(CosmodModBlocks.ORANGE_PANSIES, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> ORANGE_PURPLE_PANSIES = block(CosmodModBlocks.ORANGE_PURPLE_PANSIES, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> RED_PANSIES = block(CosmodModBlocks.RED_PANSIES, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> SUNSET_IRIS = doubleBlock(CosmodModBlocks.SUNSET_IRIS, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> WHITE_PURPLE_PANSIES = block(CosmodModBlocks.WHITE_PURPLE_PANSIES, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> RUNE_FERN = block(CosmodModBlocks.RUNE_FERN, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> CHERRY_BLOSSOM_PLANKS = block(CosmodModBlocks.CHERRY_BLOSSOM_PLANKS, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> CHERRY_BLOSSOM_STAIRS = block(CosmodModBlocks.CHERRY_BLOSSOM_STAIRS, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> CHERRY_BLOSSOM_SLAB = block(CosmodModBlocks.CHERRY_BLOSSOM_SLAB, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> CHERY_BLOSSOM_FENCE = block(CosmodModBlocks.CHERY_BLOSSOM_FENCE, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> PURPLE_MORNING_GLORY_VINE = block(CosmodModBlocks.PURPLE_MORNING_GLORY_VINE, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> RUNESTONE = block(CosmodModBlocks.RUNESTONE, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> CORRUPTED_RUNESTONE = block(CosmodModBlocks.CORRUPTED_RUNESTONE, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> RADISH_SPIRIT = REGISTRY.register("radish_spirit_spawn_egg",
			() -> new ForgeSpawnEggItem(CosmodModEntities.RADISH_SPIRIT, -16738048, -16751104, new Item.Properties().tab(CosmodModTabs.TAB_COSMOD)));
	public static final RegistryObject<Item> IRON_GAUNTLET = REGISTRY.register("iron_gauntlet", () -> new IronGauntletItem());
	public static final RegistryObject<Item> TANNED_HIDE = REGISTRY.register("tanned_hide", () -> new TannedHideItem());
	public static final RegistryObject<Item> SPEAR = REGISTRY.register("spear", () -> new SpearItem());
	public static final RegistryObject<Item> MOON_STAFF = REGISTRY.register("moon_staff", () -> new MoonStaffItem());
	public static final RegistryObject<Item> RUNIC_GRASS_BLOCK = block(CosmodModBlocks.RUNIC_GRASS_BLOCK, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> RUNIC_DIRT_BLOCK = block(CosmodModBlocks.RUNIC_DIRT_BLOCK, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> MOREL_MUSHLING = REGISTRY.register("morel_mushling_spawn_egg",
			() -> new ForgeSpawnEggItem(CosmodModEntities.MOREL_MUSHLING, -1, -1, new Item.Properties().tab(CosmodModTabs.TAB_COSMOD)));
	public static final RegistryObject<Item> RED_WAXGILL = REGISTRY.register("red_waxgill_spawn_egg",
			() -> new ForgeSpawnEggItem(CosmodModEntities.RED_WAXGILL, -1, -1, new Item.Properties().tab(CosmodModTabs.TAB_COSMOD)));
	public static final RegistryObject<Item> COSMETIC_TABLE = block(CosmodModBlocks.COSMETIC_TABLE, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> MELONBREAD = block(CosmodModBlocks.MELONBREAD, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> RED_ANEMONE = block(CosmodModBlocks.RED_ANEMONE, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> YELLOW_HOLLYHOCK = doubleBlock(CosmodModBlocks.YELLOW_HOLLYHOCK, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> HOT_PINK_HOLLYHOCK = doubleBlock(CosmodModBlocks.HOT_PINK_HOLLYHOCK, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> PINK_HOLLYHOCK = doubleBlock(CosmodModBlocks.PINK_HOLLYHOCK, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> PURPLEBLACKHOLLYHOCK = doubleBlock(CosmodModBlocks.PURPLEBLACKHOLLYHOCK, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> PURPLEHOLLYHOCK = doubleBlock(CosmodModBlocks.PURPLEHOLLYHOCK, CosmodModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> STRAWBERRY_CREMETART = block(CosmodModBlocks.STRAWBERRY_CREMETART, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> LEEK_SPRITE = REGISTRY.register("leek_sprite_spawn_egg",
			() -> new ForgeSpawnEggItem(CosmodModEntities.LEEK_SPRITE, -13369600, -16724941, new Item.Properties().tab(CosmodModTabs.TAB_COSMOD)));
	public static final RegistryObject<Item> PINK_HEART_CAKE = block(CosmodModBlocks.PINK_HEART_CAKE, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> KING_PINEWOOD_MUSHLING = REGISTRY.register("king_pinewood_mushling_spawn_egg",
			() -> new ForgeSpawnEggItem(CosmodModEntities.KING_PINEWOOD_MUSHLING, -10079488, -6750208,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BIG_LEMON_TART = block(CosmodModBlocks.BIG_LEMON_TART, CosmodModTabs.TAB_COSMOD);
	public static final RegistryObject<Item> ANGELS_WING = block(CosmodModBlocks.ANGELS_WING, CosmodModTabs.TAB_IMPORTED);
	public static final RegistryObject<Item> APRICOT_JELLY = block(CosmodModBlocks.APRICOT_JELLY, CosmodModTabs.TAB_IMPORTED);
	public static final RegistryObject<Item> AUTUMN_SKULLCAP = block(CosmodModBlocks.AUTUMN_SKULLCAP, CosmodModTabs.TAB_IMPORTED);
	public static final RegistryObject<Item> BAY_BOLETE = block(CosmodModBlocks.BAY_BOLETE, CosmodModTabs.TAB_IMPORTED);
	public static final RegistryObject<Item> BEECH = block(CosmodModBlocks.BEECH, CosmodModTabs.TAB_IMPORTED);
	public static final RegistryObject<Item> BIRCH_BOLETE = block(CosmodModBlocks.BIRCH_BOLETE, CosmodModTabs.TAB_IMPORTED);
	public static final RegistryObject<Item> BLEEDING_TOOTH = block(CosmodModBlocks.BLEEDING_TOOTH, CosmodModTabs.TAB_IMPORTED);
	public static final RegistryObject<Item> BLUE_CHANTERELLE = block(CosmodModBlocks.BLUE_CHANTERELLE, CosmodModTabs.TAB_IMPORTED);
	public static final RegistryObject<Item> BLUE_GLOW_MUSHROOM = block(CosmodModBlocks.BLUE_GLOW_MUSHROOM, CosmodModTabs.TAB_IMPORTED);
	public static final RegistryObject<Item> BLUE_KNIGHT = block(CosmodModBlocks.BLUE_KNIGHT, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> BLUING_BOLETE = block(CosmodModBlocks.BLUING_BOLETE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> BRISTLED_SAWGILL = block(CosmodModBlocks.BRISTLED_SAWGILL, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> BROWN_ROLLRIM = block(CosmodModBlocks.BROWN_ROLLRIM, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> CAESAR_SHROOM = block(CosmodModBlocks.CAESAR_SHROOM, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> CANDLE_SNUFF = block(CosmodModBlocks.CANDLE_SNUFF, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> CANDY_CAP = block(CosmodModBlocks.CANDY_CAP, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> CATERPILLAR_FUNGI = block(CosmodModBlocks.CATERPILLAR_FUNGI, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> CAULIFLOWER_FUNGI = block(CosmodModBlocks.CAULIFLOWER_FUNGI, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> CHINGULU = block(CosmodModBlocks.CHINGULU, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> CLUSTERED_CORAL = block(CosmodModBlocks.CLUSTERED_CORAL, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> COLUMN_STINKHORN = block(CosmodModBlocks.COLUMN_STINKHORN, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> COOKEINA = block(CosmodModBlocks.COOKEINA, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> CRIMSON_WAXCAP = block(CosmodModBlocks.CRIMSON_WAXCAP, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> DARKSCALED_KNIGHT = block(CosmodModBlocks.DARKSCALED_KNIGHT, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> DEADLY_WEBCAP = block(CosmodModBlocks.DEADLY_WEBCAP, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> DEAD_MANS_FINGERS = block(CosmodModBlocks.DEAD_MANS_FINGERS, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> DEATH_CAP = block(CosmodModBlocks.DEATH_CAP, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> DESTROYING_ANGELS = block(CosmodModBlocks.DESTROYING_ANGELS, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> DEVILS_CIGAR = block(CosmodModBlocks.DEVILS_CIGAR, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> DEVILS_EGGS = block(CosmodModBlocks.DEVILS_EGGS, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> EARTHSTAR = block(CosmodModBlocks.EARTHSTAR, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> ELFIN_SADDLE = block(CosmodModBlocks.ELFIN_SADDLE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> FAIRY_RING_SHROOM = block(CosmodModBlocks.FAIRY_RING_SHROOM, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> FALSE_MOREL = block(CosmodModBlocks.FALSE_MOREL, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> FLY_AGARIC = block(CosmodModBlocks.FLY_AGARIC, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> GOLDEN_CHANTERELLE = block(CosmodModBlocks.GOLDEN_CHANTERELLE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> GREEN_GLOWSHROOM = block(CosmodModBlocks.GREEN_GLOWSHROOM, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> HEN_OF_THE_WOODS = block(CosmodModBlocks.HEN_OF_THE_WOODS, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> HONEY_MUSHROOM = block(CosmodModBlocks.HONEY_MUSHROOM, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> HORN_OF_PLENTY = block(CosmodModBlocks.HORN_OF_PLENTY, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> HORSE_SHROOM = block(CosmodModBlocks.HORSE_SHROOM, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> INDIGO_MILKCAP = block(CosmodModBlocks.INDIGO_MILKCAP, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> INKCAP = block(CosmodModBlocks.INKCAP, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> KING_TRUMPET = block(CosmodModBlocks.KING_TRUMPET, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> KORU_GREEN = block(CosmodModBlocks.KORU_GREEN, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> LANTERN_MUSHROOM = block(CosmodModBlocks.LANTERN_MUSHROOM, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> LATTICE_MUSHROOM = block(CosmodModBlocks.LATTICE_MUSHROOM, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> LAUGHING_GYM = block(CosmodModBlocks.LAUGHING_GYM, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MAGENTA_GLOWSHROOM = block(CosmodModBlocks.MAGENTA_GLOWSHROOM, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MAGIC_SHROOM = block(CosmodModBlocks.MAGIC_SHROOM, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MAN_ON_HORSEBACK = block(CosmodModBlocks.MAN_ON_HORSEBACK, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MATSUTAKE = block(CosmodModBlocks.MATSUTAKE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MEADOW_MUSHROOM = block(CosmodModBlocks.MEADOW_MUSHROOM, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MICA_CAP = block(CosmodModBlocks.MICA_CAP, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MUSHROOM_OF_THE_SUN = block(CosmodModBlocks.MUSHROOM_OF_THE_SUN, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> NAMEKO = block(CosmodModBlocks.NAMEKO, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> OCTOPUS_STINKHORN = block(CosmodModBlocks.OCTOPUS_STINKHORN, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> OLD_MAN_OF_THE_WOOD = block(CosmodModBlocks.OLD_MAN_OF_THE_WOOD, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> PANTHER_CAP = block(CosmodModBlocks.PANTHER_CAP, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> PARASOL_SHROOM = block(CosmodModBlocks.PARASOL_SHROOM, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> PARROT_TOADSTOOL = block(CosmodModBlocks.PARROT_TOADSTOOL, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> PENNY_BUN = block(CosmodModBlocks.PENNY_BUN, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> PHEASANT_BACK = block(CosmodModBlocks.PHEASANT_BACK, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> PIG_EARS = block(CosmodModBlocks.PIG_EARS, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> PINK_WAXCAP = block(CosmodModBlocks.PINK_WAXCAP, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> PLANT_POT_DAPPERLING = block(CosmodModBlocks.PLANT_POT_DAPPERLING, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> POISON_FIRE_CORAL = block(CosmodModBlocks.POISON_FIRE_CORAL, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> PUFFBALL = block(CosmodModBlocks.PUFFBALL, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> PURPLE_CORAL = block(CosmodModBlocks.PURPLE_CORAL, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> RED_CRACKED_BOLETE = block(CosmodModBlocks.RED_CRACKED_BOLETE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> RED_TEAR_MUSHROOM = block(CosmodModBlocks.RED_TEAR_MUSHROOM, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> ROSY_GOMPHIDIUS = block(CosmodModBlocks.ROSY_GOMPHIDIUS, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> RUFOUS_MILKCAP = block(CosmodModBlocks.RUFOUS_MILKCAP, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SAFFRON_MILKCAP = block(CosmodModBlocks.SAFFRON_MILKCAP, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SANDY_STILTBALL = block(CosmodModBlocks.SANDY_STILTBALL, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SCABER_STALK = block(CosmodModBlocks.SCABER_STALK, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SCALY_PHOLIOTA = block(CosmodModBlocks.SCALY_PHOLIOTA, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SCARLETINA_BOLETE = block(CosmodModBlocks.SCARLETINA_BOLETE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SHAGGY_MANE = block(CosmodModBlocks.SHAGGY_MANE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SHIITAKE = block(CosmodModBlocks.SHIITAKE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SLIPPERY_JACK = block(CosmodModBlocks.SLIPPERY_JACK, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SULFUR_TUFT = block(CosmodModBlocks.SULFUR_TUFT, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SWAMP_RUSSULA = block(CosmodModBlocks.SWAMP_RUSSULA, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SHORT_STEMMED_RUSSULA = block(CosmodModBlocks.SHORT_STEMMED_RUSSULA, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SWEET_TOOTH = block(CosmodModBlocks.SWEET_TOOTH, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> THE_BLUSHER = block(CosmodModBlocks.THE_BLUSHER, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> THE_PRINCE = block(CosmodModBlocks.THE_PRINCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> THE_SICKENER = block(CosmodModBlocks.THE_SICKENER, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> TRUE_MOREL = block(CosmodModBlocks.TRUE_MOREL, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> BERRY_PANCAKE = block(CosmodModBlocks.BERRY_PANCAKE, CosmodModTabs.TAB_COSMOD);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
