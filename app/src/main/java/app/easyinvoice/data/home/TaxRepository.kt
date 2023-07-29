

package app.easyinvoice.data.home

import app.easyinvoice.data.Resource
import app.easyinvoice.data.models.Tax

interface TaxRepository {
    suspend fun getTaxes(): Resource<List<Tax>>
    suspend fun addTax(tax: Tax): Resource<Tax>
    suspend fun updateTax(tax: Tax): Resource<Tax>
    suspend fun deleteTax(id: String): Resource<Boolean>
}