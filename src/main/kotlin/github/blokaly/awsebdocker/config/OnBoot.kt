package github.blokaly.awsebdocker.config

import github.blokaly.awsebdocker.common.LoggerDelegate
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component
import java.util.*

@Component
class OnBoot() : ApplicationRunner {
    private val logger by LoggerDelegate()
    override fun run(args: ApplicationArguments?) {
        logger.info("Default timezone set to UTC")
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"))
    }
}