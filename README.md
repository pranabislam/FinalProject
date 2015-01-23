FinalProject for APCS
============
Group Name: COoked GoOse
------------
**Members: Pranab Islam and Remi Moon. Period 2 Mr. Zamansky**



We are making an interactive jigsaw puzzle game. Solve the puzzle by moving the pieces with your mouse. Have fun!



1/3/15 Didn't push it but was working on an imagesplitting class to split up the images into puzzle pieces (rectangles). 

1/7/15
We both worked on and finished and Pranab pushed the basic image splitter. Works perfectly, no errors

1/8/15 Adding image to panel gives error. Both of us are working on the same file. 

1/9/15 Remi and Pranab both fixed image adding to panel error. 

1/13/15 For the last few days we've been trying to figure out how to utilize mouse actions and dragging images. We have fixed minor bugs up until this point.  


1/15/15 Finally we were able to make images move with mouse drag after a total revamping of our code!
1/16/15 Tried to add jpanels and other components into the jframe but there is a serious issue. Seems that nothing comes on screen even when we add it to the jframe. 

1/18/15 We were finally able to add a jpanel and the images onto the jframe simultaneosly. 

1/19/15 Serious overlapping issues. Crowding between canvases and images and what not. Everyhing is overlapping and we don't know how to fix it currently. Can't figure out how to make a grid to attach the images to. Serious issue. 

1/20/15 Changed the layout of the jframe and now things are more smooth, we can add things next to eachother and its much harder for them to overlap. Can't figure out the gridding system. Drew lines to make the grid. 

Also finished image snapping algorithm, works perfectly. Having issues with the window and showing the jpanels again. Also images slide when the window changes length.

Bug: Coordinates seem to be moving with the window size of th frame.

1/21/15 Gave all major components set sizes and fixed the window moving/images not following coordinate bug. Added buttons and new sets of images. Fixed more layout issues.
Bugs: When you start Gui1.java, nothing shows up. But when you shake you move your window  (on Remi's computer) or when you full screen/snap the window to half screen for Pranab, then the images show. These things seem like they have nothing to do with java so we don't understand why this is happening. Also, reset() can be improved but we can't find how to code it to restart in the same window, and make it smoother.

1/22/15 Added the pop up windows after many different attempts. Now the original image pops up in a separate GUI and you can look at the image while solving the puzzle!

Bugs/Things I don't like: Reset button opens up a new gui, doesnt actually reset the current GUI, so the old GUI is still in the background. 

If you close 1 screen, all screens close.

You cant start a new game by just clicking a different image's button, but you can open the different images without changing the current puzzle game; so there can be infinitely many open pics of the goose or the mountain, while you're still playing the eiffel tower. 

The puzzle pieces only show up after you stretch or shrink the window in some way. Really hate this bug.
