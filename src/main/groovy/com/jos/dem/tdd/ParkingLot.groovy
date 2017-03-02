package com.jos.dem.tdd

class ParkingLot {

  private final static Integer MAX_CARS = 5

  Integer cars = 0

  Boolean isEmpty(){
    cars == 0 ? true : false
  }

  void park(){
    if(cars == MAX_CARS){
      throw new RuntimeException('Cars capacity exceeded')
    }
    cars++
  }

  void remove(){
    cars--
  }

  Boolean isFull(){
    cars >= MAX_CARS ? true : false
  }

}
