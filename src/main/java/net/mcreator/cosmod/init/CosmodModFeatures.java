
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cosmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.cosmod.world.features.plants.YellowHollyhockFeature;
import net.mcreator.cosmod.world.features.plants.WhitePurplePansiesFeature;
import net.mcreator.cosmod.world.features.plants.SunsetIrisFeature;
import net.mcreator.cosmod.world.features.plants.ShaggyManeFeature;
import net.mcreator.cosmod.world.features.plants.ScarletinaBoleteFeature;
import net.mcreator.cosmod.world.features.plants.ScalyPholiotaFeature;
import net.mcreator.cosmod.world.features.plants.ScaberStalkFeature;
import net.mcreator.cosmod.world.features.plants.SandyStiltballFeature;
import net.mcreator.cosmod.world.features.plants.SaffronMilkcapFeature;
import net.mcreator.cosmod.world.features.plants.RuneFernFeature;
import net.mcreator.cosmod.world.features.plants.RufousMilkcapFeature;
import net.mcreator.cosmod.world.features.plants.RosyGomphidiusFeature;
import net.mcreator.cosmod.world.features.plants.RedTearMushroomFeature;
import net.mcreator.cosmod.world.features.plants.RedPoppyBushFeature;
import net.mcreator.cosmod.world.features.plants.RedPansiesFeature;
import net.mcreator.cosmod.world.features.plants.RedCrackedBoleteFeature;
import net.mcreator.cosmod.world.features.plants.RedAnemoneFeature;
import net.mcreator.cosmod.world.features.plants.PurplehollyhockFeature;
import net.mcreator.cosmod.world.features.plants.PurpleblackhollyhockFeature;
import net.mcreator.cosmod.world.features.plants.PurpleCoralFeature;
import net.mcreator.cosmod.world.features.plants.PuffballFeature;
import net.mcreator.cosmod.world.features.plants.PoisonFireCoralFeature;
import net.mcreator.cosmod.world.features.plants.PlantPotDapperlingFeature;
import net.mcreator.cosmod.world.features.plants.PinkWaxcapFeature;
import net.mcreator.cosmod.world.features.plants.PinkHollyhockFeature;
import net.mcreator.cosmod.world.features.plants.PigEarsFeature;
import net.mcreator.cosmod.world.features.plants.PheasantBackFeature;
import net.mcreator.cosmod.world.features.plants.PennyBunFeature;
import net.mcreator.cosmod.world.features.plants.ParrotToadstoolFeature;
import net.mcreator.cosmod.world.features.plants.ParasolShroomFeature;
import net.mcreator.cosmod.world.features.plants.PantherCapFeature;
import net.mcreator.cosmod.world.features.plants.OrangePurplePansiesFeature;
import net.mcreator.cosmod.world.features.plants.OrangePansiesFeature;
import net.mcreator.cosmod.world.features.plants.OldManOfTheWoodFeature;
import net.mcreator.cosmod.world.features.plants.OctopusStinkhornFeature;
import net.mcreator.cosmod.world.features.plants.NativeBlueLupineFeature;
import net.mcreator.cosmod.world.features.plants.NamekoFeature;
import net.mcreator.cosmod.world.features.plants.MushroomOfTheSunFeature;
import net.mcreator.cosmod.world.features.plants.MicaCapFeature;
import net.mcreator.cosmod.world.features.plants.MeadowMushroomFeature;
import net.mcreator.cosmod.world.features.plants.MatsutakeFeature;
import net.mcreator.cosmod.world.features.plants.ManOnHorsebackFeature;
import net.mcreator.cosmod.world.features.plants.MagicShroomFeature;
import net.mcreator.cosmod.world.features.plants.MagentaPansiesFeature;
import net.mcreator.cosmod.world.features.plants.MagentaGlowshroomFeature;
import net.mcreator.cosmod.world.features.plants.LavenderBushShortFeature;
import net.mcreator.cosmod.world.features.plants.LavenderBushFeature;
import net.mcreator.cosmod.world.features.plants.LaughingGymFeature;
import net.mcreator.cosmod.world.features.plants.LatticeMushroomFeature;
import net.mcreator.cosmod.world.features.plants.LanternMushroomFeature;
import net.mcreator.cosmod.world.features.plants.KoruGreenFeature;
import net.mcreator.cosmod.world.features.plants.KingTrumpetFeature;
import net.mcreator.cosmod.world.features.plants.InkcapFeature;
import net.mcreator.cosmod.world.features.plants.IndigoMilkcapFeature;
import net.mcreator.cosmod.world.features.plants.HotPinkHollyhockFeature;
import net.mcreator.cosmod.world.features.plants.HorseShroomFeature;
import net.mcreator.cosmod.world.features.plants.HornOfPlentyFeature;
import net.mcreator.cosmod.world.features.plants.HoneyMushroomFeature;
import net.mcreator.cosmod.world.features.plants.HenOfTheWoodsFeature;
import net.mcreator.cosmod.world.features.plants.GreenGlowshroomFeature;
import net.mcreator.cosmod.world.features.plants.GoldenPinkPansiesFeature;
import net.mcreator.cosmod.world.features.plants.GoldenChanterelleFeature;
import net.mcreator.cosmod.world.features.plants.FlyAgaricFeature;
import net.mcreator.cosmod.world.features.plants.FalseMorelFeature;
import net.mcreator.cosmod.world.features.plants.FairyRingShroomFeature;
import net.mcreator.cosmod.world.features.plants.ElfinSaddleFeature;
import net.mcreator.cosmod.world.features.plants.EarthstarFeature;
import net.mcreator.cosmod.world.features.plants.DevilsEggsFeature;
import net.mcreator.cosmod.world.features.plants.DevilsCigarFeature;
import net.mcreator.cosmod.world.features.plants.DestroyingAngelsFeature;
import net.mcreator.cosmod.world.features.plants.DesertMallowFeature;
import net.mcreator.cosmod.world.features.plants.DeathCapFeature;
import net.mcreator.cosmod.world.features.plants.DeadlyWebcapFeature;
import net.mcreator.cosmod.world.features.plants.DeadMansFingersFeature;
import net.mcreator.cosmod.world.features.plants.DarkscaledKnightFeature;
import net.mcreator.cosmod.world.features.plants.CrimsonWaxcapFeature;
import net.mcreator.cosmod.world.features.plants.CookeinaFeature;
import net.mcreator.cosmod.world.features.plants.ColumnStinkhornFeature;
import net.mcreator.cosmod.world.features.plants.ClusteredCoralFeature;
import net.mcreator.cosmod.world.features.plants.ChinguluFeature;
import net.mcreator.cosmod.world.features.plants.CauliflowerFungiFeature;
import net.mcreator.cosmod.world.features.plants.CaterpillarFungiFeature;
import net.mcreator.cosmod.world.features.plants.CandyCapFeature;
import net.mcreator.cosmod.world.features.plants.CandleSnuffFeature;
import net.mcreator.cosmod.world.features.plants.CallalilyFeature;
import net.mcreator.cosmod.world.features.plants.CaesarShroomFeature;
import net.mcreator.cosmod.world.features.plants.ButtercupFlowersFeature;
import net.mcreator.cosmod.world.features.plants.BrownRollrimFeature;
import net.mcreator.cosmod.world.features.plants.BristledSawgillFeature;
import net.mcreator.cosmod.world.features.plants.BluingBoleteFeature;
import net.mcreator.cosmod.world.features.plants.BluePansiesFeature;
import net.mcreator.cosmod.world.features.plants.BlueKnightFeature;
import net.mcreator.cosmod.world.features.plants.BlueIrisFeature;
import net.mcreator.cosmod.world.features.plants.BlueGlowMushroomFeature;
import net.mcreator.cosmod.world.features.plants.BlueChanterelleFeature;
import net.mcreator.cosmod.world.features.plants.BleedingToothFeature;
import net.mcreator.cosmod.world.features.plants.BirchBoleteFeature;
import net.mcreator.cosmod.world.features.plants.BeechFeature;
import net.mcreator.cosmod.world.features.plants.BayBoleteFeature;
import net.mcreator.cosmod.world.features.plants.AutumnSkullcapFeature;
import net.mcreator.cosmod.world.features.plants.ApricotJellyFeature;
import net.mcreator.cosmod.world.features.plants.AngelsWingFeature;
import net.mcreator.cosmod.CosmodMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class CosmodModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, CosmodMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> CALLALILY = register("callalily", CallalilyFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, CallalilyFeature.GENERATE_BIOMES, CallalilyFeature::placedFeature));
	public static final RegistryObject<Feature<?>> LAVENDER_BUSH = register("lavender_bush", LavenderBushFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, LavenderBushFeature.GENERATE_BIOMES, LavenderBushFeature::placedFeature));
	public static final RegistryObject<Feature<?>> NATIVE_BLUE_LUPINE = register("native_blue_lupine", NativeBlueLupineFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, NativeBlueLupineFeature.GENERATE_BIOMES,
					NativeBlueLupineFeature::placedFeature));
	public static final RegistryObject<Feature<?>> LAVENDER_BUSH_SHORT = register("lavender_bush_short", LavenderBushShortFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, LavenderBushShortFeature.GENERATE_BIOMES,
					LavenderBushShortFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BUTTERCUP_FLOWERS = register("buttercup_flowers", ButtercupFlowersFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, ButtercupFlowersFeature.GENERATE_BIOMES,
					ButtercupFlowersFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RED_POPPY_BUSH = register("red_poppy_bush", RedPoppyBushFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, RedPoppyBushFeature.GENERATE_BIOMES, RedPoppyBushFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DESERT_MALLOW = register("desert_mallow", DesertMallowFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, DesertMallowFeature.GENERATE_BIOMES, DesertMallowFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BLUE_IRIS = register("blue_iris", BlueIrisFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, BlueIrisFeature.GENERATE_BIOMES, BlueIrisFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BLUE_PANSIES = register("blue_pansies", BluePansiesFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, BluePansiesFeature.GENERATE_BIOMES, BluePansiesFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GOLDEN_PINK_PANSIES = register("golden_pink_pansies", GoldenPinkPansiesFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, GoldenPinkPansiesFeature.GENERATE_BIOMES,
					GoldenPinkPansiesFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MAGENTA_PANSIES = register("magenta_pansies", MagentaPansiesFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, MagentaPansiesFeature.GENERATE_BIOMES,
					MagentaPansiesFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ORANGE_PANSIES = register("orange_pansies", OrangePansiesFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, OrangePansiesFeature.GENERATE_BIOMES, OrangePansiesFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ORANGE_PURPLE_PANSIES = register("orange_purple_pansies", OrangePurplePansiesFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, OrangePurplePansiesFeature.GENERATE_BIOMES,
					OrangePurplePansiesFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RED_PANSIES = register("red_pansies", RedPansiesFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, RedPansiesFeature.GENERATE_BIOMES, RedPansiesFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SUNSET_IRIS = register("sunset_iris", SunsetIrisFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, SunsetIrisFeature.GENERATE_BIOMES, SunsetIrisFeature::placedFeature));
	public static final RegistryObject<Feature<?>> WHITE_PURPLE_PANSIES = register("white_purple_pansies", WhitePurplePansiesFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, WhitePurplePansiesFeature.GENERATE_BIOMES,
					WhitePurplePansiesFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RUNE_FERN = register("rune_fern", RuneFernFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, RuneFernFeature.GENERATE_BIOMES, RuneFernFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RED_ANEMONE = register("red_anemone", RedAnemoneFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, RedAnemoneFeature.GENERATE_BIOMES, RedAnemoneFeature::placedFeature));
	public static final RegistryObject<Feature<?>> YELLOW_HOLLYHOCK = register("yellow_hollyhock", YellowHollyhockFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, YellowHollyhockFeature.GENERATE_BIOMES,
					YellowHollyhockFeature::placedFeature));
	public static final RegistryObject<Feature<?>> HOT_PINK_HOLLYHOCK = register("hot_pink_hollyhock", HotPinkHollyhockFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, HotPinkHollyhockFeature.GENERATE_BIOMES,
					HotPinkHollyhockFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PINK_HOLLYHOCK = register("pink_hollyhock", PinkHollyhockFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, PinkHollyhockFeature.GENERATE_BIOMES, PinkHollyhockFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PURPLEBLACKHOLLYHOCK = register("purpleblackhollyhock", PurpleblackhollyhockFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, PurpleblackhollyhockFeature.GENERATE_BIOMES,
					PurpleblackhollyhockFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PURPLEHOLLYHOCK = register("purplehollyhock", PurplehollyhockFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, PurplehollyhockFeature.GENERATE_BIOMES,
					PurplehollyhockFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ANGELS_WING = register("angels_wing", AngelsWingFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, AngelsWingFeature.GENERATE_BIOMES, AngelsWingFeature::placedFeature));
	public static final RegistryObject<Feature<?>> APRICOT_JELLY = register("apricot_jelly", ApricotJellyFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, ApricotJellyFeature.GENERATE_BIOMES, ApricotJellyFeature::placedFeature));
	public static final RegistryObject<Feature<?>> AUTUMN_SKULLCAP = register("autumn_skullcap", AutumnSkullcapFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, AutumnSkullcapFeature.GENERATE_BIOMES,
					AutumnSkullcapFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BAY_BOLETE = register("bay_bolete", BayBoleteFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, BayBoleteFeature.GENERATE_BIOMES, BayBoleteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BEECH = register("beech", BeechFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, BeechFeature.GENERATE_BIOMES, BeechFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BIRCH_BOLETE = register("birch_bolete", BirchBoleteFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, BirchBoleteFeature.GENERATE_BIOMES, BirchBoleteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BLEEDING_TOOTH = register("bleeding_tooth", BleedingToothFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, BleedingToothFeature.GENERATE_BIOMES, BleedingToothFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BLUE_CHANTERELLE = register("blue_chanterelle", BlueChanterelleFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, BlueChanterelleFeature.GENERATE_BIOMES,
					BlueChanterelleFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BLUE_GLOW_MUSHROOM = register("blue_glow_mushroom", BlueGlowMushroomFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, BlueGlowMushroomFeature.GENERATE_BIOMES,
					BlueGlowMushroomFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BLUE_KNIGHT = register("blue_knight", BlueKnightFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, BlueKnightFeature.GENERATE_BIOMES, BlueKnightFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BLUING_BOLETE = register("bluing_bolete", BluingBoleteFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, BluingBoleteFeature.GENERATE_BIOMES, BluingBoleteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BRISTLED_SAWGILL = register("bristled_sawgill", BristledSawgillFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, BristledSawgillFeature.GENERATE_BIOMES,
					BristledSawgillFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BROWN_ROLLRIM = register("brown_rollrim", BrownRollrimFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, BrownRollrimFeature.GENERATE_BIOMES, BrownRollrimFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CAESAR_SHROOM = register("caesar_shroom", CaesarShroomFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, CaesarShroomFeature.GENERATE_BIOMES, CaesarShroomFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CANDLE_SNUFF = register("candle_snuff", CandleSnuffFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, CandleSnuffFeature.GENERATE_BIOMES, CandleSnuffFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CANDY_CAP = register("candy_cap", CandyCapFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, CandyCapFeature.GENERATE_BIOMES, CandyCapFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CATERPILLAR_FUNGI = register("caterpillar_fungi", CaterpillarFungiFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, CaterpillarFungiFeature.GENERATE_BIOMES,
					CaterpillarFungiFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CAULIFLOWER_FUNGI = register("cauliflower_fungi", CauliflowerFungiFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, CauliflowerFungiFeature.GENERATE_BIOMES,
					CauliflowerFungiFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CHINGULU = register("chingulu", ChinguluFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, ChinguluFeature.GENERATE_BIOMES, ChinguluFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CLUSTERED_CORAL = register("clustered_coral", ClusteredCoralFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, ClusteredCoralFeature.GENERATE_BIOMES,
					ClusteredCoralFeature::placedFeature));
	public static final RegistryObject<Feature<?>> COLUMN_STINKHORN = register("column_stinkhorn", ColumnStinkhornFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, ColumnStinkhornFeature.GENERATE_BIOMES,
					ColumnStinkhornFeature::placedFeature));
	public static final RegistryObject<Feature<?>> COOKEINA = register("cookeina", CookeinaFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, CookeinaFeature.GENERATE_BIOMES, CookeinaFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CRIMSON_WAXCAP = register("crimson_waxcap", CrimsonWaxcapFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, CrimsonWaxcapFeature.GENERATE_BIOMES, CrimsonWaxcapFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DARKSCALED_KNIGHT = register("darkscaled_knight", DarkscaledKnightFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, DarkscaledKnightFeature.GENERATE_BIOMES,
					DarkscaledKnightFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEADLY_WEBCAP = register("deadly_webcap", DeadlyWebcapFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, DeadlyWebcapFeature.GENERATE_BIOMES, DeadlyWebcapFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEAD_MANS_FINGERS = register("dead_mans_fingers", DeadMansFingersFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, DeadMansFingersFeature.GENERATE_BIOMES,
					DeadMansFingersFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEATH_CAP = register("death_cap", DeathCapFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, DeathCapFeature.GENERATE_BIOMES, DeathCapFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DESTROYING_ANGELS = register("destroying_angels", DestroyingAngelsFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, DestroyingAngelsFeature.GENERATE_BIOMES,
					DestroyingAngelsFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEVILS_CIGAR = register("devils_cigar", DevilsCigarFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, DevilsCigarFeature.GENERATE_BIOMES, DevilsCigarFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEVILS_EGGS = register("devils_eggs", DevilsEggsFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, DevilsEggsFeature.GENERATE_BIOMES, DevilsEggsFeature::placedFeature));
	public static final RegistryObject<Feature<?>> EARTHSTAR = register("earthstar", EarthstarFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, EarthstarFeature.GENERATE_BIOMES, EarthstarFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ELFIN_SADDLE = register("elfin_saddle", ElfinSaddleFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, ElfinSaddleFeature.GENERATE_BIOMES, ElfinSaddleFeature::placedFeature));
	public static final RegistryObject<Feature<?>> FAIRY_RING_SHROOM = register("fairy_ring_shroom", FairyRingShroomFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, FairyRingShroomFeature.GENERATE_BIOMES,
					FairyRingShroomFeature::placedFeature));
	public static final RegistryObject<Feature<?>> FALSE_MOREL = register("false_morel", FalseMorelFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, FalseMorelFeature.GENERATE_BIOMES, FalseMorelFeature::placedFeature));
	public static final RegistryObject<Feature<?>> FLY_AGARIC = register("fly_agaric", FlyAgaricFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, FlyAgaricFeature.GENERATE_BIOMES, FlyAgaricFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GOLDEN_CHANTERELLE = register("golden_chanterelle", GoldenChanterelleFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, GoldenChanterelleFeature.GENERATE_BIOMES,
					GoldenChanterelleFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GREEN_GLOWSHROOM = register("green_glowshroom", GreenGlowshroomFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, GreenGlowshroomFeature.GENERATE_BIOMES,
					GreenGlowshroomFeature::placedFeature));
	public static final RegistryObject<Feature<?>> HEN_OF_THE_WOODS = register("hen_of_the_woods", HenOfTheWoodsFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, HenOfTheWoodsFeature.GENERATE_BIOMES,
					HenOfTheWoodsFeature::placedFeature));
	public static final RegistryObject<Feature<?>> HONEY_MUSHROOM = register("honey_mushroom", HoneyMushroomFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, HoneyMushroomFeature.GENERATE_BIOMES, HoneyMushroomFeature::placedFeature));
	public static final RegistryObject<Feature<?>> HORN_OF_PLENTY = register("horn_of_plenty", HornOfPlentyFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, HornOfPlentyFeature.GENERATE_BIOMES, HornOfPlentyFeature::placedFeature));
	public static final RegistryObject<Feature<?>> HORSE_SHROOM = register("horse_shroom", HorseShroomFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, HorseShroomFeature.GENERATE_BIOMES, HorseShroomFeature::placedFeature));
	public static final RegistryObject<Feature<?>> INDIGO_MILKCAP = register("indigo_milkcap", IndigoMilkcapFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, IndigoMilkcapFeature.GENERATE_BIOMES, IndigoMilkcapFeature::placedFeature));
	public static final RegistryObject<Feature<?>> INKCAP = register("inkcap", InkcapFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, InkcapFeature.GENERATE_BIOMES, InkcapFeature::placedFeature));
	public static final RegistryObject<Feature<?>> KING_TRUMPET = register("king_trumpet", KingTrumpetFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, KingTrumpetFeature.GENERATE_BIOMES, KingTrumpetFeature::placedFeature));
	public static final RegistryObject<Feature<?>> KORU_GREEN = register("koru_green", KoruGreenFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, KoruGreenFeature.GENERATE_BIOMES, KoruGreenFeature::placedFeature));
	public static final RegistryObject<Feature<?>> LANTERN_MUSHROOM = register("lantern_mushroom", LanternMushroomFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, LanternMushroomFeature.GENERATE_BIOMES,
					LanternMushroomFeature::placedFeature));
	public static final RegistryObject<Feature<?>> LATTICE_MUSHROOM = register("lattice_mushroom", LatticeMushroomFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, LatticeMushroomFeature.GENERATE_BIOMES,
					LatticeMushroomFeature::placedFeature));
	public static final RegistryObject<Feature<?>> LAUGHING_GYM = register("laughing_gym", LaughingGymFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, LaughingGymFeature.GENERATE_BIOMES, LaughingGymFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MAGENTA_GLOWSHROOM = register("magenta_glowshroom", MagentaGlowshroomFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, MagentaGlowshroomFeature.GENERATE_BIOMES,
					MagentaGlowshroomFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MAGIC_SHROOM = register("magic_shroom", MagicShroomFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, MagicShroomFeature.GENERATE_BIOMES, MagicShroomFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MAN_ON_HORSEBACK = register("man_on_horseback", ManOnHorsebackFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, ManOnHorsebackFeature.GENERATE_BIOMES,
					ManOnHorsebackFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MATSUTAKE = register("matsutake", MatsutakeFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, MatsutakeFeature.GENERATE_BIOMES, MatsutakeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MEADOW_MUSHROOM = register("meadow_mushroom", MeadowMushroomFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, MeadowMushroomFeature.GENERATE_BIOMES,
					MeadowMushroomFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MICA_CAP = register("mica_cap", MicaCapFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, MicaCapFeature.GENERATE_BIOMES, MicaCapFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MUSHROOM_OF_THE_SUN = register("mushroom_of_the_sun", MushroomOfTheSunFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, MushroomOfTheSunFeature.GENERATE_BIOMES,
					MushroomOfTheSunFeature::placedFeature));
	public static final RegistryObject<Feature<?>> NAMEKO = register("nameko", NamekoFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, NamekoFeature.GENERATE_BIOMES, NamekoFeature::placedFeature));
	public static final RegistryObject<Feature<?>> OCTOPUS_STINKHORN = register("octopus_stinkhorn", OctopusStinkhornFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, OctopusStinkhornFeature.GENERATE_BIOMES,
					OctopusStinkhornFeature::placedFeature));
	public static final RegistryObject<Feature<?>> OLD_MAN_OF_THE_WOOD = register("old_man_of_the_wood", OldManOfTheWoodFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, OldManOfTheWoodFeature.GENERATE_BIOMES,
					OldManOfTheWoodFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PANTHER_CAP = register("panther_cap", PantherCapFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, PantherCapFeature.GENERATE_BIOMES, PantherCapFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PARASOL_SHROOM = register("parasol_shroom", ParasolShroomFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, ParasolShroomFeature.GENERATE_BIOMES, ParasolShroomFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PARROT_TOADSTOOL = register("parrot_toadstool", ParrotToadstoolFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, ParrotToadstoolFeature.GENERATE_BIOMES,
					ParrotToadstoolFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PENNY_BUN = register("penny_bun", PennyBunFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, PennyBunFeature.GENERATE_BIOMES, PennyBunFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PHEASANT_BACK = register("pheasant_back", PheasantBackFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, PheasantBackFeature.GENERATE_BIOMES, PheasantBackFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PIG_EARS = register("pig_ears", PigEarsFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, PigEarsFeature.GENERATE_BIOMES, PigEarsFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PINK_WAXCAP = register("pink_waxcap", PinkWaxcapFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, PinkWaxcapFeature.GENERATE_BIOMES, PinkWaxcapFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PLANT_POT_DAPPERLING = register("plant_pot_dapperling", PlantPotDapperlingFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, PlantPotDapperlingFeature.GENERATE_BIOMES,
					PlantPotDapperlingFeature::placedFeature));
	public static final RegistryObject<Feature<?>> POISON_FIRE_CORAL = register("poison_fire_coral", PoisonFireCoralFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, PoisonFireCoralFeature.GENERATE_BIOMES,
					PoisonFireCoralFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PUFFBALL = register("puffball", PuffballFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, PuffballFeature.GENERATE_BIOMES, PuffballFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PURPLE_CORAL = register("purple_coral", PurpleCoralFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, PurpleCoralFeature.GENERATE_BIOMES, PurpleCoralFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RED_CRACKED_BOLETE = register("red_cracked_bolete", RedCrackedBoleteFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, RedCrackedBoleteFeature.GENERATE_BIOMES,
					RedCrackedBoleteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RED_TEAR_MUSHROOM = register("red_tear_mushroom", RedTearMushroomFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, RedTearMushroomFeature.GENERATE_BIOMES,
					RedTearMushroomFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ROSY_GOMPHIDIUS = register("rosy_gomphidius", RosyGomphidiusFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, RosyGomphidiusFeature.GENERATE_BIOMES,
					RosyGomphidiusFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RUFOUS_MILKCAP = register("rufous_milkcap", RufousMilkcapFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, RufousMilkcapFeature.GENERATE_BIOMES, RufousMilkcapFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SAFFRON_MILKCAP = register("saffron_milkcap", SaffronMilkcapFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, SaffronMilkcapFeature.GENERATE_BIOMES,
					SaffronMilkcapFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SANDY_STILTBALL = register("sandy_stiltball", SandyStiltballFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, SandyStiltballFeature.GENERATE_BIOMES,
					SandyStiltballFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SCABER_STALK = register("scaber_stalk", ScaberStalkFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, ScaberStalkFeature.GENERATE_BIOMES, ScaberStalkFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SCALY_PHOLIOTA = register("scaly_pholiota", ScalyPholiotaFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, ScalyPholiotaFeature.GENERATE_BIOMES, ScalyPholiotaFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SCARLETINA_BOLETE = register("scarletina_bolete", ScarletinaBoleteFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, ScarletinaBoleteFeature.GENERATE_BIOMES,
					ScarletinaBoleteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SHAGGY_MANE = register("shaggy_mane", ShaggyManeFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, ShaggyManeFeature.GENERATE_BIOMES, ShaggyManeFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
