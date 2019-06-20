#!/bin/bash

mkdir -p $2
for mdfile in $( ls $1/. | grep .md$ ); do
  base=`basename ${mdfile} .md`
  echo "${mdfile} ${base}.pdf"
  npx @marp-team/marp-cli --theme ./theme.css --allow-local-files \
  $1/${mdfile} -o $2/${base}.pdf
done