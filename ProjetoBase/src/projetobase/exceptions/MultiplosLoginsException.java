/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobase.exceptions;

/**
 *
 * @author sticdev30
 */
public class MultiplosLoginsException
        extends Exception {

    public MultiplosLoginsException() {
    }

    public MultiplosLoginsException(String msg) {
        super(msg);
        //Encerrar todas as conexões
        
    }

    
    
}
