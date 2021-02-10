package ascendance.init.blocks;


import ascendance.interfaces.IGem;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class BlockGem extends Block implements IGem {

    private GemType type;

    public BlockGem(GemType type, boolean isOre) {
        super(getSettings(type, isOre));
        this.type = type;
    }

    @Override
    public GemType getGemType() {
        return type;
    }

    public static Settings getSettings(GemType type, boolean isOre) {

        if (isOre) {
            return FabricBlockSettings.of(Material.STONE).strength(3.0F, 3.5F).breakByTool(FabricToolTags.PICKAXES, type.getMiningLevelNeeded());
        }
        else {
            return FabricBlockSettings.of(Material.METAL).strength(5.0F, 7.0F).breakByTool(FabricToolTags.PICKAXES, 2);
        }
    }
}
