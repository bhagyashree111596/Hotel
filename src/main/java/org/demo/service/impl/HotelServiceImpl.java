package org.demo.service.impl;

import java.util.List;
import java.util.UUID;

import org.demo.entity.Hotel;
import org.demo.exception.ResourceNotFoundException;
import org.demo.repository.HotelRepository;
import org.demo.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelServiceImpl implements HotelService {
	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public Hotel createHotel(Hotel hotel) {
		return  hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotelList() {
		
		return hotelRepository.findAll();
	}

	@Override
	public Hotel getHotelById(String hotelid) {
		
		return hotelRepository.findById(hotelid).orElseThrow(()->new ResourceNotFoundException("hotel with give id not found on server"+hotelid));
	}

	
}
