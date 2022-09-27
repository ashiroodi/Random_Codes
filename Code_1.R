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

