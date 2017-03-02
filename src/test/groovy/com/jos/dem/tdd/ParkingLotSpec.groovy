package com.jos.dem.tdd

import spock.lang.Specification

class ParkingLotSpec extends Specification {

  ParkingLot parkingLot = new ParkingLot()

  void "should be empty"(){
    expect:"Parking lot empty"
      parkingLot.isEmpty()
  }

  void "should park"(){
    when:"Park"
      parkingLot.park()
    then:"Is not empty"
      parkingLot.isEmpty() == false
  }

}
