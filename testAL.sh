#!/usr/bin/env bash

# Testing script for Project F, BasicArrayList
# Author: Assistant Professor Mike Ryu <mryu@westmont.edu>

PASSWORD=$(<testAL.key)
RED="\e[31m"
GRN="\e[32m"
YLO="\e[33m"
END="\e[0m"

# shellcheck disable=SC2059
printf "\n${YLO}Decrypting instructor's test source code ...${END}\n";
openssl enc -d -aes-256-cbc -pbkdf2 -in BasicArrayListTestDriver.enc -out BasicArrayListTestDriver.java -pass pass:"$PASSWORD";
IS_DEC_SUCCESS=$?

if [ $IS_DEC_SUCCESS -eq 0 ]; then
  # shellcheck disable=SC2059
  printf "\n${GRN}[PASS] Decryption successful!${END}\n\n";
else
  rm ./BasicArrayListTestDriver.java
  # shellcheck disable=SC2059
  printf "\n${RED}[FAIL] Decryption failed. Check password?${END}\n";
  exit 1;
fi

# shellcheck disable=SC2059
printf "\n${YLO}Compiling your code ...${END}\n";
javac -cp *.jar ./*.java;
IS_JAVAC_SUCCESS=$?

rm ./BasicArrayListTestDriver.java;
if [ $IS_JAVAC_SUCCESS -eq 0 ]; then
  # shellcheck disable=SC2059
  printf "\n${GRN}[PASS] Compilation successful!${END}\n\n";
else
  rm BasicArrayListTestDriver.java;
  # shellcheck disable=SC2059
  printf "\n${RED}[FAIL] Compilation error detected.${END}\n";
  exit 2;
fi

# shellcheck disable=SC2059
printf "\n${YLO}Running your own unit tests ...${END}\n";
java -jar *.jar execute --classpath .  --select-class=BasicArrayListTest --disable-banner
IS_TESTS_PASS=$?

# shellcheck disable=SC2059
printf "\n${YLO}Running instructor's architecture and system tests ...${END}\n";
java BasicArrayListTestDriver
IS_TESTS_PASS=$?

rm ./*.class
if [ $IS_TESTS_PASS -eq 0 ]; then
  # shellcheck disable=SC2059
  printf "\n${GRN}[PASS] All tests passed!${END}\n\n";
  echo "Be sure to double check to make sure that"
  echo "your code satisfies all other requirements"
  echo "as well as following the style guidelines!"
else
  # shellcheck disable=SC2059
  printf "\n${RED}[FAIL] Test failure(s) detected.${END}\n";
  exit 3;
fi