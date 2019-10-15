def get_days(month,year):
  #finding given year leap or not
  leap=year%4==0 and year%100!=0 or year%400==0
  # checking if month is Sep,Aprl,Jun,Nov
  if month == 'September' or month == 'April' or month == 'June' or month == 'November':
    return 30 
  elif month == 'January' or month == 'March' or month == 'May' or month== 'July' or month == 'August' or month == 'October' or month== 'December':
    return 31
  elif month == 'February' and leap== True:
    return 29
  elif month == 'February' and leap == False:
    return 28


print(get_days("September",2019))
print(get_days("February",2019))
print(get_days("February",2020))
