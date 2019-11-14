package fr.gtm.bovoyages.services.soap;

public class DestinationServiceProxy implements fr.gtm.bovoyages.services.soap.DestinationService {
  private String _endpoint = null;
  private fr.gtm.bovoyages.services.soap.DestinationService destinationService = null;
  
  public DestinationServiceProxy() {
    _initDestinationServiceProxy();
  }
  
  public DestinationServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initDestinationServiceProxy();
  }
  
  private void _initDestinationServiceProxy() {
    try {
      destinationService = (new fr.gtm.bovoyages.services.soap.DestinationServiceServiceLocator()).getDestinationServicePort();
      if (destinationService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)destinationService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)destinationService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (destinationService != null)
      ((javax.xml.rpc.Stub)destinationService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public fr.gtm.bovoyages.services.soap.DestinationService getDestinationService() {
    if (destinationService == null)
      _initDestinationServiceProxy();
    return destinationService;
  }
  
  public fr.gtm.bovoyages.services.soap.DestinationDTO[] getDestinationByReducedDatesVoyage() throws java.rmi.RemoteException{
    if (destinationService == null)
      _initDestinationServiceProxy();
    return destinationService.getDestinationByReducedDatesVoyage();
  }
  
  public void orderVoyage(fr.gtm.bovoyages.services.soap.Voyage arg0) throws java.rmi.RemoteException{
    if (destinationService == null)
      _initDestinationServiceProxy();
    destinationService.orderVoyage(arg0);
  }
  
  
}