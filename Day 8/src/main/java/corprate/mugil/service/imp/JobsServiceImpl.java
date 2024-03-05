package corprate.mugil.service.imp;

import corprate.mugil.dto.request.JobsRequest;
import corprate.mugil.dto.response.JobsListResponse;
import corprate.mugil.dto.response.JobsResponse;
import corprate.mugil.model.Jobs;
import corprate.mugil.repository.JobsRepository;
import corprate.mugil.service.JobsService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobsServiceImpl implements JobsService {

    @Autowired
    private JobsRepository jobsRepository;

    @Override
    public JobsResponse createJobs(JobsRequest jobs) {

        var eve = Jobs.builder()
                        .jobname(jobs.getJobname())
                        .description(jobs.getDescription())
                        .location(jobs.getLocation())
                        .salary(jobs.getSalary())
                        .build();

        jobsRepository.save(eve);

        return JobsResponse.builder().message("jobss added successfully").build();
    }

    @Override
    public JobsListResponse getAllJobs(){

        List<Jobs> jobs = jobsRepository.findAll();
        return JobsListResponse.builder()
            .jobs(jobs)
            .build();
    }


    // Other CRUD methods can be implemented similarly
}

