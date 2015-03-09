#!/bin/bash

mdate=`sudo tune2fs -l /dev/sda1 | grep "Filesystem created:" | awk '{val=substr($0, 27, 24);print val}'`

date --set="$mdate"

cd /

find . -exec touch -d $mdate {} +

cd /var/log

find . -name "*.log*" -delete
find . -name "*.gz" -delete
find . -name "*0" -delete
find . -name "*1" -delete
find . -name "*err" -delete

cd /var/log/installer 
rm *

date --set="Sat Sep 20 10:15:16 IST 2014"

reboot

