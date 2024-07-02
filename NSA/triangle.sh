echo "Enter Side A"
read a
echo "Enter Side B"
read b
echo "Enter Side C"
read c

if [ $a == $b -a $a == $c -a $b == $c ]
then
        echo "Triangle is Equilateral."
elif [ $a == $b -o $b == $c -o $a = $c ]
then
        echo "Triangle is Isosceles."
else
        echo "Triangle is Scalene."
fi
