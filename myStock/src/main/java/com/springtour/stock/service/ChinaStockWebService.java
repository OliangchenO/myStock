
/*
 * 
 */

package com.springtour.stock.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.3.1
 * Wed Aug 28 18:08:31 CST 2013
 * Generated source version: 2.3.1
 * 
 */


@WebServiceClient(name = "ChinaStockWebService", 
                  wsdlLocation = "http://webservice.webxml.com.cn/WebServices/ChinaStockWebService.asmx?wsdl",
                  targetNamespace = "http://WebXml.com.cn/") 
public class ChinaStockWebService extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://WebXml.com.cn/", "ChinaStockWebService");
    public final static QName ChinaStockWebServiceSoap12 = new QName("http://WebXml.com.cn/", "ChinaStockWebServiceSoap12");
    public final static QName ChinaStockWebServiceSoap = new QName("http://WebXml.com.cn/", "ChinaStockWebServiceSoap");
    public final static QName ChinaStockWebServiceHttpPost = new QName("http://WebXml.com.cn/", "ChinaStockWebServiceHttpPost");
    public final static QName ChinaStockWebServiceHttpGet = new QName("http://WebXml.com.cn/", "ChinaStockWebServiceHttpGet");
    static {
        URL url = null;
        try {
            url = new URL("http://webservice.webxml.com.cn/WebServices/ChinaStockWebService.asmx?wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from http://webservice.webxml.com.cn/WebServices/ChinaStockWebService.asmx?wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public ChinaStockWebService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ChinaStockWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ChinaStockWebService() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     * 
     * @return
     *     returns ChinaStockWebServiceSoap
     */
    @WebEndpoint(name = "ChinaStockWebServiceSoap12")
    public ChinaStockWebServiceSoap getChinaStockWebServiceSoap12() {
        return super.getPort(ChinaStockWebServiceSoap12, ChinaStockWebServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ChinaStockWebServiceSoap
     */
    @WebEndpoint(name = "ChinaStockWebServiceSoap12")
    public ChinaStockWebServiceSoap getChinaStockWebServiceSoap12(WebServiceFeature... features) {
        return super.getPort(ChinaStockWebServiceSoap12, ChinaStockWebServiceSoap.class, features);
    }
    /**
     * 
     * @return
     *     returns ChinaStockWebServiceSoap
     */
    @WebEndpoint(name = "ChinaStockWebServiceSoap")
    public ChinaStockWebServiceSoap getChinaStockWebServiceSoap() {
        return super.getPort(ChinaStockWebServiceSoap, ChinaStockWebServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ChinaStockWebServiceSoap
     */
    @WebEndpoint(name = "ChinaStockWebServiceSoap")
    public ChinaStockWebServiceSoap getChinaStockWebServiceSoap(WebServiceFeature... features) {
        return super.getPort(ChinaStockWebServiceSoap, ChinaStockWebServiceSoap.class, features);
    }
    /**
     * 
     * @return
     *     returns ChinaStockWebServiceHttpPost
     */
    @WebEndpoint(name = "ChinaStockWebServiceHttpPost")
    public ChinaStockWebServiceHttpPost getChinaStockWebServiceHttpPost() {
        return super.getPort(ChinaStockWebServiceHttpPost, ChinaStockWebServiceHttpPost.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ChinaStockWebServiceHttpPost
     */
    @WebEndpoint(name = "ChinaStockWebServiceHttpPost")
    public ChinaStockWebServiceHttpPost getChinaStockWebServiceHttpPost(WebServiceFeature... features) {
        return super.getPort(ChinaStockWebServiceHttpPost, ChinaStockWebServiceHttpPost.class, features);
    }
    /**
     * 
     * @return
     *     returns ChinaStockWebServiceHttpGet
     */
    @WebEndpoint(name = "ChinaStockWebServiceHttpGet")
    public ChinaStockWebServiceHttpGet getChinaStockWebServiceHttpGet() {
        return super.getPort(ChinaStockWebServiceHttpGet, ChinaStockWebServiceHttpGet.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ChinaStockWebServiceHttpGet
     */
    @WebEndpoint(name = "ChinaStockWebServiceHttpGet")
    public ChinaStockWebServiceHttpGet getChinaStockWebServiceHttpGet(WebServiceFeature... features) {
        return super.getPort(ChinaStockWebServiceHttpGet, ChinaStockWebServiceHttpGet.class, features);
    }

}
