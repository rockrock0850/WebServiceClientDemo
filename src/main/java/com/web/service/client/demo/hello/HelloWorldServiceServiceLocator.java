/**
 * HelloWorldServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.web.service.client.demo.hello;

public class HelloWorldServiceServiceLocator extends org.apache.axis.client.Service implements com.web.service.client.demo.hello.HelloWorldServiceService {

    public HelloWorldServiceServiceLocator() {
    }


    public HelloWorldServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HelloWorldServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HelloWorldService
    private java.lang.String HelloWorldService_address = "http://localhost:8080/WebServiceServerDemo/services/HelloWorldService";

    public java.lang.String getHelloWorldServiceAddress() {
        return HelloWorldService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HelloWorldServiceWSDDServiceName = "HelloWorldService";

    public java.lang.String getHelloWorldServiceWSDDServiceName() {
        return HelloWorldServiceWSDDServiceName;
    }

    public void setHelloWorldServiceWSDDServiceName(java.lang.String name) {
        HelloWorldServiceWSDDServiceName = name;
    }

    public com.web.service.client.demo.hello.HelloWorldService getHelloWorldService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HelloWorldService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHelloWorldService(endpoint);
    }

    public com.web.service.client.demo.hello.HelloWorldService getHelloWorldService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.web.service.client.demo.hello.HelloWorldServiceSoapBindingStub _stub = new com.web.service.client.demo.hello.HelloWorldServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getHelloWorldServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHelloWorldServiceEndpointAddress(java.lang.String address) {
        HelloWorldService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.web.service.client.demo.hello.HelloWorldService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.web.service.client.demo.hello.HelloWorldServiceSoapBindingStub _stub = new com.web.service.client.demo.hello.HelloWorldServiceSoapBindingStub(new java.net.URL(HelloWorldService_address), this);
                _stub.setPortName(getHelloWorldServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("HelloWorldService".equals(inputPortName)) {
            return getHelloWorldService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://hello.demo.client.service.web.com", "HelloWorldServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://hello.demo.client.service.web.com", "HelloWorldService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("HelloWorldService".equals(portName)) {
            setHelloWorldServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
