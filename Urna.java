
package poo_atividade;


public class Urna extends Candidatos{
        public int 
                     Votar,
                     NumVotosNulos,
                     NumVotosTotal;
    
    public Urna(String Candidato1Nome,String Candidato2Nome, String NumPartido1,String NumPartido2,int NumVotosC1,int NumVotosC2, int Votar, int NumVotosNulos,int NumVotosTotal){
        super(Candidato1Nome, Candidato2Nome, NumPartido1,NumPartido2,NumVotosC1,NumVotosC2);
        this.Votar = Votar;
        this.NumVotosTotal = 0;
        this.NumVotosNulos = 0;
        
    }

    public int getNumVotosC1() {
        return NumVotosC1;
    }

    public int getNumVotosC2() {
        return NumVotosC2;
    }

    public int getNumVotosNulos() {
        return NumVotosNulos;
    }

    public int getNumVotosTotal() {
        return NumVotosTotal;
    }
//tentei implmentar assim professor mas nao consegui___________________________________________________________
    public void Votar(){
        if (Votar == 1){
            this.NumVotosC1 += 1;
            this.NumVotosTotal+=1;
        }
        if(Votar == 2){
            this.NumVotosC2 +=1;
            this.NumVotosTotal+=1;
        }
        if(Votar == 3){
            this.NumVotosNulos +=1;
            this.NumVotosTotal+=1;
        }
        if(Votar == 0){
            System.exit(0);
                }
    }
//_______________________________________________________________________    
    public void ImprimirTudo(){
        System.out.println("total de votos apurados"+getNumVotosTotal());
    }
//_______________________________________________________________________
    @Override
    public String toString() {
        return "Urna{" + ", Votar=" + Votar + ", NumVotosC1=" + NumVotosC1 + ", NumVotosC2=" + NumVotosC2 + ", NumVotosNulos=" + NumVotosNulos + ", NumVotosTotal=" + NumVotosTotal + '}';
    }
    
    
    
    
}
