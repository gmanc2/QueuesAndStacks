package stack2;
import javax.swing.JOptionPane;
public class stack2
{
public static void main(String[] args) 
	{
		int selection;
		StackType stack =new StackType();
		selection= stack.menu();
		 while(selection !=5)
			{
			if(selection ==1)
				stack.push();
			else if(selection==2)
				stack.pop();
			else if(selection==3)
				stack.create_new();
			else if(selection ==4)
				stack.printall();
			selection=stack.menu();
			}
	   System.exit(0);
	}
}
class StackType extends stack_list_node
{
  stack_list_node first,last,current;
  String value,output;
 StackType( )
	{
		first = new stack_list_node();
		first.next=null; 
		first.previous=null;
		last=first;
		printall();
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
		current= new stack_list_node();
		value =JOptionPane.showInputDialog(null,
		"Enter new  number","Input Data",JOptionPane.QUESTION_MESSAGE);
		current.number=Integer.parseInt(value);
		current.next = null;
		current.previous=last;
		last.next=current;
		last=current;
		printall();
	}

	void pop()
	{
		if(first == last)
			JOptionPane.showMessageDialog(null,"there is nothing in the stack ","STACK OUTPUT:",
			JOptionPane.INFORMATION_MESSAGE);
		else
			{
			output="the number popped off is "+last.number;
			JOptionPane.showMessageDialog(null,output,"STACK OUTPUT:",
					JOptionPane.INFORMATION_MESSAGE);
		last=last.previous;
		}
		printall();
	}
	
	void create_new()
	{
		first = new stack_list_node();
		first.next=null; 
		first.previous=null;
		last=first;
		printall();
	}
	
	void printall()
	{
		output="";
		current=last;
		output="Contents of the Stack "+"\n";
		if(last==first)
		{
			output=output+"NOTHING IN STACK";
			JOptionPane.showMessageDialog(null,output,"STACK OUTPUT:",
					JOptionPane.INFORMATION_MESSAGE);
		}
		else
		{
		while(current.previous !=null)
			{
			output=output+current.number+"\n";
			current=current.previous;
			}
			JOptionPane.showMessageDialog(null,output,"STACK OUTPUT:",
					JOptionPane.INFORMATION_MESSAGE);
		}//else
  }
}
class stack_list_node
	{
    int number;
    stack_list_node previous,next;
	}
   