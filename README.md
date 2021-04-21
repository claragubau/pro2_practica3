# PRACTICA 3

Hola franco <3

### Descarrega

Abans de res, hauries de tenir Git descarregat

1. Obrir Git (és com una especie de terminal)

2. Fer `cd` i anar a la carpeta on vulguis tenir el projecte

3. Esciure a Git:

   ```bash
   git clone https://github.com/claragubau/pro2_practica3.git
   ```

   (crec que et demanarà usuari i contrasenya)

4. Comprovar que se t'hagi descarregat bé i que ho pots veure tot

Un cop fet això, ja tens el projecte amb els canvis que he fet jo. **Només cal fer-ho una vegada**.



### Abans de començar

Just abans de començar a fer algun canvi, caldrà que:

1. Obrir Git

2. Fer `cd` a la carpeta del projecte

3. Escriure la comanda

   ```bash
    git pull
   ```

   (crec que també et demanarà usuari i contrasenya)

4. Avisa'm si et diu algo raro (crec que surt merge conflict o algo aixi, pero no hauria)



### Penjar els canvis

1. Obrir Git

2. Fer ` cd` a la carpeta del projecte

3. Abans de res, torna a fer `git pull` per evitar que hi hagi problemes amb la versio que esta penjada

4. Per veure quins fitxers has canviat i pots penjar, la comanda és  

   ```bash
   git status
   ```

5. En cas que vulguis penjar tots els fitxers que has modificat (la majoria de vegades), fes

   ```bash
   git add .
   ```

     I si només vols penjar alguns fitxers (no crec que ho facis molt però aixi ja ho saps)

   ```bash
   git add "nom dels fitxers que vulguis afegir, separats per un espai"
   ```

6. Un cop has fet el add, fer

   ``` bash
   git commit -m "missatge indicant els canvis que has fet (tampoc cal que t'ho curris molt)"
   ```

7. Un cop fet el commit, només queda penjar-ho, que es fa amb 

   ```bash
   git push
   ```

I.......... ja tindras el projecte actualizaooooooooooo!!!!!!!!



Crec que no em deixo res :)