#!/bin/sh

service page-download status
if [ $? -eq 0 ];
then
  service page-download stop
else
  echo "Service is not registered yet"
fi
