import javax.swing.JOptionPane;
public class Shop 
{
public static void main(String args[])
{
	Author author[]=new Author[13];
	HardBook hardbook;
	SoftBook softbook;
	Book book[]=new Book[10];

	author[0]=new Author("Afshan","afshan@gmail.com","female");
	author[1]=new Author("Aiman John","aiman@gmail.com","female");
	author[2]=new Author("Arslan", "arslan@gmail.com","male");
	author[3]=new Author("John Ijaz","ijaz@gmail.com","male");
	author[4]=new Author("Nasreen","nasreen@gmail.com","female");
	author[5]=new Author("Tabassam","tabassam@gmail.com","female");
	author[6]=new Author("Mahpara","mahpara@gmail.com","female");
	author[7]=new Author("Ahmed", "ahmed@gmail.com", "male");
	author[8]=new Author("Maryam", "maryam@gmail.com", "female");
	author[9]=new Author("Usman", "usman@gmail.com", "male");
	author[10]=new Author("Irfan","irfan@gmail.com", "male");
	author[11]=new Author("Thaira", "thaira@gmail.com", "female");
	author[12]=new Author("Shahbaz","shahbaz@gmail.com","male");
	
	
	softbook=new SoftBook("pdf","https://pdfbooksfree.pk/category/maulana-romi/","Romi","5678",author[0],author[12]);
	book[0]=softbook;
	hardbook=new HardBook(1,1,true,"Fruits and java","12345",author[0],author[1]);
	book[1]=hardbook;
	softbook=new SoftBook("docx","https://pdfbooksfree.pk/category/maulana-romi/","Banana","0987",author[1],author[2],author[3]);
	book[2]=softbook;
	hardbook=new HardBook(2,2,true,"java and Vegetable","2345",author[2],author[3],author[4]);
	book[3]=hardbook;
	softbook=new SoftBook("pdf","https://pdfbooksfree.pk/category/maulana-romi/","Broclii","8765",author[4],author[5]);
	book[4]=softbook;
	hardbook=new HardBook(3,3,true,"Brinjal","3456",author[5],author[6]);
	book[5]=hardbook;
	softbook=new SoftBook("docx","https://pdfbooksfree.pk/category/maulana-romi/","Grapes","5432",author[8]);
	book[6]=softbook;
	hardbook=new HardBook(4,4,true,"Apple","4567",author[7],author[8],author[9]);
	book[7]=hardbook;
	softbook=new SoftBook("docx","https://pdfbooksfree.pk/category/maulana-romi/","No","15432",author[11]);
	book[8]=softbook;   
	
	 char choice,choice3;
do {
	String choice1=JOptionPane.showInputDialog("Enter 1 for display the data of all books\nEnter 2 for searching book\nEnter 0 for exit");
	choice=choice1.charAt(0);
	if(choice=='1')
	{
		for(int i=0;i<9;i++)
		{
			String data=book[i].ShowData();
			JOptionPane.showMessageDialog(null,data,"Book Information of Book number +(i+1)",JOptionPane.PLAIN_MESSAGE);
		}
		
	}
	else if(choice=='2')
	{
		boolean flag=false;
		String choice2=JOptionPane.showInputDialog("Enter 1 for seraching by book name\nEnter 2 for searching by author name\nEnter 3 for searching by ispn");
		choice3=choice2.charAt(0);
		if(choice3=='1')
		{
			String bookname=JOptionPane.showInputDialog("Enter the book name that you want to search");
			for(int i=0;i<9;i++)
			{
			if(book[i].getBookname().toUpperCase().indexOf(bookname.toUpperCase())!=-1)
			{
				String data=book[i].ShowData();
				JOptionPane.showMessageDialog(null,data,"Book Information of Book number +(i+1)",JOptionPane.PLAIN_MESSAGE);
				flag=true;
			}
			}
			if(flag==false)
			{
				JOptionPane.showMessageDialog(null,"Record not found");
			}
		}
		else if(choice3=='2')
		{
			String authorname=JOptionPane.showInputDialog("Enter the author name that you want to search");
			for(int i=0;i<9;i++)
			{
				if(book[i].getAuthorname().toUpperCase().indexOf(authorname.toUpperCase())!=-1)
				{
					String data=book[i].ShowData();
					JOptionPane.showMessageDialog(null,data,"Book Information of Book number +(i+1)",JOptionPane.PLAIN_MESSAGE);
				}
			}
		}
		else if(choice3=='3')
		{
			String ispn=JOptionPane.showInputDialog("Enter the ispn number of the book that you want to search");
			for(int i=0;i<9;i++)
			{
				if(book[i].getispn().indexOf(ispn)!=-1)
				{
					String data=book[i].ShowData();
					JOptionPane.showMessageDialog(null,data,"Book Information of Book number +(i+1)",JOptionPane.PLAIN_MESSAGE);
				}
			}
		}
	}
}while(choice!='0');
}


}
