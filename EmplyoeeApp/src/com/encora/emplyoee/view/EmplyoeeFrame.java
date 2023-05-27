package com.encora.emplyoee.view;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EmplyoeeFrame extends Frame {
	private Label emplyoeeIdLbl;
	private TextField emplyoeeIdTxt;
	
	private Label emplyoeeNameLbl;
	private TextField emplyoeeNameTxt;
	
	private Checkbox maleOption;
	private Checkbox femaleOption;
	private Checkbox otherOption;
	private Label emplyoeeGenderLbl;
	private Label employeePerkLbl;
	
	public EmplyoeeFrame() {
	  setBounds(50, 50, 700, 500);
	  setTitle("Emplyoee Information");
	  setVisible(true);
	  setLayout(null);
	  
	  emplyoeeIdLbl = new Label("Emplyoee Id");
	  emplyoeeIdLbl.setBounds(20, 50, 100, 20);
	  add(emplyoeeIdLbl);
	  
	  emplyoeeIdTxt = new TextField();
	  emplyoeeIdTxt.setBounds(140, 50, 100, 20);
	  add(emplyoeeIdTxt);
	  
	  emplyoeeNameLbl = new Label("Emplyoee Name");
	  emplyoeeNameLbl.setBounds(20, 90, 100, 20);
	  add(emplyoeeNameLbl);
	  
	  emplyoeeNameTxt = new TextField();
	  emplyoeeNameTxt.setBounds(140, 90, 100, 20);
	  add(emplyoeeNameTxt);
	  
	  emplyoeeGenderLbl = new Label("Emplyoee Gender");
	  emplyoeeGenderLbl.setBounds(20,130,150,20);
	  add(emplyoeeGenderLbl);
	  
	  maleOption = new Checkbox("Male");
	  maleOption.setBounds(190,130,80,20);
	  add(maleOption);
	  
	  femaleOption = new Checkbox("Female");
	  femaleOption.setBounds(290,130,80,20);
	  add(femaleOption);
	  
	  otherOption = new Checkbox("Other");
	  otherOption.setBounds(390,130,80,20);
	  add(otherOption);
	  
	  employeePerkLbl = new Label("Employee Perk");
	  employeePerkLbl.setBounds(20,170,100,20);
	  add(employeePerkLbl);
	  
	  this.addWindowListener(new WindowAdapter() {
	
		  @Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			
			  EmplyoeeFrame ef = (EmplyoeeFrame)e.getSource();
					  ef.dispose();
		}
	  
	  
	  });
	}
}
