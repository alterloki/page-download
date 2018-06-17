#!/bin/sh

chmod +x /usr/local/bin/page-download.sh
mkdir -p /var/log/page-download
systemctl enable page-download.service“