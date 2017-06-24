# Date/Time Formatting -- strptime() and strftime()

import time

# The strptime() function parses ('p') a string and converts it to
# a datetime object. This turns a naive date object into an aware
# date object that can be more readily manipulated.

myDateTime = time.strptime("20170406160000", "%Y%m%d%H%M%S")
print(myDateTime)


# The strftime() function formats ('f') a datetime object into
# a formatted string.

print("My 15th wedding anniversary was on " + time.strftime("%B %d, %Y.", myDateTime))


print("""
A complete list of format codes is shown below.

Symbol	Meaning							Example

 %a	Abbreviated weekday name				'Wed'
 %A	Full weekday name					'Wednesday'
 %w	Weekday number – 0 (Sunday) through 6 (Saturday)	'3'
 %d	Day of the month (zero padded)				'05'
 %e	Day of the month (not zero padded)			'5'
 %b	Abbreviated month name					'Jan'
 %h	Abbreviated month name (same as %b)			'Jan'
 %B	Full month name						'January'
 %m	Month of the year					'01'
 %y	Year without century					'16'
 %Y	Year with century					'2016'
 %H	Hour from 24-hour clock					'17'
 %I	Hour from 12-hour clock					'05'
 %p	AM/PM							'PM'
 %M	Minutes							'00'
 %S	Seconds							'00'
 %f	Microseconds						'000000'
 %z	UTC offset for time zone-aware objects			'-0500'
 %Z	Time Zone name						'EST'
 %j	Day of the year						'013'
 %W	Week of the year					'02'
 %c	Date and time representation for current locale		'Wed Jan 13 17:00:00 2016'
 %x	Date representation for current locale			'01/13/16'
 %D	Date representation for current locale (same as %x)	'01/13/16'
 %X	Time representation for current locale			'17:00:00'
 %T	Time representation for current locale (same as %X)	'17:00:00'
 %%	A literal % character					'%'

""")
