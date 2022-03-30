/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */

package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.model.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	private Dizionario model;
	private Parola parola;



    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnClear"
    private Button btnClear; // Value injected by FXMLLoader

    @FXML // fx:id="btnTranslate"
    private Button btnTranslate; // Value injected by FXMLLoader

    @FXML // fx:id="txtOutput"
    private TextArea txtOutput; // Value injected by FXMLLoader

    @FXML // fx:id="txtTesto"
    private TextField txtTesto; // Value injected by FXMLLoader

    @FXML
    void clearText(ActionEvent event) {
    	
    	txtOutput.clear();

    }

    @FXML
    void traduci(ActionEvent event) {
    	txtOutput.clear();
    	String testo = txtTesto.getText().toLowerCase();
    	String requisiti = "/[A-Za-z]/g";
    	
    	
    	if(testo.contains(" ")) {
    		
    	String array[] = testo.split(" ");
    	//if(array[0].matches(requisiti)==true&&array[1].matches(requisiti)==true) {
    	Parola p = new Parola(array[0], array[1]);
    	boolean trov=false;
    	for(Parola ppp:model.getListaParole()) {
    		if(ppp.getParola().compareTo(array[0])==0) {
    			ppp.getListaTraduzioni().add(array[1]);
    			trov = true;
    			
    		} 
    	}
    	if (trov==false) {model.add(p);}
    	
    	txtTesto.clear();
    	}//}
    	
    	else {
    		//if (testo.matches(requisiti)==true) {
    		for(Parola pp:model.getListaParole())
    		{
    			if(pp.getParola().compareTo(testo)==0)
    				txtOutput.setText(pp.getTraduzioni());
				

    				
    	//	}
    		
    	}}

    }
    public void setModel(Dizionario model){
    	this.model=model;
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtOutput != null : "fx:id=\"txtOutput\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtTesto != null : "fx:id=\"txtTesto\" was not injected: check your FXML file 'Scene.fxml'.";

    }
    
}
