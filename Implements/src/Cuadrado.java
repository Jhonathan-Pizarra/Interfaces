
public class Cuadrado  implements Figura{
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    

    @Override
     public double calcularPerimetro(){
     
         return 0.0;
     }
    @Override
     public double calcularArea(){
     
         return 0.0;
     }
    
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    
}
