echo "enter a sentance :: "
read word
vowels=$(echo $word |grep -o -i "[aeiou]" | wc --lines)
echo Vowels :: $vowels
