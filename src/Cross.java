import org.powerbot.script.Random;
import org.powerbot.script.Tile;
import org.powerbot.script.rt6.ClientContext;
import org.powerbot.script.rt6.GameObject;

public class Cross extends Task<ClientContext> {
   
    java.util.Random random = new java.util.Random();
   int RN = random.nextInt(360) + 1;
 private int CabbageIds = 2082;
    public Cross(ClientContext ctx) {
        super(ctx);
    }
    
    @Override
    public boolean activate() {
        return !ctx.objects.select().id(CabbageIds).isEmpty()
                 && ctx.backpack.select().count() == 0
                && ctx.players.local().animation() == -1;
        
    }
    
    @Override
    public void execute(){
        GameObject Gangplank = ctx.objects.nearest().poll();
         Gangplank.interact("Cross");
         ctx.camera.turnTo(Gangplank);
        if (Gangplank.inViewport()) {
            ctx.camera.turnTo(Gangplank);
            
             ctx.camera.pitch(Random.nextInt(RN, RN));
            ctx.camera.angle(RN);
            boolean interact = Gangplank.interact("Cross");
            
            ctx.camera.pitch(Random.nextInt(RN, RN));
            ctx.camera.angle(RN);
    }
        
        
        try {
    Thread.sleep(2000);                 
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
        
        
                        
               
                        ctx.movement.step(new Tile(2929, 3152, 0));
                        ctx.camera.pitch(Random.nextInt(20, 20));
        
}
}