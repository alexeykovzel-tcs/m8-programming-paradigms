use std::sync::Arc;
use std::sync::Mutex;
use std::thread;
use std::time::Duration;

struct IntWrapper {
    value: i32,
}

fn main() {
    let mut status = IntWrapper { value: 0 };
    thread::spawn(move || {
        for _ in 0..10 {
            thread::sleep(Duration::from_millis(250));
            status.value += 1;
        }
    });
    while status.value < 10 {
        println!("waiting... ");
        thread::sleep(Duration::from_millis(500));
    }
}