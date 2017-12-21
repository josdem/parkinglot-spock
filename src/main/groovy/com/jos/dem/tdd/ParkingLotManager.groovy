package com.jos.dem.tdd

class ParkingLotManager {

	List<ParkingLot> parkingLots = []

	void manage(ParkingLot parkingLot){
		parkingLots.add(parkingLot)
	}

	Integer counts(){
		parkingLots.size()
	}

}
