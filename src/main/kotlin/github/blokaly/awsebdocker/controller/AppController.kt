package github.blokaly.awsebdocker.controller

import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
class AppController {

    @GetMapping("/health")
    fun health(): ResponseEntity<Unit> = ResponseEntity.ok(Unit)
}