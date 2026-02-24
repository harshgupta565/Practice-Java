package Practice.Aerovigile;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class InvalidFlightException extends Exception {
    public InvalidFlightException(String message) {
        super(message);
    }
}
class Data {
    String FlightNumber;
    String FlightName;
    int PassengerCount;
    double  Currentfuellevel;

    public Data(String FlightNumber, String FlightName, int PassengerCount, double  Currentfuellevel) {
        this.FlightNumber = FlightNumber;
        this.FlightName = FlightName;
        this.PassengerCount = PassengerCount;
        this.Currentfuellevel = Currentfuellevel;

    }

    public boolean validateFlightNumber(String flightNumber) throws InvalidFlightException {
        Pattern p = Pattern.compile("^FL-[0-9]{4}$");
        Matcher m = p.matcher(flightNumber);
        if (m.matches() == true) {
            return true;
        } else {
            throw new InvalidFlightException("The flight number " + flightNumber + "+ is  invalid");
        }
    }

    public boolean validateFlightName(String flightName) throws InvalidFlightException {
//        Pattern p = Pattern.compile("^(SpiceJet|Vistara|IndiGo|Air Arabia)$");
//        Matcher m = p.matcher(flightName);
//        return m.matches();
        if (!(flightName.equals("SpiceJet") ||
                flightName.equals("Vistara") ||
                flightName.equals("IndiGo") ||
                flightName.equals("Air Arabia")))
            throw new InvalidFlightException("The flight name " + flightName + " is invalid");
        else{
            return true;
        }
    }

    public boolean validatePassengerCount(int passengerCount, String flightName) throws InvalidFlightException {
        if (passengerCount < 1) {
            throw new InvalidFlightException("Passenger count must be greater than zero");
        } else if (FlightName.equals("SpiceJet") && passengerCount > 396) {
            throw new InvalidFlightException("Passenger count must be less than 396");
        } else if (FlightName.equals("Vistara") && passengerCount > 615) {
            throw new InvalidFlightException("Passenger count must be less than 615");
        } else if (FlightName.equals("IndiGo") && passengerCount > 230) {
            throw new InvalidFlightException("Passenger count must be less than 230");
        } else if (FlightName.equals("Air Arabia") && passengerCount > 130) {
            throw new InvalidFlightException("Passenger count must be less than 130");
        } else {
            return true;
        }
    }
        public double calculateFuelToFillTank (String flightName,double currentFuelLevel)throws InvalidFlightException {
        double fuelneed =0;
        if(currentFuelLevel < 0){
            throw new InvalidFlightException("Current fuel level must be greater than zero");
            }
          if(FlightName.equals("SpiceJet") && currentFuelLevel <= 2000000){
              double maxfuellevel = 2000000;
              fuelneed=currentFuelLevel-maxfuellevel;
          } else if (FlightName.equals("Vistra")&& currentFuelLevel <= 3000000) {
              double maxfuellevel = 3000000;
              fuelneed=currentFuelLevel-maxfuellevel;
          } else if (FlightName.equals("IndiGo") && currentFuelLevel <= 250000) {
              double maxfuellevel = 250000;
              fuelneed=currentFuelLevel-maxfuellevel;
          } else if (FlightName.equals("Air Arabia") && currentFuelLevel <= 150000) {
              double maxfuellevel = 150000;
              fuelneed=currentFuelLevel-maxfuellevel;
          }else {
              throw new InvalidFlightException("Invalid fuel level for");
          }
          return fuelneed;
        }
    }
        public class UserInterface {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String input = sc.nextLine();
                String[] words = input.split(":");
                String FlightNumber = words[0];
                String FlightName = words[1];
                int PassengerCount = Integer.parseInt(words[2]);
                double  Currentfuellevel = Double.parseDouble(words[3]);
                Data d = new Data(FlightNumber,FlightName,PassengerCount,Currentfuellevel);
                try {
                    d.validateFlightNumber(FlightNumber);
                    d.validateFlightName(FlightName);
                    d.validatePassengerCount(PassengerCount, FlightName);

                    double fuelRequired =
                            d.calculateFuelToFillTank(FlightName, Currentfuellevel);

                    System.out.println("Fuel required to fill the tank: "
                            + fuelRequired + " liters");

                } catch (InvalidFlightException e) {
                    System.out.println(e.getMessage());
                }

            }
        }
