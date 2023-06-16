#include <stdio.h>
#include <stdlib.h>
#include <libmult.h>

int main(int argc, char *argv[])
{
    
    graal_isolate_t *isolate = NULL;
    graal_isolatethread_t *thread = NULL;

    if (graal_create_isolate(NULL, &isolate, &thread) != 0) {
     fprintf(stderr, "initialization error\n");
     return 1;
    }
 
    char* input = "{\"geburtsDatum\": \"1974-01-01\", \"zahlungAb\": \"2023-06-01\", \"wunschrente\": 150 }\0";
    char* result = berechnung(thread, input);
    puts(result);
    
}
