package com.nj.play.docker.candidateservice.repository;

import com.nj.play.docker.candidateservice.entity.Candidate;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends ReactiveCrudRepository<Candidate, String> {
}
