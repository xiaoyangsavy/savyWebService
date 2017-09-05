package telecom.mss.jt.cg_cgfz;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;

import telecom.mss.jt.cg_cgfz.DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT.ITEM1.ITEM2;

/**
 * 物料客户端
 * 
 * @author savy
 * @version create time：2017年8月7日 下午2:08:50
 */
public class MaterialClient extends Thread {

	public void run() {
		// for(int i=0;i<10000;i++){
		int i = 0;
		// 创建服务视图
		SIMDMSVRMATERIALINAsynService weatherInterfaceImplService = new SIMDMSVRMATERIALINAsynService();
		// 获取服务实现类
		SIMDMSVRMATERIALINAsyn weatherInterfaceImpl = weatherInterfaceImplService.getPort(SIMDMSVRMATERIALINAsyn.class);
		DTMATERIALCREATE.IREQUEST.MESSAGE message = this.getMessage();
		DTBASEINFO baseInfo = this.getBaseInfo();
		while (true) {
			try {
				Date d = new Date();
				GregorianCalendar gc = new GregorianCalendar();
				gc.setTime(d);
				 if ((gc.get(gc.SECOND) == 0)) {
//				if ((gc.get(gc.SECOND) == 0) || (gc.get(gc.SECOND) == 30)) {
					i++;
					DTMATERIALCREATE materialRoot = new DTMATERIALCREATE();
					DTMATERIALCREATE.IREQUEST irequest = new DTMATERIALCREATE.IREQUEST();

					String dataString = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
					Random random = new Random();
					String msgId = "CG-TestMaterialCreate_MDM" + i + dataString + random.nextInt(10);
					baseInfo.setMSGID(msgId);
					irequest.setBASEINFO(baseInfo);
					irequest.setMESSAGE(message);
					materialRoot.setIREQUEST(irequest);

					// 调用查询方法，打印
					weatherInterfaceImpl.opMaterialCreate(materialRoot);
					System.out.println(i + "次执行结束！");
					// Thread.sleep(12000);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		for (int i = 0; i < 1; i++) {
			MaterialClient t = new MaterialClient();
			t.start();
		}

	}

	public DTMATERIALCREATE.IREQUEST.MESSAGE getMessage() {
		DTMATERIALCREATE.IREQUEST.MESSAGE message = new DTMATERIALCREATE.IREQUEST.MESSAGE();

		List<DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT> roots = new ArrayList<DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT>();
		DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT root = new DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT();
		root.setZSQDID("000003");
		List<DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT.ITEM1> item1s = new ArrayList<DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT.ITEM1>();
		DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT.ITEM1 item1 = new DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT.ITEM1();
		item1.setMATNR("J00000000003");
		item1.setSTATUS("C");
		item1.setMTART("WZ");
		item1.setMAKTX("test");
		item1.setMEINS("EA");
		item1.setPRDHA("050609");
		item1.setREMARK1("否");

		List<ITEM2> item2s = new ArrayList<ITEM2>();
		ITEM2 item2 = new ITEM2();
		item2.setSTATUSPLANT("C");
		item2.setZPROVINCE("00");
		item2.setXCHPF("X");
		item2.setBKLAS("3001");
		item2.setQKLAS("6000");
		item2.setZPURTYPE1("省采");
		item2.setZSNACTIVEFLAG("X");
		item2.setVABME("1");
		item2s.add(item2);
		item1.setItem2(item2s);

		item1s.add(item1);
		root.setItem1(item1s);
		roots.add(root);
		message.setRoot(roots);

		return message;
	}

	public DTBASEINFO getBaseInfo() {
		DTBASEINFO baseInfo = new DTBASEINFO();
		baseInfo.setSENDTIME("11111111111111");
		baseInfo.setSPROVINCE("99");
		baseInfo.setSSYSTEM("CG-CGFZ");
		baseInfo.setTSYSTEM("MDM");
		baseInfo.setSERVICENAME("OP_MaterialCreate");
		baseInfo.setTPROVINCE("99");
		baseInfo.setRETRY("1");
		return baseInfo;
	}
}
