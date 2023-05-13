public class Gato extends mamifero {
    private double tamanhoUnhas;

    public double getTamanhoUnhas() {
        return tamanhoUnhas;
    }

    public void setTamanhoUnhas(double tamanhoUnhas) {
        this.tamanhoUnhas = tamanhoUnhas;
    }

    public void apararUnhas(){
        if(tamanhoUnhas > 0.5){
            System.out.println("As garras precisam ser aparadas ฅ(ﾐ⚈ ﻌ ⚈ﾐ)ฅ");
        }
    }
    @Override
    public void grunhido(){
        System.out.println("meow meow");
    }
    void mama(){
        if(getIdade() <= 0.5){
            System.out.println("O gato tem 2 meses ou menos, então pode mamar");
        }
    }
}
