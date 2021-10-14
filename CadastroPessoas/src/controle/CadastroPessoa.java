
package controle;

import Pessoa.Pessoa;
import java.util.ArrayList;


public class CadastroPessoa {
   private  ArrayList<Pessoa> pessoa = new ArrayList<Pessoa>();
   
   public boolean salvar(Pessoa p){
       if(p != null){
           pessoa.add(p);
           return true;
       }else{
           return false;
       }
   }
   public ArrayList<Pessoa> retornarPessoas(){
       return pessoa;
   }
}
