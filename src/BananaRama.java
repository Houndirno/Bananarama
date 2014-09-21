

import static java.awt.Color.BLACK;
import static java.awt.Color.YELLOW;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.powerbot.script.MessageEvent;
import org.powerbot.script.MessageListener;
import org.powerbot.script.PaintListener;
import org.powerbot.script.PollingScript;
import org.powerbot.script.Script;
import org.powerbot.script.rt6.ClientContext;


@Script.Manifest(name = "Bananarama", description = "Extream banana picking and banking at Masa point 200k hr")
public class BananaRama extends PollingScript<ClientContext> implements PaintListener, MessageListener {
    public int SheepSheared = 0;
    public int Travel = 0;
      
        public int Profit = 0;
     
        
        
    private final List<Task> taskList = new ArrayList<Task>();
    
    @Override
    public void start(){
        taskList.addAll(Arrays.asList(new BPick(ctx), new Tele(ctx), new Bankc(ctx), new Talk(ctx), new Cross(ctx)));
        
     
    }
    
    
    @Override
    public void poll() {
       for (Task task : taskList) {
            if (task.activate()) {
                task.execute();
            }
        }
    }
    
    
    private String formatTime(final long time) {
        final int sec = (int) (time / 1000), h = sec / 3600, m = sec / 60 % 60, s = sec % 60;
        return (h < 10 ? "0" + h : h) + ":" + (m < 10 ? "0" + m : m) + ":" + (s < 10 ? "0" + s : s);
    }

    
    
private final Font font1 = new Font("Arial", 1, 12);
private final Font font2 = new Font("Arial", 1, 8);
    @Override
    public void repaint(Graphics g) {
        
           final int sec = (int) (getTotalRuntime() / 1000), h = sec / 3600, m = sec / 60 % 60, s = sec % 60;
        int xpPH = (int) ((Profit * 3600000D) / (getTotalRuntime()));
       int x=40,y=100;
                
      
         
                         
       
       
       
                g.setColor(BLACK);
                g.fillRect(x-7, y-32, 205, 105);
                g.setColor(YELLOW);
                g.fillRect(x-5, y-30, 200, 100);
                g.setColor(BLACK);
                g.setFont(font1);
                g.drawString("BananaRarma", x, y-20);
                g.setFont(font2);
                g.drawString("Banana's picked: " + SheepSheared, x, y);
               g.drawString("Travel costs: " + Travel, x, y +15);
                 g.drawString("Profit per hour: " + xpPH, x, y+30);
                g.drawString("Profit: " + Profit, x, y+45);
                g.drawString("Time Ran: "+ formatTime(getTotalRuntime()), x, y+60);
              
                
                
                
                
    }

    @Override
    public void messaged(MessageEvent e) {
         if (e.text().toLowerCase().contains("removed"))
                        Travel += 30;
          Profit += 4781;
         SheepSheared += 14;
        
         
    }
    
}