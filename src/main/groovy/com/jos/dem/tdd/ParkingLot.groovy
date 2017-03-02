package com.jos.dem.tdd

class ParkingLot {

  Integer cars = 0

  Boolean isEmpty(){
    cars == 0 ? true : false
  }

  void park(){
    cars++
  }

  void remove(){
  }

}
