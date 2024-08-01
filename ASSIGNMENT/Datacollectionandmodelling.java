import java.util.HashMap;
import java.util.Map;

class TrafficSensor 
{
    private String intersectionId;
    private int vehicleCount;
    private double averageSpeed;

    public TrafficSensor(String intersectionId)
 {
        this.intersectionId = intersectionId;
        this.vehicleCount = 0;
        this.averageSpeed = 0.0;
    }

    public String getIntersectionId() 
	{
        return intersectionId;
    }

    public int getVehicleCount()
	 {
        return vehicleCount;
    }

    public void setVehicleCount(int vehicleCount) 
	{
        this.vehicleCount = vehicleCount;
    }

    public double getAverageSpeed() 
	{
        return averageSpeed;
    }

    public void setAverageSpeed(double averageSpeed) 
	{
        this.averageSpeed = averageSpeed;
    }

    public void updateData(int vehicleCount, double averageSpeed)
	 {
        this.vehicleCount = vehicleCount;
        this.averageSpeed = averageSpeed;
    }
}

class Datacollectionandmodelling
	 {
    private Map<String, TrafficSensor> sensors = new HashMap<>();

    public void addSensor(TrafficSensor sensor)
	 {
        sensors.put(sensor.getIntersectionId(), sensor);
    }

    public TrafficSensor getSensor(String intersectionId) 
	{
        return sensors.get(intersectionId);
    }

    public void updateSensorData(String intersectionId, int vehicleCount, double averageSpeed) 
	{
        TrafficSensor sensor = getSensor(intersectionId);
        if (sensor != null) 
	{
            sensor.updateData(vehicleCount, averageSpeed);
        }
    }
}
