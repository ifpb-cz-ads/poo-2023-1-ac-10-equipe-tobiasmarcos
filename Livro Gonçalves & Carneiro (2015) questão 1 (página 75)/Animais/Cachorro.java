public class Cachorro extends mamifero {
    private float nívelEstresse;

    public float getNivelEstresse() {
        return nivelEstresse;
    }

    public void setNivelEstresse(float nivelEstresse) {
        this.nivelEstresse = nivelEstresse;
    }

    public void passear(){
        if(nívelEstresse > 70){
            System.out.println("Precisa passear (*-*)");
        }
    }
    @Override
    public void grunhido(){
        System.out.println("woof woof");
    }
    void mama(){
        if(getIdade() <= 0.5){
            System.out.println("O cachorro tem 1 mês e meio ou menos, então pode mamar");
        }
    }
    
}
