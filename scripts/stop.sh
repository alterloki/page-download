#!/bin/sh

if service --status-all | grep -Fq 'page-download'; then
  service page-download stop
fi
