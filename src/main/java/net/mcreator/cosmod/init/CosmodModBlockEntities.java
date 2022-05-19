
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cosmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.cosmod.block.entity.CosmeticTableBlockEntity;
import net.mcreator.cosmod.CosmodMod;

public class CosmodModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, CosmodMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> COSMETIC_TABLE = register("cosmetic_table", CosmodModBlocks.COSMETIC_TABLE,
			CosmeticTableBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
