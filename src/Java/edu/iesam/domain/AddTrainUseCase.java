package Java.edu.iesam.domain;

import Java.edu.iesam.data.TrainDataRepository;
import Java.edu.iesam.data.TrainMemLocalDataSource;

public class AddTrainUseCase {
    TrainDataRepository trainDataRepository;
    TrainMemLocalDataSource trainMemLocalDataSource;

    public AddTrainUseCase(TrainMemLocalDataSource trainMemLocalDataSource) {
        this.trainMemLocalDataSource=trainMemLocalDataSource;
    }
    public void add(Train train){
        trainDataRepository.add(train);
    }
}
