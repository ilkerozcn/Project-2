/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonoyunu;

import java.util.ArrayList;

/**
 *
 * @author İlker
 */
public class Oyuncu {
    public int oyuncuId;
    public String oyuncuAdi;
    public int skor;
    public int secim1;
    public int secim2;
    public int secim3;
    
    public Oyuncu(){}
    public Oyuncu(int Id,String Ad){
    this.oyuncuId=Id;
    this.oyuncuAdi=Ad;
    this.skor=0;
    
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
    public int kartSecim(int a,int b,int c){
   /* this.secim1=a;
    this.secim2=b;
    this.secim3=c;*/return a;
    }
}
