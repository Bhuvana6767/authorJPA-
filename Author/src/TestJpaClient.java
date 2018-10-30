import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.cg.bean.Author;

//import com.cg.bean.Student;
import com.cg.dao.AuthorDaoImpl;



public class TestJpaClient 
{
	public static void main(String[] args)
	{
		AuthorDaoImpl autDao=new AuthorDaoImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Author Id:");
		int aId=sc.nextInt();
		System.out.println("Enter FirstName:");
		String fnm=sc.next();
		System.out.println("Enter MiddleName:");
		String mnm=sc.next();
		System.out.println("Enter LastName:");
		String lnm=sc.next();
		System.out.println("Enter Phone number:");
		String pnum=sc.next();
		
		Author aut=new Author();
		aut.setAuthorId(aId);
		aut.setAutFirstName(fnm);
		aut.setAutLastName(lnm);
		aut.setAutMiddleName(mnm);
		aut.setAutPhoneNo(pnum);
		
		Author auth=autDao.addAuthor(aut);
		System.out.println("Data Inserted in the table "+auth);
		
		
		System.out.println("--------update name----------");
		Author aut3=autDao.updateAuthorName(2, "SaiTeja", "hi", "Banoth", "123456987");
		System.out.println("updated : "+aut3);
		
		System.out.println("----------------list of all students----------------------------");
		List<Author> autList=autDao.getAllAuthors();
		Iterator<Author> it=autList.iterator();
		
		System.out.println("AuthorId\t\t\t AutFirstName\t\t\t AutMiddleName\t\t\tAutLastName\t\t\tAutPhoneNo");
		System.out.println("-----------------------------------------------------------------------------------");
		while(it.hasNext())
		{
			Author tempAuth=it.next();
			System.out.println(tempAuth.getAuthorId()+"\t\t\t\t"+tempAuth.getAutFirstName()+"\t\t\t\t"+tempAuth.getAutMiddleName()+"\t\t\t\t"+tempAuth.getAutLastName()
					+"\t\t\t\t"+tempAuth.getAutPhoneNo());
		}
		System.out.println("-------------------------------------------------");
		System.out.println("Deleted 2 roll no");
		System.out.println("record deleted for : "+autDao.deleteAuthor(2));
	}

}

