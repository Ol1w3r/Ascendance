package ascendance;

import ascendance.init.ModBlocks;
import ascendance.init.ModItems;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {

	@Override
	public void onInitialize() {

		util.LOGGER.debug("Initialize Ascendance");

		new ModBlocks();
		new ModItems();
	}
}
