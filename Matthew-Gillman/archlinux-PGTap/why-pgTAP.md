# PGTap installation on Archlinux

This is a document explaining why I've chosen pgTAP to test my database

## Frequently updated
It's constantly maintained. Last update was on Dec the 5th 2021

## Heavily documented
Provides lots of features with a huge documentation to go through

## Doesn't need JDBC to work
We don't have to pay for a licence as it is installed directly inside of postgres. Because installing pgTAP essentially means extending the actual postgres installation with a new module that stays inside postgres there is no need to use JDBC or ODBC as many other tools are usually asking for in order for them to be working


## Peace of mind
Understanding whether or not we can use JDBC and get away with it without paying the licence is tricky. So it's much better to stay away from using it

