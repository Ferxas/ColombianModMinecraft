package net.mcreator.shitposting_colombian;

import net.minecraft.world.World;
import net.minecraft.world.Difficulty;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

@Elementsshitposting_colombian.ModElement.Tag
public class MCreatorBaretoPotionStartedapplied extends Elementsshitposting_colombian.ModElement {
	public MCreatorBaretoPotionStartedapplied(Elementsshitposting_colombian instance) {
		super(instance, 10);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorBaretoPotionStartedapplied!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorBaretoPotionStartedapplied!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorBaretoPotionStartedapplied!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorBaretoPotionStartedapplied!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorBaretoPotionStartedapplied!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((world.getDifficulty() == Difficulty.PEACEFUL)) {
		}
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(MCreatorBareto.potion, (int) 60, (int) (world.getBiome(
					new BlockPos((int) x, (int) y, (int) z)).getTemperature(new BlockPos((int) x, (int) y, (int) z)) * 100.f)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(MCreatorBareto.potion, (int) 60, (int) ((entity instanceof LivingEntity)
					? ((LivingEntity) entity).getTotalArmorValue()
					: 0)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(MCreatorBareto.potion, (int) 60, (int) (entity.getMotion().getY()), (world
					.getDifficulty() == Difficulty.HARD), (true)));
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).abilities.disableDamage = (true);
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).abilities.disableDamage = (true);
		if (entity instanceof PlayerEntity && !world.isRemote) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Jueputa, estoy re trabao pai"), (true));
		}
	}
}
