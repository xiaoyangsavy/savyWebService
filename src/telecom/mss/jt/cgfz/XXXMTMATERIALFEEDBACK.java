
package telecom.mss.jt.cgfz;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>XXX_MT_MATERIAL_FEEDBACK complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="XXX_MT_MATERIAL_FEEDBACK">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="I_REQUEST" type="{urn:telecom:mss:jt:cgfz}PROVIDER" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XXX_MT_MATERIAL_FEEDBACK", propOrder = {
    "irequest"
})
public class XXXMTMATERIALFEEDBACK {

    @XmlElement(name = "I_REQUEST")
    protected PROVIDER irequest;

    /**
     * ��ȡirequest���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PROVIDER }
     *     
     */
    public PROVIDER getIREQUEST() {
        return irequest;
    }

    /**
     * ����irequest���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PROVIDER }
     *     
     */
    public void setIREQUEST(PROVIDER value) {
        this.irequest = value;
    }

}
