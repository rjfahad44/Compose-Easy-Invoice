

package app.easyinvoice.ui.auth.home.nav

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import app.easyinvoice.ui.AppScreen
import app.easyinvoice.ui.auth.home.mybusinesses.ManageMyBusiness
import app.easyinvoice.ui.auth.home.mybusinesses.MyBusinesses
import app.easyinvoice.ui.auth.home.mybusinesses.MyBusinessesViewModel
import app.easyinvoice.ui.utils.getViewModelInstance

fun NavGraphBuilder.businessNav(navController: NavController) {
    navigation(
        startDestination = AppScreen.MyBusinesses.Home.route,
        route = AppScreen.MyBusinesses.route
    ) {

        composable(AppScreen.MyBusinesses.Home.route) {
            val vm = navController.getViewModelInstance<MyBusinessesViewModel>(it, AppScreen.MyBusinesses.route)
            MyBusinesses(vm, navController)
        }

        composable(AppScreen.MyBusinesses.ManageMyBusiness.route) {
            val vm = navController.getViewModelInstance<MyBusinessesViewModel>(it, AppScreen.MyBusinesses.route)
            ManageMyBusiness(vm, navController)
        }

    }
}