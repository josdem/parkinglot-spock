package com.jos.dem.tdd

import spock.lang.Specification

class ParkingLotSpec extends Specification {

  private final static Integer MAX_CARS = 5

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
    for(int i=0; i<MAX_CARS; i++){
      parkingLot.park()
    }
    then:"Should be full"
    parkingLot.isFull()
  }

}
