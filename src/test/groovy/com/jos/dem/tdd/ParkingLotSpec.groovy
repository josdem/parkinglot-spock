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

  void "should remove a car"(){
    when:"Park and remove"
      parkingLot.park()
      parkingLot.remove()
    then:"Should be empty"
      parkingLot.isEmpty()
  }

  void "should know parking lot is full"(){
    when:"Park a lot"
      parkingLot.park()
      parkingLot.park()
      parkingLot.park()
      parkingLot.park()
      parkingLot.park()
    then:"Should be full"
      parkingLot.isFull()
  }

}
