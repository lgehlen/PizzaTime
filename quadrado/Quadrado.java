/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadrado;
import forma.Forma;
/**
 *
 * @author luis_
 */
public class Quadrado implements Forma {
    
    @Override
    public float segmentoToArea(float ladoRaio){
       float a = ladoRaio*ladoRaio;
       return a;
   }
   
    @Override
    public float areaToSegmento(float area){
        float l = (float)Math.sqrt(area);
        return l;
   }
}
