/**
 * DestinationServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.gtm.bovoyages.services.soap;

public class DestinationServiceServiceLocator extends org.apache.axis.client.Service implements fr.gtm.bovoyages.services.soap.DestinationServiceService {

    public DestinationServiceServiceLocator() {
    }


    public DestinationServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DestinationServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DestinationServicePort
    private java.lang.String DestinationServicePort_address = "http://localhost:9080/bovoyages-ws/DestinationService";

    public java.lang.String getDestinationServicePortAddress() {
        return DestinationServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DestinationServicePortWSDDServiceName = "DestinationServicePort";

    public java.lang.String getDestinationServicePortWSDDServiceName() {
        return DestinationServicePortWSDDServiceName;
    }

    public void setDestinationServicePortWSDDServiceName(java.lang.String name) {
        DestinationServicePortWSDDServiceName = name;
    }

    public fr.gtm.bovoyages.services.soap.DestinationService getDestinationServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DestinationServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDestinationServicePort(endpoint);
    }

    public fr.gtm.bovoyages.services.soap.DestinationService getDestinationServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            fr.gtm.bovoyages.services.soap.DestinationServiceServiceSoapBindingStub _stub = new fr.gtm.bovoyages.services.soap.DestinationServiceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getDestinationServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDestinationServicePortEndpointAddress(java.lang.String address) {
        DestinationServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (fr.gtm.bovoyages.services.soap.DestinationService.class.isAssignableFrom(serviceEndpointInterface)) {
                fr.gtm.bovoyages.services.soap.DestinationServiceServiceSoapBindingStub _stub = new fr.gtm.bovoyages.services.soap.DestinationServiceServiceSoapBindingStub(new java.net.URL(DestinationServicePort_address), this);
                _stub.setPortName(getDestinationServicePortWSDDServiceName());
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
        if ("DestinationServicePort".equals(inputPortName)) {
            return getDestinationServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.services.bovoyages.gtm.fr/", "DestinationServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.services.bovoyages.gtm.fr/", "DestinationServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DestinationServicePort".equals(portName)) {
            setDestinationServicePortEndpointAddress(address);
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
