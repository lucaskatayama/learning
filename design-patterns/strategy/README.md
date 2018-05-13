# Strategy

**AKA**: Policy

## Intent

Define a family of algorithms, encapsulate an make interchangeble.
Lets the algorithm vary independently from clients that use it.

## Bad Example

## Simple Example

*Animal* class with multiple implementation of *canFly* algorithm:

- It can fly
- Can't fly

## Complex Example

*CSV* column validation based on type

Each column can be read and validated based on a configuration.