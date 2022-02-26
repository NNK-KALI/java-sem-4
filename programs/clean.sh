echo "-----------------------------------------"
echo "Listing all .class files"
ls *.class | cat -n
echo "........................................."
echo -n "All the above files will be removed(Y/N) : "; read choice 

if [[ ($choice == 'Y') || ($choice == 'y') ]]
then
  rm --verbose *.class
elif [[ $choice == 'N' ||  $choice = 'n' ]]
then
  echo -e "No files Deleted\nExiting "
else
  echo -e  "Invalid Key \nExiting"
fi

