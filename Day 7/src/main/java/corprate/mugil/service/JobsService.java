package corprate.mugil.service;

import corprate.mugil.dto.request.JobsRequest;
import corprate.mugil.dto.response.JobsListResponse;
import corprate.mugil.dto.response.JobsResponse;


public interface JobsService {
    JobsResponse createJobs(JobsRequest jobs);

    JobsListResponse getAllJobs();
}
