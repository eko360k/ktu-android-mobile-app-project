# KTU Android Mobile Application Development Project

## Overview

This repository serves as the foundation for a semester-long Android Mobile Application Development project. Students will use Java and Android Studio to design, build, test and enhance a mobile application through multiple assignment phases.

Rather than creating a new repository for each assignment, students will continuously develop the same application throughout the semester. This approach enables proper version control, demonstrates project evolution and allows lecturers to review each student's development process using GitHub.

---

## Learning Objectives

By participating in this project, students will learn how to:

* Develop Android applications using Java and Android Studio.
* Apply object-oriented programming concepts in mobile development.
* Use Git and GitHub for version control.
* Manage software development through incremental improvements.
* Document software projects professionally.
* Track application changes through commits, branches and releases.
* Collaborate using industry-standard development workflows.

---

## Student Assignment Guide

### Step 1: Fork the Repository

Click the **Fork** button on GitHub to create your own copy of this repository.

```text
Original Repository:
ktu-android-mobile-mobile-app-project

Your Fork:
your-github-username/ktu-android-mobile-app-project
```

---

### Step 2: Clone Your Fork

Clone your fork to your local machine.

```bash
git clone https://github.com/your-username/ktu-android-mobile-app-project.git
cd ktu-android-mobile-app-project
```

---

## Step 3: Clone from Main Branch and Create Personal Working Branch (IMPORTANT)

All students must strictly clone from the **main branch** as the official starting point of the project.

### 3.1 Ensure you are on main branch

```bash
git checkout main
git pull origin main
```

Verify your branch:

```bash
git branch
```

Expected output:

```text
* main
```

---

### 3.2 Create your personal working branch

Each student must create a **branch using their Student ID** before starting any development.

Example (Student ID: B202230014):

```bash
git checkout -b B202230014
```

Push the branch to GitHub:

```bash
git push -u origin B202230014
```
---

### Branch Rules

* All development work must be done on your **Student ID branch only**.
* Do NOT commit directly to the `main` branch.
* Do NOT rename your branch after creation.
* Do NOT merge your branch into `main`.

---

## Step 4: Create Android Studio Project (IMPORTANT STEP)

After cloning and switching to your branch:

### Follow these steps in Android Studio:

1. Open **Android Studio**
2. Click **New Project**
3. Select:

   ```
   Empty Views Activity
   ```
4. Configure:

   * Name your project (e.g. `MyMobileApp`)
   * Choose the cloned repository folder.
   * Language: **Java**
   * Minimum SDK:

     ```
     API 24 (Nougat - Android 7.0)
     ```
5. Click **Finish**
6. Wait for **Gradle Sync to complete**

---

## Repository Structure

⚠️ The Android Studio project is **not provided** in this repository. Each student is required to create their own Android Studio project after cloning the repository and creating their personal branch.

⚠️ The Android Studio project must be created directly in the root of the cloned repository after creating your personal branch.

Your repository structure should look similar to the following after creating your project::

```text
ktu-android-mobile-app-project/
│
├── .git/
├── .gradle/
├── .idea/
│
├── app/
│   ├── manifests/
│   │   └── AndroidManifest.xml
│   │
│   ├── kotlin+java/
│   │   ├── com.example.yourproject
│   │   │   └── MainActivity.java
│   │   │
│   │   ├── com.example.yourproject (androidTest)
│   │   │   └── ExampleInstrumentedTest.java
│   │   │
│   │   └── com.example.yourproject (test)
│   │       └── ExampleUnitTest.java
│   │
│   └── res/
│       ├── drawable/
│       ├── layout/
│       ├── mipmap/
│       └── values/
│
├── gradle/
├── screenshots/
│   └── Screenshot_B202230015.png
│
├── .gitignore
├── build.gradle.kts
├── gradle.properties
├── gradlew
├── gradlew.bat
├── settings.gradle.kts
└── README.md
```

### Important Notes

- The Android Studio project must be created directly inside the cloned repository folder.
- Do NOT create another folder such as `MyProject/` inside the repository.
- When creating the project in Android Studio, select the cloned repository folder as the project location.
- Use **Java** as the programming language.
- Use **Empty Views Activity** as the project template.
- Use **API 24 (Nougat - Android 7.0)** as the minimum SDK.
- Wait for Gradle synchronization to complete before making any changes.

## Assignment Workflow

Each assignment will build upon the same Android project.

---

### Step 5: Develop Your Application

Implement the assignment requirements within your personal branch.

Students are encouraged to:

* Commit regularly.
* Write meaningful commit messages.
* Test their application before pushing changes.

Example:

```bash
git add .
git commit -m "Added user registration screen"
git push origin B202230015
```

---

## Submission Requirements

Each student repository must contain:

### Source Code

All Android Studio source files required to build and run the application.

---

### Screenshot Folder

```text
screenshots/
```

Include at least:

```text
Screenshot_B202230014.png  (update with your actual index)
```

The screenshot must clearly show the application's main screen.

Additional screenshots may be added to demonstrate implemented features.

---

## Assignment Milestones

Students should create Git tags after completing each assignment.

Example:

```bash
git tag assignment-1
git push origin assignment-1
```

```bash
git tag assignment-2
git push origin assignment-2
```

```bash
git tag assignment-3
git push origin assignment-3
```

This allows lecturers to review the project at specific submission points.

---

## Git Commit Guidelines

Use descriptive commit messages.

### Good Examples:

```text
Added login activity
Implemented SQLite database
Designed home screen UI
Added navigation drawer
Fixed input validation bug
```

### Avoid:

```text
Update
Changes
Work done
Final
```

---

## Files That Must Not Be Committed

The following generated files should not be uploaded:

```text
.gradle/
build/
app/build/
.idea/
local.properties
captures/
.externalNativeBuild/
.cxx/
```

Ensure the provided `.gitignore` file remains unchanged.

---

## Academic Integrity

Students must:

* Develop their own work.
* Avoid copying source code from classmates.
* Maintain an authentic commit history.

Repositories found to contain plagiarized work may be subject to academic penalties.

---

## Support

If you encounter technical issues:

1. Review Android Studio build logs.
2. Verify Gradle synchronization completed successfully.
3. Check repository issues and announcements.
4. Contact the course instructor or teaching assistant.
