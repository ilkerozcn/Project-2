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
public  class BilgisayarOyuncusu extends Oyuncu{
    public int skor=0;
    public int secim1;
    public int secim2;
    public int secim3;
    public int secim4;
    public int secim5;
    public int i=0;
    
    
    
    
    public BilgisayarOyuncusu(){
    }
    public BilgisayarOyuncusu(int Id,String Ad){
    super(Id,Ad);
    }

   


 
 


    
    
    public int getOyuncuId() {
        return oyuncuId;
    }

    public void setOyuncuId(int oyuncuId) {
        this.oyuncuId = oyuncuId;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

    @Override
    public int kartSecim(int a, int b, int c) {
        a=5;return a;
    }
       public int getSecim1() {
        return secim1;
    }

    public void setSecim1(int secim1) {
        this.secim1 = secim1;
    }

    public int getSecim2() {
        return secim2;
    }

    public void setSecim2(int secim2) {
        this.secim2 = secim2;
    }

    public int getSecim3() {
        return secim3;
    }

    public void setSecim3(int secim3) {
        this.secim3 = secim3;
    }
   public int getSecim4() {
        return secim4;
    }

    public void setSecim4(int secim4) {
        this.secim4 = secim4;
    }

    public int getSecim5() {
        return secim5;
    }

    public void setSecim5(int secim5) {
        this.secim5 = secim5;
    }

    
    
}
