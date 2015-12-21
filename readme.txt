The ABACABA sequence is defined as follows: start with the first letter of the alphabet ("a"). This is the first iteration. The second iteration, you take the second letter ("b") and surround it with all of the first iteration (just "a" in this case). Do this for each iteration, i.e. take two copies of the previous iteration and sandwich them around the next letter of the alphabet.
Here are the first 5 items in the sequence:
a
aba
abacaba
abacabadabacaba
abacabadabacabaeabacabadabacaba
And it goes on and on like that, until you get to the 26th iteration (i.e. the one that adds the "z"). If you use one byte for each character, the final iteration takes up just under 64 megabytes of space.
Write a computer program that prints the 26th iteration of this sequence to a file.

https://www.reddit.com/r/dailyprogrammer/comments/u0tdt/5232012_challenge_56_easy/