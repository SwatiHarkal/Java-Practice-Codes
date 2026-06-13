package Practice;

sealed class Vehicle permits Car, Bike {

}

final class Car extends Vehicle {

}
non-sealed class Bike extends Vehicle {
}

public class SealedClass extends Bike {
}


// sealed classes lets you control which classes can extend or implement it.
// permits classes should be final or non-sealed before implementing or extending.
// final classes we can't extend or implement so if we want to inherit have to make any class as
// non-sealed class.