package ascendance.init.items.tools;

import ascendance.init.miscellaneous.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class SwordBase extends SwordItem {

    public ToolMaterial material;

    public SwordBase(ToolMaterial material, int attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed, new Settings().group(ItemGroups.TOOLS));
        this.material = material;
    }

    public SwordBase(ToolMaterial material) {
        this(material, 3, -2.4F);
    }
}
