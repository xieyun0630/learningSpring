package top.xieyun.test.Listener;
import org.springframework.context.ApplicationEvent;

public class NewEvent extends ApplicationEvent{
	
	private String name;
	private String massage;
	public NewEvent(Object source, String name, String massage) {
		super(source);
		this.name = name;
		this.massage = massage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMassage() {
		return massage;
	}
	public void setMassage(String massage) {
		this.massage = massage;
	}
}
