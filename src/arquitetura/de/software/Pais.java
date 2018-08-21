/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquitetura.de.software;

/**
 *
 * @author AdminL
 */
public class Pais {

    public static void add(Pais p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    String nome,sigla;
    public Pais(String nome,String sigla){
      
        this.nome=nome;
        this.sigla=sigla;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
     public String getNome()
    {
        return nome;
    }
     public void setSigla(String sigla)
     {
         this.sigla=sigla;
     }
     public String getSigla()
     {
         return sigla;
     }
    
}
