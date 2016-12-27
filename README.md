# Graphical-Password-Authentication-System
An authentication system using Java, MySQL that uses multiple images and integrated sound signatures for user authentication with increased levels of security.  Utilized Java Swings for front end GUI and a backend MySQL database.  Combined the existing cued click point algorithm with the persuasive feature to influence user choice. The application can be integrated with the Gmail App , or any other application.

SOFTWARE REQUIREMENTS
Operating system : Windows
Coding Language  : Java
Front End : Java Swing
Front End Tool : Net beans 7.0 IDE
Back End Database : mysql
Database GUI : Sqlyog.

The various frames involved are :

 The first frame
 The Registration frame
 Registration image panel
 Login frame
 Login image panel

In addition to this we also have a class that is used as a data type to store the image with the corresponding click points, a code section used to establish connection to the database and a code section to play the corresponding sound signature.

The first frame

The first frame has two jbuttons New Registration and Login. On clickig the button New Registration, it sets the current frame invisible and sets the registration frame as visible. This button is used when the user wishes to register because he doesn’t have an account. The Login button is clicked when the user already has an account and wants to access the application. On clicking the login button, it sets the current frame invisible and sets the login frame visible.

The Registration frame

The registration frame is the front end for user registration that is when a new user wishes to register. In this frame we use 2 Textfields and a combobox. One of the text  fields are used for obtaining the user Id and the other is for obtaining the tolerance range.The combobox is used to choose a sound signature from a set of sound signatures. The sound signature will be played on successful login.

The login frame

The login frame is displayed on clicking the login button in the first frame. It consists of a textfield for entering the userId and 3bottons Home, Next, and Cancel.The home button takes us back to the first frame. It sets the current frame invisible and sets the first frame visible.
The Next button takes us to the login image panel. It sets the current frame invisible and the login image panel visible. It also fetches the user profile vector for the corresponding user if the user Id is valid. Otherwise it displays a message saying the user
Id is invalid.The cancel button exits from the application.

