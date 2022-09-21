#!/usr/bin/env python
# coding: utf-8




import re ##importing one of the pythong libraries called the RegEX

end_user_name = input("Enter Your Name :") ## asks the user for their name
name_result = end_user_name ##their name will be stored as name_result

end_user_surname = input("Enter Your Surname :") ## asks the user for their surname
surname_result = end_user_surname ##stores the surname as surname_result

end_user_username = input("Choose a Username :") ## asks the user for their username
username_result = end_user_username ## stores the username as username_result

end_user_host = input("what Server are you running from :") ## asks what host e.g server the end_user is running from
host_result = end_user_host ##stores that as host_result

pattern = '^[a-z 0-9]+[\._]?[a-z 0-9]+[@]\w+[.]\w{2,3}$' ## splitting email into 3 parts and based on the patterns that the email is written it will be forcing its condition and the sign "@" is invalid in conditions if used wrong.


def email_validation(user_id): ## function that accepts the expression written and passes into the function for validation.
    user_id = input("Enter your Email address :") ## asks for the email address.
    while True: ## making a loop to force the user into clicking correct email address based on the condition.
        if re.search(pattern, user_id):
            print(user_id + " is ****VALID****") ## here if the email written by the end_user matches the pattern it will print the email and next to it show will show that its valid.
            return user_id ## here it will return the value to the user_id variable
            break ## breaks the loop when the condition meets.
        else: ## it will go to the next condition
            print("Email *****INVALID*****") ## first prints the invalid message to the end_user
            user_id = input("Enter a VALID email :") ## prompts and forces the user to obey the pattern and any illegal use of @ will not be accepted.
            

email = email_validation("Enter you Email Address :")## here it launches the function call and passes in the parameter.         
mydic = {
    "name" : name_result,
    "surname" : surname_result,
    "username" : username_result,
    "server" : host_result,
    "email" : email
} ## here i have made a dictionary and it prints out all the things that user inputed IF the email validation is correct.

for x, y in mydic.items(): ## and here the values inside my dictionary gets printed out.
    print(x," :",y)
