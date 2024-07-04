echo enter your file name
read file
c=`cat $file | wc -c`
echo $c character in the file :: $file
w=`cat $file | wc -w`
echo $w words in the file :: $file
l=`cat $file | wc -l`
echo $l line in the file :: $file
