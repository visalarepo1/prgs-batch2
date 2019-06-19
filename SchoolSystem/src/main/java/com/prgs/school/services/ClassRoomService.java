package com.prgs.school.services;

import java.util.ArrayList;
import java.util.List;

import com.prgs.school.model.ClassRoom;

public class ClassRoomService {
	
	List<ClassRoom> classList = new ArrayList<>();
	
	public ClassRoomService( ) {
		ClassRoom cls = new ClassRoom();
		cls.setName("c1");
		cls.setId(1);

		classList.add(cls); // .. so on.
		
		cls = new ClassRoom();
		cls.setName("c2");
		cls.setId(2);
		classList.add(cls); // .. so on.
		
		cls = new ClassRoom();
		cls.setName("c3");
		cls.setId(3);
		classList.add(cls); // .. so on.
		
		cls = new ClassRoom();
		cls.setName("c4");
		cls.setId(4);
		classList.add(cls); // .. so on.
	}
	
	public List<ClassRoom> getClassList() {
		return classList ;
	}

	public ClassRoom getClassById(int clsId) {
		
		for(ClassRoom cls : classList) {
			if(cls.getId() == clsId ) {
				return cls;
			}
		}
		
		return null;
	}
	
	public void createClass(ClassRoom cls) {
		classList.add(cls);
	}

}
