## armstrong-number/ narcissistic-number
This program checks whether a number is Armstrong number or not

### Purpose of this program 
* This program checks whether it is an Armstrong Number
* This program tests the number against five tests containing five assertions 
### Explanation for functions used
#### Breakdown function
* *breakdown* function contains 3 arguments, *m* (the number which needs to be broken down into digits), *pow* (power to be raised), *digits* (digits of the number). Initial values passed for each argument is n (input is given by the user), 1 (power), [] (a null vector) respectively.
* Cond function is used to evaluate each condition one at a time. First condition: if *m*=0 then breakdown function will return *digits*, second condition: *remainder* is a variable which stores value of `(mod m (exp 10 pow)` i.e `n%(10^1)`, *digit* is another variable which stores value of `(/ remainder (exp 10 (- pow 1)` i.e `remainder/(10^(1-1))`.
* *breakdown* function is recursively called with m as (m-remainder), pow as (pow+1), digits as (digits obtained in previous iterations conjoined with the new value stored in *digit*)
* After several iterations, `(-m remainder)` passes 0 as the value of m and the first condition is satisfied which eventually returns all digits of the number.
### How to install
* Install Java Runtime Environment (JRE) from http://www.oracle.com/technetwork/java/javase/downloads/index.html
* Install Leiningen using the instructions on the Leiningen home page at http://leiningen.org/ 
   
### Run this with
    $ lein run
 
### Test this with
 
    $ lein test
    
## License

Copyright © 2019 FIXME

This program and the accompanying materials are made available under the
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
