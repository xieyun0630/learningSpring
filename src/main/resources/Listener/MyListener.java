package top.xieyun.test.Listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component(value="applicationContext.xml")
public class MyListener implements ApplicationListener{
	@Override
	public void onApplicationEvent(ApplicationEvent evt) {
		if(evt instanceof NewEvent){
			NewEvent newEvent=(NewEvent) evt;
			System.out.println(newEvent.getName());
			System.out.println(newEvent.getMassage());
		}
	}
}
