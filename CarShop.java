package com.test;
/**
 * @功能：接口实现多态
 * @author Administrator
 *
 */
//汽车出售店
public class CarShop{
 	//收入
 	private int money=0;
	//卖出一部车
	public void sellCar(Car car){
		System.out.println("车型"+car.getName()+"单价"+car.getPrice());
		//增加卖出车售价的收入
		money+=car.getPrice();
	}
	//售车总输入
	public int getMoney(){
		return money;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarShop aShop=new CarShop();
		aShop.sellCar(new BMW());
		aShop.sellCar(new CheryQQ());
		System.out.println("总收入:"+aShop.getMoney());
	}
}
//汽车接口
interface Car{
	//汽车名称
	String getName();
	//获取汽车价格
	int getPrice();
	}
//宝马
class BMW implements Car{
	public String getName(){
		return "BMW";
		}
	public int getPrice() {
		return 300000;
		}
	}
//奇瑞QQ
class CheryQQ implements Car{

	public String getName() {
		// TODO Auto-generated method stub
		return "CheryQQ";
		}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 2000;
		}
	}
/*继承是多态得以实现的基础，从字面上理解，多态是一种类型（都是car类型）表现出多种状态
 * 将一个方法调用同这个方法所属的主体（也就是对象或类）关联起来叫做绑定，分前期绑定和后期绑定两种。
 * 1.前期绑定：在程序运行之前进行绑定，由编译器和连接程序实现，又叫静态绑定，比如static方法和
 * final方法，注意这里也包括private方法，因为它是隐式final的。
 * 2.后期绑定：在运行时根据对象的类型进行绑定，由方法调用机制实现，因此又叫动态绑定，
 * 多态就是在后期绑定这种机制上实现的。多态给我们带来的好处是消除了类之间的耦合关系，是程序更容易
 * 扩展。*/
