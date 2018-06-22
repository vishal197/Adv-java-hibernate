package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import vo.RegVO;


public class RegDAO {
	
	public void insert(RegVO regVO)
		{
			try
				{
					SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
					
					Session session=sessionFactory.openSession();
					
					Transaction transaction=session.beginTransaction();
					
					session.save(regVO);
					
					transaction.commit();
					
					session.close();
				}
			catch(Exception ex)
				{
					ex.printStackTrace();
				}
		}

	public List search()
	{
		List ls =new  ArrayList();
		try {
			SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
			
			Session session=sessionFactory.openSession();
			
			Transaction transaction=session.beginTransaction();
			
			Query q=session.createQuery("from RegVO");
			
			ls =q.list();
			transaction.commit();
			
			session.close();
	} catch (Exception e) {
		// TODO: handle exception
		
		e.printStackTrace();
	}
		return ls;
	}


public void delete(RegVO a){
	try {
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		session.delete(a);
		
		transaction.commit();
		session.close();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
}
public List search1(RegVO o)
{
	List ls =new  ArrayList();
	try {
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		Query q=session.createQuery("from RegVO where id='"+o.getId()+"'");
		
		ls =q.list();
		
		transaction.commit();
		
		session.close();
} catch (Exception e) {
	// TODO: handle exception
	
	e.printStackTrace();
}
	return ls;
}

public void edit(RegVO o){
	
	try {
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		Query q=session.createQuery("update register set firstname = :firstname" + "lastname = :lastname" + "where id = '"+o.getId()+"'");
		
		q.setParameter("firstname", o.getFn());
		q.setParameter("lastname", o.getLn());
		q.executeUpdate();
transaction.commit();
		
		session.close();
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}