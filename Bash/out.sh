#!/bin/bash

mkdir aa
mkdir bb
mkdir a
mkdir b
echo "before removing directories"
ls 

rmdir aa/ 
rmdir bb/ 
rmdir a/
rmdir b/
echo "after removing directories"
ls 
