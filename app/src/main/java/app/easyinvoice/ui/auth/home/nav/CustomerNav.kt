

package app.easyinvoice.ui.auth.home.nav

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import app.easyinvoice.ui.AppScreen
import app.easyinvoice.ui.auth.home.customers.Customers
import app.easyinvoice.ui.auth.home.customers.CustomersViewModel
import app.easyinvoice.ui.auth.home.customers.ManageCustomer
import app.easyinvoice.ui.utils.getViewModelInstance

fun NavGraphBuilder.customersNav(navController: NavController) {
    navigation(
        startDestination = AppScreen.Customers.Home.route,
        route = AppScreen.Customers.route,
    ) {
        composable(AppScreen.Customers.Home.route) {
            val vm = navController.getViewModelInstance<CustomersViewModel>(it, AppScreen.Customers.route)
            Customers(vm, navController)
        }

        composable(AppScreen.Customers.ManageCustomer.route) {
            val vm = navController.getViewModelInstance<CustomersViewModel>(it, AppScreen.Customers.route)
            ManageCustomer(vm, navController)
        }
    }
}