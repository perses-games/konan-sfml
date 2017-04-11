#!/usr/bin/env bash

DIR=.
PATH=../kotlin-native/dist/bin:$PATH

# -lcsfml-graphics -lcsfml-audio -lcsfml-window -lcsfml-network -lcsfml-system
LINKER_ARGS_linux="-L/usr/lib/x86_64-linux-gnu -lcsfml-graphics -lcsfml-window -lcsfml-system"

if [ x$TARGET == x ]; then
case "$OSTYPE" in
  darwin*)  TARGET=macbook ;;
  linux*)   TARGET=linux ;;
  *)        echo "unknown: $OSTYPE" && exit 1;;
esac
fi

var=CFLAGS_${TARGET}
CFLAGS=${!var}
var=LINKER_ARGS_${TARGET}
LINKER_ARGS=${!var}
var=COMPILER_ARGS_${TARGET}
COMPILER_ARGS=${!var} # add -opt for an optimized build.

# cinterop -def $DIR/stdio.def -copt "$CFLAGS" -target $TARGET -o stdio.kt.bc || exit 1
konanc $COMPILER_ARGS -target $TARGET $DIR/src/HelloSfml.kt -library sfml.kt.bc -linkerArgs "$LINKER_ARGS" -o HelloSfml.kexe -opt || exit 1
