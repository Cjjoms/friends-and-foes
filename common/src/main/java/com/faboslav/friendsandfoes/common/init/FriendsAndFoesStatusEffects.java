package com.faboslav.friendsandfoes.common.init;

import com.faboslav.friendsandfoes.FriendsAndFoes;
import com.faboslav.friendsandfoes.common.entity.effect.ReachStatusEffect;
import com.faboslav.friendsandfoes.common.init.registry.RegistryEntry;
import com.faboslav.friendsandfoes.common.init.registry.ResourcefulRegistries;
import com.faboslav.friendsandfoes.common.init.registry.ResourcefulRegistry;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.registry.Registry;

/**
 * @see net.minecraft.entity.effect.StatusEffects
 */
public final class FriendsAndFoesStatusEffects
{
	public static final ResourcefulRegistry<StatusEffect> STATUS_EFFECTS = ResourcefulRegistries.create(Registry.STATUS_EFFECT, FriendsAndFoes.MOD_ID);

	public static final RegistryEntry<StatusEffect> LONG_REACH = STATUS_EFFECTS.register("reach", () -> new ReachStatusEffect(StatusEffectCategory.BENEFICIAL, 3364735));
}
