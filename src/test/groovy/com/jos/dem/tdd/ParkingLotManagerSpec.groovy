package com.jos.dem.tdd

import spock.lang.Specification

class ParkingLotManagerSpec extends Specification {

	ParkingLotManager manager = new ParkingLotManager()

  void "should manage a parking lot"(){
  	given:"A ParkingLot"
  	  ParkingLot parkingLot = Mock(ParkingLot)
  	when:"Manager manages a parking lot"
  	  manager.manage(parkingLot)
  	then:"Manager can inform how many parking lot has"
  	  manager.counts() == 1
  }

}