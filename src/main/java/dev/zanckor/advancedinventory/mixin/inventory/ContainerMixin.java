package dev.zanckor.advancedinventory.mixin.inventory;

import dev.zanckor.advancedinventory.core.config.ServerConfig;
import net.minecraft.world.Container;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(Container.class)
public interface ContainerMixin {


    /**
     * @author Zanckor
     * @reason Configurable Max Stack Size
     */
    @Overwrite
    default int getMaxStackSize() {
        return ServerConfig.LIMIT_STACK_SIZE.get() == ServerConfig.DEFAULT_MINECRAFT_SIZE ? 64 : ServerConfig.LIMIT_STACK_SIZE.get();
    }
}