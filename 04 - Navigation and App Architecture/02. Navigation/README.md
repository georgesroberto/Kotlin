# Learn Navigation

1. ## Define Routes

Parts of the Navigation Component
The Navigation component has three main parts:

**NavController:** Responsible for navigating between destinations—that is, the screens in your app.

**NavGraph:** Maps composable destinations to navigate to.

**NavHost:** Composable acting as a container for displaying the current destination of the NavGraph.

In this codelab, you'll focus on the NavController and the NavHost. Within the NavHost, you'll define the destinations for the Cupcake app's NavGraph.

2. ## Navigate between routes

Now that you've defined your routes and mapped them to composables in a NavHost, it's time to navigate between screens. The NavHostController—the navController property from calling rememberNavController()—is responsible for navigating between routes. Notice, however, that this property is defined in the CupcakeApp composable. You need a way to access it from the different screens in your app.

Easy, right? Just pass the navController as a parameter to each of the composables.

While this approach works, it's not an ideal way to architect your app. A benefit of using a NavHost to handle your app's navigation is that navigation logic is kept separate from individual UI. This option avoids some of the major drawbacks of passing the navController as a parameter.

Navigation logic is kept in one place, which can make your code easier to maintain and prevent bugs by not accidentally giving individual screens free reign of navigation in your app.
In apps that need to work on different form factors (like portrait mode phone, foldable phone, or large screen tablet), a button may or may not trigger navigation, depending on the app's layout. Individual screens should be self-contained and don't need to be aware of other screens in the app.
Instead, our approach is to pass a function type into each composable for what should happen when a user clicks the button. That way, the composable and any of its child composables decide when to call the function. However, navigation logic isn't exposed to the individual screens in your app. All the navigation behavior is handled in the NavHost.

3. ## Navigate to another app

So far, you've learned how to navigate to a different screen in your app and how to navigate back to the home screen. There's just one other step to implement navigation in the Cupcake app. On the order summary screen, the user can send their order to another app. This selection brings up a ShareSheet—a user interface component that covers the bottom part of the screen—that shows sharing options.

This piece of UI isn't part of the Cupcake app. In fact, it's provided by the Android operating system. System UI, such as the sharing screen, isn't called by your navController. Instead, you use something called an Intent.

An intent is a request for the system to perform some action, commonly presenting a new activity. There are many different intents, and you're encouraged to refer to the documentation for a comprehensive list. However, we are interested in the one called ACTION_SEND. You can supply this intent with some data, such as a string, and present appropriate sharing actions for that data.

The basic process for setting up an intent is as follows:

Create an intent object and specify the intent, such as ACTION_SEND.
Specify the type of additional data being sent with the intent. For a simple piece of text, you can use "text/plain", though other types, such as "image/_" or "video/_", are available.
Pass any additional data to the intent, such as the text or image to share, by calling the putExtra() method. This intent will take two extras: EXTRA_SUBJECT and EXTRA_TEXT.
Call the startActivity() method of context, passing in an activity created from the intent.
We'll walk you through how to create the share action intent, but the process is the same for other types of intents. For future projects, you're encouraged to refer to the documentation as needed for the specific type of data and necessary extras.

## Appbar response to navigation

Even though your app functions and can navigate to and from every screen, there's still something missing from the screenshots at the start of this codelab. The app bar does not automatically respond to navigation. The title doesn't update when the app navigates to a new route nor does it display the Up button before the title when appropriate.

Notice that the AppBar title now updates to reflect the current screen. When you navigate to a screen other than StartOrderScreen, the Up button should appear and take you back to the previous screen.

## Complete App Summary

Congratulations! You've just made the leap from simple single screen applications to a complex multi-screen app using the Jetpack Navigation component to move through multiple screens.

You defined routes, handled them in a NavHost, and used function type parameters to separate the navigation logic from individual screens.

You also learned how to send data to another app using intents as well as customize the app bar in response to navigation.

In the upcoming units, you'll continue using these skills as you work on several other multi-screen apps of growing complexity.

**Learn More**

- Navigating with Compose
- Navigation principles
- Jetpack Compose Navigation
- Types of Navigation
