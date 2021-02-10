package ascendance.init.items;

import ascendance.init.miscellaneous.ItemGroups;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    public ItemBase() {
        this(new Item.Settings().group(ItemGroups.GENERAL));
    }

    public ItemBase(Settings settings) {
        super(settings);
    }
}
