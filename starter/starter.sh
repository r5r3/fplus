#!/bin/bash

# find the location of the script
work_path=$PWD
MYSELF=`which "$0" 2>/dev/null`
while [ -L $MYSELF ] ; do
    cd $(dirname $MYSELF)
    MYSELF=$(readlink $MYSELF)
    cd $(dirname $MYSELF)
    MYSELF="$PWD/$(basename $MYSELF)"
done
cd $work_path

# the jar should be located next to the script
folder=$(dirname $MYSELF)
jarname="${folder}/fplus.jar"
java=java
if test -n "$JAVA_HOME"; then
    java="$JAVA_HOME/bin/java"
fi
$java -jar $jarname "$@"
exit $?
