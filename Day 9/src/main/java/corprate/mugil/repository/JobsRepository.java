package corprate.mugil.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import corprate.mugil.model.Jobs;

public interface JobsRepository extends JpaRepository<Jobs, String> {


}
