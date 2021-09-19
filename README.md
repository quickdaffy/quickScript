# quickScript
A programming language made in Java.

## Background

I originally thought of making this so I could make a unique scripting system for Minecraft clients (such as LiquidBounce, Astolfo, Rise, etc). I decided to follow through on the idea, and here we are.

As of writing this, there is almost nothing. I first made a basic print system and math, but I want to make a lot more in the future.

## Basic info + what to find
Files end in `.qs`

Classes begin with `class:classname`

Methods begin with `method:methodname` (when they are finished)

To call a method from another class, you will do `classname:methodname(arguments)`

Example of what I hope this to look like:

```
class:helloWorld {

  method:sayHello() {
    ba:print('Hello,world!')
  }
  
  this:sayHello()
  
}
```

The above script would, as one might guess, print `Hello, world!`

Currently, built-in functions would begin with `ba:` for `basic`. An example would be `ba:print()`.

There is no documentation yet, as there is almost no language yet. If you would like an example, you can check the `test.qs` file.

## Current features
- Printing to console
- Basic math (only one operation at the moment)

## TODO:
- Methods
- Classes
- Variables
- Object-orientation (maybe)

## Contributing
If you would like to contribute, please open a PR. I would appreciate if you were to contact me before doing so, so I can approve it and push any of my local changes.

## Known Bugs
Too many to list, at the moment. If you find a bug or a possible bug, open an issue and I will resolve it.
