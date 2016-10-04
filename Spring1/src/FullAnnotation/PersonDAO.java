package FullAnnotation;

import org.springframework.stereotype.Repository;

@Repository("daoId")
public class PersonDAO {
	private void Remove() {
		System.out.println("Remove..");
	}
}
