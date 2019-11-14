/**
 * DestinationService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.gtm.bovoyages.services.soap;

public interface DestinationService extends java.rmi.Remote {
    public fr.gtm.bovoyages.services.soap.DestinationDTO[] getDestinationByReducedDatesVoyage() throws java.rmi.RemoteException;
    public void orderVoyage(fr.gtm.bovoyages.services.soap.Voyage arg0) throws java.rmi.RemoteException;
}
