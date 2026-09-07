public class Car {

    String brand = "Porsche";
    String model = "911";
    int reliseDate =  2009;
    int size = 7;
    boolean isDriving = false;
    boolean isOpen = false;
    boolean isBelt = false;
    boolean isStart = false;
    boolean isInside = false;

    void getIn(){
        if(isInside) System.out.println("You are already inside the car");
        else if(!isOpen) System.out.println("Please open the door before getting in");
        else{
            isInside = true;
            System.out.println("You are now inside the car");
        }
    }

    void exit(){
        if(isDriving) System.out.println("Please stop driving before exiting the car");
        else if(isStart) System.out.println("Please turn off the engine before exiting the car");
        else if(isBelt) System.out.println("Please untie the seat belt before exiting the car");
        else if(!isOpen) System.out.println("Please open the door before exiting the car");
        else{
            isInside = false;
            System.out.println("You have successfully exited the car");
        }
    }

    void doorOpen(){
        if(isStart) System.out.println("You can't open the door when engine is on");
        else if(isBelt) System.out.println("Please untie the seat belt before opening the door");
        else{
            isOpen = true;
            System.out.println("The door has been opened");
        }
    }

    void doorClose(){
        isOpen = false;
        System.out.println("The door has been closed");
    }

    void tieBelt(){
        if(!isInside) System.out.println("Please get in the car before fastening the seat belt");
        else if(isOpen) System.out.println("Please close the door before fastening the seat belt");
        else{
            isBelt = true;
            System.out.println("Thank you for using seat belt");
        }

    }

    void unTieBelt(){
        if(isStart) System.out.println("Please stop the engine before untie the seat belt");
        else{
            isBelt = false;
            System.out.println("Your seat belt is untied");
        }

    }

    void start(){
        if(!isInside) System.out.println("Please get in the car first before staring the engine");
        else if(isStart) System.out.println("The car engine is already started");
        else if(isOpen) System.out.println("Please close the door before starting");
        else if(!isBelt) System.out.println("Please tie seat belt before starting the engine");
        else{
            isStart = true;
            System.out.println("Engine turned on. Please drive with caution. Happy ride :)");
        }
    }

    void stopEngine(){
        if(isDriving){
            System.out.println("Please stop driving before stopping the engine");
        }else{
            isStart = false;
            System.out.println("The car engine stopped");
        }
    }

    void drive(){
        if(isStart) {
            isDriving = true;
            System.out.println("You started driving the car");
        }else System.out.println("Please start the car before driving");
    }

    void stopDrive(){
        isDriving = false;
        System.out.println("Car is at parking mode");
    }

}
