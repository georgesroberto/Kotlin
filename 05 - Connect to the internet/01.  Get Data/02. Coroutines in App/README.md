# Learned how to use coroutines to handle concurrency

Coroutines help manage long-running tasks that might otherwise block the main thread and cause your app to become unresponsive. You also learned how to write unit tests to test the coroutines.

The following features are some of the benefits of coroutines:

Readability: The code you write with coroutines provides a clear understanding of the sequence that executes the lines of code.
Jetpack integration: Many Jetpack libraries, such as Compose and ViewModel, include extensions that provide full coroutines support. Some libraries also provide their own coroutine scope that you can use for structured concurrency.
Structured concurrency: Coroutines make concurrent code safe and easy to implement, eliminate unnecessary boilerplate code, and ensure that coroutines launched by the app are not lost or keep wasting resources.
Summary
Coroutines enable you to write long running code that runs concurrently without learning a new style of programming. The execution of a coroutine is sequential by design.
The suspend keyword is used to mark a function, or function type, to indicate its availability to execute, pause, and resume a set of code instructions.
A suspend function can be called only from another suspend function.
You can start a new coroutine using the launch or async builder function.
Coroutine context, coroutine builders, Job, coroutine scope and Dispatcher are the major components for implementing coroutines.
Coroutines use dispatchers to determine the threads to use for its execution.
Job plays an important role to ensure structured concurrency by managing the lifecycle of coroutines and maintaining the parent-child relationship.
A CoroutineContext defines the behavior of a coroutine using Job and a coroutine dispatcher.
A CoroutineScope controls the lifetime of coroutines through its Job and enforces cancellation and other rules to its children and their children recursively.
Launch, completion, cancellation, and failure are four common operations in the coroutine's execution.
Coroutines follow a principle of structured concurrency.
Learn more
Kotlin coroutines on Android
Additional resources for Kotlin coroutines and flow
Exceptions in Coroutines
Coroutines on Android (part 1)
Kotlin coroutines 101
