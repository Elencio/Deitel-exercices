public class formateste {
    public static void main(String[] args) throws Exception {
        Forma[] formas = new Forma[3];
        formas [0] = new Circulo(4,"Circulo" );
        formas [1] = new quadrado(5,"Quadrado" );
        formas [2] = new esfera(6, "Esfera");

        for (Forma forma : formas) {
            System.out.println("Descrição: " + forma);
            if (forma instanceof formabidimensional) {
                formabidimensional formaBidimensional = (formabidimensional) forma;
                System.out.println("Área: " + formaBidimensional.obterarea());
            } else if (forma instanceof formaTridimensional) {
                formaTridimensional formatridimensional = (formaTridimensional) forma;
                System.out.println("Área: " + formatridimensional.obterarea());
                System.out.println("Volume: " + formatridimensional.obtervolume());
            }
        }
        

    }
}