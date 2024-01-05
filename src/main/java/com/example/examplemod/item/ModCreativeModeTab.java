package com.example.examplemod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab
{
    public static final CreativeModeTab Mod_tab = new CreativeModeTab("modtab")
    {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(moditems.Zircon.get());
        }
    };
}
