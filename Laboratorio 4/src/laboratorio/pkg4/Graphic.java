/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
/**
 *
 * @author User
 */
public class Graphic {
    
    
    
   public JFreeChart MakeGraphic( ArrayList Students){
       
       XYSeriesCollection dataset = new XYSeriesCollection();
       XYSeries maindataset = new XYSeries("XY Grafico");
        for(int i=2; i< Students.size();i++){ 
            maindataset.add(i-1,Float.valueOf((String)Students.get(i)));
        }
        dataset.addSeries(maindataset);
        JFreeChart chart= ChartFactory.createXYLineChart((String)Students.get(0), "Nota", "Calificacion", dataset,
                PlotOrientation.VERTICAL, true, true, false);
        return chart;

}
    
    
    
}
