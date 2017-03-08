// Dit is een test class
CLASS TEST {

    // Voorbeelden van data types
    INT a = 0;
    BOOLEAN b = true;
    INT c;
    INT[] d = new INT[5];
    INT[] e = {0, 1, 2, 3, 4, 5};
    CHAR f = F;

    PUBLIC INT ditIsEenFunctie(INT k, CHAR j){ // test methode met paramaters

        // variabele initialisatie
        c = 8;
        d = new INT[8];

        // if statement
        IF(a < 10){
            PRINT(a);
        } ELSE {
            PRINT(a);
        }

        // print statements
        PRINT(c);
        PRINT(b);
        PRINT(e);

        PRINT(a);

        // while statement
        WHILE(a < 15){ // logische expressie
            a = a + 1; // rekenkundige expressie
        }

        PRINT(a);

        // return statement
        IF(a < 10){
            PRINT(a);
        } ELSE {
            PRINT(a);
        }

        RETURN 1;
    }

}END