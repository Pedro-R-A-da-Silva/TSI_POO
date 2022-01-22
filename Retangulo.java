package poo_atividade;


public class Retangulo {
        private double 
                Cumprimento, 
                Largura, 
                Area,
                Perimetro,
                CalcularArea,
                CalcularPerimetro;
                
    //construtor:
    public Retangulo(double Cumprimento, double Largura, double Area, double Perimetro){
        this.Cumprimento =  Cumprimento;
        this.Largura = Largura;
        this.Area = Area;
        this.Perimetro = Perimetro;
       
    }

    public double getCumprimento() {
        return Cumprimento;
    }

    public void setCumprimento(double Cumprimento) {
        this.Cumprimento = Cumprimento;
    }

    public double getLargura() {
        return Largura;
    }

    public void setLargura(double Largura) {
        this.Largura = Largura;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double Area) {
        this.Area = Area;
    }

    public double getPerimetro() {
        return Perimetro;
    }

    public void setPerimetro(double Perimetro) {
        this.Perimetro = Perimetro;
    }

    public double getCalcularArea() {
        return Cumprimento*Largura;
    }

    public void setCalcularArea(double CalcularArea) {
        this.CalcularArea = CalcularArea;
    }

    public double getCalcularPerimetro() {
        return (2*Cumprimento)+(2*Largura);
    }

    public void setCalcularPerimetro(double CalcularPerimetro) {
        this.CalcularPerimetro = CalcularPerimetro;
    }
//a finalizar_______________________________________________________________
    public void getImprimirTudo() {
         System.out.println(getCumprimento());
         System.out.println(getLargura());
         System.out.println(getArea());
         System.out.println(getCalcularArea());
         System.out.println(getCalcularPerimetro());
    }

//a finalizar_______________________________________________________________    

}
