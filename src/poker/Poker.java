/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poker;
import java.util.*;

public class Poker {

    public static void main(String[] args) {
        System.out.println("Welcome to Texas Hold'em Poker");
        ArrayList<Player> player = new ArrayList<Player>();
        byte count = 0;
        boolean addPlayers;
        do{
            System.out.println("Add Player");
            Scanner myVal = new Scanner(System.in);
            addPlayers = myVal.nextBoolean();
            if(addPlayers == true){
                player.add(new Player());
                count++;
            } else {
                if(count < 2){
                    addPlayers = true;
                } 
            }
        }while(addPlayers == true && count < 8);
//        boolean playRound = true;
//        
//        while(playRound != false){
//            
//        }
    }
}
