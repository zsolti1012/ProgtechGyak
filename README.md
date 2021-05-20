Elképzelés: 
A program egy telefonok, tabletek és laptopok összerelését végző cég működését szimulálja.
Azonban ügyelnünk kell rá, hogy a hasonló hardver elemeket ne keverjük össze, ugyanis 
mind specifikus az adott eszközzel. Mint pl. telefonhoz is készül kijelző, azonban nem szerelhető be
egy tabletbe.

Singleton:
  Az eszközök egyedi része, amely a többi eszközben nem található meg, pl. billentyűzet, vagy touch pad.
  
 Prototype:
  pl. a processzorok újrafelhasználásánál. mind  három eszközben található processzor csak más paraméterekkel.
  
 Gyártófüggvény – Factory Method
  A készülékek legyártásához tökéletesen használható, ahol is nem kell a a konstruktorral bajlódni. A meghívott fgv. mindig
  egy adott pl tabletetet, telefont, vagy laptopot ad vissza.
  
 Díszítő-Decorator
  Mind a három esetben egy alaplapra pakoljuk rá az alkatrészeket.

Unit teszt:
-tesztelhetjük azt az esetet ha egy eszközben a hardver méretei megegyeznek, de a típusa nem, hogyan reagál a program
- ha nem kihagyunk egy alkatrészt, akkor figyelmeztet-e a program
- ha nem a megfelelő fajta eszközbe teszük bele figyelmeztet.e  a program
- Képernyő méretének ellenőrzése.
