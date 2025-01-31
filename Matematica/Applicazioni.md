# Media della Funzione \( f(x) = 2x + 4 \) nell'intervallo \([-1, 2]\)

Per calcolare la media della funzione \( f(x) = 2x + 4 \) sull'intervallo \([a, b] = [-1, 2]\), possiamo utilizzare la formula della **media integrale**:

$$
f(z) = \frac{1}{b - a} \int_a^b f(x) \, dx
$$

## Passo 1: Calcolo del denominatore
L'intervallo è \( [a, b] = [-1, 2] \), quindi:

$$
b - a = 2 - (-1) = 3
$$

## Passo 2: Calcolo dell'integrale
Dobbiamo calcolare l'integrale della funzione \( f(x) = 2x + 4 \) da \( a = -1 \) a \( b = 2 \):

$$
\int_a^b f(x) \, dx = \int_{-1}^2 (2x + 4) \, dx
$$

L'integrale di \( 2x + 4 \) è:

$$
\int (2x + 4) \, dx = x^2 + 4x + C
$$

Ora, applichiamo gli estremi \( [-1, 2] \):

$$
\int_{-1}^2 (2x + 4) \, dx = \left[ x^2 + 4x \right]_{-1}^2
$$

Calcoliamo i valori:

- Per \( x = 2 \):

$$
(2)^2 + 4(2) = 4 + 8 = 12
$$

- Per \( x = -1 \):

$$
(-1)^2 + 4(-1) = 1 - 4 = -3
$$

La differenza tra i valori è:

$$
\int_{-1}^2 (2x + 4) \, dx = 12 - (-3) = 12 + 3 = 15
$$

## Passo 3: Calcolo della media
Ora possiamo calcolare la media della funzione:

$$
f(z) = \frac{1}{b - a} \int_a^b f(x) \, dx = \frac{1}{3} \cdot 15 = 5
$$

## Conclusione
La media della funzione \( f(x) = 2x + 4 \) nell'intervallo \( [-1, 2] \) è:

$$
f(z) = 5
$$


## Esempio di Calcolo Leibniz-Newton
Consideriamo la funzione \( f(x) = x^2 \) e gli estremi di integrazione \( a = 1 \) e \( b = 2 \). L'integrale definito si calcola come segue:

$$
\int_1^2 x^2 \, dx = \left[ \frac{x^3}{3} \right]_1^2 = \frac{2^3}{3} - \frac{1^3}{3} = \frac{8}{3} - \frac{1}{3} = \frac{7}{3} \approx 2.3333
$$