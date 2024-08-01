import java.util.Scanner;
class Userinteraction 
{
    public static void main(String args[]) 
	{
        TrafficDataCollector data=new TrafficDataCollector();
        TrafficSignalOptimizer optimize=new TrafficSignalOptimizer();
        TrafficSignalController controll=new TrafficSignalController(dataCollector, optimizer);
        TrafficReportGenerator reportGenerator = new TrafficReportGenerator(dataCollector);
        dataCollector.addSensor(new TrafficSensor("Intersection1"));
        dataCollector.addSensor(new TrafficSensor("Intersection2"));
        dataCollector.updateSensorData("Intersection1",20,50.0);
        dataCollector.updateSensorData("Intersection2",15,40.0);
        controller.startMonitoring();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter'report'to generate report or'exit'to quit");
        while (scanner.hasNext()) 
	{
            String input = scanner.nextLine();
            if (input.equals("report"))
	 {
                reportGenerator.generateReport();
            } else if (input.equals("exit")) 
	{
                break;
            }
        }
        scanner.close();
    }
}
