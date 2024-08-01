class AlgorithmDesign
 {
    public int calculateSignalTiming(TrafficSensor sensor) 
	{
        int baseGreenTime = 30; 
        int additionalTimePerVehicle = 2; 

        int vehicleCount = sensor.getVehicleCount();
        double averageSpeed = sensor.getAverageSpeed();


        int greenTime = baseGreenTime + (int) (vehicleCount * additionalTimePerVehicle);
        greenTime = Math.min(greenTime, 120); 

        return greenTime;
    }
}
