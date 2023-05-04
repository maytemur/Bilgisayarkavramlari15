/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bilgisayarkavramlari15;

/**
 *
 * @author maytemur Inheritance ve Overriding (Java ile Nesne Yönelimli Programlama 10. Video)
 * serinin 16ncı videosu
 */
public class Bilgisayarkavramlari15 {

    /**
     * @param args the command line arguments    */
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        insan ali= new insan();
        muhendis veli = new muhendis();
        veli.boy = 180;
        System.out.println(veli.boy);
        veli.kilo = 90;
        veli.yemek();
        System.out.println(veli.kilo);
        veli.maas= 10000;
        veli.zam();
        System.out.println(veli.maas);
        ali.kilo = 80;
        ali.yemek();
        System.out.println(ali.kilo);
    }
    
}
