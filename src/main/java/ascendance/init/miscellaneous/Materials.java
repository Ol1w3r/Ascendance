package ascendance.init.miscellaneous;

import ascendance.interfaces.IGem.GemType;
import ascendance.init.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum Materials implements ToolMaterial {

    AMBER(4, 59, 2.0F, 2.0F, 30, () -> {
        return Ingredient.ofItems(ModItems.getRefinedGemByType(GemType.AMBER));
    }),
    AMETHYST(2, 3000, 4F, 2.1F, 30, () -> {
        return Ingredient.ofItems(ModItems.getRefinedGemByType(GemType.AMETHYST));
    }),
    AZURITE(3, 1000, 6.0F, 4.0F, 30, () -> {
        return Ingredient.ofItems(ModItems.getRefinedGemByType(GemType.AZURITE));
    }),
    ONYX(3, 1000, 10.0F, 1.5F, 30, () -> {
        return Ingredient.ofItems(ModItems.getRefinedGemByType(GemType.ONYX));
    }),
    PERIDOT(3, 900, 8.5F, 2.1F, 30, () -> {
        return Ingredient.ofItems(ModItems.getRefinedGemByType(GemType.PERIDOT));
    }),
    PETALITE(3, 250, 15.0F, 0.0F, 30, () -> {
        return Ingredient.ofItems(ModItems.getRefinedGemByType(GemType.PETALITE));
    }),
    PHOSPHOPHYLLITE(4, 1000, 5.0F, 8.0F, 30, () -> {
        return Ingredient.ofItems(ModItems.getRefinedGemByType(GemType.PHOSPHOPHYLLITE));
    }),
    RUBY(3, 2000, 8.0F, 2.7F, 30, () -> {
        return Ingredient.ofItems(ModItems.getRefinedGemByType(GemType.RUBY));
    }),
    SAPPHIRE(4, 2000, 7.2F, 2.7F, 30, () -> {
        return Ingredient.ofItems(ModItems.getRefinedGemByType(GemType.SAPPHIRE));
    }),;

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private Materials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
