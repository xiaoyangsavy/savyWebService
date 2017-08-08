
package telecom.mss.jt.cgfz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EIAC_BACK_RESPONSE complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="EIAC_BACK_RESPONSE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BASEINFO" type="{urn:telecom:mss:jt:cgfz}EIAC_BACK_BASEINFO" minOccurs="0"/>
 *         &lt;element name="ITEMSTATUS" type="{urn:telecom:mss:jt:cgfz}itemStatus" minOccurs="0"/>
 *         &lt;element name="MESSAGE" type="{urn:telecom:mss:jt:cgfz}cgfzIfResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EIAC_BACK_RESPONSE", propOrder = {
    "baseinfo",
    "itemstatus",
    "message"
})
public class EIACBACKRESPONSE {

    @XmlElement(name = "BASEINFO")
    protected EIACBACKBASEINFO baseinfo;
    @XmlElement(name = "ITEMSTATUS")
    protected ItemStatus itemstatus;
    @XmlElement(name = "MESSAGE")
    protected CgfzIfResponse message;

    /**
     * ��ȡbaseinfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EIACBACKBASEINFO }
     *     
     */
    public EIACBACKBASEINFO getBASEINFO() {
        return baseinfo;
    }

    /**
     * ����baseinfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EIACBACKBASEINFO }
     *     
     */
    public void setBASEINFO(EIACBACKBASEINFO value) {
        this.baseinfo = value;
    }

    /**
     * ��ȡitemstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ItemStatus }
     *     
     */
    public ItemStatus getITEMSTATUS() {
        return itemstatus;
    }

    /**
     * ����itemstatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ItemStatus }
     *     
     */
    public void setITEMSTATUS(ItemStatus value) {
        this.itemstatus = value;
    }

    /**
     * ��ȡmessage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CgfzIfResponse }
     *     
     */
    public CgfzIfResponse getMESSAGE() {
        return message;
    }

    /**
     * ����message���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CgfzIfResponse }
     *     
     */
    public void setMESSAGE(CgfzIfResponse value) {
        this.message = value;
    }

}
