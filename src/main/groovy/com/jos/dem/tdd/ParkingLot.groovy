package com.jos.dem.tdd

class ParkingLot {

  private final static Integer MAX_CARS = 5

  Integer cars = 0

  Boolean isEmpty(){
    cars == 0
  }

  void park(){
    if(isFull()){
      throw new RuntimeException('Cars Capacity Exceeded')
    }
    cars++
  }

  void remove(){
    cars--
  }

  Boolean isFull(){
    cars >= MAX_CARS
  }

}
