package net.finaty.additional_ores.world;

import net.finaty.additional_ores.AdditionalOres;
import net.finaty.additional_ores.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> TITAN_ORE_KEY = registerKey("titan_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> COBALT_ORE_KEY = registerKey("cobalt_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> IRIDIUM_ORE_KEY = registerKey("iridium_ore");

    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_COSMIC_DUST_ORE_KEY = registerKey("nether_cosmic_dust_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ENDSTONE_COSMIC_FRAGMENT_ORE_KEY = registerKey("endstone_cosmic_fragment_ore");

    public static void boostrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplacables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplacables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplacables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest endReplacables = new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> overworldTitanOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.TITAN_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_TITAN_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldCobaltOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.COBALT_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_COBALT_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldIridiumOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.IRIDIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_IRIDIUM_ORE.getDefaultState()));


        List<OreFeatureConfig.Target> netherCosmicDustOres =
                List.of(OreFeatureConfig.createTarget(netherReplacables, ModBlocks.NETHER_COSMIC_DUST_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> endstoneCosmicFragmentOres =
                List.of(OreFeatureConfig.createTarget(endReplacables, ModBlocks.ENDSTONE_COSMIC_FRAGMENT_ORE.getDefaultState()));


        register(context, TITAN_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTitanOres, 4));
        register(context, COBALT_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldCobaltOres, 4));
        register(context, IRIDIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldIridiumOres, 5));

        register(context, NETHER_COSMIC_DUST_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherCosmicDustOres, 9));
        register(context, ENDSTONE_COSMIC_FRAGMENT_ORE_KEY, Feature.ORE, new OreFeatureConfig(endstoneCosmicFragmentOres, 9));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(AdditionalOres.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
