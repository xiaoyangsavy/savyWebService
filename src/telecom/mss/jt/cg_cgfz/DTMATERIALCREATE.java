
package telecom.mss.jt.cg_cgfz;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DT_MATERIAL_CREATE complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DT_MATERIAL_CREATE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="I_REQUEST">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BASEINFO" type="{urn:telecom:mss:jt:cg-cgfz}DT_BASEINFO"/>
 *                   &lt;element name="MESSAGE">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ROOT" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ZSQD_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ITEM1" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="MATNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="MTART" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="MAKTX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="EXTTXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="MEINS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="MATKL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="PRDHA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="BISMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="REMARK1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="REMARK2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="REMARK3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="REMARK4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="REMARK5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="ITEM2" maxOccurs="unbounded">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="STATUS_PLANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="ZPROVINCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="WERKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="XCHPF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="BWTTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="BKLAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="QKLAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="PRCTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="ZPUR_TYPE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="ZSN_ACTIVE_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="GROES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="VABME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="REMARK1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="REMARK2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="REMARK3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="REMARK4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="REMARK5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_MATERIAL_CREATE", propOrder = {
    "irequest"
})
public class DTMATERIALCREATE {

    @XmlElement(name = "I_REQUEST", required = true)
    protected DTMATERIALCREATE.IREQUEST irequest;

    /**
     * ��ȡirequest���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DTMATERIALCREATE.IREQUEST }
     *     
     */
    public DTMATERIALCREATE.IREQUEST getIREQUEST() {
        return irequest;
    }

    /**
     * ����irequest���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DTMATERIALCREATE.IREQUEST }
     *     
     */
    public void setIREQUEST(DTMATERIALCREATE.IREQUEST value) {
        this.irequest = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="BASEINFO" type="{urn:telecom:mss:jt:cg-cgfz}DT_BASEINFO"/>
     *         &lt;element name="MESSAGE">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ROOT" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ZSQD_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ITEM1" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="MATNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="MTART" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="MAKTX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="EXTTXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="MEINS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="MATKL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="PRDHA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="BISMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="REMARK1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="REMARK2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="REMARK3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="REMARK4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="REMARK5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="ITEM2" maxOccurs="unbounded">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="STATUS_PLANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="ZPROVINCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="WERKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="XCHPF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="BWTTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="BKLAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="QKLAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="PRCTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="ZPUR_TYPE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="ZSN_ACTIVE_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="GROES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="VABME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="REMARK1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="REMARK2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="REMARK3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="REMARK4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="REMARK5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "baseinfo",
        "message"
    })
    public static class IREQUEST {

        @XmlElement(name = "BASEINFO", required = true)
        protected DTBASEINFO baseinfo;
        @XmlElement(name = "MESSAGE", required = true)
        protected DTMATERIALCREATE.IREQUEST.MESSAGE message;

        /**
         * ��ȡbaseinfo���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DTBASEINFO }
         *     
         */
        public DTBASEINFO getBASEINFO() {
            return baseinfo;
        }

        /**
         * ����baseinfo���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DTBASEINFO }
         *     
         */
        public void setBASEINFO(DTBASEINFO value) {
            this.baseinfo = value;
        }

        /**
         * ��ȡmessage���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DTMATERIALCREATE.IREQUEST.MESSAGE }
         *     
         */
        public DTMATERIALCREATE.IREQUEST.MESSAGE getMESSAGE() {
            return message;
        }

        /**
         * ����message���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DTMATERIALCREATE.IREQUEST.MESSAGE }
         *     
         */
        public void setMESSAGE(DTMATERIALCREATE.IREQUEST.MESSAGE value) {
            this.message = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ROOT" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ZSQD_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ITEM1" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="MATNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="MTART" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="MAKTX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="EXTTXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="MEINS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="MATKL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="PRDHA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="BISMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="REMARK1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="REMARK2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="REMARK3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="REMARK4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="REMARK5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="ITEM2" maxOccurs="unbounded">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="STATUS_PLANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="ZPROVINCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="WERKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="XCHPF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="BWTTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="BKLAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="QKLAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="PRCTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="ZPUR_TYPE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="ZSN_ACTIVE_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="GROES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="VABME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="REMARK1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="REMARK2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="REMARK3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="REMARK4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="REMARK5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "root"
        })
        public static class MESSAGE {

            @XmlElement(name = "ROOT", required = true)
            protected List<DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT> root;

            /**
             * Gets the value of the root property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the root property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getROOT().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT }
             * 
             * 
             */
            public List<DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT> getROOT() {
                if (root == null) {
                    root = new ArrayList<DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT>();
                }
                return this.root;
            }

            
            

			public void setRoot(List<DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT> root) {
				this.root = root;
			}




			/**
             * <p>anonymous complex type�� Java �ࡣ
             * 
             * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="ZSQD_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ITEM1" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="MATNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="MTART" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="MAKTX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="EXTTXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="MEINS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="MATKL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="PRDHA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="BISMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="REMARK1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="REMARK2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="REMARK3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="REMARK4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="REMARK5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="ITEM2" maxOccurs="unbounded">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="STATUS_PLANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="ZPROVINCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="WERKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="XCHPF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="BWTTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="BKLAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="QKLAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="PRCTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="ZPUR_TYPE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="ZSN_ACTIVE_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="GROES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="VABME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="REMARK1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="REMARK2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="REMARK3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="REMARK4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="REMARK5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "zsqdid",
                "item1"
            })
            public static class ROOT {

                @XmlElement(name = "ZSQD_ID")
                protected String zsqdid;
                @XmlElement(name = "ITEM1", required = true)
                protected List<DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT.ITEM1> item1;

                /**
                 * ��ȡzsqdid���Ե�ֵ��
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getZSQDID() {
                    return zsqdid;
                }

                /**
                 * ����zsqdid���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setZSQDID(String value) {
                    this.zsqdid = value;
                }

                /**
                 * Gets the value of the item1 property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the item1 property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getITEM1().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT.ITEM1 }
                 * 
                 * 
                 */
                public List<DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT.ITEM1> getITEM1() {
                    if (item1 == null) {
                        item1 = new ArrayList<DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT.ITEM1>();
                    }
                    return this.item1;
                }


				public void setItem1(List<DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT.ITEM1> item1) {
					this.item1 = item1;
				}


				/**
                 * <p>anonymous complex type�� Java �ࡣ
                 * 
                 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="MATNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="MTART" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="MAKTX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="EXTTXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="MEINS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="MATKL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="PRDHA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="BISMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="REMARK1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="REMARK2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="REMARK3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="REMARK4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="REMARK5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="ITEM2" maxOccurs="unbounded">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="STATUS_PLANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="ZPROVINCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="WERKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="XCHPF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="BWTTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="BKLAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="QKLAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="PRCTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="ZPUR_TYPE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="ZSN_ACTIVE_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="GROES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="VABME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="REMARK1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="REMARK2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="REMARK3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="REMARK4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="REMARK5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "status",
                    "matnr",
                    "mtart",
                    "maktx",
                    "exttxt",
                    "meins",
                    "matkl",
                    "prdha",
                    "bismt",
                    "remark1",
                    "remark2",
                    "remark3",
                    "remark4",
                    "remark5",
                    "item2"
                })
                public static class ITEM1 {

                    @XmlElement(name = "STATUS")
                    protected String status;
                    @XmlElement(name = "MATNR")
                    protected String matnr;
                    @XmlElement(name = "MTART")
                    protected String mtart;
                    @XmlElement(name = "MAKTX")
                    protected String maktx;
                    @XmlElement(name = "EXTTXT")
                    protected String exttxt;
                    @XmlElement(name = "MEINS")
                    protected String meins;
                    @XmlElement(name = "MATKL")
                    protected String matkl;
                    @XmlElement(name = "PRDHA")
                    protected String prdha;
                    @XmlElement(name = "BISMT")
                    protected String bismt;
                    @XmlElement(name = "REMARK1")
                    protected String remark1;
                    @XmlElement(name = "REMARK2")
                    protected String remark2;
                    @XmlElement(name = "REMARK3")
                    protected String remark3;
                    @XmlElement(name = "REMARK4")
                    protected String remark4;
                    @XmlElement(name = "REMARK5")
                    protected String remark5;
                    @XmlElement(name = "ITEM2", required = true)
                    protected List<DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT.ITEM1 .ITEM2> item2;

                    /**
                     * ��ȡstatus���Ե�ֵ��
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSTATUS() {
                        return status;
                    }

                    /**
                     * ����status���Ե�ֵ��
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSTATUS(String value) {
                        this.status = value;
                    }

                    /**
                     * ��ȡmatnr���Ե�ֵ��
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMATNR() {
                        return matnr;
                    }

                    /**
                     * ����matnr���Ե�ֵ��
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMATNR(String value) {
                        this.matnr = value;
                    }

                    /**
                     * ��ȡmtart���Ե�ֵ��
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMTART() {
                        return mtart;
                    }

                    /**
                     * ����mtart���Ե�ֵ��
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMTART(String value) {
                        this.mtart = value;
                    }

                    /**
                     * ��ȡmaktx���Ե�ֵ��
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMAKTX() {
                        return maktx;
                    }

                    /**
                     * ����maktx���Ե�ֵ��
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMAKTX(String value) {
                        this.maktx = value;
                    }

                    /**
                     * ��ȡexttxt���Ե�ֵ��
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEXTTXT() {
                        return exttxt;
                    }

                    /**
                     * ����exttxt���Ե�ֵ��
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEXTTXT(String value) {
                        this.exttxt = value;
                    }

                    /**
                     * ��ȡmeins���Ե�ֵ��
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMEINS() {
                        return meins;
                    }

                    /**
                     * ����meins���Ե�ֵ��
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMEINS(String value) {
                        this.meins = value;
                    }

                    /**
                     * ��ȡmatkl���Ե�ֵ��
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMATKL() {
                        return matkl;
                    }

                    /**
                     * ����matkl���Ե�ֵ��
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMATKL(String value) {
                        this.matkl = value;
                    }

                    /**
                     * ��ȡprdha���Ե�ֵ��
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPRDHA() {
                        return prdha;
                    }

                    /**
                     * ����prdha���Ե�ֵ��
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPRDHA(String value) {
                        this.prdha = value;
                    }

                    /**
                     * ��ȡbismt���Ե�ֵ��
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBISMT() {
                        return bismt;
                    }

                    /**
                     * ����bismt���Ե�ֵ��
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBISMT(String value) {
                        this.bismt = value;
                    }

                    /**
                     * ��ȡremark1���Ե�ֵ��
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getREMARK1() {
                        return remark1;
                    }

                    /**
                     * ����remark1���Ե�ֵ��
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setREMARK1(String value) {
                        this.remark1 = value;
                    }

                    /**
                     * ��ȡremark2���Ե�ֵ��
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getREMARK2() {
                        return remark2;
                    }

                    /**
                     * ����remark2���Ե�ֵ��
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setREMARK2(String value) {
                        this.remark2 = value;
                    }

                    /**
                     * ��ȡremark3���Ե�ֵ��
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getREMARK3() {
                        return remark3;
                    }

                    /**
                     * ����remark3���Ե�ֵ��
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setREMARK3(String value) {
                        this.remark3 = value;
                    }

                    /**
                     * ��ȡremark4���Ե�ֵ��
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getREMARK4() {
                        return remark4;
                    }

                    /**
                     * ����remark4���Ե�ֵ��
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setREMARK4(String value) {
                        this.remark4 = value;
                    }

                    /**
                     * ��ȡremark5���Ե�ֵ��
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getREMARK5() {
                        return remark5;
                    }

                    /**
                     * ����remark5���Ե�ֵ��
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setREMARK5(String value) {
                        this.remark5 = value;
                    }

					public void setItem2(List<DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT.ITEM1.ITEM2> item2) {
						this.item2 = item2;
					}

					/**
                     * Gets the value of the item2 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the item2 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getITEM2().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT.ITEM1 .ITEM2 }
                     * 
                     * 
                     */
                    public List<DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT.ITEM1 .ITEM2> getITEM2() {
                        if (item2 == null) {
                            item2 = new ArrayList<DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT.ITEM1 .ITEM2>();
                        }
                        return this.item2;
                    }


                    /**
                     * <p>anonymous complex type�� Java �ࡣ
                     * 
                     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="STATUS_PLANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="ZPROVINCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="WERKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="XCHPF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="BWTTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="BKLAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="QKLAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="PRCTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="ZPUR_TYPE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="ZSN_ACTIVE_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="GROES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="VABME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="REMARK1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="REMARK2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="REMARK3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="REMARK4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="REMARK5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "statusplant",
                        "zprovince",
                        "werks",
                        "xchpf",
                        "bwtty",
                        "bklas",
                        "qklas",
                        "prctr",
                        "zpurtype1",
                        "zsnactiveflag",
                        "groes",
                        "vabme",
                        "remark1",
                        "remark2",
                        "remark3",
                        "remark4",
                        "remark5"
                    })
                    public static class ITEM2 {

                        @XmlElement(name = "STATUS_PLANT")
                        protected String statusplant;
                        @XmlElement(name = "ZPROVINCE")
                        protected String zprovince;
                        @XmlElement(name = "WERKS")
                        protected String werks;
                        @XmlElement(name = "XCHPF")
                        protected String xchpf;
                        @XmlElement(name = "BWTTY")
                        protected String bwtty;
                        @XmlElement(name = "BKLAS")
                        protected String bklas;
                        @XmlElement(name = "QKLAS")
                        protected String qklas;
                        @XmlElement(name = "PRCTR")
                        protected String prctr;
                        @XmlElement(name = "ZPUR_TYPE1")
                        protected String zpurtype1;
                        @XmlElement(name = "ZSN_ACTIVE_FLAG")
                        protected String zsnactiveflag;
                        @XmlElement(name = "GROES")
                        protected String groes;
                        @XmlElement(name = "VABME")
                        protected String vabme;
                        @XmlElement(name = "REMARK1")
                        protected String remark1;
                        @XmlElement(name = "REMARK2")
                        protected String remark2;
                        @XmlElement(name = "REMARK3")
                        protected String remark3;
                        @XmlElement(name = "REMARK4")
                        protected String remark4;
                        @XmlElement(name = "REMARK5")
                        protected String remark5;

                        /**
                         * ��ȡstatusplant���Ե�ֵ��
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSTATUSPLANT() {
                            return statusplant;
                        }

                        /**
                         * ����statusplant���Ե�ֵ��
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSTATUSPLANT(String value) {
                            this.statusplant = value;
                        }

                        /**
                         * ��ȡzprovince���Ե�ֵ��
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getZPROVINCE() {
                            return zprovince;
                        }

                        /**
                         * ����zprovince���Ե�ֵ��
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setZPROVINCE(String value) {
                            this.zprovince = value;
                        }

                        /**
                         * ��ȡwerks���Ե�ֵ��
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getWERKS() {
                            return werks;
                        }

                        /**
                         * ����werks���Ե�ֵ��
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setWERKS(String value) {
                            this.werks = value;
                        }

                        /**
                         * ��ȡxchpf���Ե�ֵ��
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getXCHPF() {
                            return xchpf;
                        }

                        /**
                         * ����xchpf���Ե�ֵ��
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setXCHPF(String value) {
                            this.xchpf = value;
                        }

                        /**
                         * ��ȡbwtty���Ե�ֵ��
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getBWTTY() {
                            return bwtty;
                        }

                        /**
                         * ����bwtty���Ե�ֵ��
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setBWTTY(String value) {
                            this.bwtty = value;
                        }

                        /**
                         * ��ȡbklas���Ե�ֵ��
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getBKLAS() {
                            return bklas;
                        }

                        /**
                         * ����bklas���Ե�ֵ��
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setBKLAS(String value) {
                            this.bklas = value;
                        }

                        /**
                         * ��ȡqklas���Ե�ֵ��
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getQKLAS() {
                            return qklas;
                        }

                        /**
                         * ����qklas���Ե�ֵ��
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setQKLAS(String value) {
                            this.qklas = value;
                        }

                        /**
                         * ��ȡprctr���Ե�ֵ��
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPRCTR() {
                            return prctr;
                        }

                        /**
                         * ����prctr���Ե�ֵ��
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPRCTR(String value) {
                            this.prctr = value;
                        }

                        /**
                         * ��ȡzpurtype1���Ե�ֵ��
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getZPURTYPE1() {
                            return zpurtype1;
                        }

                        /**
                         * ����zpurtype1���Ե�ֵ��
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setZPURTYPE1(String value) {
                            this.zpurtype1 = value;
                        }

                        /**
                         * ��ȡzsnactiveflag���Ե�ֵ��
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getZSNACTIVEFLAG() {
                            return zsnactiveflag;
                        }

                        /**
                         * ����zsnactiveflag���Ե�ֵ��
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setZSNACTIVEFLAG(String value) {
                            this.zsnactiveflag = value;
                        }

                        /**
                         * ��ȡgroes���Ե�ֵ��
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getGROES() {
                            return groes;
                        }

                        /**
                         * ����groes���Ե�ֵ��
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setGROES(String value) {
                            this.groes = value;
                        }

                        /**
                         * ��ȡvabme���Ե�ֵ��
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getVABME() {
                            return vabme;
                        }

                        /**
                         * ����vabme���Ե�ֵ��
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setVABME(String value) {
                            this.vabme = value;
                        }

                        /**
                         * ��ȡremark1���Ե�ֵ��
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getREMARK1() {
                            return remark1;
                        }

                        /**
                         * ����remark1���Ե�ֵ��
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setREMARK1(String value) {
                            this.remark1 = value;
                        }

                        /**
                         * ��ȡremark2���Ե�ֵ��
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getREMARK2() {
                            return remark2;
                        }

                        /**
                         * ����remark2���Ե�ֵ��
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setREMARK2(String value) {
                            this.remark2 = value;
                        }

                        /**
                         * ��ȡremark3���Ե�ֵ��
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getREMARK3() {
                            return remark3;
                        }

                        /**
                         * ����remark3���Ե�ֵ��
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setREMARK3(String value) {
                            this.remark3 = value;
                        }

                        /**
                         * ��ȡremark4���Ե�ֵ��
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getREMARK4() {
                            return remark4;
                        }

                        /**
                         * ����remark4���Ե�ֵ��
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setREMARK4(String value) {
                            this.remark4 = value;
                        }

                        /**
                         * ��ȡremark5���Ե�ֵ��
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getREMARK5() {
                            return remark5;
                        }

                        /**
                         * ����remark5���Ե�ֵ��
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setREMARK5(String value) {
                            this.remark5 = value;
                        }

                    }

                }

            }

        }

    }

}
