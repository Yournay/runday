package runday.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import runday.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "friends", path = "friends")
public interface FriendsRepository
    extends PagingAndSortingRepository<Friends, String> {}
