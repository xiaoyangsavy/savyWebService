package telecom.mss.jt.cgfz;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import telecom.mss.jt.cg_cgfz.SICGFZSVRRETURNMESSAGEOUTSyn;
import telecom.mss.jt.cg_cgfz.SICGFZSVRRETURNMESSAGEOUTSynService;

/**
 * 物料反馈客户端
 * 
 * @author savy
 * @version create time：2017年8月8日 下午12:11:04
 */
public class FeedbackClient {

	final static int threadSize = 1;
	final static int loopSize = 10000;

	public static void main(String[] args) {

		for (int i = 0; i < threadSize; i++) {
			final int index = i;
			Thread timeThread = new Thread() {
				@Override
				public void run() {
					FeedbackClient.this.doInterface(index);
				}
			};
			timeThread.start();
		}
	}

	public static void doInterface(int index) {
		// 创建服务视图
		SICGFZSVRRETURNMESSAGEOUTSynService sicgfzsvrReturnMessageOutSynService = new SICGFZSVRRETURNMESSAGEOUTSynService();
		// 获取服务实现类
		SICGFZSVRRETURNMESSAGEOUTSyn sicgfzsvrReturnMessageOutSyn = sicgfzsvrReturnMessageOutSynService
				.getPort(SICGFZSVRRETURNMESSAGEOUTSyn.class);
		for (int i = 0; i < loopSize; i++) {
			long dataStart = System.currentTimeMillis();
			try {
				Date d = new Date();
				GregorianCalendar gc = new GregorianCalendar();
				gc.setTime(d);
				 if ((gc.get(gc.SECOND) == 0)) {
					 
				
				PROVIDER provider = new PROVIDER();
				COSTCENTERBASEINFO baseInfo = new COSTCENTERBASEINFO();

				String dataString = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
				String msgId = "FB-TestMaterialFeedback_MDM" + i + dataString;
				baseInfo.setMSGID(msgId);
				baseInfo.setSENDTIME("11111111111111");
				baseInfo.setSPROVINCE("99");
				baseInfo.setSSYSTEM("CG-CGFZ");
				baseInfo.setTSYSTEM("MDM");
				baseInfo.setSERVICENAME("OP_MaterialCreate");
				baseInfo.setTPROVINCE("99");
				baseInfo.setRETRY("1");
				provider.setBASEINFO(baseInfo);

				PROVIDERFEEDBACKMODEL message = new PROVIDERFEEDBACKMODEL();
				message.setMESSAGE("test");
				message.setTYPE("T");
				message.setZSQDID("111111");
				provider.setMESSAGE(message);

				// 调用查询方法，打印
				sicgfzsvrReturnMessageOutSyn.xxxMTMATERIALFEEDBACK(provider);
				System.out.println(index + "线程：第" + i + "次执行\n"+msgId);
				 }
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			long dataEnd = System.currentTimeMillis();
			System.out.println("执行时长:"
					+ (dataEnd - dataStart) / 1000.0 + "秒");
		}
	}
}
