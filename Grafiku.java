import java.awt.*;
import javax.swing.*;
/** Aplikacioni i meposhtem ka per qellim kryesore paraqitjen grafike te rezulatit ne nje dritare grafike */
class Grafiku extends JPanel
{ 
   /* meposht kemi deklarimin e 4 fushave private */    
   private double vlera_per_shitje;
   private String vlera_e_konvertuar2;   
   private String monedha1;
   private String monedha2;
   public Grafiku()
   {  JFrame obj = new JFrame(); // Krijimi i Kornizes
      obj.getContentPane().add(this);
      obj.setSize(1000,500); // caktimi i madhesis se Kornizes
      obj.setVisible(true);
      obj.setTitle("Dy Rrethat"); // caktimi i titullit te Kornizes
   }
   public void paintComponent(Graphics g)
   { 
      g.setColor(Color.white);
      g.fillRect(1,1,999,499); // vizatimi i prapavijes me ngjyre te bardhe
      int left_edge = 300;
      int top = 190;
      int diameter = 140;
      /* Tani posht kemi vizatimin e rrethit te pare te kuq dhe pastaj ne te vendoset nje rezultat i llogaritjes */ 
      g.setColor(Color.red);
      g.fillOval(left_edge, top, diameter, diameter);
      g.setColor(Color.green);
      g.drawString( vlera_per_shitje + " " + monedha1 + " " ,340,265); // vizatimi i stringut per rrethin e pare
      int left_edge2 = 510;
      int top2 = 190;
      int diameter2 = 140;
      /* Tani posht kemi vizatimin e rrethit te dyte te kaltert dhe pastaj ne te vendoset nje rezultat i llogaritjes */ 
      g.setColor(Color.blue);
      g.fillOval(left_edge2, top2, diameter2, diameter2);
      g.setColor(Color.green);      
      g.drawString( vlera_e_konvertuar2 + " " + monedha2 + " ", 550, 265);  // vizatimi i stringut per rrethin e dyte    
   }
   public void vleratmonetare(double a, String d)
      { 
        vlera_per_shitje = a;
        vlera_e_konvertuar2 = d;
        }
        
    public void vleratemonedhes(String vlera1, String vlera2)
         {
            monedha1 = vlera1;
            monedha2 = vlera2;
         }              
}