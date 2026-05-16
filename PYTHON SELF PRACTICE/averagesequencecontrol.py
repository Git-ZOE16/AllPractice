#Set total to zero
#Set grade counter to zero
#Set grades to a list of the ten grades
#For each grade in the grades list:
#Add the grade to the total
#Add one to the grade counter
#Set the class average to the total divided by the number of grades
#Display the class average



#CODE

total = 0
grade_counter = 0

grades = [5, 6, 8, 4, 78, 50, 40, 30, 20, 10 ]
for grade in grades:
     total += grade
     grade_counter += 1
average = total / grade_counter
print(f'class average is {average}')
 
