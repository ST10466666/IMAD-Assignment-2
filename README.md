# IMAD-Assignment-2
This Android-based History Quiz App tests users' knowledge of historical facts, specifically focusing on history. 
The app presents a series of True/False questions, tracks user scores, and provides immediate feedback.

# Table of Content
-Features

-Usage

- Installation

-Technical Details

-Liscense

-Reference 

# Features
### 5 True/False Questions – 
Test knowledge on historical events, geography, and economics.
### Interactive Quiz Experience – 
Instant feedback with (correct) and  (incorrect) indicators.
### Score Tracking – 
Calculates and displays the final score after completing all questions.
### Dynamic UI –
Next Button remains visible but is only enabled after answering all questions.
Answer buttons disable after quiz completion.
Smooth Navigation – Moves from Questions Screen → Score Screen with an option to restart.
 Clean & Intuitive Design – Simple layout with clear feedback.
 
 ![image](https://github.com/user-attachments/assets/19676885-30e1-4efd-983c-32e0f10e1a77)

 # Usage
### Launch the app – 
Starts on the quiz screen.
### Answer questions – 
Tap True or False for each historical fact.
### Complete the quiz – 
After the last question, the Next button activates.
### View your score – 
Final results are displayed with performance feedback.
### Restart option –
Play again from the score screen.

# Installation
Instructions on how to install and set up the App.

### 1. Open the project in Android Studio:
Launach Android Studio

Click "Open" or "Open an existing Android Studio Project".

Navigate to the project directory and select the build.gradle file.

Android Studio will begin building the project and downloading dependencies.

### 2.Install Dependencies:
Android Studio will automatically intall the dependencies listed in your build.gradle file.

If you've added any new dependencies, make sure to sync Gradle again.


### Build & Run on an emulator or physical device

![image](https://github.com/user-attachments/assets/601f2c24-2c8e-4aee-af68-572129d22e32)

# Technical Deatils
### Built With
Kotlin (Primary language)

Android Studio (Development environment)

Android Jetpack Components (For modern Android development)

App Architecture
Single-Activity for Quiz (Questtions.kt)

Score Display Activity (Score.kt)

Intent-Based Navigation (Passing scores between screens)

## Key Components
### Button State Management – 
Next button enables only after quiz completion.
### Score Calculation –
Tracks correct answers and displays performance.
### Quiz Completion Detection – 
Automatically detects when all questions are answered.

![image](https://github.com/user-attachments/assets/926661a0-0bd5-4e35-947e-131b8956fe58)








