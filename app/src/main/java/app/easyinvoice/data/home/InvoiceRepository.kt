

package app.easyinvoice.data.home

import app.easyinvoice.data.Resource
import app.easyinvoice.data.models.Invoice
import app.easyinvoice.data.models.Tax

interface InvoiceRepository {
    suspend fun getInvoices(): Resource<List<Invoice>>
    suspend fun addInvoice(invoice: Invoice): Resource<Invoice>
    suspend fun updateInvoice(invoice: Invoice): Resource<Invoice>
    suspend fun deleteInvoice(id: String): Resource<Boolean>
    suspend fun updatePaidState(id: String, isPaid: Boolean): Resource<Boolean>
}