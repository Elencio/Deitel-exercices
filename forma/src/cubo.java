public class cubo extends formaTridimensional {
        private double lado;
        private String nome;
    
        public cubo(double lado, String nome) {
            this.lado = lado;
            this.nome = nome;
        }
    
        @Override
        public double obterarea() {
            // a área de um cubo é a soma das áreas de todas as suas faces
            return 6 * lado * lado;
        }
    
        @Override
        public double obtervolume() {
            return lado * lado * lado;
        }
    
        @Override
        public String toString() {
            return nome + " (lado = " + lado + ")";
        }
    }
    

