package github.blokaly.awsebdocker.model

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository


@Repository
interface CustomerRepository : CrudRepository<Customer, Long> {
    fun findByLastName(lastName: String): Iterable<Customer>
}