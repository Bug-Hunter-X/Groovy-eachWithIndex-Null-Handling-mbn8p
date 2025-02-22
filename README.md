# Groovy eachWithIndex Unexpected Null Behavior

This example demonstrates a potential pitfall when using Groovy's `eachWithIndex` method with lists containing null values. Unlike some languages that might throw an exception, Groovy's `eachWithIndex` silently skips over null entries. This can lead to unexpected behavior if not handled correctly.

The solution shows how to handle null values more explicitly using a `try-catch` block or by filtering out null values beforehand.
