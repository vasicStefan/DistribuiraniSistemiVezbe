
package service;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.6
 * 2017-03-09T20:03:06.050+01:00
 * Generated source version: 3.1.6
 */

@WebFault(name = "rasporedFault", targetNamespace = "http://www.example.org/rasporedcasova/")
public class GetRasporedFault_Exception extends Exception {
    
    private service.RasporedFaultType rasporedFault;

    public GetRasporedFault_Exception() {
        super();
    }
    
    public GetRasporedFault_Exception(String message) {
        super(message);
    }
    
    public GetRasporedFault_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public GetRasporedFault_Exception(String message, service.RasporedFaultType rasporedFault) {
        super(message);
        this.rasporedFault = rasporedFault;
    }

    public GetRasporedFault_Exception(String message, service.RasporedFaultType rasporedFault, Throwable cause) {
        super(message, cause);
        this.rasporedFault = rasporedFault;
    }

    public service.RasporedFaultType getFaultInfo() {
        return this.rasporedFault;
    }
}
