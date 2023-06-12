struct IntWrapper {
    value: i32
}

fn main() {
    let mut vector = vec![]; // Initialize empty mutable vector
    let wrapper = IntWrapper { value : 5 }; // Init wrapper
    // let closure = || vector.push(wrapper.value);                     // Use for 1
    // let closure = move || vector.push(wrapper.value);                // Use for 2
    // let closure = || add_wrapper_value(&mut vector, wrapper);        // Use for 3
    // let closure = || add_wrapper_value(&mut vector, &wrapper);       // Use for 4
    // let closure = move || add_wrapper_value(&mut vector, &wrapper);  // Use for 5
    
    println!("Value in wrapper: {:?}", wrapper.value);
    // If you're curious, you can execute the closure like this:
    // closure(); // Not required for any of the subquestions. 
}

// Modify this function declaration for subquestion 4 (and 5).
fn add_wrapper_value(vector: &mut Vec<i32>, wrapper: IntWrapper) {
    vector.push(wrapper.value);
}