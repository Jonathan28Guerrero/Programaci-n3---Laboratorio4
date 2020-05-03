package laboratorio.pkg4;

import java.util.ArrayList;
/**
 *
 * @author User
 */
public class Subject {
    ArrayList Students = new ArrayList();
    ArrayList StudentAverage = new ArrayList();
    
    public void EnterStudent( int nombre,int documento,int notas){
        
    }
    public void ScoreAverage(){
        for(int i=0; i<Students.size(); i++){
            ArrayList Row = (ArrayList) Students.get(i);
            ArrayList Aux = new ArrayList();
            Aux.add(Row.get(0));
            Aux.add(Row.get(1));
            float Sum =0;
            for(int j=2; j<Row.size(); j++)
                Sum = Sum + Float.valueOf(String.valueOf(Row.get(j)));
            Sum = Sum/(Row.size()-2);
            Aux.add(Sum);
            if(Sum>=3.0)
                Aux.add("Aprobado");
            else
                Aux.add("Reprobado");
            StudentAverage.add(Aux);
        }
    }
    
   

}
