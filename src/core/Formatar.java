/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import javax.swing.JTable;

/**
 *
 * @author Paulo Lima
 */
public class Formatar {
    
    public void FormatarJtable1(JTable jTable1) {

        //ocultar a coluna 0:
        jTable1.getColumn("id").setMinWidth(0);
        jTable1.getColumn("id").setMaxWidth(0);
        jTable1.getColumn("id").setWidth(0);
        
       
        
//        
//        
//        
//        jTable1.getColumn("data_aula").setMinWidth(200);
//        jTable1.getColumn("data_aula").setMaxWidth(300);
//        jTable1.getColumn("data_aula").setWidth(200);
//        jTable1.getColumnModel().getColumn(1).setHeaderValue("Data");
//        
//        jTable1.getColumn("hora").setMinWidth(200);
//        jTable1.getColumn("hora").setMaxWidth(300);
//        jTable1.getColumn("hora").setWidth(200);
//        
          //FUNCIONA ATÉ AQUI  



//        jTable1.getColumn("formando.id").setMinWidth(200);
//        jTable1.getColumn("formando.id").setMaxWidth(300);
//        jTable1.getColumn("formando.id").setWidth(200);
        
//        jTable1.getColumn("Domínio_id").setMinWidth(200);
//        jTable1.getColumn("Domínio_id").setMaxWidth(300);
//        jTable1.getColumn("Domínio_id").setWidth(200);
        
    }
}

