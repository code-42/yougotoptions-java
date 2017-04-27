package net.ed.models.data;
/**
 * Inspired by LaunchCode
 * Created by Edward Dupre
 * Copyright 2017
 */
import net.ed.models.Options;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Repository
public interface OptionsDao extends CrudRepository<Options, Integer> {
}
