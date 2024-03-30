# App walkthrough

The Cupcake app is a bit different than the apps you've worked with so far. Instead of all the content displaying on a single screen, the app has four separate screens, and the user can navigate through each screen while ordering cupcakes. If you run the app, you won't see anything and you won't be able to navigate between these screens since the navigation component is not added to the app code yet. However, you can still check the composable previews for each screen and match them with the final app screens below.

Start order screen
The first screen presents the user with three buttons that correspond to the quantity of cupcakes to order.

In code, this is represented by the StartOrderScreen composable in StartOrderScreen.kt.

The screen consists of a single column, with an image and text, along with three custom buttons to order different quantities of cupcakes. The custom buttons are implemented by the SelectQuantityButton composable, which is also in StartOrderScreen.kt.

Choose flavor screen
After selecting the quantity, the app prompts the user to select a cupcake flavor. The app uses what's known as radio buttons to display different options. Users can select one flavor out of a choice of possible flavors.

The list of possible flavors is stored as a list of string resource IDs in data.DataSource.kt.

Choose pickup date screen
After choosing a flavor, the app presents users with another series of radio buttons to select a pickup date. Pickup options come from a list returned by the pickupOptions() function in OrderViewModel.

Both the Choose Flavor screen and Choose Pickup Date screen are represented by the same composable, SelectOptionScreen in SelectOptionScreen.kt. Why use the same composable? The layout of these screens is exactly the same! The only difference is the data, but you can use the same composable to display both the flavor and pickup date screens.

Order Summary screen
After selecting the pickup date, the app displays the Order Summary screen where the user can review and complete the order.

This screen is implemented by the OrderSummaryScreen composable in SummaryScreen.kt.

The layout consists of a Column containing all the information about their order, a Text composable for the subtotal, and buttons to either send the order to another app or cancel the order and return to the first screen.

If users choose to send the order to another app, the Cupcake app displays an Android ShareSheet that shows different sharing options.

a32e016a6ccbf427.png

The current state of the app is stored in data.OrderUiState.kt. The OrderUiState data class contains properties to store the user's selections from each screen.

The screens of the app will be presented in the CupcakeApp composable. However, in the starter project, the app simply shows the first screen. It's not currently possible to navigate through all the screens of the app, but don't worry, that's what you're here for! You'll learn how to define navigation routes, set up a NavHost composable to navigate between screens—also known as destinations—perform intents to integrate with system UI components like the share screen, and make the AppBar respond to navigation changes.

Reusable composables
Where appropriate, the sample apps in this course are designed to implement best practices. The Cupcake app is no exception. In the ui.components package, you'll see a file named CommonUi.kt that contains a FormattedPriceLabel composable. Multiple screens in the app use this composable to format the order price consistently. Rather than duplicate the same Text composable with the same formatting and modifiers, you can define FormattedPriceLabel once and then reuse it as many times as needed for other screens.

The flavor and pickup date screens use the SelectOptionScreen composable, which is also reusable. This composable takes a parameter named options of the type List<String> that represents the options to display. The options appear in a Row, consisting of a RadioButton composable and a Text composable containing each string. A Column surrounds the entire layout and also contains a Text composable to show the formatted price, a Cancel button, and a Next button.
