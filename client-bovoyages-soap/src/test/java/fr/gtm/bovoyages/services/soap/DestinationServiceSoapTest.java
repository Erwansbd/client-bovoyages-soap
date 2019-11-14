package fr.gtm.bovoyages.services.soap;

import static org.junit.Assert.*;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

import javax.xml.rpc.ServiceException;

import org.junit.Test;

public class DestinationServiceSoapTest {

	@Test
	public void DestinationsReduced() throws ServiceException, RemoteException {
		DestinationService service = new DestinationServiceServiceLocator().getDestinationServicePort();
		DestinationDTO[] destinations = service.getDestinationByReducedDatesVoyage();
		List<DestinationDTO> destinationsdto = Arrays.asList(destinations);
		assertTrue(destinationsdto.size()>0);
	}

}
