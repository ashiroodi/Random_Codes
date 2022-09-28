"Hello, World"
[1] "Hello, World"
> class("Hello, World")
[1] "character"
> name <- "Matthew"
> surname <- "Shiroodi"
> age <- 21
> paste("Hello Dear",name,"Aged",age,"Surname",surname)
[1] "Hello Dear Matthew Aged 21 Surname Shiroodi"
> class(age)
[1] "numeric"
> new_age = as.numeric(age)
> new_age_2 = as.integer(age)
> new_age_3 = as.complex(age)
> paste("Data Type is" , class(new_age))
[1] "Data Type is numeric"
> paste("Data Type is" , class(new_age_2))
[1] "Data Type is integer"
> paste("Data Type is" , class(new_age_3))
[1] "Data Type is complex"
> num <- 10
> num <- 25
> num_1 <- 25
> num_1 + num
[1] 50

## this is also how to make comment in R

## testing
> "Hellow World"
[1] "Hellow World"
> age <- 10L
> class(age)
[1] "integer"
> age_new <- as.complex(age)
> class(age_new)
[1] "complex"
> paste("The value in here is " , class(age_new))
[1] "The value in here is  complex"
> ## practice

#new Lesson
  
  > "Hellow World"
[1] "Hellow World"
> age <- 10L
> class(age)
[1] "integer"
> age_new <- as.complex(age)
> class(age_new)
[1] "complex"
> paste("The value in here is " , class(age_new))
[1] "The value in here is  complex"
> ## practice
> #### NEW Lesson
> num <- 10
> num <- 2
> num_2 <- 5
> num + num_2
[1] 7
> 10 + 5
[1] 15
> ## there are built in math function
> num_1 <- 10
> num_2 <- 50
> num_3 <- 100
> max(num_1, num_2, num_3)
[1] 100
> ## found the maximum number there
  > min(num_1, num_2, num_3)
[1] 10
> ## found the minimum number there
  > sqrt(num_1)
[1] 3.162278
> ## bring the sqrt of that value
  > abs(num_2)
[1] 50
> abs(-4.7)
[1] 4.7
> ## this brings the absolute positive value
  > ceiling(10.5)
[1] 11
> floor(10.5)
[1] 10
> testing <- floor(10.5)
> class(testing)
[1] "numeric"
> conv_testing <- as.integer(testing)
> class(conv_testing)
[1] "integer"
> conv_testing_complex <- as.complex(conv_testing)
> class conv_testing_complex
Error: unexpected symbol in "class conv_testing_complex"
> class(conv_testing_complex)
[1] "complex"
> conv_testing_complex
[1] 10+0i
    
> nchar("Hellow World")
[1] 12
> ## we can also search for a charector
> str <- "Hello World"
> nchar(str)
[1] 11
> grepl("H", str)
[1] TRUE
> grepl("W",str)
[1] TRUE
> grepl("F", str)
[1] FALSE
> ## Returns Boolean Values
> 10 > 9
[1] TRUE
> 10 == 9
[1] FALSE
> 10 < 9
[1] FALSE
> 10 == ceiling(9.5)
[1] TRUE
> a  <- 200
> b <- 500
> if (b > a) {
+ print(b, "Is greater than" , a)
+ } else {
  + print(b , "Smaller than", a)
  + }
Error in print.default(b, "Is greater than", a) : 
invalid printing digits -2147483648
In addition: Warning message:
In print.default(b, "Is greater than", a) : NAs introduced by coercion
> if (b > a) {
+ paste(b, "Is greater than" , a)
+ } else {
  + paste(b , "Smaller than", a)
  + }
[1] "500 Is greater than 200"
> a <- 350
> b <- ceiling(349.5)
> if (a > b) {
+ paste(a, "is bigger than", b)
+ } else if (a == b) {
  + paste(a, "equals to",b)
  + } else {
    + paste(a , "Is Smaller than", b)
    + }
[1] "350 equals to 350"
