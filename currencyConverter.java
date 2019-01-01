import javax.swing.*;
import java.text.*;
/** Aplikacioni i meposhtem kryen konvertimin e nje vlere monetare ne tjetren duke marrur 3 argumente hyrese nga shfrytezuesi dhe pastaj paraqet rezultatin nepermjet dy figurave*/
public class currencyConverter 
   {public static void main (String[] args)
      {
       /* Argumenti i pare i cili merr si te dhene vleren te cilen shfrytezuesi ka dhe deshiron te shese*/
       String vlera_monetare_shitse = args[0];
       /* Argumenti i dyte i cili merr si te dhene vleren te cilen shfrytezuesi deshiron te blej */
       String vlera_monetare_blerse = args[1];
       /* Argumenti i trete i cili merr si te dhene vleren e konverimit si rate per te vlerat monetare dhe e konverton ate tip te dhenes nga string ne double*/ 
       double rata_e_konvertimit = new Double(args[2]).doubleValue();
       /*Printimi tekstual ne dritaren komanduese */
       System.out.println("Per " + vlera_monetare_shitse + " me " + vlera_monetare_blerse + " rata e konvertimit eshte " + rata_e_konvertimit);
       System.out.println();
       /* Krijimi i nje dritareje per pyetjen e shfrytezuesit per sasin qe ai deshiron te shese*/
       String input = JOptionPane.showInputDialog("Write amount you want to sell");
       /* Llogaritja per raten e konvertimit */
       double vlera_per_shitje = new Double(input).doubleValue();
       double vlera_e_konvertuar = vlera_per_shitje*rata_e_konvertimit;
       /* Krijimi i objektit w ashtu qe ti zvogelojme decimalet nga numri i llogaritur */
       DecimalFormat w = new DecimalFormat("0.00");
       String vlera_e_konvertuar2 = w.format(vlera_e_konvertuar);       
       System.out.println( "Zgjidhja pas konvertimit per: " + input + " " + vlera_monetare_shitse + " eshte " + vlera_e_konvertuar2 + " " + vlera_monetare_blerse);       
       /* Krijimi objektit te ri dhe veqimi i vlerave per paraqitje ne Pano */      
       Grafiku printimi = new Grafiku();
       printimi.vleratmonetare(vlera_per_shitje, vlera_e_konvertuar2);
       printimi.vleratemonedhes(vlera_monetare_shitse,vlera_monetare_blerse);
       }
   }
       
