
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cosmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.cosmod.block.YellowHollyhockBlock;
import net.mcreator.cosmod.block.WhitePurplePansiesBlock;
import net.mcreator.cosmod.block.TrueMorelBlock;
import net.mcreator.cosmod.block.ThiccCakeBlock;
import net.mcreator.cosmod.block.TheSickenerBlock;
import net.mcreator.cosmod.block.ThePrinceBlock;
import net.mcreator.cosmod.block.TheBlusherBlock;
import net.mcreator.cosmod.block.SweetToothBlock;
import net.mcreator.cosmod.block.SwampRussulaBlock;
import net.mcreator.cosmod.block.SunsetIrisBlock;
import net.mcreator.cosmod.block.SulfurTuftBlock;
import net.mcreator.cosmod.block.StrawberryCremetartBlock;
import net.mcreator.cosmod.block.StackofoldbooksBlock;
import net.mcreator.cosmod.block.StackOfLogsBlock;
import net.mcreator.cosmod.block.SlipperyJackBlock;
import net.mcreator.cosmod.block.ShortStemmedRussulaBlock;
import net.mcreator.cosmod.block.ShiitakeBlock;
import net.mcreator.cosmod.block.ShaggyManeBlock;
import net.mcreator.cosmod.block.ScarletinaBoleteBlock;
import net.mcreator.cosmod.block.ScalyPholiotaBlock;
import net.mcreator.cosmod.block.ScaberStalkBlock;
import net.mcreator.cosmod.block.SandyStiltballBlock;
import net.mcreator.cosmod.block.SaffronMilkcapBlock;
import net.mcreator.cosmod.block.RunicGrassBlockBlock;
import net.mcreator.cosmod.block.RunicDirtBlockBlock;
import net.mcreator.cosmod.block.RunestoneBlock;
import net.mcreator.cosmod.block.RuneFernBlock;
import net.mcreator.cosmod.block.RufousMilkcapBlock;
import net.mcreator.cosmod.block.RosyGomphidiusBlock;
import net.mcreator.cosmod.block.RedTearMushroomBlock;
import net.mcreator.cosmod.block.RedPoppyBushBlock;
import net.mcreator.cosmod.block.RedPansiesBlock;
import net.mcreator.cosmod.block.RedCrackedBoleteBlock;
import net.mcreator.cosmod.block.RedAnemoneBlock;
import net.mcreator.cosmod.block.PurplehollyhockBlock;
import net.mcreator.cosmod.block.PurpleblackhollyhockBlock;
import net.mcreator.cosmod.block.PurpleMorningGloryVineBlock;
import net.mcreator.cosmod.block.PurpleCoralBlock;
import net.mcreator.cosmod.block.PuffballBlock;
import net.mcreator.cosmod.block.PoisonFireCoralBlock;
import net.mcreator.cosmod.block.PlantPotDapperlingBlock;
import net.mcreator.cosmod.block.PinkWaxcapBlock;
import net.mcreator.cosmod.block.PinkHollyhockBlock;
import net.mcreator.cosmod.block.PinkHeartCakeBlock;
import net.mcreator.cosmod.block.PigEarsBlock;
import net.mcreator.cosmod.block.PheasantBackBlock;
import net.mcreator.cosmod.block.PennyBunBlock;
import net.mcreator.cosmod.block.ParrotToadstoolBlock;
import net.mcreator.cosmod.block.ParasolShroomBlock;
import net.mcreator.cosmod.block.PantherCapBlock;
import net.mcreator.cosmod.block.OrangePurplePansiesBlock;
import net.mcreator.cosmod.block.OrangePansiesBlock;
import net.mcreator.cosmod.block.OldManOfTheWoodBlock;
import net.mcreator.cosmod.block.OctopusStinkhornBlock;
import net.mcreator.cosmod.block.NativeBlueLupineBlock;
import net.mcreator.cosmod.block.NamekoBlock;
import net.mcreator.cosmod.block.MushroomOfTheSunBlock;
import net.mcreator.cosmod.block.MushroomGrowLogBlock;
import net.mcreator.cosmod.block.MicaCapBlock;
import net.mcreator.cosmod.block.MelonbreadBlock;
import net.mcreator.cosmod.block.MeadowMushroomBlock;
import net.mcreator.cosmod.block.MatsutakeBlock;
import net.mcreator.cosmod.block.ManOnHorsebackBlock;
import net.mcreator.cosmod.block.MagicShroomBlock;
import net.mcreator.cosmod.block.MagentaPansiesBlock;
import net.mcreator.cosmod.block.MagentaGlowshroomBlock;
import net.mcreator.cosmod.block.LavenderBushShortBlock;
import net.mcreator.cosmod.block.LavenderBushBlock;
import net.mcreator.cosmod.block.LaughingGymBlock;
import net.mcreator.cosmod.block.LatticeMushroomBlock;
import net.mcreator.cosmod.block.LanternMushroomBlock;
import net.mcreator.cosmod.block.KoruGreenBlock;
import net.mcreator.cosmod.block.KingTrumpetBlock;
import net.mcreator.cosmod.block.JubileeRoseBushBlock;
import net.mcreator.cosmod.block.InkcapBlock;
import net.mcreator.cosmod.block.IndigoMilkcapBlock;
import net.mcreator.cosmod.block.HotPinkHollyhockBlock;
import net.mcreator.cosmod.block.HorseShroomBlock;
import net.mcreator.cosmod.block.HornOfPlentyBlock;
import net.mcreator.cosmod.block.HoneyMushroomBlock;
import net.mcreator.cosmod.block.HenOfTheWoodsBlock;
import net.mcreator.cosmod.block.GreenGlowshroomBlock;
import net.mcreator.cosmod.block.GoldenPinkPansiesBlock;
import net.mcreator.cosmod.block.GoldenChanterelleBlock;
import net.mcreator.cosmod.block.FlyAgaricBlock;
import net.mcreator.cosmod.block.FlamingoOysterGrowLog3Block;
import net.mcreator.cosmod.block.FlamingoOysterGrowLog2Block;
import net.mcreator.cosmod.block.FlamingoOysterGrowLog1Block;
import net.mcreator.cosmod.block.FalseMorelBlock;
import net.mcreator.cosmod.block.FairyRingShroomBlock;
import net.mcreator.cosmod.block.ElfinSaddleBlock;
import net.mcreator.cosmod.block.EarthstarBlock;
import net.mcreator.cosmod.block.DevilsEggsBlock;
import net.mcreator.cosmod.block.DevilsCigarBlock;
import net.mcreator.cosmod.block.DestroyingAngelsBlock;
import net.mcreator.cosmod.block.DesertMallowBlock;
import net.mcreator.cosmod.block.DeathCapBlock;
import net.mcreator.cosmod.block.DeadlyWebcapBlock;
import net.mcreator.cosmod.block.DeadMansFingersBlock;
import net.mcreator.cosmod.block.DarkscaledKnightBlock;
import net.mcreator.cosmod.block.CrimsonWaxcapBlock;
import net.mcreator.cosmod.block.CosmeticTableBlock;
import net.mcreator.cosmod.block.CorruptedRunestoneBlock;
import net.mcreator.cosmod.block.CookeinaBlock;
import net.mcreator.cosmod.block.ColumnStinkhornBlock;
import net.mcreator.cosmod.block.ClusteredCoralBlock;
import net.mcreator.cosmod.block.ChinguluBlock;
import net.mcreator.cosmod.block.CheryBlossomFenceBlock;
import net.mcreator.cosmod.block.CherryBlossomStairsBlock;
import net.mcreator.cosmod.block.CherryBlossomSlabBlock;
import net.mcreator.cosmod.block.CherryBlossomPlanksBlock;
import net.mcreator.cosmod.block.CherryBlossomLeavesBlock;
import net.mcreator.cosmod.block.CauliflowerFungiBlock;
import net.mcreator.cosmod.block.CaterpillarFungiBlock;
import net.mcreator.cosmod.block.CandyCapBlock;
import net.mcreator.cosmod.block.CandleSnuffBlock;
import net.mcreator.cosmod.block.CallalilyBlock;
import net.mcreator.cosmod.block.CaesarShroomBlock;
import net.mcreator.cosmod.block.ButtercupFlowersBlock;
import net.mcreator.cosmod.block.BrownRollrimBlock;
import net.mcreator.cosmod.block.BristledSawgillBlock;
import net.mcreator.cosmod.block.BooksAndBottlesBlock;
import net.mcreator.cosmod.block.BluingBoleteBlock;
import net.mcreator.cosmod.block.BluePansiesBlock;
import net.mcreator.cosmod.block.BlueKnightBlock;
import net.mcreator.cosmod.block.BlueIrisBlock;
import net.mcreator.cosmod.block.BlueGlowMushroomBlock;
import net.mcreator.cosmod.block.BlueChanterelleBlock;
import net.mcreator.cosmod.block.BleedingToothBlock;
import net.mcreator.cosmod.block.BirchBoleteBlock;
import net.mcreator.cosmod.block.BigLemonTartBlock;
import net.mcreator.cosmod.block.BeechBlock;
import net.mcreator.cosmod.block.BayBoleteBlock;
import net.mcreator.cosmod.block.AutumnSkullcapBlock;
import net.mcreator.cosmod.block.ApricotJellyBlock;
import net.mcreator.cosmod.block.AngelsWingBlock;
import net.mcreator.cosmod.CosmodMod;

public class CosmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CosmodMod.MODID);
	public static final RegistryObject<Block> STACKOFOLDBOOKS = REGISTRY.register("stackofoldbooks", () -> new StackofoldbooksBlock());
	public static final RegistryObject<Block> STACK_OF_LOGS = REGISTRY.register("stack_of_logs", () -> new StackOfLogsBlock());
	public static final RegistryObject<Block> THICC_CAKE = REGISTRY.register("thicc_cake", () -> new ThiccCakeBlock());
	public static final RegistryObject<Block> MUSHROOM_GROW_LOG = REGISTRY.register("mushroom_grow_log", () -> new MushroomGrowLogBlock());
	public static final RegistryObject<Block> FLAMINGO_OYSTER_GROW_LOG_1 = REGISTRY.register("flamingo_oyster_grow_log_1",
			() -> new FlamingoOysterGrowLog1Block());
	public static final RegistryObject<Block> FLAMINGO_OYSTER_GROW_LOG_2 = REGISTRY.register("flamingo_oyster_grow_log_2",
			() -> new FlamingoOysterGrowLog2Block());
	public static final RegistryObject<Block> FLAMINGO_OYSTER_GROW_LOG_3 = REGISTRY.register("flamingo_oyster_grow_log_3",
			() -> new FlamingoOysterGrowLog3Block());
	public static final RegistryObject<Block> BOOKS_AND_BOTTLES = REGISTRY.register("books_and_bottles", () -> new BooksAndBottlesBlock());
	public static final RegistryObject<Block> CALLALILY = REGISTRY.register("callalily", () -> new CallalilyBlock());
	public static final RegistryObject<Block> LAVENDER_BUSH = REGISTRY.register("lavender_bush", () -> new LavenderBushBlock());
	public static final RegistryObject<Block> NATIVE_BLUE_LUPINE = REGISTRY.register("native_blue_lupine", () -> new NativeBlueLupineBlock());
	public static final RegistryObject<Block> LAVENDER_BUSH_SHORT = REGISTRY.register("lavender_bush_short", () -> new LavenderBushShortBlock());
	public static final RegistryObject<Block> CHERRY_BLOSSOM_LEAVES = REGISTRY.register("cherry_blossom_leaves",
			() -> new CherryBlossomLeavesBlock());
	public static final RegistryObject<Block> BUTTERCUP_FLOWERS = REGISTRY.register("buttercup_flowers", () -> new ButtercupFlowersBlock());
	public static final RegistryObject<Block> RED_POPPY_BUSH = REGISTRY.register("red_poppy_bush", () -> new RedPoppyBushBlock());
	public static final RegistryObject<Block> JUBILEE_ROSE_BUSH = REGISTRY.register("jubilee_rose_bush", () -> new JubileeRoseBushBlock());
	public static final RegistryObject<Block> DESERT_MALLOW = REGISTRY.register("desert_mallow", () -> new DesertMallowBlock());
	public static final RegistryObject<Block> BLUE_IRIS = REGISTRY.register("blue_iris", () -> new BlueIrisBlock());
	public static final RegistryObject<Block> BLUE_PANSIES = REGISTRY.register("blue_pansies", () -> new BluePansiesBlock());
	public static final RegistryObject<Block> GOLDEN_PINK_PANSIES = REGISTRY.register("golden_pink_pansies", () -> new GoldenPinkPansiesBlock());
	public static final RegistryObject<Block> MAGENTA_PANSIES = REGISTRY.register("magenta_pansies", () -> new MagentaPansiesBlock());
	public static final RegistryObject<Block> ORANGE_PANSIES = REGISTRY.register("orange_pansies", () -> new OrangePansiesBlock());
	public static final RegistryObject<Block> ORANGE_PURPLE_PANSIES = REGISTRY.register("orange_purple_pansies",
			() -> new OrangePurplePansiesBlock());
	public static final RegistryObject<Block> RED_PANSIES = REGISTRY.register("red_pansies", () -> new RedPansiesBlock());
	public static final RegistryObject<Block> SUNSET_IRIS = REGISTRY.register("sunset_iris", () -> new SunsetIrisBlock());
	public static final RegistryObject<Block> WHITE_PURPLE_PANSIES = REGISTRY.register("white_purple_pansies", () -> new WhitePurplePansiesBlock());
	public static final RegistryObject<Block> RUNE_FERN = REGISTRY.register("rune_fern", () -> new RuneFernBlock());
	public static final RegistryObject<Block> CHERRY_BLOSSOM_PLANKS = REGISTRY.register("cherry_blossom_planks",
			() -> new CherryBlossomPlanksBlock());
	public static final RegistryObject<Block> CHERRY_BLOSSOM_STAIRS = REGISTRY.register("cherry_blossom_stairs",
			() -> new CherryBlossomStairsBlock());
	public static final RegistryObject<Block> CHERRY_BLOSSOM_SLAB = REGISTRY.register("cherry_blossom_slab", () -> new CherryBlossomSlabBlock());
	public static final RegistryObject<Block> CHERY_BLOSSOM_FENCE = REGISTRY.register("chery_blossom_fence", () -> new CheryBlossomFenceBlock());
	public static final RegistryObject<Block> PURPLE_MORNING_GLORY_VINE = REGISTRY.register("purple_morning_glory_vine",
			() -> new PurpleMorningGloryVineBlock());
	public static final RegistryObject<Block> RUNESTONE = REGISTRY.register("runestone", () -> new RunestoneBlock());
	public static final RegistryObject<Block> CORRUPTED_RUNESTONE = REGISTRY.register("corrupted_runestone", () -> new CorruptedRunestoneBlock());
	public static final RegistryObject<Block> RUNIC_GRASS_BLOCK = REGISTRY.register("runic_grass_block", () -> new RunicGrassBlockBlock());
	public static final RegistryObject<Block> RUNIC_DIRT_BLOCK = REGISTRY.register("runic_dirt_block", () -> new RunicDirtBlockBlock());
	public static final RegistryObject<Block> COSMETIC_TABLE = REGISTRY.register("cosmetic_table", () -> new CosmeticTableBlock());
	public static final RegistryObject<Block> MELONBREAD = REGISTRY.register("melonbread", () -> new MelonbreadBlock());
	public static final RegistryObject<Block> RED_ANEMONE = REGISTRY.register("red_anemone", () -> new RedAnemoneBlock());
	public static final RegistryObject<Block> YELLOW_HOLLYHOCK = REGISTRY.register("yellow_hollyhock", () -> new YellowHollyhockBlock());
	public static final RegistryObject<Block> HOT_PINK_HOLLYHOCK = REGISTRY.register("hot_pink_hollyhock", () -> new HotPinkHollyhockBlock());
	public static final RegistryObject<Block> PINK_HOLLYHOCK = REGISTRY.register("pink_hollyhock", () -> new PinkHollyhockBlock());
	public static final RegistryObject<Block> PURPLEBLACKHOLLYHOCK = REGISTRY.register("purpleblackhollyhock", () -> new PurpleblackhollyhockBlock());
	public static final RegistryObject<Block> PURPLEHOLLYHOCK = REGISTRY.register("purplehollyhock", () -> new PurplehollyhockBlock());
	public static final RegistryObject<Block> STRAWBERRY_CREMETART = REGISTRY.register("strawberry_cremetart", () -> new StrawberryCremetartBlock());
	public static final RegistryObject<Block> PINK_HEART_CAKE = REGISTRY.register("pink_heart_cake", () -> new PinkHeartCakeBlock());
	public static final RegistryObject<Block> BIG_LEMON_TART = REGISTRY.register("big_lemon_tart", () -> new BigLemonTartBlock());
	public static final RegistryObject<Block> ANGELS_WING = REGISTRY.register("angels_wing", () -> new AngelsWingBlock());
	public static final RegistryObject<Block> APRICOT_JELLY = REGISTRY.register("apricot_jelly", () -> new ApricotJellyBlock());
	public static final RegistryObject<Block> AUTUMN_SKULLCAP = REGISTRY.register("autumn_skullcap", () -> new AutumnSkullcapBlock());
	public static final RegistryObject<Block> BAY_BOLETE = REGISTRY.register("bay_bolete", () -> new BayBoleteBlock());
	public static final RegistryObject<Block> BEECH = REGISTRY.register("beech", () -> new BeechBlock());
	public static final RegistryObject<Block> BIRCH_BOLETE = REGISTRY.register("birch_bolete", () -> new BirchBoleteBlock());
	public static final RegistryObject<Block> BLEEDING_TOOTH = REGISTRY.register("bleeding_tooth", () -> new BleedingToothBlock());
	public static final RegistryObject<Block> BLUE_CHANTERELLE = REGISTRY.register("blue_chanterelle", () -> new BlueChanterelleBlock());
	public static final RegistryObject<Block> BLUE_GLOW_MUSHROOM = REGISTRY.register("blue_glow_mushroom", () -> new BlueGlowMushroomBlock());
	public static final RegistryObject<Block> BLUE_KNIGHT = REGISTRY.register("blue_knight", () -> new BlueKnightBlock());
	public static final RegistryObject<Block> BLUING_BOLETE = REGISTRY.register("bluing_bolete", () -> new BluingBoleteBlock());
	public static final RegistryObject<Block> BRISTLED_SAWGILL = REGISTRY.register("bristled_sawgill", () -> new BristledSawgillBlock());
	public static final RegistryObject<Block> BROWN_ROLLRIM = REGISTRY.register("brown_rollrim", () -> new BrownRollrimBlock());
	public static final RegistryObject<Block> CAESAR_SHROOM = REGISTRY.register("caesar_shroom", () -> new CaesarShroomBlock());
	public static final RegistryObject<Block> CANDLE_SNUFF = REGISTRY.register("candle_snuff", () -> new CandleSnuffBlock());
	public static final RegistryObject<Block> CANDY_CAP = REGISTRY.register("candy_cap", () -> new CandyCapBlock());
	public static final RegistryObject<Block> CATERPILLAR_FUNGI = REGISTRY.register("caterpillar_fungi", () -> new CaterpillarFungiBlock());
	public static final RegistryObject<Block> CAULIFLOWER_FUNGI = REGISTRY.register("cauliflower_fungi", () -> new CauliflowerFungiBlock());
	public static final RegistryObject<Block> CHINGULU = REGISTRY.register("chingulu", () -> new ChinguluBlock());
	public static final RegistryObject<Block> CLUSTERED_CORAL = REGISTRY.register("clustered_coral", () -> new ClusteredCoralBlock());
	public static final RegistryObject<Block> COLUMN_STINKHORN = REGISTRY.register("column_stinkhorn", () -> new ColumnStinkhornBlock());
	public static final RegistryObject<Block> COOKEINA = REGISTRY.register("cookeina", () -> new CookeinaBlock());
	public static final RegistryObject<Block> CRIMSON_WAXCAP = REGISTRY.register("crimson_waxcap", () -> new CrimsonWaxcapBlock());
	public static final RegistryObject<Block> DARKSCALED_KNIGHT = REGISTRY.register("darkscaled_knight", () -> new DarkscaledKnightBlock());
	public static final RegistryObject<Block> DEADLY_WEBCAP = REGISTRY.register("deadly_webcap", () -> new DeadlyWebcapBlock());
	public static final RegistryObject<Block> DEAD_MANS_FINGERS = REGISTRY.register("dead_mans_fingers", () -> new DeadMansFingersBlock());
	public static final RegistryObject<Block> DEATH_CAP = REGISTRY.register("death_cap", () -> new DeathCapBlock());
	public static final RegistryObject<Block> DESTROYING_ANGELS = REGISTRY.register("destroying_angels", () -> new DestroyingAngelsBlock());
	public static final RegistryObject<Block> DEVILS_CIGAR = REGISTRY.register("devils_cigar", () -> new DevilsCigarBlock());
	public static final RegistryObject<Block> DEVILS_EGGS = REGISTRY.register("devils_eggs", () -> new DevilsEggsBlock());
	public static final RegistryObject<Block> EARTHSTAR = REGISTRY.register("earthstar", () -> new EarthstarBlock());
	public static final RegistryObject<Block> ELFIN_SADDLE = REGISTRY.register("elfin_saddle", () -> new ElfinSaddleBlock());
	public static final RegistryObject<Block> FAIRY_RING_SHROOM = REGISTRY.register("fairy_ring_shroom", () -> new FairyRingShroomBlock());
	public static final RegistryObject<Block> FALSE_MOREL = REGISTRY.register("false_morel", () -> new FalseMorelBlock());
	public static final RegistryObject<Block> FLY_AGARIC = REGISTRY.register("fly_agaric", () -> new FlyAgaricBlock());
	public static final RegistryObject<Block> GOLDEN_CHANTERELLE = REGISTRY.register("golden_chanterelle", () -> new GoldenChanterelleBlock());
	public static final RegistryObject<Block> GREEN_GLOWSHROOM = REGISTRY.register("green_glowshroom", () -> new GreenGlowshroomBlock());
	public static final RegistryObject<Block> HEN_OF_THE_WOODS = REGISTRY.register("hen_of_the_woods", () -> new HenOfTheWoodsBlock());
	public static final RegistryObject<Block> HONEY_MUSHROOM = REGISTRY.register("honey_mushroom", () -> new HoneyMushroomBlock());
	public static final RegistryObject<Block> HORN_OF_PLENTY = REGISTRY.register("horn_of_plenty", () -> new HornOfPlentyBlock());
	public static final RegistryObject<Block> HORSE_SHROOM = REGISTRY.register("horse_shroom", () -> new HorseShroomBlock());
	public static final RegistryObject<Block> INDIGO_MILKCAP = REGISTRY.register("indigo_milkcap", () -> new IndigoMilkcapBlock());
	public static final RegistryObject<Block> INKCAP = REGISTRY.register("inkcap", () -> new InkcapBlock());
	public static final RegistryObject<Block> KING_TRUMPET = REGISTRY.register("king_trumpet", () -> new KingTrumpetBlock());
	public static final RegistryObject<Block> KORU_GREEN = REGISTRY.register("koru_green", () -> new KoruGreenBlock());
	public static final RegistryObject<Block> LANTERN_MUSHROOM = REGISTRY.register("lantern_mushroom", () -> new LanternMushroomBlock());
	public static final RegistryObject<Block> LATTICE_MUSHROOM = REGISTRY.register("lattice_mushroom", () -> new LatticeMushroomBlock());
	public static final RegistryObject<Block> LAUGHING_GYM = REGISTRY.register("laughing_gym", () -> new LaughingGymBlock());
	public static final RegistryObject<Block> MAGENTA_GLOWSHROOM = REGISTRY.register("magenta_glowshroom", () -> new MagentaGlowshroomBlock());
	public static final RegistryObject<Block> MAGIC_SHROOM = REGISTRY.register("magic_shroom", () -> new MagicShroomBlock());
	public static final RegistryObject<Block> MAN_ON_HORSEBACK = REGISTRY.register("man_on_horseback", () -> new ManOnHorsebackBlock());
	public static final RegistryObject<Block> MATSUTAKE = REGISTRY.register("matsutake", () -> new MatsutakeBlock());
	public static final RegistryObject<Block> MEADOW_MUSHROOM = REGISTRY.register("meadow_mushroom", () -> new MeadowMushroomBlock());
	public static final RegistryObject<Block> MICA_CAP = REGISTRY.register("mica_cap", () -> new MicaCapBlock());
	public static final RegistryObject<Block> MUSHROOM_OF_THE_SUN = REGISTRY.register("mushroom_of_the_sun", () -> new MushroomOfTheSunBlock());
	public static final RegistryObject<Block> NAMEKO = REGISTRY.register("nameko", () -> new NamekoBlock());
	public static final RegistryObject<Block> OCTOPUS_STINKHORN = REGISTRY.register("octopus_stinkhorn", () -> new OctopusStinkhornBlock());
	public static final RegistryObject<Block> OLD_MAN_OF_THE_WOOD = REGISTRY.register("old_man_of_the_wood", () -> new OldManOfTheWoodBlock());
	public static final RegistryObject<Block> PANTHER_CAP = REGISTRY.register("panther_cap", () -> new PantherCapBlock());
	public static final RegistryObject<Block> PARASOL_SHROOM = REGISTRY.register("parasol_shroom", () -> new ParasolShroomBlock());
	public static final RegistryObject<Block> PARROT_TOADSTOOL = REGISTRY.register("parrot_toadstool", () -> new ParrotToadstoolBlock());
	public static final RegistryObject<Block> PENNY_BUN = REGISTRY.register("penny_bun", () -> new PennyBunBlock());
	public static final RegistryObject<Block> PHEASANT_BACK = REGISTRY.register("pheasant_back", () -> new PheasantBackBlock());
	public static final RegistryObject<Block> PIG_EARS = REGISTRY.register("pig_ears", () -> new PigEarsBlock());
	public static final RegistryObject<Block> PINK_WAXCAP = REGISTRY.register("pink_waxcap", () -> new PinkWaxcapBlock());
	public static final RegistryObject<Block> PLANT_POT_DAPPERLING = REGISTRY.register("plant_pot_dapperling", () -> new PlantPotDapperlingBlock());
	public static final RegistryObject<Block> POISON_FIRE_CORAL = REGISTRY.register("poison_fire_coral", () -> new PoisonFireCoralBlock());
	public static final RegistryObject<Block> PUFFBALL = REGISTRY.register("puffball", () -> new PuffballBlock());
	public static final RegistryObject<Block> PURPLE_CORAL = REGISTRY.register("purple_coral", () -> new PurpleCoralBlock());
	public static final RegistryObject<Block> RED_CRACKED_BOLETE = REGISTRY.register("red_cracked_bolete", () -> new RedCrackedBoleteBlock());
	public static final RegistryObject<Block> RED_TEAR_MUSHROOM = REGISTRY.register("red_tear_mushroom", () -> new RedTearMushroomBlock());
	public static final RegistryObject<Block> ROSY_GOMPHIDIUS = REGISTRY.register("rosy_gomphidius", () -> new RosyGomphidiusBlock());
	public static final RegistryObject<Block> RUFOUS_MILKCAP = REGISTRY.register("rufous_milkcap", () -> new RufousMilkcapBlock());
	public static final RegistryObject<Block> SAFFRON_MILKCAP = REGISTRY.register("saffron_milkcap", () -> new SaffronMilkcapBlock());
	public static final RegistryObject<Block> SANDY_STILTBALL = REGISTRY.register("sandy_stiltball", () -> new SandyStiltballBlock());
	public static final RegistryObject<Block> SCABER_STALK = REGISTRY.register("scaber_stalk", () -> new ScaberStalkBlock());
	public static final RegistryObject<Block> SCALY_PHOLIOTA = REGISTRY.register("scaly_pholiota", () -> new ScalyPholiotaBlock());
	public static final RegistryObject<Block> SCARLETINA_BOLETE = REGISTRY.register("scarletina_bolete", () -> new ScarletinaBoleteBlock());
	public static final RegistryObject<Block> SHAGGY_MANE = REGISTRY.register("shaggy_mane", () -> new ShaggyManeBlock());
	public static final RegistryObject<Block> SHIITAKE = REGISTRY.register("shiitake", () -> new ShiitakeBlock());
	public static final RegistryObject<Block> SLIPPERY_JACK = REGISTRY.register("slippery_jack", () -> new SlipperyJackBlock());
	public static final RegistryObject<Block> SULFUR_TUFT = REGISTRY.register("sulfur_tuft", () -> new SulfurTuftBlock());
	public static final RegistryObject<Block> SWAMP_RUSSULA = REGISTRY.register("swamp_russula", () -> new SwampRussulaBlock());
	public static final RegistryObject<Block> SHORT_STEMMED_RUSSULA = REGISTRY.register("short_stemmed_russula",
			() -> new ShortStemmedRussulaBlock());
	public static final RegistryObject<Block> SWEET_TOOTH = REGISTRY.register("sweet_tooth", () -> new SweetToothBlock());
	public static final RegistryObject<Block> THE_BLUSHER = REGISTRY.register("the_blusher", () -> new TheBlusherBlock());
	public static final RegistryObject<Block> THE_PRINCE = REGISTRY.register("the_prince", () -> new ThePrinceBlock());
	public static final RegistryObject<Block> THE_SICKENER = REGISTRY.register("the_sickener", () -> new TheSickenerBlock());
	public static final RegistryObject<Block> TRUE_MOREL = REGISTRY.register("true_morel", () -> new TrueMorelBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			StackofoldbooksBlock.registerRenderLayer();
			StackOfLogsBlock.registerRenderLayer();
			ThiccCakeBlock.registerRenderLayer();
			MushroomGrowLogBlock.registerRenderLayer();
			FlamingoOysterGrowLog1Block.registerRenderLayer();
			FlamingoOysterGrowLog2Block.registerRenderLayer();
			FlamingoOysterGrowLog3Block.registerRenderLayer();
			BooksAndBottlesBlock.registerRenderLayer();
			CallalilyBlock.registerRenderLayer();
			LavenderBushBlock.registerRenderLayer();
			NativeBlueLupineBlock.registerRenderLayer();
			LavenderBushShortBlock.registerRenderLayer();
			CherryBlossomLeavesBlock.registerRenderLayer();
			ButtercupFlowersBlock.registerRenderLayer();
			RedPoppyBushBlock.registerRenderLayer();
			DesertMallowBlock.registerRenderLayer();
			BlueIrisBlock.registerRenderLayer();
			BluePansiesBlock.registerRenderLayer();
			GoldenPinkPansiesBlock.registerRenderLayer();
			MagentaPansiesBlock.registerRenderLayer();
			OrangePansiesBlock.registerRenderLayer();
			OrangePurplePansiesBlock.registerRenderLayer();
			RedPansiesBlock.registerRenderLayer();
			SunsetIrisBlock.registerRenderLayer();
			WhitePurplePansiesBlock.registerRenderLayer();
			RuneFernBlock.registerRenderLayer();
			PurpleMorningGloryVineBlock.registerRenderLayer();
			CosmeticTableBlock.registerRenderLayer();
			MelonbreadBlock.registerRenderLayer();
			RedAnemoneBlock.registerRenderLayer();
			YellowHollyhockBlock.registerRenderLayer();
			HotPinkHollyhockBlock.registerRenderLayer();
			PinkHollyhockBlock.registerRenderLayer();
			PurpleblackhollyhockBlock.registerRenderLayer();
			PurplehollyhockBlock.registerRenderLayer();
			StrawberryCremetartBlock.registerRenderLayer();
			PinkHeartCakeBlock.registerRenderLayer();
			BigLemonTartBlock.registerRenderLayer();
			AngelsWingBlock.registerRenderLayer();
			ApricotJellyBlock.registerRenderLayer();
			AutumnSkullcapBlock.registerRenderLayer();
			BayBoleteBlock.registerRenderLayer();
			BeechBlock.registerRenderLayer();
			BirchBoleteBlock.registerRenderLayer();
			BleedingToothBlock.registerRenderLayer();
			BlueChanterelleBlock.registerRenderLayer();
			BlueGlowMushroomBlock.registerRenderLayer();
			BlueKnightBlock.registerRenderLayer();
			BluingBoleteBlock.registerRenderLayer();
			BristledSawgillBlock.registerRenderLayer();
			BrownRollrimBlock.registerRenderLayer();
			CaesarShroomBlock.registerRenderLayer();
			CandleSnuffBlock.registerRenderLayer();
			CandyCapBlock.registerRenderLayer();
			CaterpillarFungiBlock.registerRenderLayer();
			CauliflowerFungiBlock.registerRenderLayer();
			ChinguluBlock.registerRenderLayer();
			ClusteredCoralBlock.registerRenderLayer();
			ColumnStinkhornBlock.registerRenderLayer();
			CookeinaBlock.registerRenderLayer();
			CrimsonWaxcapBlock.registerRenderLayer();
			DarkscaledKnightBlock.registerRenderLayer();
			DeadlyWebcapBlock.registerRenderLayer();
			DeadMansFingersBlock.registerRenderLayer();
			DeathCapBlock.registerRenderLayer();
			DestroyingAngelsBlock.registerRenderLayer();
			DevilsCigarBlock.registerRenderLayer();
			DevilsEggsBlock.registerRenderLayer();
			EarthstarBlock.registerRenderLayer();
			ElfinSaddleBlock.registerRenderLayer();
			FairyRingShroomBlock.registerRenderLayer();
			FalseMorelBlock.registerRenderLayer();
			FlyAgaricBlock.registerRenderLayer();
			GoldenChanterelleBlock.registerRenderLayer();
			GreenGlowshroomBlock.registerRenderLayer();
			HenOfTheWoodsBlock.registerRenderLayer();
			HoneyMushroomBlock.registerRenderLayer();
			HornOfPlentyBlock.registerRenderLayer();
			HorseShroomBlock.registerRenderLayer();
			IndigoMilkcapBlock.registerRenderLayer();
			InkcapBlock.registerRenderLayer();
			KingTrumpetBlock.registerRenderLayer();
			KoruGreenBlock.registerRenderLayer();
			LanternMushroomBlock.registerRenderLayer();
			LatticeMushroomBlock.registerRenderLayer();
			LaughingGymBlock.registerRenderLayer();
			MagentaGlowshroomBlock.registerRenderLayer();
			MagicShroomBlock.registerRenderLayer();
			ManOnHorsebackBlock.registerRenderLayer();
			MatsutakeBlock.registerRenderLayer();
			MeadowMushroomBlock.registerRenderLayer();
			MicaCapBlock.registerRenderLayer();
			MushroomOfTheSunBlock.registerRenderLayer();
			NamekoBlock.registerRenderLayer();
			OctopusStinkhornBlock.registerRenderLayer();
			OldManOfTheWoodBlock.registerRenderLayer();
			PantherCapBlock.registerRenderLayer();
			ParasolShroomBlock.registerRenderLayer();
			ParrotToadstoolBlock.registerRenderLayer();
			PennyBunBlock.registerRenderLayer();
			PheasantBackBlock.registerRenderLayer();
			PigEarsBlock.registerRenderLayer();
			PinkWaxcapBlock.registerRenderLayer();
			PlantPotDapperlingBlock.registerRenderLayer();
			PoisonFireCoralBlock.registerRenderLayer();
			PuffballBlock.registerRenderLayer();
			PurpleCoralBlock.registerRenderLayer();
			RedCrackedBoleteBlock.registerRenderLayer();
			RedTearMushroomBlock.registerRenderLayer();
			RosyGomphidiusBlock.registerRenderLayer();
			RufousMilkcapBlock.registerRenderLayer();
			SaffronMilkcapBlock.registerRenderLayer();
			SandyStiltballBlock.registerRenderLayer();
			ScaberStalkBlock.registerRenderLayer();
			ScalyPholiotaBlock.registerRenderLayer();
			ScarletinaBoleteBlock.registerRenderLayer();
			ShaggyManeBlock.registerRenderLayer();
			ShiitakeBlock.registerRenderLayer();
			SlipperyJackBlock.registerRenderLayer();
			SulfurTuftBlock.registerRenderLayer();
			SwampRussulaBlock.registerRenderLayer();
			ShortStemmedRussulaBlock.registerRenderLayer();
			SweetToothBlock.registerRenderLayer();
			TheBlusherBlock.registerRenderLayer();
			ThePrinceBlock.registerRenderLayer();
			TheSickenerBlock.registerRenderLayer();
			TrueMorelBlock.registerRenderLayer();
		}
	}
}
