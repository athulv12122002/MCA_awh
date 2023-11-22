list=['a','ab','abc','abcd','abcde']
big=0
for i in list:
    length=len(i)
    word=i
    if length > big:
        big=length
        big_word=i;
print("The Big word is: ",big_word,"and its length is:",big)
