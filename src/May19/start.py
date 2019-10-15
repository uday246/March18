from tkinter import*

c = Canvas ()
c.pack()

verts = [40,70,70,70,80,40,90,70,120,70,95,90,105,120,80,100,55,120,65,90]
for i in range(len(verts)):
    verts[i] += 100
    
c.create_polygon(verts, fill='yellow', outline='yellow')
c.mainloop()
c.create_text("Hello")