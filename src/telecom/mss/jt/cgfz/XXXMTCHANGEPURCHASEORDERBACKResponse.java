
package telecom.mss.jt.cgfz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>XXX_MT_CHANGE_PURCHASE_ORDER_BACKResponse complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="XXX_MT_CHANGE_PURCHASE_ORDER_BACKResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E_RESPONSE" type="{urn:telecom:mss:jt:cgfz}EIAC_BACK_RESPONSE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XXX_MT_CHANGE_PURCHASE_ORDER_BACKResponse", propOrder = {
    "eresponse"
})
public class XXXMTCHANGEPURCHASEORDERBACKResponse {

    @XmlElement(name = "E_RESPONSE")
    protected EIACBACKRESPONSE eresponse;

    /**
     * ��ȡeresponse���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EIACBACKRESPONSE }
     *     
     */
    public EIACBACKRESPONSE getERESPONSE() {
        return eresponse;
    }

    /**
     * ����eresponse���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EIACBACKRESPONSE }
     *     
     */
    public void setERESPONSE(EIACBACKRESPONSE value) {
        this.eresponse = value;
    }

}
