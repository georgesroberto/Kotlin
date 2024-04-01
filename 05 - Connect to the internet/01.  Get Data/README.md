
Great work on this challenging topic of coroutines! You have learned that coroutines are very useful because their execution can be suspended, freeing up the underlying thread to do other work, and then the coroutine can be resumed later. This allows you to run concurrent operations in your code.

Coroutine code in Kotlin follows the principle of structured concurrency. It is sequential by default, so you need to be explicit if you want concurrency (e.g. using launch() or async()). With structured concurrency, you can take multiple concurrent operations and put it into a single synchronous operation, where concurrency is an implementation detail. The only requirement on the calling code is to be in a suspend function or coroutine. Other than that, the structure of the calling code doesn't need to take into account the concurrency details. That makes your asynchronous code easier to read and reason about.

Structured concurrency keeps track of each of the launched coroutines in your app and ensures that they are not lost. Coroutines can have a hierarchy—tasks might launch subtasks, which in turn can launch subtasks. Jobs maintain the parent-child relationship among coroutines, and allow you to control the lifecycle of the coroutine.

Launch, completion, cancellation, and failure are four common operations in the coroutine's execution. To make it easier to maintain concurrent programs, structured concurrency defines principles that form the basis for how the common operations in the hierarchy are managed:

Launch: Launch a coroutine into a scope that has a defined boundary on how long it lives for.
Completion: The job is not complete until its child jobs are complete.
Cancellation: This operation needs to propagate downward. When a coroutine is canceled, then the child coroutines need to also be canceled.
Failure: This operation should propagate upward. When a coroutine throws an exception, then the parent will cancel all of its children, cancel itself, and propagate the exception up to its parent. This continues until the failure is caught and handled. It ensures that any errors in the code are properly reported and never lost.
Through hands-on practice with coroutines and understanding the concepts behind coroutines, you are now better equipped to write concurrent code in your Android app. By using coroutines for asynchronous programming, your code is simpler to read and reason about, more robust in situations of cancellations and exceptions, and delivers a more optimal and responsive experience for end users.

Summary
Coroutines enable you to write long running code that runs concurrently without learning a new style of programming. The execution of a coroutine is sequential by design.
Coroutines follow the principle of structured concurrency, which helps ensure that work is not lost and tied to a scope with a certain boundary on how long it lives. Your code is sequential by default and cooperates with an underlying event loop, unless you explicitly ask for concurrent execution (e.g. using launch() or async()). The assumption is that if you call a function, it should finish its work completely (unless it fails with an exception) by the time it returns regardless of how many coroutines it may have used in its implementation details.
The suspend modifier is used to mark a function whose execution can be suspended and resumed at a later point.
A suspend function can be called only from another suspending function or from a coroutine.
You can start a new coroutine using the launch() or async() extension functions on CoroutineScope.
Jobs plays an important role to ensure structured concurrency by managing the lifecycle of coroutines and maintaining the parent-child relationship.
A CoroutineScope controls the lifetime of coroutines through its Job and enforces cancellation and other rules to its children and their children recursively.