package com.test;
/**
 * @���ܣ��ӿ�ʵ�ֶ�̬
 * @author Administrator
 *
 */
//�������۵�
public class CarShop{
 	//����
 	private int money=0;
	//����һ����
	public void sellCar(Car car){
		System.out.println("����"+car.getName()+"����"+car.getPrice());
		//�����������ۼ۵�����
		money+=car.getPrice();
	}
	//�۳�������
	public int getMoney(){
		return money;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarShop aShop=new CarShop();
		aShop.sellCar(new BMW());
		aShop.sellCar(new CheryQQ());
		System.out.println("������:"+aShop.getMoney());
	}
}
//�����ӿ�
interface Car{
	//��������
	String getName();
	//��ȡ�����۸�
	int getPrice();
	}
//����
class BMW implements Car{
	public String getName(){
		return "BMW";
		}
	public int getPrice() {
		return 300000;
		}
	}
//����QQ
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
/*�̳��Ƕ�̬����ʵ�ֵĻ���������������⣬��̬��һ�����ͣ�����car���ͣ����ֳ�����״̬
 * ��һ����������ͬ����������������壨Ҳ���Ƕ�����ࣩ�������������󶨣���ǰ�ڰ󶨺ͺ��ڰ����֡�
 * 1.ǰ�ڰ󶨣��ڳ�������֮ǰ���а󶨣��ɱ����������ӳ���ʵ�֣��ֽо�̬�󶨣�����static������
 * final������ע������Ҳ����private��������Ϊ������ʽfinal�ġ�
 * 2.���ڰ󶨣�������ʱ���ݶ�������ͽ��а󶨣��ɷ������û���ʵ�֣�����ֽж�̬�󶨣�
 * ��̬�����ں��ڰ����ֻ�����ʵ�ֵġ���̬�����Ǵ����ĺô�����������֮�����Ϲ�ϵ���ǳ��������
 * ��չ��*/
