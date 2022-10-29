
public class SoftBook extends Book
{
private String filetype, link;

SoftBook()
{
super();
filetype=link="unknown";

}

SoftBook(String filetype,String link,String name,String ISBN, Author... Authors)
{
	super(name,ISBN,Authors);
	this.filetype=filetype;
	this.link=link;
}

String ShowData()
{
String data=super.ShowData();
data=data+"\nMore information\n\nType:\tSoft Form\nFile Type:\t\t"+filetype+"\nLink:\t\t"+link;
return data;
}

}
