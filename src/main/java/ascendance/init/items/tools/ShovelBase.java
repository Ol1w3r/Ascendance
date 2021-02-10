package ascendance.init.items.tools;

import ascendance.init.miscellaneous.ItemGroups;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class ShovelBase extends ShovelItem {

    public ToolMaterial material;

    public ShovelBase(ToolMaterial material, int attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed, new Settings().group(ItemGroups.TOOLS));
        this.material = material;
    }

    public ShovelBase(ToolMaterial material) {
        this(material, 1, -3.0F);
    }
}
