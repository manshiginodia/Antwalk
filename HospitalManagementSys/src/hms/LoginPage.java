package hms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginPage implements ActionListener {

    Connection con;
    Statement stmt;
    PreparedStatement pstmt;
    ResultSet rs;


    //stack variable at global scope for storing obj reference
    JFrame frmMain;
    JPanel pnllogin;

    JLabel lbluid, lblupwd;
    JTextField txtuid, txtupwd;

    JButton btnlogin;

    void CreateGUI(){

        //we will create the parent window for the project
        frmMain = new JFrame();

        //Now we will create instances of labels and textfields to be nested directly into the frame
        lbluid = new JLabel();
        lbluid .setText("User ID: ");
        txtuid  = new JTextField(10);

        lblupwd = new JLabel();
        lblupwd.setText("Password: ");
        txtupwd = new JTextField(10);

        //deciding orientation or layout for JFrame
        frmMain.setLayout(new FlowLayout()); //arranges components from left to right, there are more diff layouts like grid layout,etc


        //now we will have to add components ie, lables, textfields into the container ie frame
        frmMain.add(lbluid);
        frmMain.add(txtuid);

        frmMain.add(lblupwd);
        frmMain.add(txtupwd);



        //now we will create panels and respective components for crud and navigation panel and then we will add panel to frame

        // let's begin with crud panel
        pnllogin=new JPanel();
        //pnllogin.setBorder(BorderFactory.createTitledBorder("CRUD OPERATIONS"));

        pnllogin.setLayout(new FlowLayout());
        btnlogin= new JButton();
        btnlogin.addActionListener(this);
        btnlogin.setText(("Login"));


        //now host crud buttons in panel and then host crud panel in frameMain
        pnllogin.add(btnlogin);

        frmMain.add(pnllogin);


        frmMain.setSize(400,500);
        frmMain.setTitle("HMS Version 1.0");
        frmMain.setVisible(true);//by default visibility is false so set it to true to view


    }


    @Override
    public void actionPerformed(ActionEvent componentref) {
//        String uid =  txtuid.getText();
//        String upwd =  txtupwd.getText();
        if(componentref.getActionCommand() == "Login"){
            System.out.println("Login button got the click action or event");

            //if(uid =="123" && upwd =="123") {
                frmMain.setVisible(false);
                HospitalManagementSystem hmsobj = new HospitalManagementSystem();
                hmsobj.CreateGUI();

            //}
        }
    }
}
