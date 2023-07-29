

package app.easyinvoice.ui.auth.home.nav

import androidx.navigation.NavBackStackEntry
import app.easyinvoice.ui.AppScreen

fun NavBackStackEntry.getTitle(): Int {
    return when (destination.parent?.route) {
        AppScreen.Dashboard.route -> AppScreen.Dashboard.title
        AppScreen.Invoices.route -> AppScreen.Invoices.title
        AppScreen.Taxes.route -> AppScreen.Taxes.title
        AppScreen.MyBusinesses.route -> AppScreen.MyBusinesses.title
        AppScreen.Customers.route -> AppScreen.Customers.title
        else -> AppScreen.Dashboard.title
    }
}