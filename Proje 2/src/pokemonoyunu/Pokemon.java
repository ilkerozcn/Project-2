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
public class Pokemon {

    private int kullanım;
    private int kullanım1;
    private String PokemonId;
    private String PokemonAdı;
    private String PokemonTip;
    private int Hasar;

    public Pokemon() {
    }

    public Pokemon(String Id, String Ad, String Tip) {
        this.kullanım = 0;
        this.kullanım1 = 0;
        this.PokemonAdı = Ad;
        this.PokemonId = Id;
        this.PokemonTip = Tip;
    }

    public int getKullanım() {
        return this.kullanım;
    }

    public void setKullanım(int kullanım) {
        this.kullanım = kullanım;
    }

    public int getKullanım1() {
        return this.kullanım1;
    }

    public void setKullanım1(int kullanım1) {
        this.kullanım1 = kullanım1;
    }

    public String getPokemonId() {
        return this.PokemonId;
    }

    public void setPokemonId(String PokemonId) {
        this.PokemonId = PokemonId;
    }

    public String getPokemonAdı() {
        return this.PokemonAdı;
    }

    public void setPokemonAdı(String PokemonAdı) {
        this.PokemonAdı = PokemonAdı;
    }

    public String getPokemonTip() {
        return this.PokemonTip;
    }

    public void setPokemonTip(String PokemonTip) {
        this.PokemonTip = PokemonTip;
    }

    public int getHasar() {
        return this.Hasar;
    }

    public void hasarPuaniGoster() {
        System.out.println(this.Hasar);

    }

    public boolean karKullanıldıMı(int K) {
        if (K == 1) {
            System.out.println("Kullanıldı");
            return true;
        } else {
            return false;
        }
    }

    public boolean karKullanıldıMı1(int K) {
        if (K == 1) {
            System.out.println("Kullanıldı");
            return true;
        } else {
            return false;
        }
    }
    private String DosyaYolu;

    public String getDosyaYolu() {
        return DosyaYolu;
    }

    public void setDosyaYolu(String DosyaYolu) {
        this.DosyaYolu = DosyaYolu;
    }

}
