package poo_atividade;
    


public class Quadrado{
    private double 
                Lado, 
                Área, 
                Perímetro,
                CalcularArea,
                CalcularPerimetro;

                
    //construtor:
    public Quadrado(double Lado, double Área,double Perímetro){
        this.Lado =  Lado;
        this.Área = Área;
        this.Perímetro = Perímetro;
       
    }
    
    //metodos:
    public double getLado() {
        return Lado;
    }

    public void setLado(double Lado) {
        this.Lado = Lado;
    }

    public double getÁrea() {
        return Área;
    }

    public void setÁrea(double Área) {
        this.Área = Área;
    }

    public double getPerímetro() {
        return Perímetro;
    }

    public void setPerímetro(double Perímetro) {
        this.Perímetro = Perímetro;
    }

    public double getCalcularArea() {
        return Lado*Lado ;
    }

    public void setCalcularArea(double CalcularArea) {
        this.CalcularArea = CalcularArea;
    }

    public double getCalcularPerimetro() {
        return 4 * Lado;
    }

    public void setCalcularPerimetro(double CalcularPerimetro) {
        this.CalcularPerimetro = CalcularPerimetro;
    }
    
    public void ImprimirTudo() {
        System.out.println(getLado());
         System.out.println(getÁrea());
         System.out.println(getPerímetro());
         System.out.println(getCalcularArea());
         System.out.println(getCalcularPerimetro());
    }      
    

}

    
   
