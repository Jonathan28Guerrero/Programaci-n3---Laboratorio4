package laboratorio.pkg4;

import java.util.ArrayList;
import static laboratorio.pkg4.SubjectParameters.NumberNotes;
/**
 *
 * @author User
 */
public class Subject {
    ArrayList Students = new ArrayList();
    ArrayList StudentAverage = new ArrayList();
    int Aproved = 0;
    int Reproved = 0;
    
    public void EnterStudent( String Name,String Document,String[] Notes){
        ArrayList Aux = new ArrayList();
        Aux.add(Name);
        Aux.add(Document);
        for (int i = 0;i<NumberNotes;i++) 
                   Aux.add(Notes[i]);
        Students.add(Aux);
        ArrayList Aux2 = new ArrayList();
        Aux2.add(Aux.get(0));
            Aux2.add(Aux.get(1));
            float Sum =0;
            for(int j=2; j<Aux.size(); j++)
                Sum = Sum + Float.valueOf(String.valueOf(Aux.get(j)));
            Sum = Sum/(Aux.size()-2);
            Aux2.add(Sum);
            if(Sum>=3.0){
                Aux2.add("Aprobado");
                Aproved++;
            }
            else{
                Aux2.add("Reprobado");
                Reproved++;
            }
            StudentAverage.add(Aux2);
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
            if(Sum>=3.0){
                Aux.add("Aprobado");
                Aproved++;
            }
            else{
                Aux.add("Reprobado");
                Reproved++;
            }
            StudentAverage.add(Aux);
        }
    }
    public String[] Mortality(){
      float n = Students.size();
      float Aproved2 = ((n-Reproved)/n)*100;
      float Reproved2 = ((n-Aproved)/n)*100;
      String[] Aux ={Aproved2+"%", Reproved2+"%"};
      return Aux;
    }

   

}
