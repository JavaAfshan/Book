
public class HardBook extends  Book
{
private int roomno,shelfno;
private boolean available;

HardBook()
{
	super();
roomno=shelfno=-1;
}

HardBook(int roomno,int shelfno, boolean available,String name,String ISBN, Author... Authors)
{
	super(name,ISBN,Authors);
	this.roomno=roomno;
	this.shelfno=shelfno;
	this.available=available;
}

String ShowData()
{
String data=super.ShowData();
data=data+"\nMore information\n\nType:\tHard Form\nRoom Number:\t"+roomno+"\nShelf Number:\t\t"+shelfno;
if(available==true)
{
data=data+"\nThis is available";	
}
else
{
data=data+"\nThis is not available";	
}
return data;
}

String getbookname()
{
return getBookname();	
}
String getauthorname()
{
return getAuthorname();
}
}
