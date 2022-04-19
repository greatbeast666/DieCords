 package dc.main;

 import java.text.SimpleDateFormat;
/*    */ import java.util.Date;
/*    */ import java.util.TimeZone;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.World;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.entity.EntityDamageEvent;
/*    */ import org.bukkit.event.entity.PlayerDeathEvent;

 public class Handler implements Listener {
  @EventHandler
  public void onPlayerDeath(PlayerDeathEvent die) {
     Date now = new Date();
   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
     format.setTimeZone(TimeZone.getTimeZone("GMT+3"));
    if (die.getEntity() instanceof Player) {
      Player p = die.getEntity();
       String huila = p.getDisplayName();
       World w = p.getWorld();
     String world = w.getName();
      Player player1 = die.getEntity().getKiller();
      int x = (int)p.getLocation().getX();
      int y = (int)p.getLocation().getY();
      int z = (int)p.getLocation().getZ();
      p.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "LP" + ChatColor.DARK_GRAY + "] " + ChatColor.RED + "Вы умерли на координатах" + " X: " + x + " Y: " + y + " Z: " + z);
      EntityDamageEvent.DamageCause caused = die.getEntity().getLastDamageCause().getCause();
      Bukkit.getConsoleSender().sendMessage("[" + format.format(now) + "] " + ChatColor.RED + "Игрок " + huila + ChatColor.RED + " умер от " + caused + " в мире " + world + " на XYZ: " + " " + x + " " + y + " " + z);
       if (caused == EntityDamageEvent.DamageCause.ENTITY_ATTACK) {
         Bukkit.getConsoleSender().sendMessage("[" + format.format(now) + "] " + ChatColor.RED + "Игрок " + huila + ChatColor.RED + " умер от " + player1 + " в мире " + world + "на XYZ: " + " " + x + " " + y + " " + z);
       }
      if (player1 instanceof Player)
         Bukkit.getConsoleSender().sendMessage("[" + format.format(now) + "] " + ChatColor.RED + "Игрок " + huila + ChatColor.RED + " умер от " + player1 + " в мире " + world + "на XYZ: " + " " + x + " " + y + " " + z);
     }
   }
 }


