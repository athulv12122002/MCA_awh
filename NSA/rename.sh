#rename
for file in *;
do
  if [ -f "$file" ]
  then
  mv "$file" "$file.$$"
  echo "Renamed $file to $file.$$"
  fi
done


#undo rename
#!/bin/bash
for file in *; do
    if [ -f "$file" ]; then
        newfile="${file%.*}"  # Remove the appended PID
        mv "$file" "$newfile"
        echo "Restored $file to $newfile"
    fi
done
