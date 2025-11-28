# addition of new instructions screen


import pygame,sys
pygame.init()

import random # defines "random" and allows for the use of "random.randint" to randomize number selection
clock = pygame.time.Clock() # defines "clock" to all for a frame rate to be established


# screens:
    # main
screen= pygame.display.set_mode((900,760))  # intializes the display and its size
screen_image = pygame.image.load("background setting image.png").convert()
screen_background_image = pygame.transform.scale(screen_image, (900,760))

    # cover
cover_image = pygame.image.load("cover screen image.png")
resized_cover_image = pygame.transform.scale(cover_image, (900,760))

    # game over
game_over_image = pygame.image.load("game over image.png")
resized_game_over_image = pygame.transform.scale(game_over_image, (900,760))

    # instructions
instructions_screen = pygame.image.load("How To Play.png")
resized_instructions = pygame.transform.scale(instructions_screen, (900,760))


# background objects:

    # bonfire 1
bonfire_image = pygame.image.load("bonfire image.png")
bonfire_scaled = pygame.transform.scale(bonfire_image, (100,105))
bonfire = pygame.transform.rotate(bonfire_scaled, -44)

    # bonfire 2
bonfire_image1 = pygame.image.load("bonfire image.png")
bonfire_scaled1 = pygame.transform.scale(bonfire_image1, (113,113))
bonfire1 = pygame.transform.rotate(bonfire_scaled1, -43)

# background music
music = pygame.mixer.music.load("group 6 music file.mp3")
pygame.mixer.music.set_volume(0.4)
pygame.mixer.music.play(-1,0,1000)




# class for user character, "dragon"  /  defines the properties and attributes of the "Dragon"
class Dragon(pygame.sprite.Sprite):
    def __init__(self,color,x,y):  # the basic properties of the Dragon
        super().__init__()
        dragon_image = pygame.image.load("user character light alt.png")
        self.image = pygame.transform.scale(dragon_image, (125,135))
        #self.image = pygame.Surface((55,40)) # creates the surface for the Dragon (its size)
        #self.image.fill((201,0,201))  # assigns a specific collor to the Dragon
        x = 455
        y = 245
        self.rect = self.image.get_rect(center=(750,370)) # allows for the spawning location to be assigned
        self.dragon_health = 3000  # initializes a counter for the "health" of the Dragon

    def move(self,screen_width,screen_height):  # when called, allows for the Dragon to be moved according to specific requirements defined below 
        keys = pygame.key.get_pressed()

        # WASD controls
        if keys[pygame.K_a] and self.rect.left > 0:
            self.rect.x -= 5                        # the "A" key moves the Dragon left / forward
        if keys[pygame.K_d] and self.rect.right < 900:
            self.rect.x += 5                            # the "D" key moves the Dragon right / backward
        if keys[pygame.K_s] and self.rect.bottom < 760:
            self.rect.y += 5                            # the "S" key mpves the Dragon down
        if keys[pygame.K_w] and self.rect.top > 0:
            self.rect.y -= 5                        # the "W" key moves the Dragon up

        # arrow controls
        if keys[pygame.K_RIGHT] and self.rect.right < 900:
            self.rect.x += 5                                # the RIGHT arrow key moves the user right
        if keys[pygame.K_LEFT] and self.rect.left > 0:
            self.rect.x -= 5                            # the LEFT arrow key moves the user left / forward
        if keys[pygame.K_UP] and self.rect.top > 0:
            self.rect.y -= 5                         # the UP arrow key moves the user up   
        if keys[pygame.K_DOWN] and self.rect.bottom < 760:
            self.rect.y += 5                                # the DOWN arrow key moves the down right / backward



# class for the enemy characters, "heroes"  /  defines the properties and attributes of the "Heroes"
class Hero(pygame.sprite.Sprite):
    def __init__(self,color):
        super().__init__()
        hero_image = pygame.image.load("knight and sword image.png")
        self.image = pygame.transform.scale(hero_image, (55,70))
        #self.image = pygame.Surface((16,16)) # creates the surface (and defines its size)
        #self.image.fill((255,255,255))  # assigns a color
        self.rect = self.image.get_rect(center=(-10, random.randint(0,760)))  # specifies the spawning location; in this case, the y-coordinate is a randomly generated integer between 0 and 500 (the full height of the screen)
        self.hero_health = 400  # initializes a counter for the "health" of the Heroes

    def follow_dragon(self, dragon_x, dragon_y):   # when called, allows for the Heroes to move according to specific requirements defined below
        # the Heroes are programmed to follow the Dragon
        if show_cover or game_over:            # stops movement while the cover screen is visible  / when the user has died
            if self.rect.x < dragon_x:
                self.rect.x += 0
            elif self.rect.x > dragon_x:
                self.rect.x -= 0
            if self.rect.y < dragon_y:
                self.rect.y += 0
            elif self.rect.y > dragon_y: 
                self.rect.y -= 0
        else:
            if self.rect.x < dragon_x:
                self.rect.x += random.randint(1,4)
            elif self.rect.x > dragon_x:
                self.rect.x -= random.randint(1,5)
            if self.rect.y < dragon_y:
                self.rect.y += random.randint(1,4)
            elif self.rect.y > dragon_y: 
                self.rect.y -= random.randint(1,5) 
        # PENDING : image flip to always face user / match the direction of travel
        """  
        hero_image = pygame.image.load("knight and sword image.png").convert_alpha() # defines hero_image to allow image to be flipped
        if self.rect.x > dragon_x:
            self.image = pygame.transform.flip(hero_image,True,False)
        """

# function that, when called, causes a new Hero to spawn for each Hero that is 'killed'
def spawn():
    if len(heroes) < 3:
        hero = Hero((255,255,255))  # the variable "hero" is defined by the class "Hero"
        all_sprites.add(hero)  # adds each spawned hero into the group "all_sprites"
        heroes.add(hero) # adds each spawned hero in to the group "heroes"
    print(f"Hero spawned at {hero.rect.center}. Total heroes: {len(heroes)}")   # this line is to aid in debugging by printing a statement each time a new hero is spawned




# class for user's attack, "fireballs"
class Fireball(pygame.sprite.Sprite):
    def __init__(self,color,x,y):
        super().__init__()
        fireball_image = pygame.image.load("fireball image.png")
        self.image = pygame.transform.scale(fireball_image, (90,90))
        #self.image = pygame.Surface((20,20))
        #self.image.fill((255,128,0))
        self.rect = self.image.get_rect(center=(x,y))
    def update(self): # when called, assigns the direction and speed of the rect's travel
        self.rect.x -= 6.3

# create a sprite group for ALL sprites
all_sprites = pygame.sprite.Group()

# create sprite group for "heroes"
heroes = pygame.sprite.Group()

# create sprite group for "fireballs" (user's attack object)
fireballs = pygame.sprite.Group()

# initialize the sprites
dragon = Dragon((201,0,201), 185, 450)
all_sprites.add(dragon)  # adds the dragon to the group "all_sprites"


# spawn the initial heroes
for i in range(3):
    spawn()





# cover screen text
cover_text = pygame.font.SysFont("Courier New",50)

# user / dragon health bar
health_text = pygame.font.Font(None,30)


kill_count = 0  # initializes the kill count tracker
kc_font = pygame.font.Font(None,30) # initializes the font and size for the tracker to be displayed on the screen

# end of game report (high score and current score)
ckr_font = pygame.font.Font(None,70)

record_kill_count = 0 # will track the user's "high score" or the most kills they've done in a round
rkc_font = pygame.font.Font(None,85)



running = True

show_cover = True
show_instructions = True
game_over = False

while running:
    # quit game, shoot fireballs, show instructions
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False
        elif event.type == pygame.KEYDOWN:
            if event.key == pygame.K_ESCAPE:
                running = False
            elif event.key == pygame.K_SPACE:  # spacebar control for attack
                fireball = Fireball((255,128,0), dragon.rect.centerx, dragon.rect.centery)
                all_sprites.add(fireball)  # adds every spawned fireball into the "all_sprites" group
                fireballs.add(fireball) # adds every spawned fireball into the "fireballs" group
                # audio effect for fireball attack
                attack_audio = pygame.mixer.Sound("fireball attack audio.wav")
                attack_audio.set_volume(0.25)
                attack_audio.play(1,1000)
            elif game_over: # this section of code ONLY works if the user has lost all of his/her health
                if event.key == pygame.K_r:
                    game_over = False
                    hero.hero_health = 300 # resets heroes' health
                    dragon.dragon_health = 2500 # resets user's health
                    # spawn the initial heroes
                    for i in range(3):
                        spawn()
                    # reset kill count
                    kill_count = 0

    # updates
    dragon.move(900,800)    # calls the Dragon's move method to update user position
    fireballs.update()  # updates the entire "fireballs" group

    if len(heroes) < 3 and not game_over:
        spawn()

    # The heroes follow the dragon
    for hero in heroes:
        hero.follow_dragon(dragon.rect.centerx, dragon.rect.centery)

    # collision detection / taking damage
    heroes_damage = pygame.sprite.groupcollide(fireballs,heroes,True,False)  # collision between fireball and a hero = damage to hero
       # "True" applies to removing the fireball ; False applies to keeping the hero
    for fireball_contact, hero_contact in heroes_damage.items():
        for hero in hero_contact:
            hero.hero_health -= 40
            if hero.hero_health <= 0:
                all_sprites.remove(hero)
                heroes.remove(hero)
                spawn()
    
    # hero kill count (aka, how many heroes the user/dragon has killed)
    if hero.hero_health <= 0:
        kill_count += 1  # increases the kill count for each hero that loses all its health
    kills_tracker = kc_font.render("Hero Kill Count: " + str(kill_count), True, (255,255,255))
        
    dragon_damage = pygame.sprite.spritecollide(dragon, heroes, False)   # collision between dragon and hero = damage dealt to dragon
        # "False" applies to keeping the hero
    for hero in dragon_damage:
        dragon.dragon_health -= 10
        if dragon.dragon_health <= 0:
            game_over = True
    user_health_tracker = health_text.render("Your Health: " + str(dragon.dragon_health), True, (255,255,255))


    # high score verification
    if record_kill_count < kill_count:  # if the current kill count is less than the high score, then this kill count becomes the new high score
        record_kill_count = kill_count


    screen.fill((0,0,0))
    screen.blit(screen_background_image, (0,0))

    screen.blit(bonfire, (260,254))
    screen.blit(bonfire1, (180,95))

    screen.blit(kills_tracker, (15,15))
    screen.blit(user_health_tracker, (15,50))

    all_sprites.draw(screen)

    
    # game over
    if game_over:
        screen.blit(resized_game_over_image, (0,0))
        current_kills_report = ckr_font.render("Your Kills: " + str(kill_count), True, (0,0,255))
        high_score = rkc_font.render("Your Record: " + str(record_kill_count), True, (0,0,255))
        screen.blit(current_kills_report, (297,670))
        screen.blit(high_score, (240,609))
            # despawn heroes
        all_sprites.remove(hero)  # removes the heroes from the all_sprites group
        heroes.remove(hero)  # removes the heroes from the hero group
        #attack_audio.set_volume(0.0) # prevents audio sound

    # instructions screen
    if show_instructions:
        screen.blit(resized_instructions, (0,0))

    # cover screen
    if show_cover:
        screen.blit(resized_cover_image, (0,0))
        cover_screen_text = cover_text.render("Click Anywhere to Continue", True, (255,255,255))
        screen.blit(cover_screen_text, (50,700))
        if event.type == pygame.MOUSEBUTTONDOWN:
            show_cover = False
    

    pygame.display.flip()
    clock.tick(60)
