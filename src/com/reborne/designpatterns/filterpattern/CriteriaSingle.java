package com.reborne.designpatterns.filterpattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria{

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> singleList = new ArrayList<>();
		for(Person person:singleList){
			if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
				singleList.add(person);
			}
		}
		
		return singleList;
	}

}
