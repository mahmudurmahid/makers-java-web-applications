package repository;

import java.util.List;
import model.Space;
import org.springframework.data.repository.CrudRepository;

public interface SpaceRepository extends CrudRepository<Space, Long> {
}
