# PhoneNumberCommons

This module allows you to quickly use the functions from google's libphonenumber library  https://github.com/googlei18n/libphonenumber 

This is Google's common Java, C++ and JavaScript library for parsing, formatting, and validating international phone numbers. The Java version is optimized for running on smartphones, and is used by the Android framework since 4.0 (Ice Cream Sandwich).

# Getting Started

If you want to test the functions, download the module and add the testpage to your navigation. Otherwise you can use the mentioned java functions directly from your microflows

# Prerequisities

None

# Input
Most of the functions require two inputs

inputstring: 

The number that we are attempting to Validate. This can contain formatting such as +, ( and -, as well as a phone number extension. It can also be provided in RFC3966 format.

region: region that we are expecting the number to be from. This is only used if the number being parsed is not written in international format. The country_code for the number in this case would be stored as that of the default region supplied. If the number is guaranteed to start with a '+' followed by the country calling code, then "ZZ" or null can be supplied.

# Functions
Is number a match

Returns EXACT_MATCH if the country_code, NSN, presence of a leading zero for Italian numbers and any extension present are the same. Returns NSN_MATCH if either or both has no region specified, and the NSNs and extensions are the same. Returns SHORT_NSN_MATCH if either or both has no region specified, or the region specified is the same, and one NSN could be a shorter version of the other number. This includes the case where one has an extension specified, and the other does not. Returns NO_MATCH otherwise. For example, the numbers +1 345 657 1234 and 657 1234 are a SHORT_NSN_MATCH. The numbers +1 345 657 1234 and 345 657 are a NO_MATCH.

ParsePhonenumber

Parses a string and returns it in internation number format. This method will throw a NumberParseException if the number is not considered to be a possible number. Note that validation of whether the number is actually a valid number for a particular region is not performed. This can be done separately with PhonenumberValid function.

Phonenumber possible

Check whether a phone number is a possible number. It provides a more lenient check than isValidNumber in the following sense:
It only checks the length of phone numbers. In particular, it doesn't check starting digits of the number.
It doesn't attempt to figure out the type of the number, but uses general rules which applies to all types of phone numbers in a region. Therefore, it is much faster than isValidNumber.
For fixed line numbers, many regions have the concept of area code, which together with subscriber number constitute the national significant number. It is sometimes okay to dial the subscriber number only when dialing in the same area. This function will return true if the subscriber-number-only version is passed in. On the other hand, because isValidNumber validates using information on both starting digits (for fixed line numbers, that would most likely be area codes) and length (obviously includes the length of area codes for fixed line numbers), it will return false for the subscriber-number-only version.

Phonenumber valid

Tests whether a phone number matches a valid pattern. Note this doesn't verify the number is actually in use, which is impossible to tell by just looking at a number itself.

# Known issues

None

# Build Details

This was built with the following:

Mendix Modeler 6.10.2
Eclipse IDE Neon
Versioning


# License

This project is licensed under the Apache License v2 (for details, see the LICENSE file).
