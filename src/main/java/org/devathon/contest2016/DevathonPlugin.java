package org.devathon.contest2k16;

import org.bukkit.*

public class DevathonPlugin extends JavaPlugin, implements Player {
    
    public static void _OnEnable (  )
    {
        new Thread ( () -> {
                Bukkit
                .getServer()
                .getServer()
                .getServer()
                .getServer()
                .broadcastMessage("I jus won Dev A Thon sozm for late xD");
        }
        )
        ;
    
    }
    
    public static void _OnDisable (  )
    {
        Bukkit.getLogger().info("HEllo World: )");
    }
}
