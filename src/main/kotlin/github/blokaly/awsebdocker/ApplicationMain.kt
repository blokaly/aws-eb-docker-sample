package github.blokaly.awsebdocker

import github.blokaly.awsebdocker.common.MainLogging
import github.blokaly.awsebdocker.common.logger
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import javax.annotation.PreDestroy

fun main(args: Array<String>) {
    runApplication<ApplicationMain>(*args)
}

@SpringBootApplication
class ApplicationMain {
    @PreDestroy
    @Throws(Exception::class)
    fun onDestroy() {
        MainLogging.logger().info("Application terminated")
    }
}