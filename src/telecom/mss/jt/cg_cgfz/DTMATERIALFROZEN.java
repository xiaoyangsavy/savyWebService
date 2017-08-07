
package telecom.mss.jt.cg_cgfz;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DT_MATERIAL_FROZEN complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DT_MATERIAL_FROZEN">
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
 *                                                 &lt;element name="ZPROVINCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="MATNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="WERKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="DELET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "DT_MATERIAL_FROZEN", propOrder = {
    "irequest"
})
public class DTMATERIALFROZEN {

    @XmlElement(name = "I_REQUEST", required = true)
    protected DTMATERIALFROZEN.IREQUEST irequest;

    /**
     * ��ȡirequest���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DTMATERIALFROZEN.IREQUEST }
     *     
     */
    public DTMATERIALFROZEN.IREQUEST getIREQUEST() {
        return irequest;
    }

    /**
     * ����irequest���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DTMATERIALFROZEN.IREQUEST }
     *     
     */
    public void setIREQUEST(DTMATERIALFROZEN.IREQUEST value) {
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
     *                                       &lt;element name="ZPROVINCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="MATNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="WERKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="DELET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        protected DTMATERIALFROZEN.IREQUEST.MESSAGE message;

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
         *     {@link DTMATERIALFROZEN.IREQUEST.MESSAGE }
         *     
         */
        public DTMATERIALFROZEN.IREQUEST.MESSAGE getMESSAGE() {
            return message;
        }

        /**
         * ����message���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DTMATERIALFROZEN.IREQUEST.MESSAGE }
         *     
         */
        public void setMESSAGE(DTMATERIALFROZEN.IREQUEST.MESSAGE value) {
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
         *                             &lt;element name="ZPROVINCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="MATNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="WERKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="DELET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            protected List<DTMATERIALFROZEN.IREQUEST.MESSAGE.ROOT> root;

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
             * {@link DTMATERIALFROZEN.IREQUEST.MESSAGE.ROOT }
             * 
             * 
             */
            public List<DTMATERIALFROZEN.IREQUEST.MESSAGE.ROOT> getROOT() {
                if (root == null) {
                    root = new ArrayList<DTMATERIALFROZEN.IREQUEST.MESSAGE.ROOT>();
                }
                return this.root;
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
             *                   &lt;element name="ZPROVINCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="MATNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="WERKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="DELET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                protected List<DTMATERIALFROZEN.IREQUEST.MESSAGE.ROOT.ITEM1> item1;

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
                 * {@link DTMATERIALFROZEN.IREQUEST.MESSAGE.ROOT.ITEM1 }
                 * 
                 * 
                 */
                public List<DTMATERIALFROZEN.IREQUEST.MESSAGE.ROOT.ITEM1> getITEM1() {
                    if (item1 == null) {
                        item1 = new ArrayList<DTMATERIALFROZEN.IREQUEST.MESSAGE.ROOT.ITEM1>();
                    }
                    return this.item1;
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
                 *         &lt;element name="ZPROVINCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="MATNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="WERKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="DELET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "zprovince",
                    "status",
                    "matnr",
                    "werks",
                    "delet"
                })
                public static class ITEM1 {

                    @XmlElement(name = "ZPROVINCE")
                    protected String zprovince;
                    @XmlElement(name = "STATUS")
                    protected String status;
                    @XmlElement(name = "MATNR")
                    protected String matnr;
                    @XmlElement(name = "WERKS")
                    protected String werks;
                    @XmlElement(name = "DELET")
                    protected String delet;

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
                     * ��ȡdelet���Ե�ֵ��
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDELET() {
                        return delet;
                    }

                    /**
                     * ����delet���Ե�ֵ��
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDELET(String value) {
                        this.delet = value;
                    }

                }

            }

        }

    }

}
