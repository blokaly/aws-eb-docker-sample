package github.blokaly.awsebdocker.controller

import github.blokaly.awsebdocker.model.Customer
import github.blokaly.awsebdocker.model.CustomerRepository
import github.blokaly.awsebdocker.model.Hello
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
class AppController(val repository: CustomerRepository) {

    @GetMapping("/health")
    fun health(): ResponseEntity<Unit> = ResponseEntity.ok(Unit)

    @GetMapping("/hello")
    fun hello(): ResponseEntity<Hello> = ResponseEntity.ok(Hello("Hello World!"))

    @RequestMapping("/save")
    fun save(): String {
        repository.save(Customer("Jack", "Smith"))
        repository.save(Customer("Adam", "Johnson"))
        repository.save(Customer("Kim", "Smith"))
        repository.save(Customer("David", "Williams"))
        repository.save(Customer("Peter", "Davis"))

        return "Done"
    }

    @RequestMapping("/findall")
    fun findAll() = repository.findAll()

    @RequestMapping("/findbyid/{id}")
    fun findById(@PathVariable id: Long)
            = repository.findById(id)

    @RequestMapping("findbylastname/{lastName}")
    fun findByLastName(@PathVariable lastName: String)
            = repository.findByLastName(lastName)
}