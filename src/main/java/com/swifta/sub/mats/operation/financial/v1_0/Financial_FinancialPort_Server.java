
package com.swifta.sub.mats.operation.financial.v1_0;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2014-11-16T13:20:51.330+01:00
 * Generated source version: 3.0.2
 * 
 */
 
public class Financial_FinancialPort_Server{

    protected Financial_FinancialPort_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new FinancialPortImpl();
        String address = "http://localhost:9090/FinancialPort";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new Financial_FinancialPort_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
