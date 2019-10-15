/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>
#include <string.h>
char getNumber(char aC) {
		char c = ' ';
		switch (aC) {
		case 'A':
		case 'B':
		case 'C':
			c = '2';
			break;
		case 'D':
		case 'E':
		case 'F':
			c = '3';
			break;
		case 'G':
		case 'H':
		case 'I':
			c = '4';
			break;
		case 'J':
		case 'K':
		case 'L':
			c = '5';
			break;
		case 'M':
		case 'N':
		case 'O':
			c = '6';
			break;
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
			c = '7';
			break;
		case 'T':
		case 'U':
		case 'V':

			c = '8';
			break;
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':

			c = '9';
			break;

		}
		return c;
	}
int main()
{
    char str[100];
    char *uppr;
    printf("Enter a telephone number using letterss (EXIT to quit):");
    gets(str);
    int i=0;
    for(i=0;str[i]!='\0';i++){
        if(str[i]=='-'){
            printf("-");
            continue;
        }
        if(str[i]>='a' && str[i]<='z'){
            str[i]=str[i]-32;
        }
        printf("%c",getNumber(str[i]));
    }
    return 0;
}
