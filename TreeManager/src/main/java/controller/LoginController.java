package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dto.MasterUserDTO;
import vista.UILogin;

public class LoginController implements ActionListener {
	mainWindowController mwc;
	MasterUserDTO mu;
	UILogin uilogin;

	
	public LoginController(){
		mu= new MasterUserDTO("c","c");	
		uilogin= new UILogin();
		uilogin.getBtnLogin().addActionListener(this);}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.uilogin.getBtnLogin()) {
			if(true
//					this.uilogin.getTextField().getText()==mu.getNombre() && 
//			   this.uilogin.getPasswordField().getText()==mu.getPassword()
			   ){
				this.uilogin.getFrmRootmanager().dispose();
				this.mwc= new mainWindowController();
			}
		}
		
	}
}
