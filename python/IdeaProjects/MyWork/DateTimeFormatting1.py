# String Date Formatting

# Whenever you are monkeying around with "aware" date/time formatting
# or manipulation, you will need to import the appropriate module

import datetime

print(datetime.date.today())

print("{0:%m/%d/%Y %H:%M:%S}".format(datetime.datetime.now()))


# Time values can be referenced directly by the following names.

t = datetime.time(9, 18, 27)
print(t)
print('hour       :', t.hour)
print('minute     :', t.minute)
print('second     :', t.second)
print('microsecond:', t.microsecond)
print('tzinfo     :', t.tzinfo)         # time zone info


# Date values can be referenced directly by the following names.

today = datetime.date.today()
print(today)
print('ctime  :', today.ctime())
tt = today.timetuple()
print('tuple  : tm_year  =', tt.tm_year)
print('         tm_mon   =', tt.tm_mon)
print('         tm_mday  =', tt.tm_mday)
print('         tm_hour  =', tt.tm_hour)
print('         tm_min   =', tt.tm_min)
print('         tm_sec   =', tt.tm_sec)
print('         tm_wday  =', tt.tm_wday)
print('         tm_yday  =', tt.tm_yday)
print('         tm_isdst =', tt.tm_isdst)
print('ordinal:', today.toordinal())
print('Year   :', today.year)
print('Mon    :', today.month)
print('Day    :', today.day)


# The default string representation of a datetime object uses the
# ISO-8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm). Alternate formats
# can be generated using strftime() (covered elsewhere).

