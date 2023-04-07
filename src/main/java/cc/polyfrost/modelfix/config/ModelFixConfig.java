package cc.polyfrost.modelfix.config;

import cc.polyfrost.modelfix.PolyModelFix;
import cc.polyfrost.oneconfig.config.Config;
import cc.polyfrost.oneconfig.config.annotations.Info;
import cc.polyfrost.oneconfig.config.data.InfoType;
import cc.polyfrost.oneconfig.config.data.Mod;
import cc.polyfrost.oneconfig.config.data.ModType;

public class ModelFixConfig extends Config {

    @Info(text = "Use the enabled button in the mod menu to enable or disable the mod.", type = InfoType.INFO)
    private boolean hi = true;

    public ModelFixConfig() {
        super(new Mod(PolyModelFix.NAME, ModType.UTIL_QOL), PolyModelFix.MODID + ".json");
        initialize();
    }
}

