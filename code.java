/**This program modify the square so that it has twice the size and the same top-left
corner as the original.
 * @author (Fikri Şan Köktaş)
 * @version (22 October 2020)*/
import java.awt.Rectangle;
import java.util.Scanner;

public class KFS_GrowSquarePrinter_Main
{
    public static void main(String [] args)
    {
        Rectangle square = new Rectangle(100,100,50,50); 
        System.out.println(square); //creates first and base square
        
        square.translate(25,25); //we should translate the little square to counter shifting
        square.grow(25,25);
        System.out.println(square); //creates the second
    }
}


