
/*
 * Trap : 1
 * Setting a mutable object equal to another.
 * Both variables share a reference to the same object.
 * Create a new copy of the object (copy constructor)
 * 
 * Trap : 2
 * Getters returns a mutable object directly.
 * The outside variable and field share a reference to the same object.
 * Returns a new copy of the object.
 * 
 * Remember: Every array is a mutable object of a type[] class.
 * Mutable: Here there is setters(mutators) present. where you can change the field.
 * Immutable: Impossible to change the field.
 */
