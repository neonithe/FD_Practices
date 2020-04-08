package org.example;

public class Car
{
    String brand;
    String regNr;
    String maxSpeed;
    String ownerName;

        public String getInfo()
        {
            String outPut = "Brand:"+brand+"\nRegistration:"+regNr+"\nMax Speed:"+maxSpeed+"\nOwner:"+ownerName+"\n";
            return outPut;
        }

}
