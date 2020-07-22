/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonoyunu;

import java.util.ArrayList;
import java.util.Random;
import static pokemonoyunu.İvsB.pc1;

/**
 *
 * @author İlker
 */
public class PokemonOyunu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         MainPage menü = new MainPage();
        menü.setVisible(true);
        ArrayList<Pokemon> list=new ArrayList<Pokemon>();
        Pikachu pika=new Pikachu("1","Pikachu","Elektrik");
        Bulbasaur bulba=new Bulbasaur("2","Bulbasaur","Çim");
        Charmander charm=new Charmander("3","Charmander","Ateş");
        Squirtle squirt=new Squirtle("4","Squirtle","Su");
        Zubat zuba=new Zubat("5","Zubat","Hava");
        Psyduck psy=new Psyduck("6","Psyduck","Su");
        Snorlax snor=new Snorlax("7","Snorlax","Normal");
        Butterfree butter=new Butterfree("8","Butterfree","Hava");
        Jigglypuff jiggly=new Jigglypuff("9","Jigglypuff","Ses");
        Meowth meow=new Meowth("10","Meowth","Normal");
        list.add(pika);
        list.add(bulba);
        list.add(charm);
        list.add(squirt);
        list.add(zuba);
        list.add(psy);
        list.add(snor);
        list.add(butter);
        list.add(jiggly);
        list.add(meow);
        int t1,t2,t3;
        t1=1;t2=1;t3=1;
        Random rnd=new Random();
        while(t1==t2 || t1==t3 || t2==t3){
        t1=rnd.nextInt(10);
        t2=rnd.nextInt(10);
        t3=rnd.nextInt(10);
        }/*
        BilgisayarOyuncusu pc1=new BilgisayarOyuncusu(1,"pc1");
        
       // bulba.hasarPuaniGoster();
      //  snor.hasarPuaniGoster();
      //  System.out.println(pc1.secim1);
        System.out.println(list.get(0).getPokemonAdı());
        BilgisayarOyuncusu pc2=new BilgisayarOyuncusu(2,"pc2");
        int t4=1,t5=1,t6=1;
      while(t1==t4 || t1==t5 || t2==t6 || t2==t5 || t1==t6 || t2==t4 || t3==t4
              || t3==t5 || t3==t6 || t4==t5 || t4==t6 || t5==t6){
        t4=rnd.nextInt(10);
        t5=rnd.nextInt(10);
        t6=rnd.nextInt(10);
        }
      pc1.kartSecim(t1, t2, t3);
      pc1.setSecim1(t1);
      pc1.setSecim2(t2);
      pc1.setSecim3(t3);
        System.out.println(t5+""+t6+""+t4+""+t2+""+t1+""+t3);
        if(list.get(t1).getHasar()>list.get(t4).getHasar())
             pc1.skor=pc1.skor+5;
        else
            pc2.skor=pc2.skor+5;
            System.out.println("1. Bilgisayar Skoru: "+pc1.skor);
            System.out.println("2. Bilgisayar Skoru: "+pc2.skor);
            System.out.println(pc1.getSecim1());
            
*/
       
    }
    
}
