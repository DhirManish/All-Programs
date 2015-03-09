#!/usr/bin/env Rscript

csv <- read.csv("datasql.csv", head=TRUE, sep=",")

#print(csv)

table <- data.frame(csv)

#print(names(csv))

print(table)

