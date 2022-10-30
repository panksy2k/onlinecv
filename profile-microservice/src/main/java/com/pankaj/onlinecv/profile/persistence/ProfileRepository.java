package com.pankaj.onlinecv.profile.persistence;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProfileRepository extends ReactiveCrudRepository<ProfileEntity, Integer> {
}
