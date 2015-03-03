#!/bin/sh
self=`which "$0" 2>/dev/null`
[ $? -gt 0 -a -f "$0" ] && self="./$0"
java=java
if test -n "$JAVA_HOME"; then
    java="$JAVA_HOME/bin/java"
fi
${java} $java_args -jar $self "$@"
exit $?
