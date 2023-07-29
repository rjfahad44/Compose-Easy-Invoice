

package app.easyinvoice.data.models

data class Dashboard(
    val invoiceCount: Int,
    val receivedAmount: Double,
    val totalAmount: Double,
    val pendingInvoices: Int,
    val pendingAmount: Double
): BaseModel()