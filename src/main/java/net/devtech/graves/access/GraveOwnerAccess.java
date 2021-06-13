package net.devtech.graves.access;

import java.util.List;
import java.util.UUID;

import net.minecraft.item.ItemStack;

public interface GraveOwnerAccess {
	void ueaj_setGrave(UUID uuid, List<ItemStack> inventory);

	boolean isGrave();
}
