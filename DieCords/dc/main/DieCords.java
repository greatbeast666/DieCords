package dc.main;

import org.bukkit.Bukkit;
/*    */ import org.bukkit.plugin.Plugin;
/*    */ import org.bukkit.plugin.java.JavaPlugin;

 public class DieCords
 extends JavaPlugin {
   public void onEnable() {
    Bukkit.getPluginManager().registerEvents(new Handler(), (Plugin)this);
    getLogger().info("DieCords enabled");
  }

  public void onDisable() {
/* 17 */     getLogger().info("DieCords disabled");
/*    */   }



