package lab.phb.forecasta.util

import lab.phb.forecasta.repo.ResumeRepo
import lab.phb.forecasta.model.Resume
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.slf4j.LoggerFactory

@SpringBootTest
class ForecastTest {

    @Autowired
    lateinit var repo: ResumeRepo
    val log = LoggerFactory.getLogger(ForecastTest::class.java)

    @Test
    fun calculateATest() {
        var data = repo.findAll() as List<Resume>
        val result = Forecast.calculateA(data)
        log.info("" + result)
        Assertions.assertNotNull(result)
    }

    @Test
    fun generateXTest() {
        var result = Forecast.generateX(5)
        var result2 = Forecast.generateX(6)

        log.info(result.toString())
        log.info(result2.toString())

        Assertions.assertNotNull(result)
        Assertions.assertNotNull(result2)
    }

    @Test
    fun calculateBTest() {
        var data = repo.findAll() as List<Resume>
        var result = Forecast.calculateB(data)
        log.info("" + result)
        Assertions.assertNotNull(data)
    }

    @Test
    fun sumX2Test() {
        var data = Forecast.generateX(41)
        var result = Forecast.sumX2(data)
        log.info("" + result)
        Assertions.assertNotNull(result)
    }

    @Test
    fun sumXYTest() {
        var dataResume = repo.findAll()
        var dataX = Forecast.generateX(dataResume.size)
        var result = Forecast.sumXY(dataX, dataResume)
        log.info("" + result)
        Assertions.assertNotNull(result)
    }

    @Test
    fun calculateLeastSquareTest() {
        var data = repo.findAll()
        var result = Forecast.calculateLeastSquare(data)
        log.info("" + result)
        Assertions.assertNotNull(result)
    }

}