package com.faboslav.friendsandfoes.init.forge;

import com.faboslav.friendsandfoes.common.init.FriendsAndFoesStructureProcessorTypes;
import com.faboslav.friendsandfoes.common.init.registry.RegistryEntry;
import com.faboslav.friendsandfoes.world.forge.processor.IceologerCabinArmorStandProcessor;
import com.faboslav.friendsandfoes.world.forge.processor.IllusionerShackItemFrameProcessor;
import net.minecraft.structure.processor.StructureProcessorType;

public class FriendsAndFoesStructureProcessorTypesImpl
{
	public static final RegistryEntry<StructureProcessorType<IllusionerShackItemFrameProcessor>> ILLUSIONER_SHACK_ITEM_FRAME_PROCESSOR = FriendsAndFoesStructureProcessorTypes.STRUCTURE_PROCESSOR.register("illusioner_shack_item_frame_processor", () -> () -> IllusionerShackItemFrameProcessor.CODEC);
	public static final RegistryEntry<StructureProcessorType<IceologerCabinArmorStandProcessor>> ICEOLOGER_CABIN_ARMOR_STAND_PROCESSOR = FriendsAndFoesStructureProcessorTypes.STRUCTURE_PROCESSOR.register("iceologer_cabin_armor_stand_processor", () -> () -> IceologerCabinArmorStandProcessor.CODEC);

	public static void init() {
	}
}
