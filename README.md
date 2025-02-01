# Scala ListBuffer toList() Surprise

This example demonstrates a common pitfall when working with Scala's mutable `ListBuffer` and converting it to an immutable `List`.  The `toList` method creates a *copy* of the data, not a view.  Changes to the original `ListBuffer` after the conversion will not reflect in the `List`.

This is different from other languages where such a conversion might return a view or reference.