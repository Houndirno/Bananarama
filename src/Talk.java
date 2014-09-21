import org.powerbot.script.Random;
import org.powerbot.script.Tile;
import org.powerbot.script.rt6.ClientContext;
import org.powerbot.script.rt6.Component;
import org.powerbot.script.rt6.Npc;

public class Talk extends Task<ClientContext> {
   
    java.util.Random random = new java.util.Random();
   int RN = random.nextInt(360) + 1;

  private int[] BANK_CHEST= {377};

    public Talk(ClientContext ctx) {
        super(ctx);
    }
    
    @Override
    public boolean activate() {
        
     return 
             !ctx.npcs.select().id(BANK_CHEST).isEmpty()
           
                && ctx.backpack.select().count() == 0
                && ctx.players.local().animation() == -1;
     

        
    }
    
    @Override
    public void execute(){
          
        
        try {
    Thread.sleep(3000);                 
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
        
        
        ctx.movement.step(new Tile(3026, 3220, 0));
                        ctx.camera.pitch(Random.nextInt(RN, 20));
        
        
              try {
    Thread.sleep(6000);                 
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}          
                        
        Npc SEAMANLORRIS = ctx.npcs.nearest().poll();
            System.out.println("Talking22");
 
          System.out.println("Talking24");
        boolean interact;
     
            System.out.println("Talking25");
     
        // SEEEAAAAMAANNNNNN JEEEKKKIIIINNSSSSSS
       
        if (SEAMANLORRIS.inViewport()) {
             ctx.movement.step(SEAMANLORRIS);
     SEAMANLORRIS.interact("Pay-fare");
    
        
            ctx.camera.angle(RN);
            try {
    Thread.sleep(2000);                 
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
            ctx.chat.clickContinue();
            System.out.println("Talking2");
              try {
    Thread.sleep(2000);                 
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
            
            Component Trav = ctx.widgets.component(1188, 12);
       Trav.click();
       
        try {
    Thread.sleep(2000);                 
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
       
    
        Component Trav2 = ctx.widgets.component(1191, 7);
       Trav2.click();
            
            
        System.out.println("Talking");
        
        } else {
            ctx.movement.step(SEAMANLORRIS);
            ctx.camera.turnTo(SEAMANLORRIS);
            
              
       
    }
        
        
        
}
}