package ascendance.init.miscellaneous;

import ascendance.init.ModItems;
import ascendance.util;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ItemGroups {

    public static final ItemGroup GENERAL = FabricItemGroupBuilder.build(
            new Identifier(util.MODID, "general"),
            () -> new ItemStack(ModItems.refinedGems.get("item_refined_sapphire"))
    );
    public static final ItemGroup TOOLS = FabricItemGroupBuilder.build(
            new Identifier(util.MODID, "tools"),
            () -> new ItemStack(ModItems.gemHoes.get("item_hoe_sapphire"))
    );
    public static final ItemGroup ARMOR = FabricItemGroupBuilder.build(
            new Identifier(util.MODID, "armor"),
            () -> new ItemStack(Items.DIAMOND_HELMET)
    );
}
