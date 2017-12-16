#!/bin/sh

chmod +x /usr/local/bin/page-download.sh
mkdir /var/log/page-download
systemctl enable page-download.service
