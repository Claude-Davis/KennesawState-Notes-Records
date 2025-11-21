# Course CSE 1321L
# Section: BJK
# Semester: Fall 2024
# Name: Starlan Davis

def continueGame():
    cont = input("Would you like to continue playing? (yes/no): ")
    if cont == "no":
        print(" ")
        print("Thanks for playing!")

def restartGame():
    restart = input("Would you like to restart the game? (yes/no): ")
    if restart == "yes":
        direction = input("You are in a room. Choose a direction to move in (north, south, east, west): ")
        print(" ")
        adventureGame()
    elif restart == "no":
        print(" ")
        print("Thanks for playing!")

direction = input("You are in a room. Choose a direction to move in (north, south, east, west): ")
print(" ")

while direction == "north" or "south" or "east" or "west":
    direction = input("You are in a room. Choose a direction to move in (north, south, east, west): ")

def adventureGame():
    if direction == "north":
        north_opt1 = input("You move north and find a river. What will you do? (swim/build a raft): ")
        print(" ")
        if north_opt1 == "swim":
            print("You swim to the other side of the river, but as you climb out you notice two leeches have attached themselves to your leg. What do you do?:")
            continueGame()
            print(" 1. Pull them off and keep walking.")
            print(" 2. Remove it with your pocket knife and clean out the wound.")
            north_opt2 = int(input(" "))
            print(" ")

            match (north_opt2):
                case 1:
                    north_opt3 = input("You chose to pull off the leeches and keep walking. As you travel further, your leg begins to hurt and you notice a cave. What do you do? (enter the cave/walk past it): ")
                    continueGame()
                    print(" ")

                    if north_opt3 == "cave" or north_opt3 == "enter" or north_opt3 == "enter the cave":
                        north_opt4 = input("You enter the cave. Do you want to tend to your wound or explore more of the cave?: ")
                        continueGame()
                        if north_opt4 == "tend to wound" or north_opt4 == "wound" or north_opt4 == "tend" or north_opt4 == "tend to my wound":
                            print("You pull out a water bottle and a plastic bag with antiseptic cream and a bandage and clean the wound. Once you've taken care of the wound, you decide to...")
                            print(" 1. explore more of the cave")
                            print(" 2. leave the cave and continue walking through the forest")
                            continueGame()
                            north_opt5 = int(input("Enter choice here: "))
                            match north_opt5:
                                case 1:
                                    print("You walk further into the cave and stumble upon a sleeping bear.")
                                    print("The bear wakes up and begins to chase you. You run back out of the cave and decide to...")
                                    print(" 1. try to outrun it (you're a decent runner and may be able to lose the bear in the forest)")
                                    print(" 2. climb a nearby tree (you can climb pretty quickly, and maybe the bear the bear will leave you alone)")
                                    continueGame()
                                    north_opt6 = int(input("Enter choice here: "))
                                    match north_opt6:
                                        case 1:
                                            print("You keep running and try to throw off the bear by making sharp turns through the trees. Unfortunately, the bear is faster than you and surprisingly agile.")
                                            print("As the bear gains on you and is about to land a heavy blow to your head, a thunderous crack echoes through the forest as a large tree, old and eroded, crashes down right between you and the bear. The bear jumps back, startled, and turns away, givinhg up the chase.")
                                            print("You narrowly escaped death...")
                                            print(" ")

                                            print("Thanks for playing part 1 of Nature Adventure!")
                                            restartGame()
                                        case 2:
                                            print("You climb a tree nearby and the rams into the base of it. The tree shakes a little, but stay on, gripping its trunk tightly.")
                                            print("The bear watches you a few minutes before eventually returning the cave. You wait another five or so minutes before climbing back down.")
                                            print("You escaped the bear!")
                                            print(" ")

                                            print("Thanks for playing part 1 of Nature Adventure!")
                                            restartGame()
                                case 2:
                                    print("You exit the cave and start walking ___(east/west)___")
                                    direction2 = input(" ")
                                    if direction2 == "west":
                                        print("As you head west, the forest vegetation becomes thicker, and you are having a hard time seeing...")
                                        print(" ")

                                        print("Thanks for playing part 1 of Nature Adventure!")
                                        restartGame()
                                    elif direction2 == "east":
                                        print("After heading east for about two hours, you come to an open plain...")
                                        print(" ")

                                        print("Thanks for playing part 1 of Nature Adventure!")
                                        restartGame()
                            print(" ")
                        elif north_opt4 == "explore" or north_opt4 == "explore more of the cave" or north_opt4 == "explore cave" or north_opt4 == "explore the cave":
                            print("You walk further into the cave and discover that a bear is sleeping there. Unfortunately, the bear wakes up and chases you.")
                            print("You try to run, but your injured leg gives and the bear cathches you.")
                            print(" ")

                            print("**You Died**")
                            print(" ")

                            restartGame()

                    elif north_opt3 == "walk" or north_opt3 == "walk past" or north_opt3 == "walk past it":
                        print("You chose to walk past the cave, and continue ___(east/west)___")
                        direction2 = input(" ")
                        if direction2 == "west":
                            print("As you head west, the forest vegetation becomes thicker, and you are having a hard time seeing. After about an hour, you stop to give your leg a rest...")
                            print(" ")

                            print("Thanks for playing part 1 of Nature Adventure!")
                            restartGame()
                        elif direction2 == "east":
                            print("After heading east for about an hour, you stop to rest your leg, now burning with pain...")
                            print(" ")

                            print("Thanks for playing part 1 of Nature Adventure!")
                            restartGame()
                case 2:
                    print("You carefully remove the leeches, then you pull out a water bottle and a plastic bag with antiseptic cream and a bandage to clean the wound.")
                    print(" ")

                    north_opt3 = input("You continue walking and notice a cave. What do you do? (enter the cave/walk past it)?: ")
                    if north_opt3 == "cave" or north_opt3 == "enter" or north_opt3 == "enter the cave":
                        print("You go into the cave and start exploring. But, it turns out a bear is sleeping there.")
                        print("The bear wakes up and begins to chase you. You run back out of the cave and decide to...")
                        print(" 1. try to outrun it (you're a decent runner and may be able to lose the bear in the forest)")
                        print(" 2. climb a nearby tree (you can climb pretty quickly, and maybe the bear the bear will leave you alone)")
                        north_opt4 = int(input(" "))
                        match north_opt4:
                            case 1:
                                    print("You keep running and try to throw off the bear by making sharp turns through the trees. Unfortunately, the bear is faster than you and surprisingly agile.")
                                    print("As the bear gains on you and is about to land a heavy blow to your head, a thunderous crack echoes through the forest as a large tree, old and eroded, crashes down right between you and the bear. The bear jumps back, startled, and turns away, givinhg up the chase.")
                                    print("You narrowly escaped death...")
                                    print(" ")

                                    print("Thanks for playing part 1 of Nature Adventure!")
                                    restartGame()
                            case 2:
                                    print("You climb a tree nearby and the rams into the base of it. The tree shakes a little, but stay on, gripping its trunk tightly.")
                                    print("The bear watches you a few minutes before eventually returning the cave. You wait another five or so minutes before climbing back down.")
                                    print("You escaped the bear!")
                                    print(" ")

                                    print("Thanks for playing part 1 of Nature Adventure!")
                                    restartGame()
                    elif north_opt3 == "walk" or north_opt3 == "walk past" or north_opt3 == "walk past it" or north_opt3 == "walk past the cave":
                        print("You ignore the cave and continue walking ___(east/west)___")
                        direction2 = input(" ")
                        if direction2 == "west":
                            print("As you head west, the forest vegetation becomes thicker, and you are having a hard time seeing...")
                            print(" ")

                            print("Thanks for playing part 1 of Nature Adventure!")
                            restartGame()
                        elif direction2 == "east":
                            print("After heading east for about two hours, you come to an open plain...")
                            print(" ")

                            print("Thanks for playing part 1 of Nature Adventure!")
                            restartGame()


        elif north_opt1 == "build a raft" or "raft":
            print("You finish the raft, but have limited space. What do you take with you?: ")
            print(" 1. lifeline rope and first aid kit")
            print(" 2. tent and bow drill fire starter")
            north_opt2 = int(input(" "))
            print(" ")

            match (north_opt2):
                case 1:
                    print("You brought the rope and first aid kit. Once on the other side of the river, you keep walking and come to the base of a mountain.")
                    print(" ")

                    north_opt3 = input("Do you want to climb this mountain? (yes/no)")
                    if north_opt3 == "yes":
                        north_opt4 = int(input("Choose a number between 1 and 5 to decide what happens next:"))
                        match north_opt4:
                            case 1:
                                print("You start climbing, and as you make it about halfway up the mountain, your foot slips and you fall.")
                                print("Your head strikes a rock. Unfortunately, your journey is over.")
                                print(" ")

                                print("**You Died**")

                                restartGame()
                            case 2:
                                print("Before you start climbing, you walk around the base of the mountain, searching for a safer way up.")
                                print("Rather than a trail up the mountain, you discover an entrance into what looks to be a mineshaft. Do you want to explore the mineshaft or climb up the mountain?")
                                north_opt5 = input(" ")

                                if north_opt5 == "climb the mountain" or north_opt5 == "mountain" or north_opt5 == "climb" or north_opt5 == "climb up the mountain":
                                    print("Choose a number between 1 and 5, but excluding 2:")
                                    north_opt6 = int(input(" "))

                                    match north_opt6:
                                        case 1:
                                            print("You start climbing, and as you make it about halfway up the mountain, your foot slips and you fall.")
                                            print("Your head strikes a rock. Unfortunately, your journey is over.")
                                            print(" ")

                                            print("**You Died**")

                                            restartGame()
                                        case 3:
                                            print("You carefully begin climbing the mountain. It takes you a while, but you eventually reach the top.")
                                            print("With sore arms and legs, you pull yourself over the edge.")
                                            print("You look up, and in front of you is a village!")
                                            print(" ")

                                            print("Thanks for playing part 1 of Nature Adventure!")
                                            restartGame()
                                        case 4:
                                            print("You carefully begin climbing the mountain. It takes you a while and the high altitude begins to affect you.")
                                            print("You begin to feel nauseous and dizzy.")
                                            print(" ")
                                            print("Fortunately, you manage to hold out and make it to the top!")
                                            print(" ")
                                            print("You look up, and in front of you is a village!")
                                            print(" ")

                                            print("Thanks for playing part 1 of Nature Adventure!")
                                            restartGame()
                                        case 5:
                                            print("You carefully begin climbing the mountain. It takes you a while and the high altitude begins to affect you.")
                                            print("You begin to feel nauseous and dizzy.")
                                            print(" ")
                                            print("Unfortunately, the dizziness and your weak leg get the best of you. And you fall.")
                                            print("Your head strikes a rock. Sadly, your journey is over.")
                                            print(" ")

                                            print("**You Died**")

                                            restartGame()
                                    
                                elif north_opt5 == "mineshaft" or north_opt5 == "explore" or north_opt5 == "explore mineshaft" or north_opt5 == "explore the mineshaft":
                                    print("You enter the mineshaft...")
                                    print(" ")

                                    print("Thank you for playing part 1 of Nature Adventure!")
                                    restartGame()        

                            case 3:
                                print("You carefully begin climbing the mountain. It takes you a while, but you eventually reach the top.")
                                print("With sore arms and legs, you pull yourself over the edge.")
                                print("You look up, and in front of you is a village!")
                                print(" ")

                                print("Thanks for playing part 1 of Nature Adventure!")
                                restartGame()
                            case 4:
                                print("You carefully begin climbing the mountain. It takes you a while and the high altitude begins to affect you.")
                                print("You begin to feel nauseous and dizzy.")
                                print(" ")
                                print("Fortunately, you manage to hold out and make it to the top!")
                                print(" ")
                                print("You look up, and in front of you is a village!")
                                print(" ")

                                print("Thanks for playing part 1 of Nature Adventure!")
                                restartGame()
                            case 5:
                                print("You carefully begin climbing the mountain. It takes you a while and the high altitude begins to affect you.")
                                print("You begin to feel nauseous and dizzy.")
                                print(" ")
                                print("Unfortunately, the dizziness and your weak leg get the best of you. And you fall.")
                                print("Your head strikes a rock. Sadly, your journey is over.")
                                print(" ")

                                print("**You Died**")

                                restartGame()

                    elif north_opt3 == "no":
                        print("")
                        print("You walk around the base of the mountain, searching for an alternative route.")
                        print("You discover an entrance to what looks to be a mineshaft.")
                        print("")
                        print("You walk into the mineshaft...")
                        print(" ")

                        print("Thank you for playing part 1 of Nature Adventure!")
                        restartGame()
                case 2:
                    print("You brought the rope and first aid kit. Once on the other side of the river, you keep walking and come to the base of a mountain.")
                    print(" ")
                    north_opt3 = input("Do you want to climb this mountain? (yes/no)")
                    if north_opt3 == "yes":
                        north_opt4 = int(input("Choose a number between 1 and 5 to decide what happens next: "))
                        match north_opt4:
                            case 1:
                                print("You start climbing, and as you make it about halfway up the mountain, your foot slips and you fall.")
                                print("Your head strikes a rock. Unfortunately, your journey is over.")
                                print(" ")

                                print("**You Died**")

                                restartGame()
                            case 2:
                                print("Before you start climbing, you walk around the base of the mountain, searching for a safer way up.")
                                print("Rather than a trail up the mountain, you discover an entrance into what looks to be a mineshaft. Do you want to explore the mineshaft or climb up the mountain?")
                                north_opt5 = input(" ")

                                if north_opt5 == "climb the mountain" or north_opt5 == "mountain" or north_opt5 == "climb" or north_opt5 == "climb up the mountain":
                                    print("You carefully begin climbing the mountain. It takes you a while, but you eventually reach the top.")
                                    print("With sore arms and legs, you pull yourself over the edge.")
                                    print("You look up, and in front of you is a village!")
                                    print(" ")

                                    print("Thanks for playing part 1 of Nature Adventure!")
                                    restartGame()
                                
                                elif north_opt5 == "mineshaft" or north_opt5 == "explore" or north_opt5 == "explore mineshaft" or north_opt5 == "explore the mineshaft":
                                    print("You enter the mineshaft...")
                                    print(" ")

                                    print("Thank you for playing part 1 of Nature Adventure!")
                                    restartGame()        

                            case 3:
                                print("You carefully begin climbing the mountain. It takes you a while, but you eventually reach the top.")
                                print("With sore arms and legs, you pull yourself over the edge.")
                                print("You look up, and in front of you is a village!")
                                print(" ")

                                print("Thanks for playing part 1 of Nature Adventure!")
                                restartGame()
                            case 4:
                                print("You carefully begin climbing the mountain. It takes you a while and the high altitude begins to affect you.")
                                print("You begin to feel nauseous and dizzy.")
                                print(" ")
                                print("Fortunately, you manage to hold out and make it to the top!")
                                print(" ")
                                print("You look up, and in front of you is a village!")
                                print(" ")

                                print("Thanks for playing part 1 of Nature Adventure!")
                                restartGame()
                            case 5:
                                print("You carefully begin climbing the mountain. It takes you a while and the high altitude begins to affect you.")
                                print("You begin to feel nauseous and dizzy.")
                                print(" ")
                                print("Unfortunately, the dizziness and your weak leg get the best of you. And you fall.")
                                print("Your head strikes a rock. Sadly, your journey is over.")
                                print(" ")

                                print("**You Died**")

                                restartGame()

                    elif north_opt3 == "no":
                        print("")
                        print("You walk around the base of the mountain, searching for an alternative route.")
                        print("You discover an entrance to what looks to be a mineshaft.")
                        print("")
                        print("You walk into the mineshaft...")
                        print(" ")

                        print("Thank you for playing part 1 of Nature Adventure!")
                        restartGame()

####################################################        SOUTH
    elif direction == "south":
        south_opt = 1("You move south and discover a dense forest. What will you do? (climb a tree/walk deeper into the forest): ")
        if south_opt == "climb" or south_opt == "tree" or south_opt == "climb a tree":
            print("You climb the tree. Once at the top, you notice a cabin off to your right, and a lake to your left.")
            print(" ")
            continueGame()
            south_opt2 = input("Do you want to explore the cabin or the lake?  ")
            if south_opt2 == "lake" or south_opt2 == "explore the lake" or south_opt2 == "the lake":
                print("You go to the lake and find a small boat.")
                print("On the the boat is a map. You follow the map and it leads you to a mountain..  ")
                print(" ")

                print("Thank you for playing part 1 of Nature Adventure!")
                restartGame()
            elif south_opt2 == "cabin" or south_opt2 == "the cabin" or south_opt2 == "explore the cabin":
                print("You go to the cabin and explore inside.")
                print("You discover a map. You follow the map and it eventually leads you to a dense part of the mountain and to an abandoned house..")
                print(" ")
                    
                print("Thank you for playing part 1 of Nature Adventure!")
                restartGame()

        elif south_opt == "forest" or south_opt == "walk" or south_opt == "walk deeper into the forest":
            south_opt2 = input("In the forest you discover an old cabin. Do you want to explore it? (yes/no)  ")
            if south_opt2 == "yes":
                print("You go to the cabin and explore inside.")
                print("You discover a map. You follow the map and it eventually leads you to a dense part of the mountain and to an abandoned house..")
                print(" ")
                    
                print("Thank you for playing part 1 of Nature Adventure!")
                restartGame()
            elif south_opt2 == "no":
                print("You walk past the cabin. As you continue, the forest becomes denser, and oddly quiet..")
                print(" ")

                print("Thank you for playing part 1 of Nature Adventure!")
                restartGame()

                

####################################################        WEST
    elif direction == "west":
        west_opt1 = input ("You move west and stumble upon a cave. What will you do? (enter the cave/walk past it): ")
        print(" ")
        continueGame()

        if west_opt1 == "enter" or west_opt1 == "cave" or west_opt1 == "enter the cave":
            print("You walk into the cave and eventually find a small box, the outside faded and worn.")
            print("You open the boxand find an expensive-looking ring and a note.")
            print("The note reads: ")
            print("  Here is the ring. I trust you understand what this means. You know the dangers. Be cautious of your surroundings and of those you meet. Trust no one.")
            continueGame()
            
            print(" ")
            west_opt2 = input("Do you want to explore the story of this note and ring? (yes/no)  ")
        if west_opt2 == "no":
            print("... okay.")
            print(" ")
            print("Thank you for playing part 1 of Nature Adventure!")
            restartGame()
        elif west_opt2 == "yes":
            print("Wonderful.  >:)")
            print(" ")
            print(" ")
            print("Continue the story in Part 2 of Nature Adventure!")
            restartGame()

####################################################        EAST
    elif direction == "east":
        east_opt1 = input("You move east and encounter a mountain. (climb the mountain/go around it): ")
        print(" ") 
        if east_opt1 == "climb" or east_opt1 == "climb the mountain" or east_opt1 == "climb it":
            east_opt2 = input(()"Choose a number between 1 and 5: "))
        elif east_opt1 == "go around it" or east_opt1 == "go around" or east_op1 == "around":
            ###


adventureGame()
