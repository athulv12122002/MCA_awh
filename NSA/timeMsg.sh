time=$( date +%H)
echo $time ":" $( date +%M) ":" $( date +%S)

if [ $time -gt 0 -a $time -lt 12 ]
then
	echo "GOOD MORNING..."
elif [ $time -gt 12 -a $time -lt 16 ]
then 
	echo "GOOD AFTERNOON..."
elif [ $time -gt 16 -a $time -lt 24 ]
then
	echo "GOOD EVENING..."
else
	echo "GOOD NIGHT...BYEEE!"
fi

