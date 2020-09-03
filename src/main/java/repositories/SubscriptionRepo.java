package repositories;
import models.User;
import org.springframework.data.repository.CrudRepository;
public interface SubscriptionRepo extends CrudRepository<User,Integer> {
}
