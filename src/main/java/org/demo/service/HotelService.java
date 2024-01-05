package org.demo.service;

import java.util.List;

import org.demo.entity.Hotel;



public interface HotelService {

	Hotel createHotel(Hotel hotel);

	List<Hotel> getAllHotelList();

	Hotel getHotelById(String hotelid);

	

	

}
