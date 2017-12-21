package com.jos.dem.tdd

import spock.lang.Specification

class ParkingLotManagerSpec extends Specification {

	ParkingLotManager manager = new ParkingLotManager()

  void "should manage a parking lot"(){
  	given:"A ParkingLot"
  	  ParkingLot parkingLot = Mock(ParkingLot)
  	when:"We can create a new one"
  	  manager.manage(parkingLot)
  	then:"Manager can Create a new one"
  	  manager.counts() == 1
  }

}