class Visualizationandreporting
 {
    private TrafficDataCollector dataCollector;

    public TrafficReportGenerator(TrafficDataCollector dataCollector) 
	{
        this.dataCollector = dataCollector;
    }

    public void generateReport() 
	{
        System.out.println("Traffic Flow Report:");
        for (TrafficSensor sensor : dataCollector.getSensors().values()) 
{
            System.out.println("Intersection " + sensor.getIntersectionId() + ":");
            System.out.println("  Vehicle Count: " + sensor.getVehicleCount());
            System.out.println("  Average Speed: " + sensor.getAverageSpeed());
        }
    }
}
