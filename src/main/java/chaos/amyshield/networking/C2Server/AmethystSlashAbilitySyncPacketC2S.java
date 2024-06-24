package chaos.amyshield.networking.C2Server;

import chaos.amyshield.util.IEntityDataSaver;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;

public class AmethystSlashAbilitySyncPacketC2S {
    public static void receiver(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler, PacketByteBuf buf, PacketSender responseSender) {
        if (player != null) {
            ((IEntityDataSaver) player).getPersistentData().putBoolean("slashing", buf.readBoolean());
        }
    }

    public static void syncSlash(CustomPayload customPayload, ServerPlayNetworking.Context context) {
        System.out.println("sync Charge");
    }
}