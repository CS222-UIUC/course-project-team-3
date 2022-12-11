# course-project-team-3
course-project-team-3 created by GitHub Classroom

![code coverage](https://img.shields.io/badge/coverage-100%25-brightgreen)

![lint code base](https://img.shields.io/badge/lint%20code%20base-passing%20locally-green)


Introduction:


Installation Instructions:
- Download the code onto Android Studio
- Open using the android emulator
- ...

Techinical:
At the highest level of abstraction, we have the full application. Its conceptual goal is to provide the user with a platform from which they can communicate their 
life goals, show how much progress they’ve made in achieving those goals, and check on the progress of others in their ventures. This app was developed in Android 
Studio and adopts the class conventions associated with the development environment, primarily being the use of models to represent what could considered traditional 
objects in object-oriented programming and the use of two types of classes from which interactions with on-screen elements can be defined: the Fragment and the 
Activity. The former is a piece of an application's user interface or behavior that can be placed in an Activity while the latter is defined as “a single, focused 
thing that the user can do” by the Android developers reference page.

Both fragments and activities exist as Java classes and typically incorporate different android libraries to achieve different goals. In our implementation, Toast was 
a prominently included library within this project, as it enables developers to communicate with users via text pop ups if need be.  Android also has different 
utilities for interactable icons (we used the Button and ImageButton classes for the entirety of our interactable icons) and interactable containers—think a scrolling 
list. 

Functionally, this bucket list application is comprised of 2 connected fragment data structures which constitute a login page (first fragment) and the actual bucket 
list of the user (second fragment). The first fragment is comprised of two text fields in which the user can input text via keyboard. Assuming the values inputted are 
ones deemed correct (“CS222User”, “CS222Password” in the demonstration), the user will then be sent to a page where they can view their goals, change their goals, and 
mark their goals as complete. If the password is deemed incorrect, Toast will pop up a message indicating “Wrong Username or Password”. On the page where the user can 
interact with their own bucket list, there is additionally a friends button which will take them to a page with a scrolling view of other users and a profile picture 
at the top which represents them. This page with the scrolling view represents the UserPage activity and is launched by passing an Intent. An Intent is defined as “an 
abstract description of an operation to be performed”. 

Group Members:
Jason Wu: created the log in screen and bucket list fragments
Noah Carroll: user page scrolling, and an initial implementation of the bucket list
Michelle Zhang: responsible for visual design, test case implementation
Keli Akabutu: icon class implementation, test case implementation, visual design work
