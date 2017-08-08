
package telecom.mss.jt.cgfz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PURHCASE_ORDER_BACK_REQUEST complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="PURHCASE_ORDER_BACK_REQUEST">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BASEINFO" type="{urn:telecom:mss:jt:cgfz}COST_CENTER_BASEINFO" minOccurs="0"/>
 *         &lt;element name="MESSAGE" type="{urn:telecom:mss:jt:cgfz}PURHCASE_ORDER_BACK_MESSAGE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PURHCASE_ORDER_BACK_REQUEST", propOrder = {
    "baseinfo",
    "message"
})
public class PURHCASEORDERBACKREQUEST {

    @XmlElement(name = "BASEINFO")
    protected COSTCENTERBASEINFO baseinfo;
    @XmlElement(name = "MESSAGE")
    protected PURHCASEORDERBACKMESSAGE message;

    /**
     * ��ȡbaseinfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link COSTCENTERBASEINFO }
     *     
     */
    public COSTCENTERBASEINFO getBASEINFO() {
        return baseinfo;
    }

    /**
     * ����baseinfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link COSTCENTERBASEINFO }
     *     
     */
    public void setBASEINFO(COSTCENTERBASEINFO value) {
        this.baseinfo = value;
    }

    /**
     * ��ȡmessage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PURHCASEORDERBACKMESSAGE }
     *     
     */
    public PURHCASEORDERBACKMESSAGE getMESSAGE() {
        return message;
    }

    /**
     * ����message���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PURHCASEORDERBACKMESSAGE }
     *     
     */
    public void setMESSAGE(PURHCASEORDERBACKMESSAGE value) {
        this.message = value;
    }

}
