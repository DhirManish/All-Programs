#!/bin/bash

date --set="Tue Jun 15 10:13:17 IST 2014"

find . -exec touch -t 201406151013.17 {} +

