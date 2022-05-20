
package net.mcreator.cosmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.cosmod.init.CosmodModTabs;

public class AmethystDaggerItem extends SwordItem {
	public AmethystDaggerItem() {
		super(new Tier() {
			public int getUses() {
				return 88;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.AMETHYST_SHARD));
			}
		}, 3, -2.4f, new Item.Properties().tab(CosmodModTabs.TAB_COSMOD));
	}
}
