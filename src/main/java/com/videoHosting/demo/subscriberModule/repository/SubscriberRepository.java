package com.videoHosting.demo.subscriberModule.repository;

import com.videoHosting.demo.subscriberModule.Entity.SubscriberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriberRepository extends JpaRepository<SubscriberEntity, Long>
{

}
