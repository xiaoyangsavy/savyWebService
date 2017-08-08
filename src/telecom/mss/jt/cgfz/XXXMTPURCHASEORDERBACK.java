
package telecom.mss.jt.cgfz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>XXX_MT_PURCHASE_ORDER_BACK complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="XXX_MT_PURCHASE_ORDER_BACK">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="I_REQUEST" type="{urn:telecom:mss:jt:cgfz}PURHCASE_ORDER_BACK_REQUEST" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XXX_MT_PURCHASE_ORDER_BACK", propOrder = {
    "irequest"
})
public class XXXMTPURCHASEORDERBACK {

    @XmlElement(name = "I_REQUEST")
    protected PURHCASEORDERBACKREQUEST irequest;

    /**
     * 获取irequest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PURHCASEORDERBACKREQUEST }
     *     
     */
    public PURHCASEORDERBACKREQUEST getIREQUEST() {
        return irequest;
    }

    /**
     * 设置irequest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PURHCASEORDERBACKREQUEST }
     *     
     */
    public void setIREQUEST(PURHCASEORDERBACKREQUEST value) {
        this.irequest = value;
    }

}
