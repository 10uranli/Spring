package FullAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("serviceId")
public class PersonService {
	PersonDAO dao;

	@Autowired
	public PersonService(PersonDAO dao) {
		super();
		this.dao = dao;
	}

	public PersonDAO getDao() {
		return dao;
	}

	public void setDao(PersonDAO dao) {
		this.dao = dao;
	}

}
