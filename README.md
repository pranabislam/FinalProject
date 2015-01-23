FinalProject for APCS
============
Group Name: COoked GoOse
------------
**Members: Pranab Islam and Remi Moon. Period 2 Mr. Zamansky**
Note: Pranab didn't ssh to this git repo because he used a different computer, so there are three authors in this repo (two Pranabs and one Remi). You can see this on Pulse button on the side or the commit history. 

About the Project:
------------
We made a puzzle game in Java's GUI. Solve the puzzle by moving the pieces with your mouse. Choose from four images. Have fun! 

**How to run:**
Compile Gui1.java in terminal or powershell and run with "java Gui1"

**Work Log:**

- 1/3/15  Didn't push it but was working on an imagesplitting class to split up the images into puzzle pieces (rectangles) - Pranab and Remi. 

- 1/7/15 We both worked on and finished and Pranab pushed the basic image splitter in class. Works perfectly, no errors.

- 1/8/15 Adding image to panel gives error. Both of us are working on the same file. 

- 1/9/15 Remi and Pranab both fixed image adding to panel error. 
- ImageAdder function works - Pranab
- 1/13/15 For the last few days we've been trying to figure out how to utilize mouse actions and dragging images by testing on separate files. We have fixed minor bugs the last few days. - Remi and Pranab

- 1/15/15 Revamped code entirely and mouse drag and mouse pressed works like a charm. Added a new file, ImageGrab.java - Pranab with Remi's help. 
- 1/16/15 Re-Added the imagesplit file. - Pranab Islam


- 1/18/15 Added JLabels and other components. Made pseudorandom distribution of images to a certain part of the screen. Serious errors with Jpanels and non visible component issues - Pranab & Remi both worked on this together. 

- 1/19/15 Finished primitive snapping function (only works in x direction). - Pranab 
Serious overlapping issues. Crowding between canvases and images and what not. Everyhing is overlapping and we don't know how to fix it currently. Can't figure out how to make a grid to attach the images to. Serious issue. 

- 1/20/15 Changed the layout of the jframe and now things are more smooth, we can add things next to eachother and its much harder for them to overlap. - Remi 

- 1/20/15 Drew lines to make the grid after jpanels and rectangles didnt work. 
Also finished image snapping algorithm, works perfectly. Having issues with the window and showing the jpanels again. Current Error: images slide when the window changes length. - Pranab 

- 1/21/15 Added and gave all major components set sizes and fixed the window moving/images not following coordinate bug. Added many image handling files and images after splitting with imagesplitter - Pranab 

- 1/21/15 Added buttons with action listeners and new sets of images. Fixed more layout issues. - Remi

Bugs: When you start Gui1.java, nothing shows up. But when you shake you move your window  (on Remi's computer) or when you full screen/snap the window to half screen for Pranab, then the images show. These things seem like they have nothing to do with java so we don't understand why this is happening. Also, reset() can be improved but we can't find how to code it to restart in the same window, and make it smoother.

- 1/22/15 Added the pop up windows after many different attempts. Now the original image pops up in a separate GUI and you can look at the image while solving the puzzle! Added multiple image opening gui files. Fixed numerous shortcomings in code- Pranab

- 1/22/15 Made a working reset button. Each window closes independently now as well. 
- 1/23/15 - Code cleanup and fixing some coordinates with images - Remi

Bugs/Things we don't like: 

Each of the image-related buttons automatically make the pop up window show up, regardless of the puzzle pieces on the screen. You could click Eiffel's button while playing the Goose and have an eiffel and goose pop up. Not a big deal however.

Pop up windows don't automatically close when resetting, must manually close it. 


