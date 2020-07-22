/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonoyunu;

/**
 *
 * @author İlker
 */
public class InsanOyuncusu extends Oyuncu{
    public int skor=0;
    
    
    
    
    public InsanOyuncusu(){
        
    }
    public InsanOyuncusu(int Id,String Ad){
    super(Id,Ad);
    
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

    @Override
    public int kartSecim(int a, int b, int c) {
        return super.kartSecim(a, b, c); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
