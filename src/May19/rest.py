import turtle 

x = turtle.Turtle()
x.speed(0)

def draw_star(length, angle):

 for i in range(5): #the star is made out of 5 sides
  x.forward(length)
  x.right(angle)


for i in range(1):
 x.color("purple") #if  you want outline of the star choose .color("purple" + "outline color")
 x.begin_fill()
 draw_star(100, 144) #144 is the perfect angle for a star
 x.end_fill()