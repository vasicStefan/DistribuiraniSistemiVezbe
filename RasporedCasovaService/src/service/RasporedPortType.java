package service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2017-03-05T01:23:44.173+01:00
 * Generated source version: 3.1.6
 * 
 */
@WebService(targetNamespace = "http://www.example.org/rasporedcasova/", name = "RasporedPortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface RasporedPortType {

    @WebMethod(action = "http://www.example.org/rasporedcasova/getRaspored")
    @WebResult(name = "rasporedResponse", targetNamespace = "http://www.example.org/rasporedcasova/", partName = "out")
    public RasporedResponseType getRaspored(
        @WebParam(partName = "in", name = "rasporedRequest", targetNamespace = "http://www.example.org/rasporedcasova/")
        RasporedRequestType in
    );
}
