package today;


import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class JDBC {
	
	///CREATION D UNE TABLE
    
	
	public static  void inserttoJtable(String bdd,String TABLE,String nom,String prenom,String nomrue,String dob,String telephone,String mid,String id) throws SQLException
	 {
		    System.out.println("insertion!");

	   Connection c = null;
	   Statement stmt = null;
	   try {
	     Class.forName("org.sqlite.JDBC");
	     c = DriverManager.getConnection("jdbc:sqlite:"+bdd);
	     c.setAutoCommit(false);
	     System.out.println("insertion >>>>> ouverture de la base de donnÃ©e avec succÃ©s");
	     String sql;
	     
	     stmt = c.createStatement();

	     
	     sql = "INSERT INTO "+TABLE+" (ID,MID,NAME,PRENAME,NOMRUE,DOB,TELEPHONE) " +
		            "VALUES ('"+id+"','"+mid+"','"+nom+"','"+prenom+"','"+nomrue+"','"+dob+"','"+telephone+"');";	                 	               	       		    		   
	     stmt.executeUpdate(sql);	    		     
	     stmt.close();
	     c.commit();
	     c.close();
	     System.out.println("insertion >>>>> enregistrement reussie!");
	   } catch ( Exception e ) {
	     System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	    // System.exit(0);
	     stmt.close();
	      c.close();
	        //connectiontobdd("insertion ","data base.db");
	   }
	  
	 }
	 
	
        
        
        	public static  void inserttoOM(String bdd,String TABLE,String nom,String prenom,String om,String mid) throws SQLException
	 {
		    System.out.println("insertion!");

	   Connection c = null;
	   Statement stmt = null;
	   try {
	     Class.forName("org.sqlite.JDBC");
	     c = DriverManager.getConnection("jdbc:sqlite:"+bdd);
	     c.setAutoCommit(false);
	     System.out.println("insertion >>>>> ouverture de la base de donnÃ©e avec succÃ©s");
	     String sql;
	     
	     stmt = c.createStatement();

	     
	     sql = "INSERT INTO "+TABLE+" (MID,NAME,PRENAME,OM) " +
		            "VALUES ('"+mid+"','"+nom+"','"+prenom+"','"+om+"');";	                 	               	       		    		   
	     stmt.executeUpdate(sql);	    		     
	     stmt.close();
	     c.commit();
	     c.close();
	     System.out.println("insertion >>>>> enregistrement reussie!");
	   } catch ( Exception e ) {
	     System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	    // System.exit(0);
	     stmt.close();
	      c.close();
	        //connectiontobdd("insertion ","data base.db");
	   }
	  
	 }
                
                
                
	    public static  void inserttoCVs(String bdd,String TABLE,String mid) throws SQLException
	 {
		    System.out.println("insertion!");

	   Connection c = null;
	   Statement stmt = null;
	   try {
	     Class.forName("org.sqlite.JDBC");
	     c = DriverManager.getConnection("jdbc:sqlite:"+bdd);
	     c.setAutoCommit(false);
	     System.out.println("insertion >>>>> ouverture de la base de donnÃ©e avec succÃ©s");
	     String sql;
	     
	     stmt = c.createStatement();

	     
	     sql = "INSERT INTO "+TABLE+" (MID) " + " VALUES ('"+mid+"');";	                 	               	       		    		   
	     stmt.executeUpdate(sql);	    		     
	     stmt.close();
	     c.commit();
	     c.close();
	     System.out.println("insertion >>>>> enregistrement reussie!");
	   } catch ( Exception e ) {
	     System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	    // System.exit(0);
	     stmt.close();
	      c.close();
	        //connectiontobdd("insertion ","data base.db");
	   }
	  
	 }       
            
            
            
            public static  void inserttoENs(String bdd,String TABLE,String mid) throws SQLException
	 {
		    System.out.println("insertion!");

	   Connection c = null;
	   Statement stmt = null;
	   try {
	     Class.forName("org.sqlite.JDBC");
	     c = DriverManager.getConnection("jdbc:sqlite:"+bdd);
	     c.setAutoCommit(false);
	     System.out.println("insertion >>>>> ouverture de la base de donnÃ©e avec succÃ©s");
	     String sql;
	     
	     stmt = c.createStatement();

	     
	     sql = "INSERT INTO "+TABLE+" (MID) " + " VALUES ('"+mid+"');";	                 	               	       		    		   
	     stmt.executeUpdate(sql);	    		     
	     stmt.close();
	     c.commit();
	     c.close();
	     System.out.println("insertion >>>>> enregistrement reussie!");
	   } catch ( Exception e ) {
	     System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	    // System.exit(0);
	     stmt.close();
	      c.close();
	        //connectiontobdd("insertion ","data base.db");
	   }
	  
	 }      
            
            
            
            
            
            public static  void inserttoRCs(String bdd,String TABLE,String mid) throws SQLException
	 {
		    System.out.println("insertion!");

	   Connection c = null;
	   Statement stmt = null;
	   try {
	     Class.forName("org.sqlite.JDBC");
	     c = DriverManager.getConnection("jdbc:sqlite:"+bdd);
	     c.setAutoCommit(false);
	     System.out.println("insertion >>>>> ouverture de la base de donnÃ©e avec succÃ©s");
	     String sql;
	     
	     stmt = c.createStatement();

	     
	     sql = "INSERT INTO "+TABLE+" (MID) " + " VALUES ('"+mid+"');";	                 	               	       		    		   
	     stmt.executeUpdate(sql);	    		     
	     stmt.close();
	     c.commit();
	     c.close();
	     System.out.println("insertion >>>>> enregistrement reussie!");
	   } catch ( Exception e ) {
	     System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	    // System.exit(0);
	     stmt.close();
	      c.close();
	        //connectiontobdd("insertion ","data base.db");
	   }
	  
	 }      
            
            
            public static  void inserttoMotivs(String bdd,String TABLE,String mid) throws SQLException
	 {
		    System.out.println("insertion!");

	   Connection c = null;
	   Statement stmt = null;
	   try {
	     Class.forName("org.sqlite.JDBC");
	     c = DriverManager.getConnection("jdbc:sqlite:"+bdd);
	     c.setAutoCommit(false);
	     System.out.println("insertion >>>>> ouverture de la base de donnÃ©e avec succÃ©s");
	     String sql;
	     
	     stmt = c.createStatement();

	     
	     sql = "INSERT INTO "+TABLE+" (MID) " + " VALUES ('"+mid+"');";	                 	               	       		    		   
	     stmt.executeUpdate(sql);	    		     
	     stmt.close();
	     c.commit();
	     c.close();
	     System.out.println("insertion >>>>> enregistrement reussie!");
	   } catch ( Exception e ) {
	     System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	    // System.exit(0);
	     stmt.close();
	      c.close();
	        //connectiontobdd("insertion ","data base.db");
	   }
	  
	 }       
	
	
		 public static void createTable(String bdd,String TABLE1,String TABLE2,String TABLE3,String TABLE4) throws SQLException
		  {
			    System.out.println("creation de la table!");

		    Connection c = null;
		    Statement stmt = null;
		    try {
		      Class.forName("org.sqlite.JDBC");
		      c = DriverManager.getConnection("jdbc:sqlite:"+bdd);
		      System.out.println("creation de la table >>>>> ouverture de la base de donnÃ©e avec succÃ©s");

		      stmt = c.createStatement();
		     String sql = "CREATE TABLE "+TABLE1 +
		                   "(ID           STRING  PRIMARY KEY     NOT NULL    ," +
		                   " MID           STRING   NOT NULL , " +
		                   " NAME           STRING   NOT NULL , " +
		                   " PRENAME           STRING   NOT NULL ,"+
                                   " NOMRUE           STRING   NOT NULL ,"+
                                   " DOB           STRING   NOT NULL ,"+
                                   "TELEPHONE           STRING  )"; 
		      stmt.executeUpdate(sql);
		      stmt.close();
		      c.close();
			  System.out.println("creation de la table "+TABLE1+">>>>> creation de la table reussie!");

		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		     // System.exit(0);
		      stmt.close();
		      c.close();
		    }
                    
                    
                    
                    ////////////////////////////////////////////////////////////////////////////////////////
                    
                    try {
		      Class.forName("org.sqlite.JDBC");
		      c = DriverManager.getConnection("jdbc:sqlite:"+bdd);
		      System.out.println("creation de la table >>>>> ouverture de la base de donnÃ©e avec succÃ©s");

		      stmt = c.createStatement();
		     String sql = "CREATE TABLE "+TABLE3 +
		                   "(ID           STRING  PRIMARY KEY     NOT NULL    ," +
		                   " DKEY           STRING   NOT NULL " +
		                   "  )"; 
		      stmt.executeUpdate(sql);
		      stmt.close();
		      c.close();
			  System.out.println("creation de la table "+TABLE3+">>>>> creation de la table reussie!");

		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		     // System.exit(0);
		      stmt.close();
		      c.close();
		    }
                    
                    
                    
                    ////////////////////////////////////////////////////////////////////////////////////////
                    
                    try {
		      Class.forName("org.sqlite.JDBC");
		      c = DriverManager.getConnection("jdbc:sqlite:"+bdd);
		      System.out.println("creation de la table >>>>> ouverture de la base de donnÃ©e avec succÃ©s");

		      stmt = c.createStatement();
		     String sql = "CREATE TABLE "+TABLE4 +
		                   "(ID           STRING  PRIMARY KEY     NOT NULL    ," +
		                   " TIMER           STRING   NOT NULL " +
		                   "  )"; 
		      stmt.executeUpdate(sql);
		      stmt.close();
		      c.close();
			  System.out.println("creation de la table "+TABLE4+">>>>> creation de la table reussie!");

		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		     // System.exit(0);
		      stmt.close();
		      c.close();
		    }
                    
		  }
		
		
		
		 
		 
		 public static void createTableCards(String bdd,String TABLE2) throws SQLException
		  {
		 ///////////////////CARDS /////////////////////////////////////////////////////////////////////
                    System.out.println(">>>>> creation de la table des cartes!");

		    Connection c = null;
		    Statement stmt = null;
                    try {
		      Class.forName("org.sqlite.JDBC");
		      c = DriverManager.getConnection("jdbc:sqlite:"+bdd);
		      System.out.println("creation de la table des cartes >>>>> ouverture de la base de donnÃ©e avec succÃ©s");

		      stmt = c.createStatement();
		     String sql = "CREATE TABLE "+TABLE2 +
		                   "(" +
		                   " MID           STRING   NOT NULL , " +		                   
                                   " CARD           BLOB"+
                                   "  )"; 
		      stmt.executeUpdate(sql);
		      stmt.close();
		      c.close();
			  System.out.println("creation de la table des cartes "+TABLE2+">>>>> creation de la table reussie!");

		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		     // System.exit(0);
		      stmt.close();
		      c.close();
		    }
		 
                  }
		 
                 
                 
                 ///passports
                 public static void createTablePassports(String bdd,String TABLE2) throws SQLException
		  {
		 ///////////////////passports /////////////////////////////////////////////////////////////////////
                    System.out.println(">>>>> creation de la table des cartes!");

		    Connection c = null;
		    Statement stmt = null;
                    try {
		      Class.forName("org.sqlite.JDBC");
		      c = DriverManager.getConnection("jdbc:sqlite:"+bdd);
		      System.out.println("creation de la table des cartes >>>>> ouverture de la base de donnÃ©e avec succÃ©s");

		      stmt = c.createStatement();
		     String sql = "CREATE TABLE "+TABLE2 +
		                   "(" +
		                   " MID           STRING   NOT NULL , " +		                   
                                   " PASSPORT           BLOB"+
                                   "  )"; 
		      stmt.executeUpdate(sql);
		      stmt.close();
		      c.close();
			  System.out.println("creation de la table des cartes "+TABLE2+">>>>> creation de la table reussie!");

		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		     // System.exit(0);
		      stmt.close();
		      c.close();
		    }
		 
                  }
                 
                 
                 
                 ///passports
                 public static void createTableMotivs(String bdd,String TABLE2) throws SQLException
		  {
		 ///////////////////passports /////////////////////////////////////////////////////////////////////
                    System.out.println(">>>>> creation de la table des cartes!");

		    Connection c = null;
		    Statement stmt = null;
                    try {
		      Class.forName("org.sqlite.JDBC");
		      c = DriverManager.getConnection("jdbc:sqlite:"+bdd);
		      System.out.println("creation de la table des cartes >>>>> ouverture de la base de donnÃ©e avec succÃ©s");

		      stmt = c.createStatement();
		     String sql = "CREATE TABLE "+TABLE2 +
		                   "(" +
		                   " MID           STRING   NOT NULL , " +		                   
                                   " MO           BLOB"+
                                   "  )"; 
		      stmt.executeUpdate(sql);
		      stmt.close();
		      c.close();
			  System.out.println("creation de la table des cartes "+TABLE2+">>>>> creation de la table reussie!");

		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		     // System.exit(0);
		      stmt.close();
		      c.close();
		    }
		 
                  }
                 
                 
                 
                 ///photos
                 public static void createTablePhotos(String bdd,String TABLE2) throws SQLException
		  {
		 ///////////////////photos /////////////////////////////////////////////////////////////////////
                    System.out.println(">>>>> creation de la table des cartes!");

		    Connection c = null;
		    Statement stmt = null;
                    try {
		      Class.forName("org.sqlite.JDBC");
		      c = DriverManager.getConnection("jdbc:sqlite:"+bdd);
		      System.out.println("creation de la table des cartes >>>>> ouverture de la base de donnÃ©e avec succÃ©s");

		      stmt = c.createStatement();
		     String sql = "CREATE TABLE "+TABLE2 +
		                   "(" +
		                   " MID           STRING   NOT NULL , " +		                   
                                   " PHOTO           BLOB"+
                                   "  )"; 
		      stmt.executeUpdate(sql);
		      stmt.close();
		      c.close();
			  System.out.println("creation de la table des cartes "+TABLE2+">>>>> creation de la table reussie!");

		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		     // System.exit(0);
		      stmt.close();
		      c.close();
		    }
		 
                  }
                 
                 
                                  ///cv
                 public static void createTableCVs(String bdd,String TABLE2) throws SQLException
		  {
		 ///////////////////cv /////////////////////////////////////////////////////////////////////
                    System.out.println(">>>>> creation de la table des cartes!");

		    Connection c = null;
		    Statement stmt = null;
                    try {
		      Class.forName("org.sqlite.JDBC");
		      c = DriverManager.getConnection("jdbc:sqlite:"+bdd);
		      System.out.println("creation de la table des cartes >>>>> ouverture de la base de donnÃ©e avec succÃ©s");

		      stmt = c.createStatement();
		     String sql = "CREATE TABLE "+TABLE2 +
		                   "(" +
		                   " MID           STRING   NOT NULL , " +		                   
                                   " CV           BLOB"+
                                   "  )"; 
		      stmt.executeUpdate(sql);
		      stmt.close();
		      c.close();
			  System.out.println("creation de la table des cartes "+TABLE2+">>>>> creation de la table reussie!");

		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		     // System.exit(0);
		      stmt.close();
		      c.close();
		    }
		 
                  }
                 
                 
                      ///cv
                 public static void createTableENs(String bdd,String TABLE2) throws SQLException
		  {
		 ///////////////////cv /////////////////////////////////////////////////////////////////////
                    System.out.println(">>>>> creation de la table des cartes!");

		    Connection c = null;
		    Statement stmt = null;
                    try {
		      Class.forName("org.sqlite.JDBC");
		      c = DriverManager.getConnection("jdbc:sqlite:"+bdd);
		      System.out.println("creation de la table des cartes >>>>> ouverture de la base de donnÃ©e avec succÃ©s");

		      stmt = c.createStatement();
		     String sql = "CREATE TABLE "+TABLE2 +
		                   "(" +
		                   " MID           STRING   NOT NULL , " +		                   
                                   " EN           BLOB"+
                                   "  )"; 
		      stmt.executeUpdate(sql);
		      stmt.close();
		      c.close();
			  System.out.println("creation de la table des cartes "+TABLE2+">>>>> creation de la table reussie!");

		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		     // System.exit(0);
		      stmt.close();
		      c.close();
		    }
		 
                  }
                 
                 
                 
                 
                 
                 ///cv
                 public static void createTableRCs(String bdd,String TABLE2) throws SQLException
		  {
		 ///////////////////cv /////////////////////////////////////////////////////////////////////
                    System.out.println(">>>>> creation de la table des cartes!");

		    Connection c = null;
		    Statement stmt = null;
                    try {
		      Class.forName("org.sqlite.JDBC");
		      c = DriverManager.getConnection("jdbc:sqlite:"+bdd);
		      System.out.println("creation de la table des cartes >>>>> ouverture de la base de donnÃ©e avec succÃ©s");

		      stmt = c.createStatement();
		     String sql = "CREATE TABLE "+TABLE2 +
		                   "(" +
		                   " MID           STRING   NOT NULL , " +		                   
                                   " RC           BLOB"+
                                   "  )"; 
		      stmt.executeUpdate(sql);
		      stmt.close();
		      c.close();
			  System.out.println("creation de la table des cartes "+TABLE2+">>>>> creation de la table reussie!");

		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		     // System.exit(0);
		      stmt.close();
		      c.close();
		    }
		 
                  }
		 
                 
                 
		 
	                ///om
                 public static void createTableOMs(String bdd,String TABLE2) throws SQLException
		  {
		 ///////////////////photos /////////////////////////////////////////////////////////////////////
                    System.out.println(">>>>> creation de la table des cartes!");

		    Connection c = null;
		    Statement stmt = null;
                    try {
		      Class.forName("org.sqlite.JDBC");
		      c = DriverManager.getConnection("jdbc:sqlite:"+bdd);
		      System.out.println("creation de la table des cartes >>>>> ouverture de la base de donnÃ©e avec succÃ©s");

		      stmt = c.createStatement();
		     String sql = "CREATE TABLE "+TABLE2 +
		                   "(" +
		                   " MID           STRING   NOT NULL , " +                             
		                   " NAME           STRING, " +
		                   " PRENAME           STRING, " +
                                   " OM           STRING"+
                                   "  )"; 
		      stmt.executeUpdate(sql);
		      stmt.close();
		      c.close();
			  System.out.println("creation de la table des cartes "+TABLE2+">>>>> creation de la table reussie!");

		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		     // System.exit(0);
		      stmt.close();
		      c.close();
		    }
		 
                  }
                 
                 
		 // afficher tout les elements de la table
                 public static int ids=0;
		static void selectallfromtable(String bdd,String TABLE) throws SQLException, ClassNotFoundException
		  {ids=0;
			    System.out.println("affichage!");
		    Connection c = null;
		    Statement stmt = null;
		    try {
		      Class.forName("org.sqlite.JDBC");
		      c = DriverManager.getConnection("jdbc:sqlite:"+bdd);
		      c.setAutoCommit(false);
		      System.out.println("affichage >>>>> ouverture de la base de donnÃ©e avec succÃ©s");

		      stmt = c.createStatement();
		     
		      ResultSet rs = stmt.executeQuery( "SELECT * FROM "+TABLE+";" ); 
		         System.out.println("---------------------"+TABLE+"----------------------");
                         DefaultTableModel model =(DefaultTableModel) UI.jTable1.getModel();
                         model.setRowCount(0);
		      while ( rs.next() ) {
		         String id = rs.getString("id");
		         String  nom = rs.getString("name");
                         String  prenom = rs.getString("prename");
		         String  dob  = rs.getString("dob");
                         String  telephone  = rs.getString("telephone");
                         
		         System.out.println(id+" "+nom+" "+prenom+" "+dob+" "+telephone);
                         
                         
        model.addRow(new Object[]{ id,nom,prenom,dob ,telephone });
		      
                      ids++;}
                      ids++;
		         System.out.println("----------------------------------------------------");

		      rs.close();
		      stmt.close();
		      c.close();
			    System.out.println("affichage >>>>> affichage terminÃ©");

		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		     // System.exit(0);
		      stmt.close();
		      c.close();
		    }
		  }
		 
		 
	public static void selectallCards(String bdd,String TABLE) throws SQLException, ClassNotFoundException
		  {
			    System.out.println("affichage!");
		    Connection c = null;
		    Statement stmt = null;
		    try {
		      Class.forName("org.sqlite.JDBC");
		      c = DriverManager.getConnection("jdbc:sqlite:"+bdd);
		      c.setAutoCommit(false);
		      System.out.println("affichage >>>>> ouverture de la base de donnÃ©e avec succÃ©s");

		      stmt = c.createStatement();
		     
		     ResultSet rs = stmt.executeQuery( "SELECT * FROM "+TABLE+" WHERE ID='0"+"';" ); 
		         System.out.println("---------------------"+TABLE+"----------------------");                        
		      while ( rs.next() ) {
		         String id = rs.getString("id");
		          byte[]  nom = rs.getBytes("card");                                                
		         System.out.println(id+" "+nom);

		      
                      }
                      
		         System.out.println("----------------------------------------------------");

		      rs.close();
		      stmt.close();
		      c.close();
			    System.out.println("affichage >>>>> affichage terminÃ©");

		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		     // System.exit(0);
		      stmt.close();
		      c.close();
		    }
		  }
		  
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		public static String id="";
		public static          String  nom="";
                         public static String  prenom="";
		         public static String  dob="" ;
                         public static String  telephone="";
                         public static String  mid="";


//affichage avec filtre
		 static void selectionDISP(String bdd,String TABLE) throws SQLException, ClassNotFoundException
		  {
			    System.out.println("affichage!");

		    Connection c = null;
		    Statement stmt = null;
		    try {
		      Class.forName("org.sqlite.JDBC");
		      c = DriverManager.getConnection("jdbc:sqlite:"+bdd);
		      c.setAutoCommit(false);
		      System.out.println("affichage filtrÃ© >>>>> ouverture de la base de donnÃƒÂ©e avec succÃ©s");

		      stmt = c.createStatement();
		      // ici le filtre 
		      int column = 0;
    // DefaultTableModel model =(DefaultTableModel) UI.jTable1.getModel();
int row = UI.jTable1.getSelectedRow();
String ID = UI.jTable1.getModel().getValueAt(row, column).toString();
                     System.out.println(ID);
		      ResultSet rs = stmt.executeQuery( "SELECT * FROM "+TABLE+" WHERE ID='"+ID+"';" );
		      System.out.println("---------------------"+TABLE+"----------------------");
                         //model.setRowCount(0);
		      while ( rs.next() ) {
		          id = rs.getString("id");
                           mid = rs.getString("mid");
		           nom = rs.getString("name");
                           prenom = rs.getString("prename");
		           dob  = rs.getString("dob");
                           telephone  = rs.getString("telephone");
		         //System.out.println(id+" "+name+" "+adresse+" "+specialitÃ©+" "+decision);
                         
                         
                         
                         System.out.println(nom);
        //model.addRow(new Object[]{ id,nom,prenom,dob ,telephone });
		      }
		      System.out.println("---------------------------------------------------");
		      rs.close();
		      stmt.close();
		      c.close();
		      System.out.println("affichage filtrÃ© >>>>>> affichage terminÃ© !");
                      
                      
		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		     // System.exit(0);
		      stmt.close();
		      c.close();
		    }
		    
		  }

                 
                 
                 
                 
                 public static String om="";
                 //affichage avec filtre
		 static void selectionDISPOM(String bdd,String TABLE,String MID) throws SQLException, ClassNotFoundException
		  {
                      om=" ";
			    System.out.println("affichage!");

		    Connection c = null;
		    Statement stmt = null;
		    try {
		      Class.forName("org.sqlite.JDBC");
		      c = DriverManager.getConnection("jdbc:sqlite:"+bdd);
		      c.setAutoCommit(false);
		      System.out.println("affichage filtrÃ© >>>>> ouverture de la base de donnÃƒÂ©e avec succÃ©s");

		      stmt = c.createStatement();
		      // ici le filtre 
		      ResultSet rs = stmt.executeQuery( "SELECT * FROM "+TABLE+" WHERE MID='"+MID+"';" );
		      System.out.println("---------------------"+TABLE+"----------------------");
                         //model.setRowCount(0);
		      if ( rs.next() ) {		          
                           om  = rs.getString("om");
		         //System.out.println(id+" "+name+" "+adresse+" "+specialitÃ©+" "+decision);                       
                         System.out.println(om);
        //model.addRow(new Object[]{ id,nom,prenom,dob ,telephone });
		      }
		      System.out.println("---------------------------------------------------");
		      rs.close();
		      stmt.close();
		      c.close();
		      System.out.println("affichage filtrÃ© >>>>>> affichage terminÃ© !");
                      
                      
		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		     // System.exit(0);
		      stmt.close();
		      c.close();
		    }
		    
		  }
                 
                 
/* 
		 ////////////////////////metre a jour la table
		 
		 public static void updatetable(String bdd,String name,String adresse,String specialitÃ©,String decision,String id,String TABLE) throws SQLException
		  {
			    System.out.println("mise a jour!");

		    Connection c = null;
		    Statement stmt = null;
		    try {
		      Class.forName("org.sqlite.JDBC");
		      c = DriverManager.getConnection("jdbc:sqlite:"+bdd);
		      c.setAutoCommit(false);
		      System.out.println("update >>>>> ouverture de la base de donnÃ©e avec succÃ©s");

		      stmt = c.createStatement();
		     // String sql = "UPDATE COMPANY set SALARY = 25000.00 where ID=1;";	              
	             // String sql = "UPDATE BDD_TABLE set ID ="+Custumer.getText()+"where ID="+(String) (jTable1.getValueAt(jTable1.getSelectedRow(), 0))+";";
	             //String sql = "UPDATE "+TABLE+" SET NAME = '"+name+"' WHERE ID = '"+id+"';";
	            //stmt.executeUpdate(sql);
		      //c.commit();
	              	             
	             String sql = "UPDATE "+TABLE+" SET DECISION = '"+decision+"' WHERE ID = '"+id+"';";
	             stmt.executeUpdate(sql);
		      c.commit();
	              
			    System.out.println("update >>>>> mise a jour terminÃ©e avec succÃ©s!");

		    
		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      stmt.close();
		      c.close();
		      //System.exit(0);
		    }
		  }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		//////delete from table 
		 
		 public static  void deletefromtable(String bdd,String TABLE ,String ID ) throws SQLException
		  {
			    System.out.println("suppresion!");

		   Connection c = null;
		    Statement stmt = null;
		    try {
		      Class.forName("org.sqlite.JDBC");
		      c = DriverManager.getConnection("jdbc:sqlite:"+bdd);
		      c.setAutoCommit(false);
		      System.out.println("delete >>>>>> ouverture de la base de donnÃ©e avec succÃ©s");

		     stmt = c.createStatement();
	              
	              
	              System.out.println(ID);
		      String sql = "DELETE from "+TABLE+" where ID = '"+ID+"';";
		      stmt.executeUpdate(sql);
		      c.commit();
		      stmt.close();
		      c.close();
			    System.out.println("delete >>>>>> suppression terminÃ©e avec succÃ©s");

		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      stmt.close();
		      c.close();
		     // System.exit(0);
		    }
		  }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		*/ 
	public static void connectiontobdd(String demandeur,String bdd )
	  {
		    System.out.println(demandeur+" >>>>> connection a "+bdd+" en cours...");

	    Connection c = null; 
	   
	    try {
	      Class.forName("org.sqlite.JDBC");
	     
	      c = DriverManager.getConnection("jdbc:sqlite:"+bdd);
	      
	      System.out.println(demandeur+">>>>>> Connection reussie! "+bdd+" disponible!");
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      //System.exit(0);
	    }
	    
	    
	  
	  }
                 
                 /*
	public static void functions() throws SQLException {
		// TODO Auto-generated method stub
String db= "data base.db";
connectiontobdd("starting ",db);

//creation d'une nouvelle table
createTable(db,"table1");
//operation : insertion dans la table
//inserttobdd(db,"FADEL","ARC EN CIEL","ARC EN CIEL","35021","table1");
//affichage des donnÃ©es de la table
selectallfromtable(db,"table1");
//faire une recherche dans la table
selectionWithFilter(db,"table1");

//si necessaire  effacer et update
//deletefromtable(db,"table1" ,"30023" );
//updatetable(db,"table1","KADOUR", "JEANNE DARC", "SYSTEME INFORMATIQUE","35040" );
	*/
}


