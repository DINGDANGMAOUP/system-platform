package kuroneko.fun.system.platform.monitor.util;

import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiRobotSendRequest;
import com.dingtalk.api.request.OapiRobotSendRequest.Link;
import com.dingtalk.api.request.OapiRobotSendRequest.Markdown;
import com.dingtalk.api.request.OapiRobotSendRequest.Text;
import com.dingtalk.api.response.OapiRobotSendResponse;
import com.taobao.api.ApiException;
import java.util.Arrays;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 * @author kuroneko
 */
@Component
public class DingTalkUtil {


  /**
   *  参考 https://developers.dingtalk.com/document/app/custom-robot-access/title-zob-eyu-qse
   */



  @Resource
  DingTalkClient dingTalkClient;
  @Resource
  OapiRobotSendRequest request;
  @Resource
  Text text;
  @Resource
  Link link;
  @Resource
  Markdown markdown;
  public void pushText() throws ApiException {

    request.setMsgtype("text");
    text.setContent("测试文本消息");
    request.setText(text);
    OapiRobotSendRequest.At at = new OapiRobotSendRequest.At();
    at.setAtMobiles(Arrays.asList("132xxxxxxxx"));
// isAtAll类型如果不为Boolean，请升级至最新SDK
    at.setIsAtAll(true);
    request.setAt(at);
    OapiRobotSendResponse response = dingTalkClient.execute(request);





  }
  public void pushLink() throws ApiException {
    request.setMsgtype("link");
    link.setMessageUrl("https://www.dingtalk.com/");
    link.setPicUrl("");
    link.setTitle("时代的火车向前开");
    link.setText("这个即将发布的新版本，创始人xx称它为红树林。而在此之前，每当面临重大升级，产品经理们都会取一个应景的代号，这一次，为什么是红树林");
    request.setLink(link);
    OapiRobotSendResponse response = dingTalkClient.execute(request);
  }
  public void pushMarkdown() throws ApiException {
    request.setMsgtype("markdown");
    markdown.setTitle("杭州天气");
    markdown.setText("#### 杭州天气 @156xxxx8827\n" +
        "> 9度，西北风1级，空气良89，相对温度73%\n\n" +
        "> ![screenshot](https://gw.alicdn.com/tfs/TB1ut3xxbsrBKNjSZFpXXcXhFXa-846-786.png)\n"  +
        "> ###### 10点20分发布 [天气](http://www.thinkpage.cn/) \n");
    request.setMarkdown(markdown);
    OapiRobotSendResponse response = dingTalkClient.execute(request);
  }
}
