#include <stdio.h>
#include <stdlib.h>
void beolvas();


int main()
{
    beolvas();

    return 0;
}

void beolvas(){

    FILE *fp;
    char filenev[50];
    char c;

    printf("A fajl neve: \n");
    scanf("%s",filenev);

    fp = fopen(filenev,"w");

    printf(" Uzenet: \n");

    while(ch = getchar() != '#'){
        putc(ch,fp);
    }
    fclose(fp);

    fopen(fp,"r");

    while((ch = getc(fp)) != EOF){
        printf("%c",ch);
    }
    fclose(fp);

    return 0;
}
