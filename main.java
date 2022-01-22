//Implementado por pedro rodrigo
package poo_atividade;
import java.util.*;


public class main {
    public static void main(String[] args){
        Candidatos candidatos = new Candidatos("","","","",0,0);
        Urna urna = new Urna("","","","",0,0,0,0,0);
         Scanner e= new Scanner(System.in);
                    int op;
                    int voto;
              

        do {
            System.out.println("-----MENU----- ");
            System.out.println("Cadastrar == 1 ");
            System.out.println("Votar == 2 ");
            System.out.println("imprimir Tudo == 3 ");
            System.out.println("finalizar == 0 ");
            op=e.nextInt();

            if (op==1){

                System.out.println("digite o nome do 1º candidato: ");
                candidatos.Candidato1Nome = e.next();
                System.out.println("digite o partido do 1º candidato ");
                candidatos.NumPartido1 = e.next();
                System.out.println("digite o nome do 2º candidato: ");
                candidatos.Candidato2Nome = e.next();
                System.out.println("digite o partido do 2º candidato ");
                candidatos.NumPartido2 = e.next();
                
            }
            else if(op == 2) {
            System.out.println("----URNA---- ");
            System.out.println("candidato"+" "+candidatos.getCandidato1Nome()+" "+"vote: 1");
            System.out.println("candidato"+" "+candidatos.getCandidato2Nome()+" "+"vote: 2");
            System.out.println("Para votar Nulo vote: 3");
            voto = e.nextInt();
            if (voto == 1){
                candidatos.NumVotosC1 +=1;
                urna.NumVotosTotal +=1;
            }
            else if(voto == 2){
                candidatos.NumVotosC2 +=1;
                urna.NumVotosTotal +=1;
            }
            else if(voto == 3){
                urna.NumVotosNulos +=1;
                urna.NumVotosTotal +=1;
            }
            
            }
            
            else if (op==3) {
                System.out.println("----Registro de URNA----");
                System.out.println("candidato:"+" "+candidatos.getCandidato1Nome()+":"+" "+candidatos.getNumVotosC1());
                System.out.println("partido:"+" "+candidatos.getNumPartido1());
                System.out.println("candidato:"+" "+candidatos.getCandidato2Nome()+":"+" "+candidatos.getNumVotosC2());
                System.out.println("partido:"+" "+candidatos.getNumPartido2());
                if(candidatos.NumVotosC1 > candidatos.NumVotosC2){
                    System.out.println("------------Candidato Vencedor---------------");
                    System.out.println("candidato:"+" "+candidatos.getCandidato1Nome()+" "+"partido:"+" "+candidatos.getNumPartido1()+":"+"com"+" "+candidatos.getNumVotosC1()+" "+"votos.");
                    System.out.println("---------------------------------------------");
                }
                else if(candidatos.NumVotosC2 > candidatos.NumVotosC1){
                    System.out.println("------------Candidato Vencedor---------------");
                    System.out.println("candidato:"+" "+candidatos.getCandidato2Nome()+" "+"partido:"+" "+candidatos.getNumPartido2()+":"+"com"+" "+candidatos.getNumVotosC2()+" "+"votos.");
                    System.out.println("---------------------------------------------");
                };
                //System.out.println(candidatos.getNumVotosC1());
                //System.out.println(candidatos.getNumVotosC2());
                System.out.println("Apuração de Votos Nulos"+":"+urna.getNumVotosNulos());
                System.out.println("Apuração de Total de Votos"+":"+urna.getNumVotosTotal());
                
                

             }
            
        }while (op!=0);
    }
}
         
         
    

