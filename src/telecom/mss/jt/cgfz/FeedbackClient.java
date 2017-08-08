package telecom.mss.jt.cgfz;

import telecom.mss.jt.cg_cgfz.SICGFZSVRRETURNMESSAGEOUTSyn;
import telecom.mss.jt.cg_cgfz.SICGFZSVRRETURNMESSAGEOUTSynService;

/**
 * 物料反馈客户端
 * 
 * @author savy
 * @version create time：2017年8月8日 下午12:11:04
 */
public class FeedbackClient {

	public static void main(String[] args) {
		// 创建服务视图
		SICGFZSVRRETURNMESSAGEOUTSynService sicgfzsvrReturnMessageOutSynService = new SICGFZSVRRETURNMESSAGEOUTSynService();
		// 获取服务实现类
		SICGFZSVRRETURNMESSAGEOUTSyn sicgfzsvrReturnMessageOutSyn = sicgfzsvrReturnMessageOutSynService
				.getPort(SICGFZSVRRETURNMESSAGEOUTSyn.class);
		for (int i = 630; i < 10000; i++) {
			try {
				PROVIDER provider = new PROVIDER();
				// 调用查询方法，打印
				sicgfzsvrReturnMessageOutSyn.xxxMTMATERIALFEEDBACK(provider);
				System.out.println(i + "次执行结束！");

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
