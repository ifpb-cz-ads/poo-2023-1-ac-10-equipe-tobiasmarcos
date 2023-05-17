public class Cobra extends Réptil {
    private boolean peçonhenta;

    public boolean getPeçonhenta() {
        return peçonhenta;
    }

    public void setPeçonhenta(boolean peçonhenta) {
        this.peçonhenta = peçonhenta;
    }
    @Override
    public void grunhido(){
        System.out.println("tsss tsss");
    }
    public void aquecer(){
        if(getTemperaturaCorporal() < 27){
            System.out.println("A cobra está procurando um lugar quente (¬_¬)");
        }
    }

}
