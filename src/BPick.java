
import org.powerbot.script.Random;
import org.powerbot.script.rt6.ClientContext;
import org.powerbot.script.rt6.GameObject;
import org.powerbot.script.rt6.GroundItem;
import org.powerbot.script.rt6.Npc;
import org.powerbot.script.rt6.Objects;

public class BPick extends Task<ClientContext> {
    public int CabPick = 0;
    private int CabbageIds = 2073;
    java.util.Random random = new java.util.Random();
   int RN = random.nextInt(360) + 1;
    
    public BPick(ClientContext ctx) {
        super(ctx);
    }
    
    @Override
    public boolean activate() {
        return !ctx.objects.select().id(CabbageIds).isEmpty()
                && ctx.backpack.select().count()< 28
                && ctx.players.local().animation() == -1;
        
    }
    
    @Override
    public void execute(){
        
        System.out.println("Picking");
        
         GameObject Banana_Tree = ctx.objects.nearest().poll();
     
            ctx.camera.pitch(Random.nextInt(RN, RN));
            ctx.camera.angle(RN);
         Banana_Tree.interact("Pick");
    
         Banana_Tree.interact("Pick");
          Banana_Tree.interact("Pick");
            ctx.camera.pitch(Random.nextInt(RN, RN));
            ctx.camera.angle(RN);
             Banana_Tree.interact("Pick");
         Banana_Tree.interact("Pick");
         Banana_Tree.interact("Pick");
        if (Banana_Tree.inViewport()) {
             ctx.camera.pitch(Random.nextInt(RN, RN));
            ctx.camera.angle(RN);
            boolean interact = Banana_Tree.interact("Pick");
            
            ctx.camera.pitch(Random.nextInt(RN, RN));
            ctx.camera.angle(RN);
           
        } else {
            ctx.movement.step(Banana_Tree);
            ctx.camera.turnTo(Banana_Tree);
            ctx.camera.pitch(Random.nextInt(RN, RN));
        }
        
    }
}