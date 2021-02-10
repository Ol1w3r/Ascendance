package ascendance.interfaces;

import ascendance.init.miscellaneous.Materials;
import net.minecraft.item.ToolMaterial;

public interface IGem {

    GemType getGemType();

    enum GemType {

        AMBER(
                "amber",
                1,
                Materials.AMBER
        ),
        AMETHYST(
                "amethyst",
                2,
                Materials.AMETHYST
        ),
        AZURITE(
                "azurite",
                2,
                Materials.AZURITE
        ),
        ONYX(
                "onyx",
                2,
                Materials.ONYX
        ),
        PERIDOT(
                "peridot",
                2,
                Materials.PERIDOT
        ),
        PETALITE(
                "petalite",
                2,
                Materials.PETALITE
        ),
        PHOSPHOPHYLLITE(
                "phosphophyllite",
                2,
                Materials.PHOSPHOPHYLLITE
        ),
        RUBY(
                "ruby",
                2,
                Materials.RUBY
        ),
        SAPPHIRE(
                "sapphire",
                2,
                Materials.SAPPHIRE
        ),
        ;

        private final String name; // Name used for IDs
        private final int miningLevelNeeded; // Mining level needed to mine ore of this type
        private final ToolMaterial toolMaterial;


        GemType(
                String name,
                int miningLevelNeeded,
                ToolMaterial material) {
            this.name = name;
            this.miningLevelNeeded = miningLevelNeeded;
            this.toolMaterial = material;
        }

        public String getName() { return name; }
        public int getMiningLevelNeeded() { return miningLevelNeeded; }
        public ToolMaterial getToolMaterial() { return toolMaterial; }
    }
}
