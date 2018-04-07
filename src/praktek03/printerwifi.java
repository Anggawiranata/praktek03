
package praktek03;


public class printerwifi extends printer {
    private String jenisprinter;
    
    @Override
    void menngantitinta(){
               System.out.println("KRIIIK....");
   

    }

    public String getJenisprinter() {
        return jenisprinter;
    }

    public void setJenisprinter(String jenisprinter) {
        this.jenisprinter = jenisprinter;
    }
    
}