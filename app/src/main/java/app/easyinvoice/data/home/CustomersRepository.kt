
package app.easyinvoice.data.home

import app.easyinvoice.data.Resource
import app.easyinvoice.data.models.Customer

interface CustomersRepository {
    suspend fun getCustomers(): Resource<List<Customer>>
    suspend fun addCustomer(customer: Customer): Resource<Customer>
    suspend fun updateCustomer(customer: Customer): Resource<Customer>
    suspend fun deleteCustomer(id: String): Resource<Boolean>
}