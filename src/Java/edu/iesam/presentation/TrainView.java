package Java.edu.iesam.presentation;

import Java.edu.iesam.data.TrainDataRepository;
import Java.edu.iesam.data.TrainMemLocalDataSource;
import Java.edu.iesam.domain.Train;

public class TrainView {
    public  TrainMemLocalDataSource trainMemLocalDataSource =new TrainDataRepository(trainMemLocalDataSource.getInstance());
    public void add(Train train){
        trainDataRepository.add(train);
    }
}
