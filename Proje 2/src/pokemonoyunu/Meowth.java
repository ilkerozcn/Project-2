/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonoyunu;

import javax.swing.ImageIcon;

/**
 *
 * @author İlker
 */
public class Meowth extends Pokemon{
   private int Hasar=40;
    private int kullanım=0;
    private int kullanım1=0;
    private String DosyaYolu="src//image//meowth.jpg";
    
    public ImageIcon icon = new ImageIcon(DosyaYolu);
public String getDosyaYolu() {
        return DosyaYolu;
    }
   
    public Meowth(){}
    public Meowth(String Id,String Ad,String Tip){
    super(Id,Ad,Tip);
    }

    public int getHasar() {
        return Hasar;
    }

    public void setHasar(int Hasar) {
        this.Hasar = Hasar;
    }

    @Override
    public boolean karKullanıldıMı(int K) {
        if(K==1){
        System.out.println("Kullanıldı");
        return true;
    }else 
        return false;
    }

    @Override
    public boolean karKullanıldıMı1(int K) {
    if(K==1){
        System.out.println("Kullanıldı");
        return true;
    }else 
        return false;    }

    @Override
    public void hasarPuaniGoster() {
        System.out.println(""+this.Hasar);
    }

    public int getKullanım() {
        return kullanım;
    }

    public void setKullanım(int kullanım) {
        this.kullanım = kullanım;
    }

    public int getKullanım1() {
        return kullanım1;
    }

    public void setKullanım1(int kullanım1) {
        this.kullanım1 = kullanım1;
    }
    
}
