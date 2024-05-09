package generic;

public class Test1 {

	public static void main(String[] args) {
		System.out.println(Demo.b);
		
Demo x =new Demo();

x.a=45;//value we are changing of A
x.c=55;
x.c='&';
System.out.println(x.a);
x.test(x);

Demo<Integer,String> y=new Demo<Integer,String>();
y.a=78;
y.c=60;
y.d="ddcsac";
String v=y.test(67);
System.out.println(v);

//y.c="bca";

Demo<Character,Integer> z=new Demo<Character,Integer>();
z.a=56;
z.c='$';
z.d=67;
int f=z.test('&');
//z.c="velocity";
//System.out.println(z.c);




	}

}
