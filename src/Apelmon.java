/**
 * Created by all on 29.03.2015.
 */
public class Apelmon {
    String sort, color;
    float ves;
    private int cena;
    public int getCena() {
        return cena;
    }
    @Override
    public String toString() {
        return "Cort- " +this.sort+"Color - "+ this.color+ "Ves"+ this.ves+ "Cena - "+this.cena;
    }

    public void Apelmon(String sort, String color, float ves, int cena) {
        this.sort = sort;
        this.color = color;
        this.ves = ves;
        this.cena = cena;
    }
    public static void main (String[] args){
        Apelmon a1 = new Apelmon();
        Apelmon a2 =new Apelmon();
        Apelmon a3 = new Apelmon();
        System.out.println(a1.toString());
    }



}
