package come.hspedu.encap;

public class Account {
	private String name;
	private double balance;
	private String pwd;
	public Account(){
		
	}
	public Account(String name,double balance,String pwd) {
		this.setName(name);
		this.setBalance(balance);
		this.setPwd(pwd);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length()>=2 && name.length()<=4) {
			this.name=name;
		}else {
			System.out.println("姓名要求，（长度为2位3位4位），默认名字“无名");
			this.name="无名";
		}
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
			if(balance>20) {
				this.balance=balance;
			}else {
				System.out.println("余额（必须>20）默认为0");
			}
		
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		if(pwd.length()==6) {
		this.pwd=pwd;
		}else {
			System.out.println("密码（必须是六位数）默认“000000");
			this.pwd="000000";
		}
	}
	public void showInfo() {
		System.out.println("账户信息name="+name+" 余额="+balance+" 密码="+pwd);
		}
}
