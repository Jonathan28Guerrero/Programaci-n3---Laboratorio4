package laboratorio.pkg4;

import java.util.ArrayList;
/**
 *
 * @author User
 */
public class Subject {
    ArrayList Students = new ArrayList();
    ArrayList StudentAverge = new ArrayList();
    
    public void EnterStudent( int nombre,int documento,int notas){
        
        Students.add(nombre);
        Students.add(documento);
        Students.add(notas);
        
    }
    
    public void ScoreAverage(){
        
    }
    
   

}
