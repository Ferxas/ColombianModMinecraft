package net.mcreator.shitposting_colombian;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effect;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.ai.attributes.AbstractAttributeMap;
import net.minecraft.entity.LivingEntity;

import java.util.List;
import java.util.ArrayList;

@Elementsshitposting_colombian.ModElement.Tag
public class MCreatorBareto extends Elementsshitposting_colombian.ModElement {
	@ObjectHolder("shitposting_colombian:bareto")
	public static final Effect potion = null;

	public MCreatorBareto(Elementsshitposting_colombian instance) {
		super(instance, 9);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerEffect(RegistryEvent.Register<Effect> event) {
		event.getRegistry().register(new EffectCustom());
	}

	public static class EffectCustom extends Effect {
		private final ResourceLocation potionIcon;

		public EffectCustom() {
			super(EffectType.HARMFUL, -1);
			setRegistryName("bareto");
			potionIcon = new ResourceLocation("shitposting_colombian:textures/porro.png");
		}

		@Override
		public String getName() {
			return "effect.bareto";
		}

		@Override
		public boolean isBeneficial() {
			return false;
		}

		@Override
		public boolean isInstant() {
			return false;
		}

		@Override
		public List<ItemStack> getCurativeItems() {
			List<ItemStack> ret = new ArrayList<>();
			ret.add(new ItemStack(Items.MILK_BUCKET, (int) (1)));
			ret.add(new ItemStack(MCreatorComidaDeLaCosta.block, (int) (1)));
			return ret;
		}

		@Override
		public boolean shouldRenderInvText(EffectInstance effect) {
			return true;
		}

		@Override
		public boolean shouldRenderHUD(EffectInstance effect) {
			return true;
		}

		@Override
		public void applyAttributesModifiersToEntity(LivingEntity entity, AbstractAttributeMap attributeMapIn, int amplifier) {
			World world = entity.world;
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				MCreatorBaretoPotionStartedapplied.executeProcedure($_dependencies);
			}
		}

		@Override
		public void performEffect(LivingEntity entity, int amplifier) {
			World world = entity.world;
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				MCreatorBaretoPotionStartedapplied.executeProcedure($_dependencies);
			}
		}

		@Override
		public boolean isReady(int duration, int amplifier) {
			return true;
		}
	}
}
