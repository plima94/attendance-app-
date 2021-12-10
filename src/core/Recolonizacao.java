/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import db.DBWorker;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paulo Lima
 */
public class Recolonizacao {
    
    public void Recolonizar() throws ClassNotFoundException, IllegalAccessException, InstantiationException {

            String s="";
            String user = "root";
            String password = "";
            String baseDados = "registopresencas";
            String server = "127.0.0.1";           
            DBWorker db;      
            
            try{
                db = new DBWorker(server, user, password, baseDados);                
                s = "alter table formando AUTO_INCREMENT=1;";db.executeUpdate(s);
                s = "SET FOREIGN_KEY_CHECKS = 0";db.executeUpdate(s);
                s = "truncate table formando;";db.executeUpdate(s); 
                s = "INSERT INTO `registopresencas`.`formando` ( `Nome`, `Turma`) VALUES ('Tiago', 'A');";db.executeUpdate(s);
                
                s = "INSERT INTO `registopresencas`.`formando` ( `Nome`, `Turma`) VALUES ('Nuno', 'A');";db.executeUpdate(s);
                s = "INSERT INTO `registopresencas`.`formando` ( `Nome`, `Turma`) VALUES ('José', 'A');";db.executeUpdate(s);
                s = "INSERT INTO `registopresencas`.`formando` ( `Nome`, `Turma`) VALUES ('Marta', 'A');";db.executeUpdate(s);
                s = "INSERT INTO `registopresencas`.`formando` ( `Nome`, `Turma`) VALUES ('Aparício', 'A');";db.executeUpdate(s);
                s = "INSERT INTO `registopresencas`.`formando` ( `Nome`, `Turma`) VALUES ('Ana', 'A');";db.executeUpdate(s);
                s = "INSERT INTO `registopresencas`.`formando` ( `Nome`, `Turma`) VALUES ('Paulo', 'A');";db.executeUpdate(s);
                s = "INSERT INTO `registopresencas`.`formando` ( `Nome`, `Turma`) VALUES ('Ricardo', 'A');";db.executeUpdate(s);
                s = "INSERT INTO `registopresencas`.`formando` ( `Nome`, `Turma`) VALUES ('Maria', 'A');";db.executeUpdate(s);
                s = "INSERT INTO `registopresencas`.`formando` ( `Nome`, `Turma`) VALUES ('Irene', 'A');";db.executeUpdate(s);
                s = "INSERT INTO `registopresencas`.`formando` ( `Nome`, `Turma`) VALUES ('Joel', 'A');";db.executeUpdate(s);
                s = "INSERT INTO `registopresencas`.`formando` ( `Nome`, `Turma`) VALUES ('Hélder', 'A');";db.executeUpdate(s);
                s = "INSERT INTO `registopresencas`.`formando` ( `Nome`, `Turma`) VALUES ('Catarina', 'A');";db.executeUpdate(s);
            
             } catch (SQLException ex) {
                Logger.getLogger(Recolonizacao.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            try{
                db = new DBWorker(server, user, password, baseDados);                
                s = "alter table domínio AUTO_INCREMENT=1;";db.executeUpdate(s);
                s = "SET FOREIGN_KEY_CHECKS = 0";db.executeUpdate(s);
                s = "truncate table domínio;";db.executeUpdate(s); 
                s = "INSERT INTO `registopresencas`.`domínio` ( `Designacao`) VALUES ('JAVA');";db.executeUpdate(s);
                s = "INSERT INTO `registopresencas`.`domínio` ( `Designacao`) VALUES ('C++');";db.executeUpdate(s);
                s = "INSERT INTO `registopresencas`.`domínio` ( `Designacao`) VALUES ('INGLÊS');";db.executeUpdate(s);
                s = "INSERT INTO `registopresencas`.`domínio` ( `Designacao`) VALUES ('FRANCÊS');";db.executeUpdate(s);
                s = "INSERT INTO `registopresencas`.`domínio` ( `Designacao`) VALUES ('BASES DE DADOS');";db.executeUpdate(s);
                s = "INSERT INTO `registopresencas`.`domínio` ( `Designacao`) VALUES ('ENGENHARIA DE SOFTWARE');";db.executeUpdate(s);
                s = "INSERT INTO `registopresencas`.`domínio` ( `Designacao`) VALUES ('WEB');";db.executeUpdate(s);
                
              
            
             } catch (SQLException ex) {
                Logger.getLogger(Recolonizacao.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
    }
}
    
    
    
    

