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

public class Cliente {
   
    private String nome,telefone,credito,pais,siglapais;
    private int idade;
    public Cliente(String nome,String telefone,int idade,String pais,String siglapais,String credito){
      
        this.nome=nome;
        this.credito=credito;
        this.telefone=telefone;
        this.idade=idade;
        this.pais=pais;
        this.siglapais=siglapais;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
     public String getNome()
    {
        return nome;
    }
     public void setCredito(String credito)
     {
         this.credito=credito;
     }
     public String getCredito()
     {
         return credito;
     }
    /////////////////////////////////////////// 
     public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }
     public String getTelefone()
    {
        return telefone;
    }
    ////////////////////////////////////////// 
      public void setIdade(int idade)
    {
        this.idade = idade;
    }
     public int getIdade()
    {
        return idade;
    }
      public void setPais(String pais)
    {
        this.pais = pais;
    }
     public String getPais()
    {
        return pais;
    }
       public void setSiglapais(String siglapais)
    {
        this.siglapais = siglapais;
    }
     public String getSuglapais()
    {
        return siglapais;
    }
}


