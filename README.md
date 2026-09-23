# Java-Artist-Serialization
Java application that saves and restores Artist objects using ObjectOutputStream and ObjectInputStream.


# Java Object Serialization

This project demonstrates Java object serialization and deserialization using an Artist object.

The program creates an Artist object, saves the object to a file, modifies the object in memory, and then reads the original object back from the serialized file.

## Features
- Creates Artist objects containing ID, name, genre, followers, and popularity
- Uses class inheritance with `ArtistSer` extending `Artist`
- Serializes objects using `ObjectOutputStream`
- Reads serialized objects using `ObjectInputStream`
- Demonstrates saving and restoring an object's state
- Uses Java exception handling for file operations

## Technologies and Concepts
- Java
- Object-Oriented Programming
- Inheritance
- Serialization
- File I/O
- ObjectInputStream
- ObjectOutputStream
- Serializable interface

## How It Works

1. An `ArtistSer` object is created.
2. The object is written to a file using `toSerFile()`.
3. The program changes the Artist object in memory.
4. `fromSerFile()` reads the previously saved object.
5. The original object's data is restored from the file.
