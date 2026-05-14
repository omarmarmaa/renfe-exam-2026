package Java.edu.iesam.domain;

import Java.edu.iesam.data.TrainDataRepository;
import Java.edu.iesam.data.TrainMemLocalDataSource;

public class DeleteTrainUseCase {
    TrainDataRepository trainDataRepository;
    TrainMemLocalDataSource trainMemLocalDataSource;

    public DeleteTrainUseCase(TrainMemLocalDataSource trainMemLocalDataSource) {
        this.trainMemLocalDataSource = trainMemLocalDataSource;
    }
    public void delete(String id) {
        trainDataRepository.delete(id);
    }
}
