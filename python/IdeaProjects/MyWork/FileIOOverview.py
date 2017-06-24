# File Input & Output Overview


# A file is an object in python. A file must be declared and
# named before it can be referenced. The system has a number of
# built-in functions that you use to open, read, write, close,
# and obtain information about a given file. 

myFileName = open("C:\python\data\FileOnDisk.txt", "w+")

print("Name of the file: ", myFileName.name)
print("Open or closed? ", myFileName.closed)
print("Opening mode: ", myFileName.mode)


# The file parameters can be fed in as variable values.

fullNamePath = "C:\python\data\File_IO_Test.txt"

fileIOtest = open(fullNamePath, "w+")

fileIOtest.write("This is going to be the first line in the file.")

fileIOtest.close()


# The file data can be read in to the program, then used as a
# string.

inputTestFile = open("C:\python\data\BestAlbumsOf2017.txt", "r")

firstLineOnly = inputTestFile.readline()

entireFileContents = inputTestFile.read()

inputTestFile.close()

print(firstLineOnly)

print(entireFileContents)

