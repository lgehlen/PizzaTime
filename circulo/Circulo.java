/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulo;
import forma.Forma;
/**
 *
 * @author luis_
 */
public class Circulo implements Forma{
    
    @Override
    public float segmentoToArea(float ladoRaio){
       float pi = (float)3.141592;
       float a = (ladoRaio * ladoRaio) * pi;
       return a;
   }
   
    @Override
    public float areaToSegmento(float area){
       int a = 1 ;
       return a;
   }
}
