package queue1;

import javax.swing.JOptionPane;

public class stack1
{
	public static void main(String[] args) 
	{
		 StackType stack =new StackType();
		 int selection;
		selection=stack.menu();
		 while(selection !=5)
			{
			if(selection ==1)
				stack.push();
			else if(selection==2)
				stack.pop();
			else if(selection==3)
				stack.create_new();
			else if(selection==4)
				stack.printstack();
			selection=stack.menu();
			}//while loop
	System.exit(0);
	}
}

class  StackType
{
	int[]number= new int[10];
	int top,i;
	String value,output;

StackType( )
	{
	top = -1;
	printstack();
	}

int menu()
{
	int selection;
	String value;
	String output="STACK PROJECT"+"\n"+
		"1.  Push on Stack"+"\n"+
		"2.  Pop off Stack"+"\n"+
		"3.  Create new  Stack"+"\n"+
		"4.  Print entires in Stack "+"\n"+
		"5.  Exit "+"\n"+
		"Enter your selection >";
		value =JOptionPane.showInputDialog(null,
						        output,"Input Data",JOptionPane.QUESTION_MESSAGE);
		selection =Integer.parseInt(value);
		return selection;
}
		
void push()
	{	
	if(top==9)
		JOptionPane.showMessageDialog(null,"The stack is full ","STACK OUTPUT:",
				JOptionPane.INFORMATION_MESSAGE);
	else
	{
		top=top+1;
		value =JOptionPane.showInputDialog(null,
				"Enter new  number","Input Data",JOptionPane.QUESTION_MESSAGE);
				number[top]=Integer.parseInt(value);
	}
	printstack();
}

void pop()
	{
	if(top>=0)
		{
		output="the number popped off is "+number[top];
		JOptionPane.showMessageDialog(null,output,"STACK OUTPUT:",
						JOptionPane.INFORMATION_MESSAGE);
		top=top-1;
		}
	printstack();
	}

void create_new()
	{
	top=-1;
	printstack();
	}

void printstack()
	{
	output="Contents of the Stack "+"\n";
	if(top==-1)
		JOptionPane.showMessageDialog(null,"there is nothing in the stack ","STACK OUTPUT:",
				JOptionPane.INFORMATION_MESSAGE);
	else
		{
		 for (i=top;i>=0;--i)
		 	output=output+number[i]+"\n";
		 JOptionPane.showMessageDialog(null,output,"STACK OUTPUT:",
					JOptionPane.INFORMATION_MESSAGE);
		}
	 }
}