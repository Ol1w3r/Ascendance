package ascendance.init;

import ascendance.interfaces.IGem.GemType;
import ascendance.init.items.ItemBase;
import ascendance.init.items.tools.*;
import ascendance.init.miscellaneous.ItemGroups;
import ascendance.util;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.HashMap;
import java.util.Map;

public class ModItems {

    public static final Map<String, Item> rawGems = new HashMap<>();
    public static final Map<String, Item> refinedGems = new HashMap<>();
    public static final Map<String, Item> gemPickaxes = new HashMap<>();
    public static final Map<String, Item> gemAxes = new HashMap<>();
    public static final Map<String, Item> gemShovels = new HashMap<>();
    public static final Map<String, Item> gemSwords = new HashMap<>();
    public static final Map<String, Item> gemHoes = new HashMap<>();
    public static final Map<String, Item> items = new HashMap<>();

    public ModItems() {
        util.LOGGER.debug("Crystallized: Start item registry");

        registerGems();

        registerGemTools();

        items.put("item_celestial_steel", new ItemBase());

        registerItemsInMap(items, ItemGroups.GENERAL);
    }

    public static Item getRefinedGemByType(GemType type) {
        return refinedGems.get("item_refined_" + type.getName());
    }

    private void registerGemTools() {

        registerPickaxes();
        registerAxes();
        registerShovels();
        registerHoes();
        registerSwords();
    }

    private void registerPickaxes() {
        String name;
        Item item;

        for (GemType type : GemType.values()) {
            name = "item_pickaxe_" + type.getName();
            item = new PickaxeBase(type.getToolMaterial(), 2, -2.8F);

            gemPickaxes.put(name, item);
            registerItem(name, item, ItemGroups.TOOLS);
        }
    }

    private void registerShovels() {
        String name;
        Item item;

        for (GemType type : GemType.values()) {
            name = "item_shovel_" + type.getName();
            item = new ShovelBase(type.getToolMaterial(), 1, -3.0F);

            gemShovels.put(name, item);
            registerItem(name, item, ItemGroups.TOOLS);
        }
    }

    private void registerAxes() {
        String name;
        Item item;

        for (GemType type : GemType.values()) {
            name = "item_axe_" + type.getName();
            item = new AxeBase(type.getToolMaterial(), 6, -2.8F);

            gemAxes.put(name, item);
            registerItem(name, item, ItemGroups.TOOLS);
        }
    }

    private void registerSwords() {
        String name;
        Item item;

        for (GemType type : GemType.values()) {
            name = "item_sword_" + type.getName();
            item = new SwordBase(type.getToolMaterial(), 3, -2.4F);

            gemSwords.put(name, item);
            registerItem(name, item, ItemGroups.TOOLS);
        }
    }

    private void registerHoes() {
        String name;
        Item item;

        for (GemType type : GemType.values()) {
            name = "item_hoe_" + type.getName();
            item = new HoeBase(type.getToolMaterial(), 0, -0.0F);

            gemHoes.put(name, item);
            registerItem(name, item, ItemGroups.TOOLS);
        }
    }

    private void registerGems() {
        String name;
        String pre = "item_raw_";
        Item item;

        for (GemType type : GemType.values()) {
            name = pre + type.getName();
            item = new ItemBase();

            rawGems.put(name, new ItemBase());
            registerItem(name, rawGems.get(name), ItemGroups.GENERAL);
        }
        pre = "item_refined_";
        for (GemType type : GemType.values()) {
            name = pre + type.getName();

            refinedGems.put(name, new ItemBase());
            registerItem(name, refinedGems.get(name), ItemGroups.GENERAL);
        }
    }

    private void registerGems(Map<String, Item> map, String name, ItemGroup group) {

        for(GemType type : GemType.values()) {
            registerItem(name + type.getName(), map.get(name + type.getName()), group);
        }
    }

    private void registerItemsInMap(Map<String, Item> map, ItemGroup group) {
        map.forEach((name, item) -> {
            registerItem(name, item, group);
        }) ;
    }

    private void registerItem(String name, Item item, ItemGroup group) {

        util.LOGGER.debug("Registering: " + name);

        Registry.register(
                Registry.ITEM,
                new Identifier(util.MODID, name),
                item
        );
    }
}
