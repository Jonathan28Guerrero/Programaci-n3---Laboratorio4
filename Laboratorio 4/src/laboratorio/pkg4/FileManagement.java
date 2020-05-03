/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author User
 */
public class FileManagement {
    public ArrayList LoginByFile(File FileStudents) throws FileNotFoundException{
        ArrayList TableStudents = new ArrayList();
        try(Scanner ScanFile = new Scanner(FileStudents)){
            while (ScanFile.hasNextLine()){
                ArrayList Values = SplitColumns(ScanFile.nextLine());
                TableStudents.add(Values);
            }
        }
        return TableStudents;
    }
    public ArrayList SplitColumns(String Row){
        ArrayList Columns = new ArrayList();
        try(Scanner RowScanner = new Scanner(Row)){
            RowScanner.useDelimiter(";");
                while(RowScanner.hasNext()) {
                Columns.add(RowScanner.next());
            }
        }
        return Columns;
    }
    public void ExportFile(ArrayList Students) throws IOException{
        JFileChooser SelectFile = new JFileChooser();
        int Result = SelectFile.showOpenDialog(null);
        File FileSelected = SelectFile.getSelectedFile();
        try (FileWriter FW = new FileWriter(FileSelected.getPath()+".csv")) {
            for(int i=0; i<Students.size(); i++){
                ArrayList Row = (ArrayList) Students.get(i);
                for(int j=0; j<Row.size(); j++){
                    FW.append(Row.get(j)+"");
                    if(j!=(Row.size()-1))
                        FW.append(";");
                }
                FW.append("\n");
            }
            FW.flush();
            FW.close();
        }
    }
}
