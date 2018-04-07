
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
        
        printerwifi pw = new printerwifi();
        pw.setMerk("epson");
        pw.setWarna("hitam");
        pw.setHarga(10000);
        pw.setJenisprinter("wifi");
        pw.menngantitinta();
        System.out.println("Jenis \t:"+pw.getJenisprinter());
        pw.throttle();
    }
}
