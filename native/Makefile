CC=gcc
CFLAGS=-c -Wall -shared

ifeq ($(OS),Windows_NT)
		LDFLAGS=-lcrypt32
else
		LDFLAGS=
endif

all: uid uuid


uid: uid.c
		$(CC) $(CFLAGS) -o libuid.so -fPIC uid.c

uuid: uuid.c
		$(CC) $(CFLAGS) -o libuuid.so -fPIC uuid.c

clean:
		rm -rf *.so
