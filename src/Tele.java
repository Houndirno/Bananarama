




import java.util.concurrent.Callable;
import org.powerbot.script.Condition;
import org.powerbot.script.Random;
import org.powerbot.script.Tile;
import org.powerbot.script.rt6.ClientContext;
import org.powerbot.script.rt6.Component;
import org.powerbot.script.rt6.GameObject;


public class Tele extends Task<ClientContext> {
    private int[] BANK_CHEST= {2073, 2074};
    private int[] Stile = {45205};
    public String bankD;
   
    public boolean loot;
    public boolean Banked;
    public boolean DisplayL;
   public boolean DisplayB;
    public boolean atbank;
    

    public Tele(ClientContext ctx) {
        super(ctx);
       
        }
    
   
    
    
    @Override
    public boolean activate() {
 
          
          return !ctx.objects.select().id(BANK_CHEST).isEmpty()
                  && ctx.backpack.select().count() == 28
          && ctx.players.local().animation() == -1;
     
         
    }
       
    @Override
           
  
    
    public void execute() {
        
      try {
    Thread.sleep(1500);                 //1000 milliseconds is one second.
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
        
        
        Component Teleport = ctx.widgets.component(1477, 38).component(1);
       
        System.out.println("TP");
        Teleport.centerPoint();
        Teleport.click();
        
        try {
    Thread.sleep(1500);                 //1000 milliseconds is one second.
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
        
         
        Component Teleport3 = ctx.widgets.component(1092, 24);
        Teleport3.click();
        
         try {
    Thread.sleep(18000);                 //1000 milliseconds is one second.
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
        
        
                        
               
                        ctx.movement.step(new Tile(3027, 3226, 0));
                        ctx.camera.pitch(Random.nextInt(20, 20));
                      
                          try {
    Thread.sleep(8000);                 //1000 milliseconds is one second.
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
                       
                          ctx.movement.step(new Tile(3046, 3237, 0));
                        ctx.camera.pitch(Random.nextInt(20, 20));
                          
                          try {
    Thread.sleep(10000);                 //1000 milliseconds is one second.
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
			
                        
                    
                    
                    
                }
                
            }
            
       
                    
                    
                                   
                        
            
    
    

    

   