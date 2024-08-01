import java.util.Timer;
import java.util.TimerTask;

class Implementation
 {
    private TrafficDataCollector dataCollector;
    private TrafficSignalOptimizer optimizer;

    public TrafficSignalController(TrafficDataCollector dataCollector, TrafficSignalOptimizer optimizer)
 {
        this.dataCollector=dataCollector;
        this.optimizer = optimizer;
    }

public void startMonitoring() 
	{
        Timer timer = new Timer();
        timer.schedule(new TimerTask()
	 {
            @Override
        public void run()
		 {
                for (TrafficSensor sensor : dataCollector.getSensors().values())
			 {
                    int greenTime = optimizer.calculateSignalTiming(sensor);
                    System.out.println("Intersection "+ sensor.getIntersectionId()+"green time:"+greenTime+"seconds.");
                }
            }
        }
, 0, 30000); 
    }
}
