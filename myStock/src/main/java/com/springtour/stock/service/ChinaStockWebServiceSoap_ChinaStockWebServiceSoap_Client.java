
package com.springtour.stock.service;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.3.1
 * Wed Aug 28 18:08:31 CST 2013
 * Generated source version: 2.3.1
 * 
 */

public final class ChinaStockWebServiceSoap_ChinaStockWebServiceSoap_Client {

    private static final QName SERVICE_NAME = new QName("http://WebXml.com.cn/", "ChinaStockWebService");

    private ChinaStockWebServiceSoap_ChinaStockWebServiceSoap_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = ChinaStockWebService.WSDL_LOCATION;
        if (args.length > 0) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        ChinaStockWebService ss = new ChinaStockWebService(wsdlURL, SERVICE_NAME);
        ChinaStockWebServiceSoap port = ss.getChinaStockWebServiceSoap();  
        
        {
        System.out.println("Invoking getStockImageByteByCode...");
        java.lang.String _getStockImageByteByCode_theStockCode = "";
        byte[] _getStockImageByteByCode__return = port.getStockImageByteByCode(_getStockImageByteByCode_theStockCode);
        System.out.println("getStockImageByteByCode.result=" + _getStockImageByteByCode__return);


        }
        {
        System.out.println("Invoking getStockInfoByCode...");
        java.lang.String _getStockInfoByCode_theStockCode = "";
        com.springtour.stock.service.ArrayOfString _getStockInfoByCode__return = port.getStockInfoByCode(_getStockInfoByCode_theStockCode);
        System.out.println("getStockInfoByCode.result=" + _getStockInfoByCode__return);


        }
        {
        System.out.println("Invoking getStockImageKByteByCode...");
        java.lang.String _getStockImageKByteByCode_theStockCode = "";
        java.lang.String _getStockImageKByteByCode_theType = "";
        byte[] _getStockImageKByteByCode__return = port.getStockImageKByteByCode(_getStockImageKByteByCode_theStockCode, _getStockImageKByteByCode_theType);
        System.out.println("getStockImageKByteByCode.result=" + _getStockImageKByteByCode__return);


        }
        {
        System.out.println("Invoking getStockImageKByCode...");
        java.lang.String _getStockImageKByCode_theStockCode = "";
        java.lang.String _getStockImageKByCode_theType = "";
        port.getStockImageKByCode(_getStockImageKByCode_theStockCode, _getStockImageKByCode_theType);


        }
        {
        System.out.println("Invoking getStockImageByCode...");
        java.lang.String _getStockImageByCode_theStockCode = "";
        port.getStockImageByCode(_getStockImageByCode_theStockCode);


        }

        System.exit(0);
    }

}
