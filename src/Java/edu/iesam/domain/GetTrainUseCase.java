package Java.edu.iesam.domain;

import Java.edu.iesam.data.TrainMemLocalDataSource;

import java.util.ArrayList;

public class GetTrainUseCase {
    TrainRepository trainRepository;
    TrainMemLocalDataSource trainMemLocalDataSource;

    public GetTrainUseCase(TrainMemLocalDataSource trainMemLocalDataSource){
        this.trainMemLocalDataSource=trainMemLocalDataSource;
    }
    public void get(Train train){
         trainRepository.getAll();
    }
}
