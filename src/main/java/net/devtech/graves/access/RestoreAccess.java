package net.devtech.graves.access;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import net.minecraft.item.ItemStack;

public interface RestoreAccess {
	Map<UUID, List<ItemStack>> ueaj_getRestores();
}
