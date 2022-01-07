Java concurrency and multi-threading interview questions on
Java Memory Model,
volatile keyword,
HashMap,
ConcurrentHashMap,
fail-safe and
fail-fast iterator,
immutability,
ThreadLocal,
Callable and Runnable,
Concurrent package,
synchronization and
Executor framework


Process ?
Program in execution
Takes more time for creation
Consumes more resources
Memory is not shared
Process communication is complex
If one process fails, it doesnt affect other process
If one process is blocked , other process are alos blocked

Thread
Part of Process
Takes less time for creation
Consumes less resources
Memory is shared
Efficient communication
If thread craches all the thread crashes



Thread is a class . Has run method to be overrided. started using start() method
Runnable is a interface . Preffered to use Runnable interface . Because we can implement more than one interface.

All the methods are managed by thread cllass


Limitation od Thread API

 Thread scheduling with dealys
 Users grow

 So came Executor Framework -async task for parrlellism - JSR(JAva specification request ) -166

 Executor Framework used for decopules the business logic -> thread creation and management
 clean shutdown of all task

 Thread pool ?

 Generation transaction report for every user.

 Thread poll is logical group of threads . Fixed no. threads.
 If terminated then new threads are introcuded. Resuing threads
 -amange resurce efficiently
 -open connetion to db
 -Thrad poll size , how many ? How many core ?all does by framework.

 Executor -->  Executor Se4vice--> Scheduled ExecutroService

 Callables and Futures

 Runnable doesnt have return value

 Callble Interface --> return generic value and captured in furture object

 Callable --> call method can throw checked exception

 Excecutor framwrok support both Runnable and Callble


 Executor Service
 - Subinterface of Executor Interfcace
 Manages the life cycle of threads and alsothe Excutor
 Provides submit method accepts both runanble and callble objects, collection of Runnable and callble objects


- Process the user information and store the information in the database

invokeAny ,invokeAll

submit task and return the output of one successful / exception execution

submits all the task and return thier output


shutdown
no new task will be accepted
No gaurantee for complettion

shtunow
halt the wating task
stops the executing task


return

EE Concurrency API

Enterprise Edition works within container or application server

container provide run timer support to the application compoments like EJB and servkets


resource man

jdbc trans mgnt  connect pooling

jms. enterprise javae beans.

contxt info , jndi , security contect  to the threads by container

centralised and manageable objects in J2ee Server

Enables Java EE application to submit async tasks
Manages and monitor the life cycle of async  operations


API

ManagedThreadFactory
ManagedExecutorService to submit the task
ManagedScheduledExecutorService
Context Service


By deployment descriptor
inject using resource annotation

ManagedTask Interface
Managed Task Listener - Receive lifecycle Notiifcation








