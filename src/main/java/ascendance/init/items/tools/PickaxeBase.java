package ascendance.init.items.tools;

import ascendance.init.miscellaneous.ItemGroups;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class PickaxeBase extends PickaxeItem {

    public ToolMaterial material;

    public PickaxeBase(ToolMaterial material, int attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed, new Item.Settings().group(ItemGroups.TOOLS));
        this.material = material;
    }

    public PickaxeBase(ToolMaterial material) {
        this(material, 2, -2.8F);
    }
}
