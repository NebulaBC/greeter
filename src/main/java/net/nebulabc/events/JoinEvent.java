package net.nebulabc.events;

import com.bta.events.PlayerLoggedInEvent;
import net.minecraft.server.MinecraftServer;
import net.minecraft.src.EntityPlayerMP;
import net.minecraft.src.Packet3Chat;
import net.minecraft.src.command.ChatColor;
import org.pf4j.Extension;

import java.io.File;

@Extension
public class JoinEvent implements PlayerLoggedInEvent
{
    @Override
    public void onEvent(EntityPlayerMP entityPlayerMP)
    {
        File f = new File("world/players/" + entityPlayerMP.username + ".dat");
        if(!f.exists()) {
            MinecraftServer.getInstance().configManager.sendPacketToAllPlayers(new Packet3Chat(ChatColor.yellow + "Welcome " + entityPlayerMP.username + " to the server!"));
        }
    }
}
