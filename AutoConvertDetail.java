
//自动类型转换细节
public class AutoConvertDetail {
	
	//编写一个main方法
	public static void main(String[] args) {
		//有多种类型的数据混合运算时
		//系统首先自动将所有数据转换成容量大的那种数据类型，然后在进行计算
		int n1 = 10;//ok
		//float d1 = n1 + 1.1 ;//错误，n1 + 1.1 => 结果类型是double
		//double d1 = n1 + 1.1;//正确， n1 + 1.1 => 结果类型是double
		float d1 = n1 + 1.1F;//正确，n1 +1.1F => 结果类型是 float
		
		//当我们把精度（容量）大的数据类型赋值给精度（容量）小的数据类型时
		//就会报错，反之就会进行自动类型转换。
		
		//int n2 = 1.1; //错误 double -> int
		
		//(byte,short)和 char 之间不会相互自动转换
		//当把数赋给 byte 时，先判断该数是否在byte范围内，如果是就可以
		byte b1 = 10;//ok, -128 -127
		int n2 = 1;//n2是int
		//byte b2 = n2;//错误，原因：如果是变量赋值，判断类型
	}
}