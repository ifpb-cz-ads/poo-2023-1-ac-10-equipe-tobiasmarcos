public class Réptil extends Animal {
    private float temperaturaCorporal;

    public float getTemperaturaCorporal() {
        return temperaturaCorporal;
    }

    public void setTemperaturaCorporal(float temperaturaCorporal) {
        this.temperaturaCorporal = temperaturaCorporal;
    }

    public void aquecer(){
        if(temperaturaCorporal < 25){
            System.out.println("O réptil está procurando um lugar quente (¬_¬) ");
        }
    }

}
