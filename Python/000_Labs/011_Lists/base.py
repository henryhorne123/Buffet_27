import random
jokes = ["Why did the chicken cross the road? To get to the other side", "Guess what? Chicken Butt", "What do you call a cow with no legs? Ground Beef", "What do you call a cow with 2 legs? Lean Beef", "What do you call a girl with only one leg? Ilean"]
random = int(random.randrange(0,4))
if random == 0:
    print(jokes[0])
elif random == 1:
    print(jokes[1])
elif random == 2:
    print(jokes[2])
elif random == 3:
    print(jokes[3])
elif random == 4:
    print(jokes[4])