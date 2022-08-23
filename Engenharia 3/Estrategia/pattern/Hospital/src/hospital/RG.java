/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author Fatec
 */
public class RG {
   public double numero;
   public String dataExpedicao;
   public double getNumero() {
      return numero;
   }
   public void setNumero(double numero) {
      this.numero = numero;
   }
   public String getDataExpedicao() {
      return dataExpedicao;
   }
   public void setDataExpedicao(String dataExpedicao) {
      this.dataExpedicao = dataExpedicao;
   }
   public RG(double numero, String dataExpedicao) {
      this.numero = numero;
      this.dataExpedicao = dataExpedicao;
   }

   public RG(){}
   
}
