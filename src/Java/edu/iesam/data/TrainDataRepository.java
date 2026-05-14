package Java.edu.iesam.data;

import Java.edu.iesam.domain.Train;
import Java.edu.iesam.domain.TrainRepository;

import java.util.ArrayList;

public class TrainDataRepository implements TrainRepository {
    TrainRepository trainRepository;
    TrainMemLocalDataSource trainMemLocalDataSource;

    public void TrainDataRepository(TrainMemLocalDataSource trainMemLocalDataSource){
        this.trainMemLocalDataSource=trainMemLocalDataSource;
    }

    @Override
    public void add(Train train) {
       trainRepository.add(train);
    }

    @Override
    public void delete(String id) {
        trainRepository.delete(id);
    }

    @Override
    public ArrayList<Train> getAll() {
        return trainRepository.getAll();
    }

    @Override
    public void getId(String id) {
        trainRepository.getId(id);
    }
}
