/*
 *Class Car
 */
package autoservice;

/**
 *
 * @author Utilizator
 */
public class Car implements Saleable, Rentable{

    void increaseRent(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 /**
 @enum enumeration of accepted car colors
 */
 public enum Color { WHITE, RED, YELLOW, GREEN, GRAY, BLACK };
 /**
 Internal hidden fields / attributes
 */
 private Color color;
 private String name;
 private short speed;

    public int getRentPrice() {
        return rentPrice;
    }

    public static boolean isRENTABLE() {
        return RENTABLE;
    }

    public static boolean isSALEABLE() {
        return SALEABLE;
    }
 private int salePrice;

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    public void setRentPrice(int rentPrice) {
        this.rentPrice = rentPrice;
    }
 private int rentPrice;
 /**
 Constructors
 */
 public Car(){
 name = "Default car name";
 speed = 90;
 }
 public Car(String carName, short carSpeed, Color carColor){
 name = carName;
 speed = carSpeed;
 color = carColor;
 }
 /*get-ers and set-ers*/
 public String getName(){
 return(name);
 }
 public Color getColor(){
 return(color);
 }
 public short getSpeed(){
 return(speed);
 }
 public void setName(String newName){
 name = newName;
 }
 public void setColor(Color newColor){
 color = newColor;
 }
 public void setSpeed(short newSpeed){
 speed = newSpeed;
 }
 /**
 The method increase actual speed of Car until final speed specified.
 * @param newSpeed is new speed
 */
 public void increaseSpeed(short newSpeed){
 if(newSpeed > speed){
 speed = newSpeed;
 }
 else if (newSpeed < speed){
 decreaseSpeed(newSpeed);
 }
 }
 /**
 The method decrease actual speed of Car until final speed specified.
 * @param newSpeed is new speed
 */
 public void decreaseSpeed(short newSpeed){
 if(newSpeed < speed){
 speed = newSpeed;
 }
 else if (newSpeed < speed){
 increaseSpeed(newSpeed);
 }
 }
 /**
 Abstract method defined in Saleable interface implemented by class car
 * is implemented here.
 * @override Saleable.getSalePrice() method
 */
 @Override
 public int getSalePrice(){
 return(12000);
 }
 /**
 Abstract method defined in Rentable interface implemented by class car
 * is implemented here.
 * @override Rentable.getDailyRentPrice() method
 */
 @Override
 public int getDailyRentPrice(){
 return(250);
 }
 }

