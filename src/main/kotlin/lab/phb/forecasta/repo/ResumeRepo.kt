package lab.phb.forecasta.repo

import lab.phb.forecasta.model.Resume
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ResumeRepo: JpaRepository<Resume, String> {
}