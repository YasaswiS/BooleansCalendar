# BooleansCalendar

## Summary

With this Calendar application, users can schedule events by designating a specific date to be notified of the event, writing a description of the event, & setting a specific time to be notified of the event. The user will be notified of the events via their smartphone or by e-mail. May add functionality by linking it to canvas.

## Website

Click [here](https://booleans-website.herokuapp.com/) to access the website.

NOTE: CSS formatting has not fully been implemented into the website, which will be a goal for the coming week. Complete CSS formatting can be seen if run via LocalHost, or by looking at the picture below.

![Home Page Screenshot](https://user-images.githubusercontent.com/71394490/112705180-d5cb3f80-8e5a-11eb-9c53-c50d1347e9b0.png)

## Project Plan

Click [here](https://docs.google.com/document/d/1_egHgpKx7FtzuqQB7QGcD1Rdo_Stov1bfvrn3Qzmf-4/edit?usp=sharing) to access the Booleans' Project Plan.

---------------------------------------------------------------- Week 3 ----------------------------

## Self Grading

###### Aditya Surapaneni

- Click [here](https://spring-boot-calculator.herokuapp.com/calculator) to access the Recursion Lab.
- The Ticket for my Recursion Mini Lab can be found under the "In Progress" section [here](https://github.com/AdityaS1426/BooleansCalendar/projects/1).
- I have created a calculator, which utilizes Recursion for a few of the functions, such as the Fibonacci & the Factorial.
- I have written multiple algorithms for the Factorial, including the use of Recursion, For Loops, While Loops, etc. This is my WOW.
- Our team was having difficulty mapping our Recursion Lab to our existing website, so that's why my Recursion Lab is placed on a separate Heroku application. We will resolve this issue by moving to AWS in the future.

###### Vihan Jayaraman

Score: 10/10

Justification:
- All criteria met for individual project requirements:
- Individual section on labs page (separate dropdown menu): [Dropdown section in HTML page](https://github.com/AdityaS1426/BooleansCalendar/blob/017751d806c52ae6ef95c9ab2ac5ae116fcc0ea9/src/main/resources/templates/MiniLabsHome.html#L176)
- Individual Mini Lab - River Recursion (from tutorial) - completely functional: [HTML page](https://github.com/AdityaS1426/BooleansCalendar/blob/master/src/main/resources/templates/labs/Vihan/River-Recursion.html#L8) [Java class](https://github.com/AdityaS1426/BooleansCalendar/blob/master/src/main/java/FRQ/Vihan/FrogRiver.java)
- Default input of 3 rocks: [RequestParam configuration to have default value](https://github.com/AdityaS1426/BooleansCalendar/blob/017751d806c52ae6ef95c9ab2ac5ae116fcc0ea9/src/main/java/com/booleans/calendar/MainController.java#L32)
- Able to adjust output by allowing user to enter in the desired number of paths: [Form for inputting number of rocks](https://github.com/AdityaS1426/BooleansCalendar/blob/017751d806c52ae6ef95c9ab2ac5ae116fcc0ea9/src/main/resources/templates/labs/Vihan/River-Recursion.html#L8)
- WOW: elapsed time for each run: [Time Elapsed Function](https://github.com/AdityaS1426/BooleansCalendar/blob/017751d806c52ae6ef95c9ab2ac5ae116fcc0ea9/src/main/java/FRQ/Vihan/FrogRiver.java#L28)

- Explanation paragraph so the user knows what they are doing: [Paragraph in html](https://github.com/AdityaS1426/BooleansCalendar/blob/17a9691429a4299d2b94b78b1d43e6853fadff71/src/main/resources/templates/labs/Vihan/River-Recursion.html#L13)

NOTE: For inputs of around 10 or less rocks, the algorithm completes so quickly that the timeelapsed function cannot register, which means it returns an output of 0 nanoseconds, (although this is obviously not the case).

Improvements: - Better Aesthetics
              - Add a scaled graphic of a river and the frog crossing the river.

---------------------------------------------------------------- Week 2 ----------------------------

## Self Grading

###### Aditya Surapaneni

Score: 9/10

Justification:

- All of the criteria outlined on the "End Sprint #1" assignment on Canvas are met.
- Finished all of the work I was assigned by the Scrum Master, such as the creation of the website via the use of HTML & CSS, the creation of the Recursion Mini Lab logic, etc.
- Contributed to the entire team effort when possible so as not to let the team fall down.
- I feel as if I did not accomplish enough during this week, though, so I'm taking a point off.

------------------------------------------------------------------------------------------------------------

###### Yasaswi Singamneni

Score: 8/10

Justification:

- Finished personal minilab.
- Finished all work outnlined by Scrum Master at the begenning of the week.
- Couldn't help on deployment or integrating the minilab with the main website so I took off 2 points.


------------------------------------------------------------------------------------------------------------

###### Neil Sahai

Score: 8/10

Justification:

- Finished personal recursion minilab - having difficulties uploading lab
- Finished all work outnlined by Scrum Master at the begenning of the week.
- Researched Google Calendar API integration - will be up by this week.
- I was unable to figure out how to get the recursion lab up, so I have put up a different recursion lab with logarithms that I have done previously - did not accomplish as much as I wanted to this week so I am taking off 2 points.

###### Vihan Jayaraman

Score 8/10

Justification:

- Finished frogs recursion minilab logic
- Created HTML website pages + templating the html pages
- Did not create full html page for frogs recursion minilab - (Still not April 12th yet, but I didn't put a full effort that warrants a 10/10).

---------------------------------------------------------------- Week 0 & Week 1 ----------------------------

## Team SMART Goals for Mini Review #1

| Smart Goal 1 | Description |
| --- | --- |
| S | The Booleans will create a basic template for their website, with a home page set up with a background image, logo, buttons, text, etc. by March 26, 2021. Creating a template will allow for a basis to build off of while furthering the development of the intended Calendar Application. |
| M | The goal will be achieved if the Home Page successfully opens on LocalHost with the intended format. The intended background image, logo, buttons, & text should be clearly visible, & the format should be appealing. |
| A | This goal will be achieved via the use of HTML, CSS, & Java knowledge in conjunction with the IntelliJ IDEA development interface. Websites were developed in the previous Tri, so this goal is very achievable. |
| R | The goal is very realistic, especially with work put in from every team member. Most of the knowledge used to create the Home Page is from prior experience, so this goal is extremely realistic.
| T | This goal should be achieved by April 12, 2021. |

| Smart Goal 2 | Description |
| --- | --- |
| S | The Booleans will make sure their website is deployed by March 26 2021, even if the CSS formatting is not visible. The CSS formatting will be taken care of by the next checkpoint. The Booleans will utilize Heroku for deployment, as it's the simplest method. Ensuring the website is deployed is a simple goal, but it's essential for further progress, as the deployed website can be checked routinely to measure progress. |
| M | The goal will be achieved if the website is readily accessible via the public through the use of the URL. |
| A | This goal is definitely achievable, as prior experience has allowed for the knowledge necessary to easily deploy the website. |
| R | This goal is realistic, as the presence of a GitHub repository with working code is all that's necessary for deployment on Heroku. |
| T | This goal should be achieved by April 12, 2021. |

###### SMART Goal 3
| Smart Goal 3 | Description |
| --- | --- |
| S | The Booleans will start working on their Recursion Mini Lab, with the basic logic completed by March 26, 2021. If the basic logic is outlined, it will be much easier to work around the logic to establish the "view" that's part of the MVC framework. As a result, the Mini Lab will make its presence on the website at a late date, preferably by April 2, 2021. |
| M | If the recursion-based Factorial Program is able to be run successfully in IntelliJ IDEA, this goal will be achieved. |
| A | This goal will be achievable, as it's simply the basis of the Mini Lab, which will be furthered next week. |
| R | This goal is very realistic, as the Tech Talk on Thursday, March 25, 2021 provided quite a bit of insight regarding the approach necessary to complete this Mini Lab. |
| T | This goal should be achieved by April 12, 2021. |

## Individual SMART Goals

Click [here](https://github.com/AdityaS1426/BooleansCalendar/projects/1) to access the Scrum Board, which contains individual SMART Goals. They're under the "In Progress" column, with a separate card for each team member. Or, look below.

| Individual Goals | Description |
| --- | --- |
| Aditya | Contribute to the team effort by assisting in the development of the Home Page via the use of HTML & CSS. Additionally, start on the Mini Lab by creating the basic logic for the Recursion Mini Lab in Factorial.java. Finally, routinely update the README, as well as the Scrum Board, to document progress. These individual goals will be achieved if my contributions allow for the team SMART Goals to be successfully attained. These goals are achievable, as I have full access to the material necessary, such as IntelliJ IDEA, prior knowledge, team members, etc. These goals are realistic, as I have included variation to maintain focus. Focus is key in reaching the desired end result. I will make sure to complete my tasks on time so as not to let my team down. The deadline is April 12, which I am sure is enough time. |
| Yasaswi | Help integrate Java back end code and front end HTML/CSS code, and add database functionality. The goal will be acheived when you can save events in the calender/ lab results on the website. The goal is achivable, as I have expericence/old code to refer back to, from last tri's project. The goal is realistic, as I've helped on the sql databases on the last project. I will try to achieve this goal by April 12. |
| Praveen | Help Yasaswi with the database storage as well as develop the backend code that sets up all of the event listeners. This goal will be acheived when all of the buttons are able to be pressed, and when they redirect to different pages of the website. This goal is realistic because I have experience with databases from last trimester, and Yasaswi could help me out when I am stuck. I will try to attain this goal by April 12. |
| Neil | Check for APIs to allow for Canvas and Google integration so you can see your assignments, to-do's, and grades all in one space. Then implement these APIs into our project, allowing for a swift and clean connection to other apps. This goal is achievable because I have seen these kind of API integrations done into calendars before, so I can find tutorials explaining how to accomplish it if I am stuck. This goal is realistic as this is something which we can do and perserve through given our 3 tris of PBL learning. I will achieve this goal by April 12th 2021 |
| Vihan | Create another Recursion Mini-Lab with GUI, based on the problem of the frog crossing the river. This lab will be completed once the user is able to input a river of the specified width (number of stones in river), and they will receive the number of distinct paths the frog can take to get to the other side of the river. This goal is achievable because I have a solid understanding of how to create  basic recursive functions, from what has been taught in class. This goal is realistic because this problem is entry level, and not incredibly complex. I also have knowledge about how to create a basic GUI with text forms, so I will be able to create the GUI for this lab. I will achieve this goal by April 12th, 2021


## Journals and Project Credits
Contributor | GitHub Link | 
----------- | ----------- |
Neil Sahai | [@Neil-Sahai](https://github.com/Neil-Sahai) | 
Aditya Supraneni | [@AdityaS1426](https://github.com/AdityaS1426) | 
Praveen Natarajan | [@PNatarajan123](https://github.com/PNatarajan123) | 
Yasaswi Singamneni | [@YasaswiS](https://github.com/YasaswiS) |
Vihan Jayaraman | [@VihanJ](https://github.com/VihanJ) |
