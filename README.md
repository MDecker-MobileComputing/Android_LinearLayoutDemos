# Android-App "LinearLayout-Demo"

App contains several layout files using [*LinearLayout*](https://developer.android.com/reference/android/widget/LinearLayout).
 Exactly one of these layout files must be loaded in method *onCreate()*
 of class *MainActivity*:

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView( R.layout.platzmangel );

        //setContentView( R.layout.verschachtelt );
    }

<br>

Comments (JavaDoc) and UI texts are in German.

<br>

----
## Screenshots

First layout file `platzmangel.xml` shows what happens when there is lack of space to display all elements in a *LinearLayout*: 
![Screenshot 1](screenshot_1.png)  ![Screenshot 2](screenshot_2.png)

For this example the *auto rotate* feature of the Android device or emulator instance has to be enabled.

<br><br>

Second layout file `verschachtelt.xml` shows that *LinearLayouts* (like other layouts) can be nested:
![Screenshot 3](screenshot_3.png)

<br>

----
# License

See the [LICENSE file](LICENSE.md) for license rights and limitations (BSD 3-Clause License).
