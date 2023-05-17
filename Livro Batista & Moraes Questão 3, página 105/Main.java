public class Main {
    public static void main(String[] args){
        double metrosQuadrados = 10.12;
        double pesQuadrados = 5.5;
        double milhasQuadradas = 8.82;
        double acres = 1.3;

        ConversaoDeUnidadesDeArea.acresParaPesQuadrados(acres);
        ConversaoDeUnidadesDeArea.milhasQuadradasParaAcres(milhasQuadradas);
        ConversaoDeUnidadesDeArea.metrosQuadradosParaPesQuadrados(metrosQuadrados);
        ConversaoDeUnidadesDeArea.pesQuadradosParaCentimetrosQuadrados(pesQuadrados);
    }
}
