package corprate.mugil.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import corprate.mugil.dto.request.JobsRequest;
import corprate.mugil.dto.response.JobsListResponse;
import corprate.mugil.dto.response.JobsResponse;
import corprate.mugil.service.JobsService;
import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/jobs")
@PreAuthorize("hasRole('ADMIN')")
@RequiredArgsConstructor
public class JobsController {

    private final JobsService jobsService;

    @PreAuthorize("hasAuthority('admin:create')")
    @PostMapping("/add")
    public ResponseEntity<?> createJobs(@RequestBody JobsRequest jobsRequest){
        JobsResponse response = new JobsResponse();

        try{
            response = jobsService.createJobs(jobsRequest);
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        }
        catch(Exception e){
            return new ResponseEntity<>(response, HttpStatus.EXPECTATION_FAILED);
        }
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllJobs(){

        JobsListResponse jobsListResponse = new JobsListResponse();

        try{
            jobsListResponse = jobsService.getAllJobs();
            return new ResponseEntity<>(jobsListResponse, HttpStatus.CREATED);
        }
        catch(Exception e){
            return new ResponseEntity<>(jobsListResponse, HttpStatus.EXPECTATION_FAILED);
        }
    }
}
