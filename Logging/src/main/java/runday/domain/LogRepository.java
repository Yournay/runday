package runday.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import runday.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "logs", path = "logs")
public interface LogRepository extends PagingAndSortingRepository<Log, Long> {
    void deleteById(Long id);
}
