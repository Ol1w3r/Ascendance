package ascendance.init.items.tools;

import ascendance.init.miscellaneous.ItemGroups;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class HoeBase extends HoeItem {

    public ToolMaterial material;

    public HoeBase(ToolMaterial material, int attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed, new Settings().group(ItemGroups.TOOLS));
        this.material = material;
    }

    public HoeBase(ToolMaterial material) {
        this(material, 0, -0.0F);
    }
}
