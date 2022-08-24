package net.mcreator.shitposting_colombian;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

@Elementsshitposting_colombian.ModElement.Tag
public class MCreatorEjemploArmorArmor extends Elementsshitposting_colombian.ModElement {
	@ObjectHolder("shitposting_colombian:ejemploarmorarmorhelmet")
	public static final Item helmet = null;
	@ObjectHolder("shitposting_colombian:ejemploarmorarmorbody")
	public static final Item body = null;
	@ObjectHolder("shitposting_colombian:ejemploarmorarmorlegs")
	public static final Item legs = null;
	@ObjectHolder("shitposting_colombian:ejemploarmorarmorboots")
	public static final Item boots = null;

	public MCreatorEjemploArmorArmor(Elementsshitposting_colombian instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 200;
			}

			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{50, 50, 50, 50}[slot.getIndex()];
			}

			public int getEnchantability() {
				return 50;
			}

			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Blocks.BIRCH_SAPLING, (int) (1)), new ItemStack(Blocks.SPRUCE_SAPLING, (int) (1)));
			}

			@OnlyIn(Dist.CLIENT)
			public String getName() {
				return "ejemploarmorarmor";
			}

			public float getToughness() {
				return 5f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "shitposting_colombian:textures/models/armor/ejemploarmor_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("ejemploarmorarmorhelmet"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "shitposting_colombian:textures/models/armor/ejemploarmor_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("ejemploarmorarmorbody"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "shitposting_colombian:textures/models/armor/ejemploarmor_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("ejemploarmorarmorlegs"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "shitposting_colombian:textures/models/armor/ejemploarmor_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("ejemploarmorarmorboots"));
	}
}
