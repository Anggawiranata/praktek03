
package praktek03;


public class printeraksi {
    public static void main(String[] args) {
        
        printer p = new printer(); 
        
        p.setMerk("epson");
        p.setWarna("putih");
        p.setHarga(1000);
                
        p.menngantitinta();
        
        System.out.print("merknya \t: ");
        System.out.println(p.getMerk());
        System.out.print("warnanya \t: ");
        System.out.println(p.getWarna());
        System.out.print("harganya \t: ");
        System.out.println(p.getHarga());
    }
}
