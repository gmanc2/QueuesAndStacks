package queue1;
import javax.swing.JOptionPane;
public class queue2
{
  public static void main(String[] args) 
	{
	QueueType queue =new QueueType();
	int selection;
		selection=queue.menu();
		 while(selection !=5)
			{
			if(selection ==1)
				queue.add_queue();
			else if(selection==2)
				queue.delete_queue();
			else if(selection==3)
				queue.print_queue();
			else if(selection ==4)
				queue.create_new();
		selection=queue.menu();
			}//while loop
		System.exit(0);
	}
}
		
class QueueType extends queue_node
{
queue_node first,current,last;
String output,value;

QueueType( )
{
first = new queue_node();
first.next=null; 
last=first;
print_queue();
}

int menu()
{
	int selection;
	String value;
	String output="QUEUE PROJECT"+"\n"+
		"1.  Add to the queue"+"\n"+
		"2.  Delete from the queue"+"\n"+
		"3.  Print values in the queue"+"\n"+
		"4.  Create a new queue "+"\n"+
		"5.  Exit "+"\n"+
		"Enter your selection >";
		value =JOptionPane.showInputDialog(null,
				        output,"Input Data",JOptionPane.QUESTION_MESSAGE);
		selection =Integer.parseInt(value);
		return selection;
}

void add_queue()
{
	current = new queue_node();
	value =JOptionPane.showInputDialog(null,
			"Enter new number","Input Data",JOptionPane.QUESTION_MESSAGE);
			current.number=Integer.parseInt(value);
	last.next=current;
	current.next =null;
	last = current;
	print_queue();
}

void delete_queue()
{
current=first.next;
if(current!=null)
	{
	output="Number deleted = "+current.number;
	JOptionPane.showMessageDialog(null,output,"QUEUE OUTPUT:",
			JOptionPane.INFORMATION_MESSAGE);
	first.next=current.next;
	}
if(first.next==null)
last=first;
print_queue();
}

void create_new()	
{
first = new queue_node();
first.next=null; 
last=first;
print_queue();
}

void print_queue()
{
	current=first.next;
	if (current==null)
		JOptionPane.showMessageDialog(null,"NO numbers in the Queue","QUEUE OUTPUT:",
				JOptionPane.INFORMATION_MESSAGE);
		else
			{
			output="Queue Contents"+"\n";
			while(current!=null)
			{
			output=output+current.number+"  ";
				current=current.next;
			}
			JOptionPane.showMessageDialog(null,output,"QUEUE OUTPUT:",
					JOptionPane.INFORMATION_MESSAGE);
			}
	}
}

class queue_node
{
 int number;
 queue_node next;
}