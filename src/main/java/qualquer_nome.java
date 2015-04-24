/**
 * Created by ana.fasanella on 24/04/15.
 */
public class qualquer_nome {

    //Deve retornar uma soma dos parametros recebidos
    public int addition(int x, int y){
        return x+y;
    }

    //Deve identificar se um email passado como parametro é valido
    public boolean validaEmail(String email){
        if(email.contains("@")){
            if(email.contains("com")){
                if(email.contains("br")){
                    return true;
                }
            }
        }
        return true;
    }

    //Deve retornar verdadeiro se o usuario tiver 18 anos ou mais
    public boolean maiorIdade(int idade) {
        if(idade > 18){
            return true;
        }
        return false;
    }

   public void faznada(){
   }
}
