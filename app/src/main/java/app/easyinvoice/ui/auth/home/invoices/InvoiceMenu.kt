

package app.easyinvoice.ui.auth.home.invoices

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.ui.graphics.vector.ImageVector
import app.easyinvoice.R

sealed class InvoiceMenu(@StringRes val title: Int, val icon: ImageVector) {
    object MarkAsPaid : InvoiceMenu(R.string.mark_as_paid, Icons.Filled.Check)
    object MarkAsUnPaid : InvoiceMenu(R.string.mark_as_unpaid, Icons.Filled.Clear)
    object Edit : InvoiceMenu(R.string.edit, Icons.Filled.Edit)
    object Delete : InvoiceMenu(R.string.delete, Icons.Filled.Delete)
}