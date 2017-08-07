
package telecom.mss.jt.cg_cgfz;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the telecom.mss.jt.cg_cgfz package. 
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

    private final static QName _MTMATERIALFROZEN_QNAME = new QName("urn:telecom:mss:jt:cg-cgfz", "MT_MATERIAL_FROZEN");
    private final static QName _MTMATERIALCREATE_QNAME = new QName("urn:telecom:mss:jt:cg-cgfz", "MT_MATERIAL_CREATE");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: telecom.mss.jt.cg_cgfz
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTMATERIALCREATE }
     * 
     */
    public DTMATERIALCREATE createDTMATERIALCREATE() {
        return new DTMATERIALCREATE();
    }

    /**
     * Create an instance of {@link DTMATERIALCREATE.IREQUEST }
     * 
     */
    public DTMATERIALCREATE.IREQUEST createDTMATERIALCREATEIREQUEST() {
        return new DTMATERIALCREATE.IREQUEST();
    }

    /**
     * Create an instance of {@link DTMATERIALCREATE.IREQUEST.MESSAGE }
     * 
     */
    public DTMATERIALCREATE.IREQUEST.MESSAGE createDTMATERIALCREATEIREQUESTMESSAGE() {
        return new DTMATERIALCREATE.IREQUEST.MESSAGE();
    }

    /**
     * Create an instance of {@link DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT }
     * 
     */
    public DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT createDTMATERIALCREATEIREQUESTMESSAGEROOT() {
        return new DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT();
    }

    /**
     * Create an instance of {@link DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT.ITEM1 }
     * 
     */
    public DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT.ITEM1 createDTMATERIALCREATEIREQUESTMESSAGEROOTITEM1() {
        return new DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT.ITEM1();
    }

    /**
     * Create an instance of {@link DTMATERIALFROZEN }
     * 
     */
    public DTMATERIALFROZEN createDTMATERIALFROZEN() {
        return new DTMATERIALFROZEN();
    }

    /**
     * Create an instance of {@link DTMATERIALFROZEN.IREQUEST }
     * 
     */
    public DTMATERIALFROZEN.IREQUEST createDTMATERIALFROZENIREQUEST() {
        return new DTMATERIALFROZEN.IREQUEST();
    }

    /**
     * Create an instance of {@link DTMATERIALFROZEN.IREQUEST.MESSAGE }
     * 
     */
    public DTMATERIALFROZEN.IREQUEST.MESSAGE createDTMATERIALFROZENIREQUESTMESSAGE() {
        return new DTMATERIALFROZEN.IREQUEST.MESSAGE();
    }

    /**
     * Create an instance of {@link DTMATERIALFROZEN.IREQUEST.MESSAGE.ROOT }
     * 
     */
    public DTMATERIALFROZEN.IREQUEST.MESSAGE.ROOT createDTMATERIALFROZENIREQUESTMESSAGEROOT() {
        return new DTMATERIALFROZEN.IREQUEST.MESSAGE.ROOT();
    }

    /**
     * Create an instance of {@link DTBASEINFO }
     * 
     */
    public DTBASEINFO createDTBASEINFO() {
        return new DTBASEINFO();
    }

    /**
     * Create an instance of {@link DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT.ITEM1 .ITEM2 }
     * 
     */
    public DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT.ITEM1 .ITEM2 createDTMATERIALCREATEIREQUESTMESSAGEROOTITEM1ITEM2() {
        return new DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT.ITEM1 .ITEM2();
    }

    /**
     * Create an instance of {@link DTMATERIALFROZEN.IREQUEST.MESSAGE.ROOT.ITEM1 }
     * 
     */
    public DTMATERIALFROZEN.IREQUEST.MESSAGE.ROOT.ITEM1 createDTMATERIALFROZENIREQUESTMESSAGEROOTITEM1() {
        return new DTMATERIALFROZEN.IREQUEST.MESSAGE.ROOT.ITEM1();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTMATERIALFROZEN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:telecom:mss:jt:cg-cgfz", name = "MT_MATERIAL_FROZEN")
    public JAXBElement<DTMATERIALFROZEN> createMTMATERIALFROZEN(DTMATERIALFROZEN value) {
        return new JAXBElement<DTMATERIALFROZEN>(_MTMATERIALFROZEN_QNAME, DTMATERIALFROZEN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTMATERIALCREATE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:telecom:mss:jt:cg-cgfz", name = "MT_MATERIAL_CREATE")
    public JAXBElement<DTMATERIALCREATE> createMTMATERIALCREATE(DTMATERIALCREATE value) {
        return new JAXBElement<DTMATERIALCREATE>(_MTMATERIALCREATE_QNAME, DTMATERIALCREATE.class, null, value);
    }

}
