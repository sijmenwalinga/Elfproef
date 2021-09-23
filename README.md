# Elfproef

An implementation of the Elfproef test using Clojure, to show how powerful and easy functional programming can be.

## Usage

To use this function import/download the source or copy the function. And use the function by passing an input string of numbers as first argument and a vector with weights of each number in the input as second argument. An exmaple:

    (elfproef "736160221" [9, 8, 7, 6, 5, 4, 3, 2, 1])

The function will return true if it is a valid input based on the input, and false if not.

## Examples

`(elfproef "736160221" [9, 8, 7, 6, 5, 4, 3, 2, 1]) ;; valid => true`

`(elfproef "0000000" [8, 7, 6, 5, 4, 3, 2, 1]) ;; invalid => false`

## License

Copyright © 2021 

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
