

package app.easyinvoice.ui.auth.home.nav

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import app.easyinvoice.ui.AppScreen
import app.easyinvoice.ui.auth.home.taxes.ManageTaxes
import app.easyinvoice.ui.auth.home.taxes.Taxes
import app.easyinvoice.ui.auth.home.taxes.TaxesViewModel
import app.easyinvoice.ui.utils.getViewModelInstance

fun NavGraphBuilder.taxNav(navController: NavController) {
    navigation(
        startDestination = AppScreen.Taxes.Home.route,
        route = AppScreen.Taxes.route
    ) {
        composable(AppScreen.Taxes.Home.route) {
            val vm = navController.getViewModelInstance<TaxesViewModel>(it, AppScreen.Taxes.route)
            Taxes(vm, navController)
        }

        composable(AppScreen.Taxes.ManageTaxes.route) {
            val vm = navController.getViewModelInstance<TaxesViewModel>(it, AppScreen.Taxes.route)
            ManageTaxes(vm, navController)
        }
    }
}