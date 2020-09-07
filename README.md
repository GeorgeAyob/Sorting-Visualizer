Sorting Visualizer
Java / JavaFX application for visualizing and sorting algorithms using various sorts of data structures.

 [
![sorter](https://user-images.githubusercontent.com/51719874/86028837-67a73880-ba00-11ea-8c28-e0b35af58c1e.gif)
](url)

Different sorts to implement:

<img width="162" alt="Screen Shot 2020-06-29 at 11 47 16 AM" src="https://user-images.githubusercontent.com/51719874/86027165-5c530d80-b9fe-11ea-9de9-419b172bb5f2.png">

1. Introduction:

The application consists of an interface which allows the user to explore different sorting
algorithms, not only getting a visual output of the sorting process, but also receiving useful
statistic on the algorithm itself (time complexity, actual time utilized, etc.

2. Application Architecture:

The application is going to be built in Java, using the JavaFX library to implement the GUI. The
latter is going to be divided in two main panels. One Java class is going to represent the overall
GUI containing the two panels, while one external Java class is going to represent the right-hand
side of the GUI, the canvas. What we refer to as canvas is the section of the interface in which
the sorting process takes action and is outputted. The architecture of the application is also going
to include a class containing all the sorting algorithms.

3. Required System Functions:

The system is going to require different functions to operate at best. Every class is going to
contain some important function for its operation.
The core of the application is the class containing all the algorithms, which is going to
implement a big variety of sorting algorithm: selection sort, bubble sort, cocktail sort, odd-even
sort, insertion sort, tim sort, quick sort, heap sort, merge sort, pigeonhole sort, radix sort, and
bogo sort.
The GUI class is also going to contain a series of classes to help the user navigate through the
different functionalities. Some of them (and other may be introduced in production): createList,
which is going to initialize a list of numbers; shuffleList, which shuffles the number in a random
manner; reset, which allows the user to reset any control previously selected; sorting, to start the
sorting process; pause, to pause the sorting process

4. User Interface:

The user interface consists of two main panels. The left panel is a control board, from which the
user can select the algorithm and many other parameters that make the experience more
personalized. The right panel presents a canvas in which the actual sorting is going to take place.
All the values are going to be represented as a vertical line of length x, where x is the value that
needs to be sorted. For every iteration, these lines are going to switch position until the final
sored position is achieved.


<img width="789" alt="Screen Shot 2020-09-07 at 12 38 02 PM" src="https://user-images.githubusercontent.com/51719874/92406873-24a3c880-f107-11ea-963a-23be5a5fa527.png">

<img width="796" alt="Screen Shot 2020-09-07 at 12 38 22 PM" src="https://user-images.githubusercontent.com/51719874/92406876-253c5f00-f107-11ea-8bbb-25f4deb0a6e6.png">

<img width="787" alt="Screen Shot 2020-09-07 at 12 38 43 PM" src="https://user-images.githubusercontent.com/51719874/92406874-253c5f00-f107-11ea-9803-64b541e64f8d.png">


