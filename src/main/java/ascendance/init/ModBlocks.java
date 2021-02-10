package ascendance.init;

import ascendance.init.blocks.BlockGem;
import ascendance.init.miscellaneous.ItemGroups;
import ascendance.interfaces.IGem.GemType;
import ascendance.util;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.HashMap;
import java.util.Map;

public class ModBlocks {

    public static final Map<String, Block> gemOres = new HashMap<>();
    public static final Map<String, Block> gemRaw = new HashMap<>();
    public static final Map<String, Block> gemRefined = new HashMap<>();
    public static final Map<String, Block> blocks = new HashMap<>();

    public ModBlocks() {
        util.LOGGER.debug("Crystallized: Start block registry");

        registerGemBlocks();

        registerBlocksInMap(blocks, ItemGroups.GENERAL);
    }

    private void registerGemBlocks() {

        registerGemBlocks("block_ore_", true, gemOres);
        registerGemBlocks("block_raw_", false, gemRaw);
        registerGemBlocks("block_refined_", false, gemRefined);
    }

    private void registerGemBlocks(String prefix, boolean isOre, Map<String, Block> map) {
        Block block;
        String name = "";
        for(GemType type: GemType.values()) {
            block = new BlockGem(type, isOre);
            name = prefix + type.getName();
            registerBlock(name, block, ItemGroups.GENERAL);
            map.put(name, block);
        }
    }

    private void putGemBlocks() {
        String typeName;
        String pre = "block_";

        for(GemType type: GemType.values()) {
            typeName = type.getName();
            gemOres.put(pre + "ore_" + typeName, new BlockGem(type, true));
            gemRaw.put(pre + "raw_" + typeName, new BlockGem(type, false));
            gemRefined.put(pre + "refined_" + typeName, new BlockGem(type, false));
        }
    }

    private void registerGems(Map<String, Block> map, String name, ItemGroup group) {

        for(GemType type : GemType.values()) {
            registerBlock(name + type.getName(), map.get(name + type.getName()), group);
        }
    }

    private void registerBlocksInMap(Map<String, Block> map, ItemGroup group) {
        map.forEach((name, block) -> {
            registerBlock(name, block, group);
        }) ;
    }

    private void registerBlock(String name, Block block, ItemGroup group) {

        util.LOGGER.debug("Registering: " + name);

        Registry.register(
                Registry.BLOCK,
                new Identifier(util.MODID, name),
                block);
        Registry.register(
                Registry.ITEM,
                new Identifier(util.MODID, name),
                new BlockItem(block, new Item.Settings().group(group)));
    }
}
