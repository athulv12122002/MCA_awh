echo "Enter a Number: "
read num
i=1
while [ $i -le 10 ]
do
        mul=$((num*i))
        echo $i"*"$num"="$mul
        ((i++))
done
