# PRACTICA 3

Hola franco :yum:

### Descarrega :arrow_down:

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



### Abans de començar :alarm_clock:

Just abans de començar a fer algun canvi, caldrà que:

1. Obrir Git

2. Fer `cd` a la carpeta del projecte

3. Escriure la comanda

   ```bash
    git pull
   ```

   (crec que també et demanarà usuari i contrasenya)

4. Avisa'm si et diu algo raro (crec que surt merge conflict o algo aixi, pero no hauria)



### Penjar els canvis :arrow_up:

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

I.......... ja tindras el projecte actualizaooooooooooo!!!!!!!! :tada:



Crec que no em deixo res :sunflower:

# LA PRÀCTICA:heavy_exclamation_mark:

### TODO

#### Classe Articles :on:

- [ ] Identificador ha de ser únic



#### Classe Clients :on:

- [ ] Identificar de manera unívoca pel correu electrònic
- [ ] Clients estàndards no paguen mensualitat
- [ ] Clients prèmium paguen 4€ al mes; reben 20% de descompte en les despeses d'enviament
- [ ] Falta acabar de mirar si es calculen be les quotes



#### Classe Comandes :on:

- [ ] Pensar com s'han de demanar per pantalla les comandes
- [ ] Guardar data en què la comanda va ser realitzada
- [ ] Com gestionar lo del temps fins l'enviament :warning:
  - [ ] *"cada comanda té un temps fins l'enviament donat per la data de creació de la mateixa i el temps d'enviament de l'article. La comanda urgent triga la meitat d'aquest temps a enviar-se. D'altra banda, un cop enviat, una comanda té un temps fins a la recepció. Es triga 2 dies a rebre la comanda normal i 1 dia la comanda urgent"*
- [ ] Com va lo de cancel·lar les comandes
- [ ] No sé què és el mètode getTime (*"permet obtenir la data associada a un objecte de tipus Date"*)



#### Classe Llista :warning:

No faig llista del que falta perquè s'ha de fer pràcticament tota



#### Classe Dades :warning:

No faig llista del que falta perquè s'ha de fer pràcticament tota



#### Classe Controlador :warning:

No faig llista; està començada però crec que és del últim que hem de fer



#### Classe MercatException :question:

Te'n vas encarregar tu a la pràctica anterior, no sé exactament com va



#### Classe IniciadorMercatUB :white_check_mark:

#### Classe MercatUB :on:

S'ha d'anar fent sobre la marxa també, però està començada.