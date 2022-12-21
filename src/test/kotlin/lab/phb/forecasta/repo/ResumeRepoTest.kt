package lab.phb.forecasta.repo

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ResumeRepoTest {

    @Autowired
    lateinit var repo: ResumeRepo
    val log = LoggerFactory.getLogger(ResumeRepoTest::class.java)

    @Test
    fun getAllTest() {
        var result = repo.findAll()
        result.forEach {
            log.info(it.toString())
        }
        Assertions.assertNotNull(result)
    }

}