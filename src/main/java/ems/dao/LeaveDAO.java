package ems.dao;

import ems.domain.Leave;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Transactional
@Repository
public interface LeaveDAO extends CrudRepository<Leave, Long> {

    public List<Leave> findByTeamId(String teamId);

    public List<Leave> findByStartDateBetween(LocalDate startDate, LocalDate endDate);
}