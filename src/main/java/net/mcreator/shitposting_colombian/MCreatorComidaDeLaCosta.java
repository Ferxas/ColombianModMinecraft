package net.mcreator.shitposting_colombian;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

@Elementsshitposting_colombian.ModElement.Tag
public class MCreatorComidaDeLaCosta extends Elementsshitposting_colombian.ModElement {
	@ObjectHolder("shitposting_colombian:comidadelacosta")
	public static final Item block = null;

	public MCreatorComidaDeLaCosta(Elementsshitposting_colombian instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).food((new Food.Builder()).hunger(10).saturation(0.3f).build()));
			setRegistryName("comidadelacosta");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 10;
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}
