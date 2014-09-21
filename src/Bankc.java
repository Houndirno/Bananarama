import java.util.concurrent.Callable;
import org.powerbot.script.Condition;
import org.powerbot.script.Random;
import org.powerbot.script.Tile;
import org.powerbot.script.rt6.ClientContext;
import org.powerbot.script.rt6.Component;
import org.powerbot.script.rt6.GameObject;


public class Bankc extends Task<ClientContext> {
    private int[] BANK_CHEST= {36788};
    private int[] Stile = {45205};
    public String bankD;
   
  
    

    public Bankc(ClientContext ctx) {
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
    GameObject Bank_deposit_box = ctx.objects.nearest().poll();
                 
                                 
                        ctx.camera.turnTo(Bank_deposit_box);
                         try {
    Thread.sleep(1000);                 
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
                         Bank_deposit_box.interact("Deposit");
         ctx.camera.turnTo(Bank_deposit_box);
            ctx.camera.pitch(Random.nextInt(10, 90));
            ctx.camera.angle(20);
       
         
                             try {
    Thread.sleep(1500);                 
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
          

                        Component BankT = ctx.widgets.component(11, 6);
        BankT.click();
                    
                     try {
    Thread.sleep(1000);                 
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
        
        
        ctx.movement.step(new Tile(3027, 3226, 0));
                        ctx.camera.pitch(Random.nextInt(20, 20));
    }
}