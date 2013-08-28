package com.springtour.stock.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.3.1
 * Wed Aug 28 18:08:31 CST 2013
 * Generated source version: 2.3.1
 * 
 */
 
@WebService(targetNamespace = "http://WebXml.com.cn/", name = "ChinaStockWebServiceHttpGet")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ChinaStockWebServiceHttpGet {

    @WebResult(name = "base64Binary", targetNamespace = "http://WebXml.com.cn/", partName = "Body")
    @WebMethod
    public byte[] getStockImageByteByCode(
        @WebParam(partName = "theStockCode", name = "theStockCode", targetNamespace = "")
        java.lang.String theStockCode
    );

    @WebResult(name = "ArrayOfString", targetNamespace = "http://WebXml.com.cn/", partName = "Body")
    @WebMethod
    public ArrayOfString getStockInfoByCode(
        @WebParam(partName = "theStockCode", name = "theStockCode", targetNamespace = "")
        java.lang.String theStockCode
    );

    @WebResult(name = "base64Binary", targetNamespace = "http://WebXml.com.cn/", partName = "Body")
    @WebMethod(operationName = "getStockImage_kByteByCode")
    public byte[] getStockImageKByteByCode(
        @WebParam(partName = "theStockCode", name = "theStockCode", targetNamespace = "")
        java.lang.String theStockCode,
        @WebParam(partName = "theType", name = "theType", targetNamespace = "")
        java.lang.String theType
    );

    @WebMethod(operationName = "getStockImage_kByCode")
    public void getStockImageKByCode(
        @WebParam(partName = "theStockCode", name = "theStockCode", targetNamespace = "")
        java.lang.String theStockCode,
        @WebParam(partName = "theType", name = "theType", targetNamespace = "")
        java.lang.String theType
    );

    @WebMethod
    public void getStockImageByCode(
        @WebParam(partName = "theStockCode", name = "theStockCode", targetNamespace = "")
        java.lang.String theStockCode
    );
}
