
package br.org.credenciadora.scg.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import br.org.credenciadora.scg.webservice.dto.SCGRequest;
import br.org.credenciadora.scg.webservice.dto.SCGResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.org.credenciadora.scg.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ScgRequest_QNAME = new QName("http://webservice.scg.credenciadora.org.br", "scgRequest");
    private final static QName _ScgResponse_QNAME = new QName("http://webservice.scg.credenciadora.org.br", "scgResponse");
    private final static QName _Confirmation_QNAME = new QName("http://webservice.scg.credenciadora.org.br", "confirmation");
    private final static QName _Id_QNAME = new QName("http://webservice.scg.credenciadora.org.br", "id");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.org.credenciadora.scg.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SCGRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SCGRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.scg.credenciadora.org.br", name = "scgRequest")
    public JAXBElement<SCGRequest> createScgRequest(SCGRequest value) {
        return new JAXBElement<SCGRequest>(_ScgRequest_QNAME, SCGRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SCGResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SCGResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.scg.credenciadora.org.br", name = "scgResponse")
    public JAXBElement<SCGResponse> createScgResponse(SCGResponse value) {
        return new JAXBElement<SCGResponse>(_ScgResponse_QNAME, SCGResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.scg.credenciadora.org.br", name = "confirmation")
    public JAXBElement<String> createConfirmation(String value) {
        return new JAXBElement<String>(_Confirmation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.scg.credenciadora.org.br", name = "id")
    public JAXBElement<String> createId(String value) {
        return new JAXBElement<String>(_Id_QNAME, String.class, null, value);
    }

}
