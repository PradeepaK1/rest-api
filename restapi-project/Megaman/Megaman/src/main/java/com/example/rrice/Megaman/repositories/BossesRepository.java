package com.example.rrice.Megaman.repositories;
import com.example.rrice.Megaman.models.bosses;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface BossesRepository extends MongoRepository < bosses, String > {
 bosses findBy_id(ObjectId _id);
}