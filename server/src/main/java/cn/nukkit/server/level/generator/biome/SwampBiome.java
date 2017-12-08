package cn.nukkit.server.level.generator.biome;

import cn.nukkit.server.block.Block;
import cn.nukkit.server.block.BlockFlower;
import cn.nukkit.server.level.generator.populator.PopulatorFlower;
import cn.nukkit.server.level.generator.populator.PopulatorLilyPad;
import cn.nukkit.server.level.generator.populator.tree.SwampTreePopulator;

/**
 * author: MagicDroidX
 * Nukkit Project
 */
public class SwampBiome extends GrassyBiome {

    public SwampBiome() {
        super();

        PopulatorLilyPad lilypad = new PopulatorLilyPad();
        lilypad.setBaseAmount(4);

        SwampTreePopulator trees = new SwampTreePopulator();
        trees.setBaseAmount(2);

        PopulatorFlower flower = new PopulatorFlower();
        flower.setBaseAmount(2);
        flower.addType(Block.RED_FLOWER, BlockFlower.TYPE_BLUE_ORCHID);

        this.addPopulator(trees);
        this.addPopulator(flower);
        this.addPopulator(lilypad);

        this.setElevation(62, 63);

        this.temperature = 0.8;
        this.rainfall = 0.9;
    }

    @Override
    public String getName() {
        return "Swamp";
    }

    @Override
    public int getColor() {
        return 0x6a7039;
    }
}