/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.faete;

import com.sun.xml.ws.security.soap12.Header;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import javax.xml.ws.WebServiceProvider;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author sticdev30
 */
@WebService(serviceName = "NovoWebService")
@Stateless()
public class NovoWebService {

    Header header;

    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
}
