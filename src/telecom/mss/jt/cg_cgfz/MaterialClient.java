package telecom.mss.jt.cg_cgfz;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;

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
		while (true) {
			try {
				Date d = new Date();
				GregorianCalendar gc = new GregorianCalendar();
				gc.setTime(d);
				if ((gc.get(gc.SECOND) == 0) || (gc.get(gc.SECOND) == 30)) {
					i++;
					// 创建服务视图
					SIMDMSVRMATERIALINAsynService weatherInterfaceImplService = new SIMDMSVRMATERIALINAsynService();
					// 获取服务实现类
					SIMDMSVRMATERIALINAsyn weatherInterfaceImpl = weatherInterfaceImplService
							.getPort(SIMDMSVRMATERIALINAsyn.class);

					DTMATERIALCREATE materialRoot = new DTMATERIALCREATE();
					DTMATERIALCREATE.IREQUEST irequest = new DTMATERIALCREATE.IREQUEST();

					DTBASEINFO baseInfo = new DTBASEINFO();
					String dataString = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
					Random random = new Random();
					String msgId = "CG-TestMaterialCreate_MDM" + i + dataString + random.nextInt(10);
					baseInfo.setMSGID(msgId);
					baseInfo.setSENDTIME("11111111111111");
					baseInfo.setSPROVINCE("99");
					baseInfo.setSSYSTEM("CG-CGFZ");
					baseInfo.setTSYSTEM("MDM");
					baseInfo.setSERVICENAME("OP_MaterialCreate");
					baseInfo.setTPROVINCE("99");
					baseInfo.setRETRY("1");
					irequest.setBASEINFO(baseInfo);
					DTMATERIALCREATE.IREQUEST.MESSAGE message = new DTMATERIALCREATE.IREQUEST.MESSAGE();

					List<DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT> roots = new ArrayList<DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT>();
					DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT root = new DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT();
					root.setZSQDID("000001");
					List<DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT.ITEM1> item1s = new ArrayList<DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT.ITEM1>();
					DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT.ITEM1 item1 = new DTMATERIALCREATE.IREQUEST.MESSAGE.ROOT.ITEM1();
					item1.setMATNR("J01010100751");
					item1.setSTATUS("C");
					item1.setMTART("WZ");
					item1.setMAKTX("test");
					item1.setMEINS("EA");
					item1.setPRDHA("050609");
					item1.setREMARK1("否");
					item1s.add(item1);
					root.setItem1(item1s);
					roots.add(root);
					message.setRoot(roots);
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
}
