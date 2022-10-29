
public class Author
{
private String name,email,gender;
Author()
{
name=email=gender="unknown";	
}
Author(String name,String email,String gender)
 {
	 this.name=name;
	 this.email=email;
	 this.gender=gender;
 }

String ShowData()
{
	String data="Name:\t"+name+"\n"+"Email\t"+email+"\n"+"Gender\t"+gender+"\n";
	return data;
}
}
