package com.app.service.room.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.room.RoomDAO;
import com.app.dto.room.Room;
import com.app.service.room.RoomService;

@Service
public class RoomServiceImpl implements RoomService {
	
	@Autowired
	RoomDAO roomDAO;

	@Override
	public List<Room> findRoomList() {
		
		System.out.println("RoomServiceImpl findRoomList");
		
		// 핵심 비지니스 로직 	|	서비스 로직
		
		//전체호실정보 조회
		
		// DAO 활용(호출) -> 실제 DB에서 데이터 조회해서 달라!
		List<Room> roomList = roomDAO.findRoomList();
		
		return roomList;
	}
	
	

}
