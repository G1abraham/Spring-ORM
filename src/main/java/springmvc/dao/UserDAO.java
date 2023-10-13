package springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.entities.User;


@Repository
public class UserDAO {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int save(User user) {
		
		Integer i= (Integer)this.hibernateTemplate.save(user);
		return i;
	}

}
