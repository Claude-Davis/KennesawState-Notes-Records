"""
Course CSE 1321L
Section: BJK
Semester: Fall 2024
Name: Starlan Davis
"""

# Collision Detection - Lab.8.A.
import pygame
pygame.init()
clock = pygame.time.Clock()

print("Lab.8.A. - Collision Detection")

screen = pygame.display.set_mode((400,400))

rect = pygame.Rect(175,0,50,400)   # the stable, color changing rect
rect1 = pygame.Rect(175,175,50,50)   # the moving blue square

rect_speed = [5,0]

surf = pygame.Surface((rect.w,rect.h))
surf.fill(color=(255,0,0))

surf1 = pygame.Surface((rect1.w,rect1.h))
surf1.fill(color=(0,0,255))


running = True
while running:
    if (rect.colliderect(rect1)):
        surf.fill(color=(0,255,0))
    else:
        surf.fill(color=(255,0,0))

    if (rect1.x<0 or rect1.x>350):
        rect_speed[0] = -rect_speed[0]
    rect1 = rect1.move(rect_speed)

    screen.fill(color=(0, 0, 0))

    screen.blit(surf, (rect.x,rect.y))
    screen.blit(surf1, (rect1.x,rect1.y))
    pygame.display.flip()
    clock.tick(60)

    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False
        elif event.type == pygame.KEYDOWN:
            if event.key == pygame.K_ESCAPE:
                running = False


# Collision Detection of Multiple Rects - Lab.8.B.
import pygame
pygame.init()
clock = pygame.time.Clock()

print("Lab.8.B. - Collision Detection of Multiple Rects")

screen = pygame.display.set_mode((400,400))

rect = pygame.Rect(175,0,50,400)   # the stable, color changing rect
rect1 = pygame.Rect(175,175,50,50)  # the center, moving, blue rect
rect2 = pygame.Rect(175,0,50,50)   # the top, moving rect
rect3 = pygame.Rect(175,350,50,50)  # the bottom, moving rect

rect_speed1 = [5,0]
rect_speed2 = [10,0]
rect_speed3 = [20,0]

surf = pygame.Surface((rect.w,rect.h))
surf.fill(color=(255,0,0))

surf1 = pygame.Surface((rect1.w,rect1.h))
surf1.fill(color=(0,0,255))

surf2 = pygame.Surface((rect2.w,rect2.h))
surf2.fill(color=(0,0,255))

surf3 = pygame.Surface((rect3.w,rect3.h))
surf3.fill(color=(0,0,255))



running = True
while running:
   list1 = [rect1, rect2, rect3]

   collide = rect.collidelist(list1)
   if (rect.collidelist(list1)) == -1:
       surf.fill(color=(255,0,0))
   else:
       surf.fill(color=(0,255,0))


    ######

# moves rect1
   if (rect1.x<0 or rect1.x>350):
       rect_speed1[0] = -rect_speed1[0]
   rect1 = rect1.move(rect_speed1)
# moves rect2
   if (rect2.x<0 or rect2.x>350):
       rect_speed2[0] = -rect_speed2[0]
   rect2 = rect2.move(rect_speed2)
# moves rect3
   if (rect3.x<0 or rect3.x>350):
       rect_speed3[0] = -rect_speed3[0]
   rect3 = rect3.move(rect_speed3)

    #update the list

   #if line.collidelist(list) == -1: fill red
   #else: fill fill green
   screen.fill(color=(0, 0, 0))

   screen.blit(surf, (rect.x,rect.y))
   screen.blit(surf1, (rect1.x,rect1.y))
   screen.blit(surf2, (rect2.x, rect2.y))
   screen.blit(surf3, (rect3.x, rect3.y))
   pygame.display.flip()
   clock.tick(60)

   for event in pygame.event.get():
       if event.type == pygame.QUIT:
           running = False
       elif event.type == pygame.KEYDOWN:
           if event.key == pygame.K_Escape:
               running = False


# Control of A Rect with Keys - Lab.8.C.
import pygame, sys
from pygame.locals import *
pygame.init()
clock = pygame.time.Clock()

print("Lab.8.C. - Keyboard Controls")

screen = pygame.display.set_mode((500,500))

blue = pygame.Rect(225,225,50,50)
rect_speed = [0,0]

surf = pygame.Surface((blue.w,blue.h))
surf.fill(color=(0,0,255))



running = True
while running:
    for event in pygame.event.get():
        if event.type == pygame.KEYDOWN:
            if event.key == pygame.K_ESCAPE:
                running = False

    # the keys
    keys = pygame.key.get_pressed()
    if keys[K_w]:
        if blue.top > 0: # prevent rect from moving off the top
            blue.y -= 5 # move up 5 if key 'w' is pressed
    if keys[K_s]:
        if blue.bottom < 500:  # prevent rect from moving off the bottom
            blue.y += 5  # move down 5 if key 's' is pressed
    if keys[K_d]:
        if blue.right < 500:  # prevent rect from moving off the right side
            blue.x += 5 # move right 5 if key 'd' is pressed
    if keys[K_a]:
        if blue.left > 0: # prevent rect from moving off the left side
            blue.x -= 5 # move left 5 if key 'a' is pressed
    if keys[K_r]:
        blue.x = 225
        blue.y = 225
    blue = blue.move(rect_speed)


    screen.fill(color=(0,0,0))
    screen.blit(surf, (blue.x,blue.y))
    pygame.display.flip()
    clock.tick(60)
