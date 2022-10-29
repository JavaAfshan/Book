
public class Book
{
private String name,ISBN;
int numberofauthors;
Author authors1[];
Book()
{
name=ISBN="Unknown"; 

}
Book(String name,String ISBN, Author... Authors)
{
	this.name=name;
	this.ISBN=ISBN;
	this.numberofauthors=Authors.length;
	authors1=new Author[Authors.length];
	for(int i=0;i<numberofauthors;i++)
	{
		authors1[i]=new Author(); 
		authors1[i]=Authors[i];
	}
}

String ShowData()
{

String data="\n\nBook Information\n\nName:\t"+name+"\nISBN\t"+ISBN;
	for(int i=0;i<numberofauthors;i++)
	{
		data=data+"\n\nAuthor Information\n\n"+authors1[i].ShowData()+"\n";
	}
	return data;
}

}


