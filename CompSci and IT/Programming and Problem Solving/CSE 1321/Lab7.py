# Course CSE 1321L
# Section: BJK
# Semester: Fall 2024
# Name: Starlan Davis
# Date: 09/30/2024

print("Lab.7.A. - Gradual Color Change of the Screen")
print(" ")
import pygame

pygame.init()
clock = pygame.time.Clock()

screen = pygame.display.set_mode((400,400))

color_value = 0
increasing = True  # determines if the color value is increasing or decreasing

run = True
while run:
    # fills the screen with the current color
    screen.fill((color_value,color_value,color_value))

    if increasing:
        color_value += 1
        if color_value >=255:
            increasing = False
    else:
        color_value -= 1
        if color_value <= 0:
            increasing = True

    pygame.display.flip()
    clock.tick(85)

    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False
          
print(" ")
print("-------------------------------------")
print(" ")

print("Lab.7.B. - Five Red Rects")
print(" ")
import pygame
pygame.init()

screen = pygame.display.set_mode((600,600))

rect = pygame.Rect(0,0,60,60)

surf = pygame.Surface((rect.w,rect.h))
surf.fill(color=(255,0,0))

screen.blit(surf, (0,0))
screen.blit(surf,(0,540))
screen.blit(surf, (540,540))
screen.blit(surf, (540,0))
screen.blit(surf, (270,270))

pygame.display.flip()

run = True
while run:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

print(" ")
print("-------------------------------------")
print(" ")

print("Lab.7.C. - Moving Rects")
print(" ")
import pygame
pygame.init()
clock = pygame.time.Clock()

screen = pygame.display.set_mode((1000,500))

rect1 = pygame.Rect(0,0,100,100)
rect2 = pygame.Rect(0,400,100,100)

rect_speed = [5,0]

surf1 = pygame.Surface((rect1.w,rect1.h))
surf1.fill(color=(0,255,0))

surf2 = pygame.Surface((rect2.w,rect2.h))
surf2.fill(color=(0,0,255))


run = True
while run:
    if (rect1.x<0 or rect1.x>900):
        rect_speed[0] = -rect_speed[0]
    rect1 = rect1.move(rect_speed)

    if (rect2.x<0 or rect2.x>900):
        rect_speed[1] = -rect_speed[1]
    rect2 = rect2.move(rect_speed)

    screen.fill(color=(0,0,0))
    screen.blit(surf1, (rect1.x,rect1.y))
    screen.blit(surf2, (rect2.x, rect2.y))
    pygame.display.flip()
    clock.tick(60)

    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False
