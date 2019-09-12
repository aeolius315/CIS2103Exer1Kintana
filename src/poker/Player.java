/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poker;
import java.util.*;

public class Player {
    String name;
    int chips;
    boolean inPlay;
    
    Scanner myPlayer = new Scanner(System.in);
    Scanner myChips = new Scanner(System.in);
    
    Player() {
        System.out.println("Input Name: ");
        String userName = myPlayer.nextLine();
        System.out.println("Enter Amount: ");
        int userChips = myChips.nextInt();
        name = userName;
        chips = userChips;
        inPlay = false;
    }
    
    public int bet(int x){
        chips-=x;
        return x;
    }
    public void check(){
        
    }
    public void call(){
        
    }
    public void fold(){
        
    }
    public void raise(int x){
        
    }
    public void clear(){
        
    }
    public void allIn(){
        
    }
}
