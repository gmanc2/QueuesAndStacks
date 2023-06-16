package queue1;

import javax.swing.JOptionPane;

public class queue1 
{
 public static void main(String[] args) 
	{
	  int selection;
	  queue data =new queue();
	 selection =data.menu();
	 while(selection !=5)
	 	{
	  if(selection ==1)
	 	data.ADD_QUEUE();
	  else if(selection==2)
	 	data.DELETE_QUEUE();
	  else if(selection==3)
	 	 data.PRINT_QUEUE();
	  else if(selection==4)
		 	 data.NEW_QUEUE();
	  selection= data.menu();
	 }//while loop
	System.exit(0);
 }
}
 class queue
 {
 int[] number=new int[10];
 int head,tail,i;
 boolean empty;
 String value,output;
	 
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
 
	queue()
	 {
	 	head=0;
	 	tail=-1;
	 	empty=true;
	 }
	void NEW_QUEUE()
	 {
	 	head=0;
	 	tail=-1;
	 	empty=true;
	 	for(i=0;i<=9;++i)
	 		number[i]=0;
	 }
	 void ADD_QUEUE()
	 {
	 int i;
	 int savetail=tail;
	 tail=tail+1;
	 if(tail==10)tail=0;
	 if ((tail==head) & (!empty))
	 	{
		 JOptionPane.showMessageDialog(null,"Queue is full","QUEUE OUTPUT:",
					JOptionPane.INFORMATION_MESSAGE);
	 	tail=savetail;
	 	}
	 else
	 	{
	 	empty=false;
	 	value =JOptionPane.showInputDialog(null,
				"Enter new number","Input Data",JOptionPane.QUESTION_MESSAGE);
				number[tail]=Integer.parseInt(value);
	 	}
	 output="";
	 output=output+"**** Queue After Add **** "+"\n";
	 for(i=9;i>=0;--i)
	 	{
	 	output=output+"\n"+number[i];
	 	if(i==head)output=output+" head = "+head+" ";
	 	if(i==tail)output=output+" tail = "+tail;
	  	}
	 JOptionPane.showMessageDialog(null,output,"QUEUE OUTPUT:",
				JOptionPane.INFORMATION_MESSAGE);
	 }

	 void DELETE_QUEUE()
	 {
	output="";
	 if(empty)
		 JOptionPane.showMessageDialog(null,"Queue is empty","QUEUE OUTPUT:",
					JOptionPane.INFORMATION_MESSAGE);
	 else
	 	{
	 	if (head==tail)	
	 		{
	 		output=output+"number deleted "+number[head]+"\n";
	 		head=head+1;
	 		if (head==10)head=0;
	 		empty=true;
	 		}
	 	else
	 		{
	 		output=output+"number deleted "+number[head]+"\n";
	 		head=head+1;
	 		if(head==10)head=0;
	 		}
	 	 output=output+"\n"+"\n"+"**** Queue After Delete **** ";
	 for(i=9;i>=0;--i)
	 	{
	 	output=output+"\n"+number[i];
	 	if(i==head)output=output+" head = "+head+"  ";
	 	if(i==tail)output=output+" tail = "+tail;
	 	}
	 JOptionPane.showMessageDialog(null,output,"QUEUE OUTPUT:",
				JOptionPane.INFORMATION_MESSAGE);
	   }
	 }

	 void PRINT_QUEUE()
	 {
		 int i;
		/*	if (empty)
				 JOptionPane.showMessageDialog(null,"The queue is empty","QUEUE OUTPUT:",
							JOptionPane.INFORMATION_MESSAGE);
			else
				{
				output="";
				output=output+"Correct Values in the queue"+"\n";
				System.out.println("Correct Values in the queue");
				i=head;
				System.out.println(number[i]);
				output=output+number[i]+"\n";
				while(i!=tail)
					{
					i=i+1;
					if(i==10)i=0;
					System.out.println(number[i]);
					output=output+number[i]+"\n";
					}
				}//else not empty
			JOptionPane.showMessageDialog(null,output,"QUEUE OUTPUT:",
					JOptionPane.INFORMATION_MESSAGE);*/
		 output="";
			if(empty)
				 JOptionPane.showMessageDialog(null,"Queue is empty","QUEUE OUTPUT:",
							JOptionPane.INFORMATION_MESSAGE);
			else
			{
				 for(i=9;i>=0;--i)
				 	{
				 	output=output+"\n"+number[i];
				 	if(i==head)output=output+" head = "+head+" ";
				 	if(i==tail)output=output+" tail = "+tail;
				  	}
				 JOptionPane.showMessageDialog(null,output,"QUEUE OUTPUT:",
							JOptionPane.INFORMATION_MESSAGE);
			}
}
 }