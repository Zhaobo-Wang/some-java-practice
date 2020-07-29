package restaurant_sys_practice;

public class main {

	public static void main(String[] args) { 
		
		restaurant restaurant1 = new restaurant(33, " JiBaoSiChu " , 2);// 创建restaurant1的 用overloaded constructor
		
		restaurant restaurant2 = new restaurant(1280, " Mr.Gao " , 0);
		
		restaurant restaurant3 = new restaurant();//创建restaurant3的 用default constructor
		
		restaurant1.setAddress(1760);//更改restaurant1的地址
		
		restaurant2.setAddress(-740);//更改了一个小于零的地址，直接返回 error  ！
		
		System.out.println(restaurant1.toString());//返回   restaurant [address=1760, name= JiBaoSiChu , michelin_level=2]
		System.out.println(restaurant2.toString());//返回   restaurant [address=1280, name= Mr.Gao , michelin_level=0]
		System.out.println(restaurant3.toString());//返回   restaurant [address=0, name=null, michelin_level=0]
		
		restaurant1.printInfo();  // 返回 The michelin level is originally 2
		
		restaurant1.printInfo(3);  //返回 The micheline level now is changing from 2 to 3
		
	}

}
