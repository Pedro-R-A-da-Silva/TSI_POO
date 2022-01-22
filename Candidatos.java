
package poo_atividade;


public class Candidatos{ 
        public String 
                     Candidato1Nome,
                     Candidato2Nome,
                     NumPartido1,
                     NumPartido2;
        public int
                     NumVotosC1,
                     NumVotosC2;

    
    public Candidatos(String Candidato1Nome,String Candidato2Nome, String NumPartido1,String NumPartido2,int NumVotosC1,int NumVotosC2){
        this.Candidato1Nome = Candidato1Nome;
        this.Candidato2Nome = Candidato2Nome;
        this.NumPartido1 = NumPartido1;
        this.NumPartido2 = NumPartido2;
        this.NumVotosC1 = 0;
        this.NumVotosC2 = 0;
        
    }

    public String getCandidato1Nome() {
        return Candidato1Nome;
    }

    public void setCandidato1Nome(String Candidato1Nome) {
        this.Candidato1Nome = Candidato1Nome;
    }

    public String getCandidato2Nome() {
        return Candidato2Nome;
    }

    public void setCandidato2Nome(String Candidato2Nome) {
        this.Candidato2Nome = Candidato2Nome;
    }

    public String getNumPartido1() {
        return NumPartido1;
    }

    public void setNumPartido1(String NumPartido1) {
        this.NumPartido1 = NumPartido1;
    }

    public String getNumPartido2() {
        return NumPartido2;
    }

    public void setNumPartido2(String NumPartido2) {
        this.NumPartido2 = NumPartido2;
    }

    
    public int getNumVotosC1() {
        return NumVotosC1;
    }

    public void setNumVotosC1(int NumVotosC1) {
        this.NumVotosC1 = NumVotosC1;
    }

    public int getNumVotosC2() {
        return NumVotosC2;
    }

    public void setNumVotosC2(int NumVotosC2) {
        this.NumVotosC2 = NumVotosC2;
    }
    

    @Override
    public String toString() {
        return "Candidatos{" + "Candidato1Nome=" + Candidato1Nome + ", Candidato2Nome=" + Candidato2Nome + ", NumPartido1=" + NumPartido1 + ", NumPartido2=" + NumPartido2 + ", NumVotosC1=" + NumVotosC1 + ", NumVotosC2=" + NumVotosC2 +'}';
    }
    
    
    
    
}
