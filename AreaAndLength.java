//�������Σ�Բ�������ܳ�������Ĵ���

class Trangle{
	//��������
	double SideA,SideB,SideC,area,length;   //�߳���������ܳ�
	boolean boo;    //�ж��Ƿ���������
	
	public Trangle(double a,double b,double c){
		//���������Σ����ж��Ƿ���������
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
		//���������εĳ��ȣ�������������Σ��������������
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
		//���������������������������Σ��������������
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
		//���������θ��߳��ȣ��ж��Ƿ���������
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
	//������
	double above,bottom,height,area;   //�ϵס��µס��ߡ����
	
	Lader(double a,double b,double h){
		//��������
		above=a;
		bottom=b;
		height=h;
	}
	
	double getArea(){
		//�����������
		area=(above+bottom)/2*height;
		return area;
	}
}

class Circle{
	//Բ��
	double radius,area;//�뾶�����
	
	Circle(double r){
		//����Բ��
		radius=r;
	}
	
	double getArea(){
		//����Բ�����
		return(3.14*radius*radius);
	}
	
	double getLength(){
		//����Բ���ܳ�
		return(3.14*2*radius);
	}
	
	void setRadius(double newRadius){
		//����Բ�ΰ뾶
		radius=newRadius;
	}
	double getRadius(){
		//��ȡԲ�ΰ뾶
		return radius;
	}
}

public class AreaAndLength{
	//�����������
	public static void main(String args[]){
		//main����
		double length,area;//�ܳ����
		
		Circle circle=null;
		Trangle trangle;
		Lader lader;
		
		//������Ӧ����
		circle=new Circle(10);
		trangle=new Trangle(3,4,5);
		lader=new Lader(3,4,10);
		//�����ܳ����
		length=trangle.getLength();
		System.out.println("Բ���ܳ���"+length);
		area=trangle.getArea();
		System.out.println("Բ�����"+area);
		length=trangle.getLength();
		System.out.println("�����ε��ܳ���"+length);
		area=trangle.getArea();
		System.out.println("�����ε������"+area);
		area=lader.getArea();
		System.out.println("���ε������"+area);
		//������������ݲ��ܹ���������ʱ�����
		trangle.setABC(12,34,1);
		area=trangle.getArea();
		System.out.println("�����ε������"+area);
		length=trangle.getLength();
		System.out.println("�����ε��ܳ���"+length);
	}
}






