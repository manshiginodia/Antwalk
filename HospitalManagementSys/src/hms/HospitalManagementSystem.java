package hms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class HospitalManagementSystem implements ActionListener {
    Connection con;
    Statement stmt;
    PreparedStatement pstmt;
    ResultSet rs;


    //stack variable at global scope for storing obj reference
    JFrame frmMain;
    JPanel pnlcrud, pnlnavig;

    JLabel lblmid, lblmname, lblmprice,lblmqty;
    JTextField txtmid, txtmname, txtmprice, txtmqty;

    JButton btninsert, btnupdate, btndelete,btnsearch,btnclear;
    JButton btnfirst,btnlast,btnnext,btnprev;


    void CreateGUI(){

        //we will create the parent window for the project
        frmMain = new JFrame();

        //Now we will create instances of labels and textfields to be nested directly into the frame
        lblmid = new JLabel();
        lblmid .setText("Med ID: ");
        txtmid  = new JTextField(10);

        lblmname = new JLabel();
        lblmname.setText("Med Name: ");
        txtmname = new JTextField(10);

        lblmprice = new JLabel("Price: ");
        txtmprice= new JTextField(10);

        lblmqty = new JLabel("Quantity");
        txtmqty = new JTextField(10);//10 specifies the max size of input

        //deciding orientation or layout for JFrame
        frmMain.setLayout(new FlowLayout()); //arranges components from left to right, there are more diff layouts like grid layout,etc


        //now we will have to add components ie, lables, textfields into the container ie frame
        frmMain.add(lblmid);
        frmMain.add(txtmid);

        frmMain.add(lblmname);
        frmMain.add(txtmname);

        frmMain.add(lblmprice);
        frmMain.add(txtmprice);

        frmMain.add(lblmqty);
        frmMain.add(txtmqty);


        //now we will create panels and respective components for crud and navigation panel and then we will add panel to frame

        // let's begin with crud panel
        pnlcrud =new JPanel();
        pnlcrud.setBorder(BorderFactory.createTitledBorder("CRUD OPERATIONS"));

        btninsert = new JButton();
        btninsert.addActionListener(this);
        btninsert.setText(("Insert"));

        btnupdate = new JButton();
        btnupdate.addActionListener(this);
        btnupdate.setText(("Update"));

        btndelete= new JButton();
        btndelete.addActionListener(this);
        btndelete.setText(("Delete"));

        btnsearch = new JButton();
        btnsearch.addActionListener(this);
        btnsearch.setText(("Search"));

        btnclear = new JButton();
        btnclear.addActionListener(this);
        btnclear.setText(("Clear"));

        //now host crud buttons in panel and then host crud panel in frameMain
        pnlcrud.add(btninsert);
        pnlcrud.add(btnupdate);
        pnlcrud.add(btndelete);
        pnlcrud.add(btnsearch);
        pnlcrud.add(btnclear);

        frmMain.add(pnlcrud);


        // let's begin with navigation panel
        pnlnavig =new JPanel();
        pnlnavig.setBorder(BorderFactory.createTitledBorder("NAVIGATION PANEL"));

        btnfirst = new JButton();
        btnfirst.addActionListener(this);
        btnfirst.setText(("<<"));

        btnprev= new JButton();
        btnprev.addActionListener(this);
        btnprev.setText(("<"));

        btnnext= new JButton();
        btnnext.addActionListener(this);
        btnnext.setText((">"));

        btnlast = new JButton();
        btnlast.addActionListener(this);
        btnlast.setText((">>"));


        //now host navig buttons in panel and then host navig panel in frameMain
        pnlnavig.add(btnfirst);
        pnlnavig.add(btnprev);
        pnlnavig.add(btnnext);
        pnlnavig.add(btnlast);

        frmMain.add(pnlnavig);






        frmMain.setSize(700,500);
        frmMain.setTitle("HMS Version 1.0");
        frmMain.setVisible(true);//by default visibility is false so set it to true to view






    }


    @Override
    public void actionPerformed(ActionEvent componentref) {
        //checks which key is clicked
        if(componentref.getActionCommand() == "Insert"){
            System.out.println("Insert button got the click action or event");
        }else if(componentref.getActionCommand() == "Update"){
            System.out.println("Update button got the click action or event");
        }else if(componentref.getActionCommand() == "Delete"){
            System.out.println("Delete button got the click action or event");
        }else if(componentref.getActionCommand() == "Search"){
            System.out.println("Search button got the click action or event");
        }else if(componentref.getActionCommand() == "Clear"){
            System.out.println("Clear button got the click action or event");
        }else if(componentref.getActionCommand() == "<<"){
            System.out.println("First button got the click action or event");
        }else if(componentref.getActionCommand() == "<"){
            System.out.println("Previous button got the click action or event");
        }else if(componentref.getActionCommand() == ">"){
            System.out.println("Next button got the click action or event");
        }else if(componentref.getActionCommand() == ">>"){
            System.out.println("Last button got the click action or event");
        }




    }
}



