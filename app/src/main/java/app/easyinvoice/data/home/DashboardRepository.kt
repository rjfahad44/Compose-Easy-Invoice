

package app.easyinvoice.data.home

import app.easyinvoice.data.Resource
import app.easyinvoice.data.models.Dashboard

interface DashboardRepository {
    suspend fun getDashboardInfo(): Resource<Dashboard>
}