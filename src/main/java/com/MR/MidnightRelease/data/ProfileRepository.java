package com.MR.MidnightRelease.data;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ProfileRepository extends MongoRepository<Profile, String> {

    @Query("{username:'?0'}")
    Profile findItemByUsername(String username);
}
