package ascendance.init.items.tools;

import ascendance.init.miscellaneous.ItemGroups;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class AxeBase extends AxeItem {

    public ToolMaterial material;

    public AxeBase(ToolMaterial material, int attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed, new Settings().group(ItemGroups.TOOLS));
        this.material = material;
    }

    public AxeBase(ToolMaterial material) {
        this(material, 6, -2.8F);
    }
}
