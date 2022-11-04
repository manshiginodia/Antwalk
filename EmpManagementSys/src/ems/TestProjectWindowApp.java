package ems;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.*;


class EmployeeManagementSystem implements ActionListener {

    Connection con;
    Statement stmt;
    PreparedStatement pstmt;
    ResultSet rs;


    //stack variable at global scope for storing obj reference
    JFrame frmMain;
    JPanel pnlcrud, pnlnavig;

    JLabel lbleid, lblename, lblesalary,lbleaddr;
    JTextField txteid, txtename, txtesalary, txteaddr;

    JButton btninsert, btnupdate, btndelete,btnsearch,btnclear;
    JButton btnfirst,btnlast,btnnext,btnprev;


    void CreateGUI(){

        //we will create the parent window for the project
        frmMain = new JFrame();

        //Now we will create instances of labels and textfields to be nested directly into the frame
        lbleid = new JLabel();
        lbleid .setText("ID: ");
        txteid  = new JTextField(10);

        lblename = new JLabel();
        lblename.setText("Name: ");
        txtename = new JTextField(10);

        lblesalary = new JLabel("Salary: ");
        txtesalary= new JTextField(10);

        lbleaddr = new JLabel("Address");
        txteaddr = new JTextField(10);//10 specifies the max size of input

        //deciding orientation or layout for JFrame
        frmMain.setLayout(new FlowLayout()); //arranges components from left to right, there are more diff layouts like grid layout,etc


        //now we will have to add components ie, lables, textfields into the container ie frame
        frmMain.add(lbleid);
        frmMain.add(txteid);

        frmMain.add(lblename);
        frmMain.add(txtename);

        frmMain.add(lblesalary);
        frmMain.add(txtesalary);

        frmMain.add(lbleaddr);
        frmMain.add(txteaddr);


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
        frmMain.setTitle("EMS Version 1.0");
        frmMain.setVisible(true);//by default visibility is false so set it to true to view


    }


    //JDBC and SQL with Oracle
    void DatabaseOps(){

        try {
            //1. loading the driver
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            //2. Establishing the connectivity
            con = (Connection) DriverManager.getConnection("jdbc:oracle:thin:@IPhost:port:xe","system","oracle");
            System.out.println("Connection got established");

            //3. create a sql query
            String msgsql="select empid, empname, empsal, empaddress from tblnriems";

            //4. statement needs to be taken care of as messenger
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);

            //5. Now we send sql as message from .java file to oracle and will receive the table back here
            rs = stmt.executeQuery(msgsql);

            /*
            //move the pointer to actual row ahead of column heading
            rs.next();

            //retrieve  the info for columns for a given record or row
            int eid = rs.getInt("empid"); //col name should be same as that in db
            String en = rs.getString("ename");
            int es = rs.getInt("empsal");
            String ed = rs.getString("empaddress");

            //showing the value retrieved from column of the row of a table
            txteid.setText(Integer.toString(eid));
            txtename.setText(en);
            txtesalary.setText(Integer.toString(es));
            txteaddr.setText(ed);

             */











            /*
            //6. now we will retrieve the details of one record at a time and will get it
            //   displayed on the console and then latter in the respective textfield

            //7.
            while (rs.next()) {

                //8. fetch all the column value row after row
                int eid = rs.getInt("empid"); //col name should be same as that in db
                String en = rs.getString("ename");
                int es = rs.getInt("empsal");
                String ed = rs.getString("empaddress");

                //9. Showing the value in console
                System.out.println(eid + " " + en + " " + es + " " + ed);
            }
             */



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }





    }

    public void fillUpText() {


        try {
            int eid = rs.getInt("empid"); //col name should be same as that in db
            String en = rs.getString("ename");
            int es = rs.getInt("empsal");
            String ed = rs.getString("empaddress");

            //showing the value retrieved from column of the row of a table
            txteid.setText(Integer.toString(eid));
            txtename.setText(en);
            txtesalary.setText(Integer.toString(es));
            txteaddr.setText(ed);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void actionPerformed(ActionEvent componentref) {
        //checks which key is clicked
        if(componentref.getActionCommand() == "Insert"){
            System.out.println("Insert button got the click action or event");
            try {
                //blank new row at the last of the result set
                rs.moveToInsertRow();

                //collect value from text and make it the value of relevent column and perform typecasting if required
                rs.updateInt("empid",Integer.parseInt(txteid.getText()));
                rs.updateInt("empname",Integer.parseInt(txtename.getText()));
                rs.updateInt("empsalary",Integer.parseInt(txtesalary.getText()));
                rs.updateInt("empaddress",Integer.parseInt(txteaddr.getText()));

                //now committing the updated resultset back to original database table
                rs.insertRow();
                JOptionPane.showMessageDialog( frmMain, "record got inserted");

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }else if(componentref.getActionCommand() == "Update"){
            System.out.println("Update button got the click action or event");
            try {
                //collect value from text and make it the value of relevent column and perform typecasting if required
                rs.updateInt("empid",Integer.parseInt(txteid.getText()));
                rs.updateInt("empname",Integer.parseInt(txtename.getText()));
                rs.updateInt("empsalary",Integer.parseInt(txtesalary.getText()));
                rs.updateInt("empaddress",Integer.parseInt(txteaddr.getText()));

                //now committing the updated resultset back to original database table
                rs.updateRow();
                JOptionPane.showMessageDialog( frmMain, "record got updated");

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }else if(componentref.getActionCommand() == "Delete"){
            System.out.println("Delete button got the click action or event");
            try {
                rs.deleteRow();
                JOptionPane.showMessageDialog( frmMain, "record got deleted");

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }else if(componentref.getActionCommand() == "Search"){
            System.out.println("Search button got the click action or event");
            if(txteid.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog( frmMain, "Emp ID compulsory for search");
            }else{
                //collected empid from runtime execution
                int eid = Integer.parseInt(txteid.getText().trim());
                String query ="select empid, empname, empsal, empaddress from tblnriems where eid =?";
                try {
                    pstmt = con.prepareStatement(query);
                    pstmt.setInt(1,eid);

                    rs = pstmt.executeQuery();

                    if(rs.next()){
                        fillUpText();
                    }else{
                        JOptionPane.showMessageDialog( frmMain, "Emp ID not present in the records");
                    }

                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }


        }else if(componentref.getActionCommand() == "Clear"){
            System.out.println("Clear button got the click action or event");
            txteid.setText(" ");
            txtename.setText(" ");
            txtesalary.setText(" ");
            txteaddr.setText(" ");
            JOptionPane.showMessageDialog( frmMain, "records got cleared");


        }else if(componentref.getActionCommand() == "<<"){
            System.out.println("First button got the click action or event");
            try {
                rs.first();
                fillUpText();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }else if(componentref.getActionCommand() == "<"){
            System.out.println("Previous button got the click action or event");

            try {
                if(rs.previous()){
                    fillUpText();
                }
                else{
                    rs.next();
                    JOptionPane.showMessageDialog( frmMain, "you are at the first entry");
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }else if(componentref.getActionCommand() == ">"){
            System.out.println("Next button got the click action or event");

            try {
                if(rs.next()){
                    fillUpText();
                }
                else{
                    rs.previous();
                    JOptionPane.showMessageDialog( frmMain, "you are at the last entry");
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }else if(componentref.getActionCommand() == ">>"){
            System.out.println("Last button got the click action or event");
            try {
                rs.last();
                fillUpText();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }




    }
}





public class TestProjectWindowApp {
    public static void main(String[] args) {

        EmployeeManagementSystem emsobj = new EmployeeManagementSystem();
        emsobj.CreateGUI();
        emsobj.DatabaseOps();

    }
}

/*
steps:
1. Create the container and sub-containers
2. Create the components
3. Decide the layout
4. Add the components into the containers
5. Perform Event handling on components
6. Go for database operations
 */



/*
common steps for backend connectivity using JDBC api
1. load the driver(jar) ie, how we change and inform java file which backend
   database technology to work with
2. Establishing the connectivity between frontend gui and backend database
   using the connection and drivermanager of java.sql*
3. Now we will build select or insert query and get it fired from front end gui
   to backend database for this you need a messenger ie, statement
4. once the required table will be fetched by statement we will have to store
   here in .java file and for that we will create a virtual table which will be
   the object of ResultSet from java.sql*
5. the functions of ResultSet, thereafter will help us to perform crud and
   navigation operation
 */