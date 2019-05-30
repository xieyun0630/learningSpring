package top.xieyun.test.applicationContext;

public class TestBean {
	String name;
	String password;
	String address;
	public TestBean(String name) {
		super();
		System.out.println("这是姓名注入："+name);
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("这是姓名注入："+name);
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		System.out.println("这是密码注入："+password);
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		System.out.println("这是地址注入："+address);
		this.address = address;
	}
	@Override
	public String toString() {
		return "TestBean [name=" + name + ", password=" + password + ", address=" + address + "]";
	}
}
