package cc.polyfrost.modelfix;

import cc.polyfrost.modelfix.config.ModelFixConfig;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = PolyModelFix.MODID, name = PolyModelFix.NAME, version = PolyModelFix.VERSION)
public class PolyModelFix {
    public static final String MODID = "@ID@";
    public static final String NAME = "@NAME@";
    public static final String VERSION = "@VER@";
    // Sets the variables from `gradle.properties`. See the `blossom` config in `build.gradle.kts`.
    @Mod.Instance(MODID)
    public static PolyModelFix INSTANCE; // Adds the instance of the mod, so we can access other variables.
    public static ModelFixConfig config;

    // Register the config and commands.
    @Mod.EventHandler
    public void onInit(FMLInitializationEvent event) {
        config = new ModelFixConfig();
    }
}
