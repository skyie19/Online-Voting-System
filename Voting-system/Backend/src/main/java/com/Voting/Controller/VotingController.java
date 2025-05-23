package com.example.voting.controller;

import com.example.voting.model.Candidate;
import com.example.voting.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class VotingController {

    @Autowired
    private CandidateRepository candidateRepo;

    @GetMapping("/candidates")
    public List<Candidate> getCandidates() {
        return candidateRepo.findAll();
    }

    @PostMapping("/vote/{id}")
    public ResponseEntity<?> vote(@PathVariable Long id) {
        Optional<Candidate> candidate = candidateRepo.findById(id);
        if (candidate.isPresent()) {
            Candidate c = candidate.get();
            c.setVotes(c.getVotes() + 1);
            candidateRepo.save(c);
            return ResponseEntity.ok("Vote counted!");
        }
        return ResponseEntity.status(404).body("Candidate not found");
    }
}
