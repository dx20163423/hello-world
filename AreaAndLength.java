//求三角形，圆，梯形周长及面积的代码

class Trangle{
	//类三角形
	double SideA,SideB,SideC,area,length;   //边长、面积、周长
	boolean boo;    //判断是否是三角形
	
	public Trangle(double a,double b,double c){
		//构造三角形，并判断是否是三角形
		SideA=a;
		SideB=b;
		SideC=c;
		if(a+b>c&&a+c>b&&b+c>a){
			boo=true;
		}
		else{
		    boo=false;
	    }
	}
	
	double getLength(){
		//计算三角形的长度，如果不是三角形，输出不是三角形
		if(boo){
			length=SideA+SideB+SideC;
			return length;
		}
		else{
			System.out.println("not a trangle");
			return 0;
		}
	}
	
	public double getArea(){
		//计算三角形面积，如果不是三角形，输出不是三角形
		if(boo){
			double p=(SideA+SideB+SideC)/2.0;
			area=Math.sqrt(p*(p-SideA)*(p-SideB)*(p-SideC));
			return area;
		}
		else{
			System.out.println("not a trangle");
			return 0;
		}
	}
	
	public void setABC(double a,double b,double c){
		//设置三角形各边长度，判断是否是三角形
		SideA=a;SideB=b;SideC=c;
		if(a+b>c&&a+c>b&&b+c>a){
			boo=true;
		}
		else{
			boo=false;
		}
	}
}

class Lader{
	//梯形类
	double above,bottom,height,area;   //上底、下底、高、面积
	
	Lader(double a,double b,double h){
		//构造梯形
		above=a;
		bottom=b;
		height=h;
	}
	
	double getArea(){
		//计算梯形面积
		area=(above+bottom)/2*height;
		return area;
	}
}

class Circle{
	//圆类
	double radius,area;//半径、面积
	
	Circle(double r){
		//构造圆形
		radius=r;
	}
	
	double getArea(){
		//计算圆形面积
		return(3.14*radius*radius);
	}
	
	double getLength(){
		//计算圆形周长
		return(3.14*2*radius);
	}
	
	void setRadius(double newRadius){
		//设置圆形半径
		radius=newRadius;
	}
	double getRadius(){
		//获取圆形半径
		return radius;
	}
}

public class AreaAndLength{
	//面积、长度类
	public static void main(String args[]){
		//main函数
		double length,area;//周长面积
		
		Circle circle=null;
		Trangle trangle;
		Lader lader;
		
		//设置相应参数
		circle=new Circle(10);
		trangle=new Trangle(3,4,5);
		lader=new Lader(3,4,10);
		//计算周长面积
		length=trangle.getLength();
		System.out.println("圆的周长："+length);
		area=trangle.getArea();
		System.out.println("圆的面积"+area);
		length=trangle.getLength();
		System.out.println("三角形的周长："+length);
		area=trangle.getArea();
		System.out.println("三角形的面积："+area);
		area=lader.getArea();
		System.out.println("梯形的面积："+area);
		//测试输入的数据不能构成三角形时的情况
		trangle.setABC(12,34,1);
		area=trangle.getArea();
		System.out.println("三角形的面积："+area);
		length=trangle.getLength();
		System.out.println("三角形的周长："+length);
	}
}






