import java.util.*;
import java.awt.event.*;
import java.awt.*;

class cal{

Frame f;
Button c,cross,div,mult,add,sub,equ,b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b10,sakii;
TextField t,t2;
String s1=" ",s2,s3;
Double a,b,res;
cal(){
f=new Frame();
c=new Button("c");
cross=new Button("del");
div=new Button("/");
mult=new Button("x");
add=new Button("+");
sub=new Button("-");
equ=new Button("=");
b1=new Button("1");
b2=new Button("2");
b3=new Button("3");
b4=new Button("4");
b5=new Button("5");
b6=new Button("6");
b7=new Button("7");
b8=new Button("8");
b9=new Button("9");
b0=new Button("0");
b10=new Button(".");
sakii=new Button("Saketh");
t=new TextField("0");
t2=new TextField();
f.setVisible(true);
f.setSize(500,400);
f.setLayout(new GridLayout(7,7));
f.add(t);
f.add(t2);
f.add(c);
f.add(cross);
f.add(add);
f.add(sub);
f.add(mult);
f.add(div);
f.add(equ);
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(b5);
f.add(b6);
f.add(b7);
f.add(b8);
f.add(b9);
f.add(b0);
f.add(b10);
f.add(sakii);
b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent age)
{
     if(s1.equals(" ")){
	s1=b1.getLabel();
	t.setText(s1);
	}
	else{
     s2=b1.getLabel();
	s1=s1+s2;
	t.setText(s1);
	}
}

});
b2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent age)
{
	     if(s1.equals(" ")){
	s1=b2.getLabel();
	t.setText(s1);
	}
	else{
     s2=b2.getLabel();
	s1=s1+s2;
	t.setText(s1);
	}
}

});
b3.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent age)
{
     if(s1.equals(" ")){
	s1=b3.getLabel();
	t.setText(s1);
	}
	else{
     s2=b3.getLabel();
	s1=s1+s2;
	t.setText(s1);
	}
}

});

b4.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent age)
{
     if(s1.equals(" ")){
	s1=b4.getLabel();
	t.setText(s1);
	}
	else{
     s2=b4.getLabel();
	s1=s1+s2;
	t.setText(s1);
	}
}

});

b5.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent age)
{
          if(s1.equals(" ")){
	s1=b5.getLabel();
	t.setText(s1);
	}
	else{
     s2=b5.getLabel();
	s1=s1+s2;
	t.setText(s1);
	}
}

});

b6.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent age)
{
     if(s1.equals(" ")){
	s1=b6.getLabel();
	t.setText(s1);
	}
	else{
     s2=b6.getLabel();
	s1=s1+s2;
	t.setText(s1);
	}
}

});

b7.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent age)
{
       if(s1.equals(" ")){
	s1=b7.getLabel();
	t.setText(s1);
	}
	else{
     s2=b7.getLabel();
	s1=s1+s2;
	t.setText(s1);
	}
}

});

b8.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent age)
{
      if(s1.equals(" ")){
	s1=b8.getLabel();
	t.setText(s1);
	}
	else{
     s2=b8.getLabel();
	s1=s1+s2;
	t.setText(s1);
	}
}

});

b9.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent age)
{     
	if(s1.equals(" ")){
	s1=b9.getLabel();
	t.setText(s1);
	}
	else{
     s2=b9.getLabel();
	s1=s1+s2;
	t.setText(s1);
	}
}

});

b0.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent age)
{
      if(s1.equals(" ")){
	s1=b0.getLabel();
	t.setText(s1);
	}
	else{
     s2=b0.getLabel();
	s1=s1+s2;
	t.setText(s1);
	}
}

});
b10.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent age)
{
      if(s1.equals(" ")){
	s1=".";
	t.setText(s1);
	}
	else{
     s2=".";
	s1=s1+s2;
	t.setText(s1);
	}
}

});

add.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent age)
{
	try{
     a=Double.parseDouble(s1);
	t.setText("");
	s1="";
	t2.setText("+");
	s3="+";
	}
	catch(Exception e){}
}
});

sub.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent age)
{
   	try{
     a=Double.parseDouble(s1);
	t.setText("");
	s1="";
	t2.setText("-");
	s3="-";
	}
	catch(Exception e){}
}
});

div.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent age)
{
 	try{
     a=Double.parseDouble(s1);
	t.setText("");
	s1="";
	t2.setText("/");
	s3="/";
	}
	catch(Exception e){}
}
});

mult.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent age)
{	
	try{
     a=Double.parseDouble(s1);
	t.setText("");
	s1="";
	t2.setText("*");
	s3="*";
	}
	catch(Exception e){}
}
});

equ.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent age)
{
     b=Double.parseDouble(s1);
	if(s3.equals("+"))
	res=a+b;
	if(s3.equals("-"))
	res=a-b;
	if(s3.equals("*"))
	res=a*b;
	if(s3.equals("/"))
	res=a/b;
	t.setText(String.valueOf(res));
	t2.setText("");
	s1=" ";
}
});

c.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent age)
{
     try{
	t.setText("");
	s1="";
	}
	catch(Exception e){}
}
});

cross.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent age)
{
	try{
     	s1=s1.substring(0, s1.length() - 1);
	t.setText(s1);
	}
	catch(Exception e){}
	
}
});

f.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
});

}


public static void main(String args[]){
new cal();
}
}