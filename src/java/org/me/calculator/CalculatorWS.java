/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/EjbWebService.java to edit this template
 */
package org.me.calculator;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
//import javax.ejb.Stateless;

/**
 *
 * @author Administrator
 */
@WebService(serviceName = "CalculatorWS")
//@Stateless()
public class CalculatorWS {

    
    @WebMethod(operationName = "add")
    public int add(@WebParam(name = "i") int i, @WebParam(name = "j") int j) {
        int k = i + j;
        return k;
    }
}
