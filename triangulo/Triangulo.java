/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;
import forma.Forma;
import forma.Forma;
/**
 *
 * @author luis_
 */
public class Triangulo implements Forma {
   
    @Override
    public float segmentoToArea(float ladoRaio){
       float h = (ladoRaio*(float)Math.sqrt(3))/2;
       float  a = (ladoRaio*h)/2;
       return a;
   }
   
    @Override
    public float areaToSegmento(float area){
       float l = 1 ;
       return l;
   }
}
