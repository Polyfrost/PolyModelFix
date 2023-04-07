package cc.polyfrost.modelfix.mixin;

import cc.polyfrost.modelfix.ModelFix;
import cc.polyfrost.modelfix.PolyModelFix;
import net.minecraft.client.renderer.block.model.BlockPart;
import net.minecraft.client.renderer.block.model.ItemModelGenerator;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin(ItemModelGenerator.class)
public class ItemModelGeneratorMixin {

    @Inject(method = "func_178397_a", at = @At("HEAD"), cancellable = true)
    private void onHeadAddLayerElements(TextureAtlasSprite textureAtlasSprite, String string, int i, CallbackInfoReturnable<List<BlockPart>> cir) {
        if (PolyModelFix.config.enabled) {
            cir.setReturnValue(ModelFix.pixel(i, string, textureAtlasSprite));
        }
    }
}
