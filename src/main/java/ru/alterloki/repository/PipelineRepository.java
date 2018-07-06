package ru.alterloki.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.alterloki.pipeline.Pipeline;

@RepositoryRestResource(collectionResourceRel = "pipeline", path = "pipeline")
public interface PipelineRepository extends PagingAndSortingRepository<Pipeline, Long> {
}