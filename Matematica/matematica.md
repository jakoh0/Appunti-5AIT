<h1 align="center">INTEGRALI DEFINITI</h1>
<img src= "https:////upload.wikimedia.org/wikipedia/commons/thumb/c/c0/%D0%A7%D1%82%D0%BE_%D1%82%D0%B0%D0%BA%D0%BE%D0%B5_%D0%B8%D0%BD%D1%82%D0%B5%D0%B3%D1%80%D0%B0%D0%BB_%D0%90%D0%BD%D0%B8%D0%BC%D0%B0%D1%86%D0%B8%D1%8F.gif/220px-%D0%A7%D1%82%D0%BE_%D1%82%D0%B0%D0%BA%D0%BE%D0%B5_%D0%B8%D0%BD%D1%82%D0%B5%D0%B3%D1%80%D0%B0%D0%BB_%D0%90%D0%BD%D0%B8%D0%BC%D0%B0%D1%86%D0%B8%D1%8F.gif">
<p>L'integrale definito nasce con lo scopo di determinare le aree di figure piane aventi contorno curivilieo chiuso.</p>

<h2>IL TRAPEZOIDE</h2>
<img width="50%"src="https://matematicaoltre.altervista.org/wp-content/uploads/2021/11/Area-del-trapezoide-in-python-1-1.png">
Il trapezoide è una figura piana delimitata dall'asse x, dalle rette x = a e x = b.
a e b rappresentano l'intervallo sul quale andremo a calcolare l'area.
<p>
<li>Andiamo a suddividere l'intervallo in parti uguali di ampiezza h = b-a/n</li>

<li>Fisso il minimo per ogni intervallo creando dei rettangoli approssimati per difetto.
<img height="25%"src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ9f-MIub7lTrwcXI_wW0KrrJ6olrOi0r_JXQ&s"></li>

<li>Indichiamo con sn la somma delle aree dei n rettangoli:</li>
<p>sn = m1h+m2h+....mnh = </p>


<h2>TEOREMA DELLA MEDIA</h2>

<p>Sia f(x) una funzione continua in un intervallo [a;b], allora esiste almeno un punto Z nell'intervallo tale che l'integrale definito della funzione sia uguale a f(z)(b-a).</p>

Essendo f continua in [a;b] vale il T. di Weiestrass quindi f ammette max e min assoluti
<img src="https://matematicaoltre.altervista.org/wp-content/uploads/2019/05/dimostrazione.png">

<li>L'area blu è equivalente a quella rosssa
f(z) = 0.5</li>

<p align="center"><img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQtE2QUMeegkPowYfnftqINOYEc1x45wYXjCg&s" ></p>

<h3>Conclusione</h3>
Se la funzione f(x) è positiva in [a;b], il teorema della media esprime l'equivalenza fra un trapezoide (la cui area è $\int_a^b f(x) \, dx$ e un rettangolo avente base b−a. L'altezza del rettangolo è data dal valore di f in un particolare punto z dell'intervallo. Questo valore si chiama **valore medio**.

<p></p>
<h2>TEOREMA FONDAMENTALE DEL CALCOLO INTEGRALE</h2>
Sia f(x) una funzione continua in un intervallo [a;b] e sia x un punto dell'intervallo. Si definisce FUNZIONE INTEGRALE : <p></p><p align="center"><img width="20%"src="https://images.treccani.it/ext-tool/intra/images/0/05/Enciclopedia_della_Matematica_formula_lettc_00300_001.jpg"></p>

<p>Se la funzione è positiva nell'intervallo, la funzione integrale F(x) rappresetna l'area del trapezoide. Tale area dipende dal valore di x.
<li>F(a) ->  [inegrale con intervallo [a;a] ] = 0</li>
<li>F(b) -> [integrale con intervallo [a;b] ] = risoluzione dell'integrale</li>
<p></p>
<img width="65%" src="https://www.geogebra.org/resource/psmruunp/PQ5FfBUtLeMfdtK7/material-psmruunp.png">

<h3>TEOREMA TORRICELLI-BARROW</h3>

Sia f(x) una funzione continua in [a;b], allora esiste la derivata della funzione integrale.







## Formula di Leibniz-Newton
La formula di Leibniz-Newton fornisce un metodo per calcolare un integrale definito utilizzando una primitiva \( F(x) \) della funzione \( f(x) \):

$$
\int_a^b f(x) \, dx = F(b) - F(a)
$$

dove \( F'(x) = f(x) \).








# Teoria del Calcolo di Aree con gli Integrali

L'integrale definito è lo strumento principale per il calcolo dell'area di una regione delimitata da una o più funzioni. Quando si vuole determinare l'area compresa tra due curve, è fondamentale individuare quale delle due sia la funzione superiore (maggiore) e quale la funzione inferiore (minore) per impostare correttamente il calcolo.

---

## 1. Area sotto una singola curva

Se abbiamo una funzione continua e non negativa f(x)f(x) su un intervallo [a, b], l'area compresa tra il grafico della funzione e l'asse xx è data dall'integrale definito:

$$A= \int_a^b f(x) \,dx$$

Se la funzione assume valori negativi, l'integrale calcolerebbe l'area con segno negativo. Per ottenere l'area reale, bisogna considerare solo il valore assoluto oppure dividere l'intervallo in parti dove la funzione è positiva e negativa, trattandole separatamente.

---

## 2. Area compresa tra due funzioni

Se abbiamo due funzioni continue f(x)f(x) e g(x)g(x) definite su un intervallo [a;b], e se f(x)f(x) è la funzione maggiore (cioè quella che sta sopra) rispetto a g(x)g(x) in quell'intervallo, allora l'area compresa tra le due curve è data da:

$$A=∫ab[f(x)−g(x)] dxA = \int_a^b [f(x) - g(x)] \,dx$$

dove:

- f(x)f(x) è la funzione **maggiore**, ossia quella che sta sopra.
- g(x)g(x) è la funzione **minore**, ossia quella che sta sotto.
- L'integrale calcola la somma infinitesimale delle strisce verticali di altezza f(x)−g(x)f(x) - g(x) e base dxdx.

Se le due funzioni si incrociano all'interno dell'intervallo, bisogna suddividere l'integrale in più intervalli separati e cambiare la funzione maggiore in ogni intervallo.

---

## 3. Procedura per il calcolo dell'area tra due curve

1. **Trovare i punti di intersezione delle due funzioni**, risolvendo l'equazione f(x)=g(x)f(x) = g(x). Questi punti determinano gli estremi di integrazione.
2. **Determinare quale funzione è maggiore** in ogni intervallo tra i punti di intersezione.
3. **Impostare e calcolare l'integrale** della differenza tra la funzione maggiore e la funzione minore.

---

## 4. Esempio pratico

### Esempio 1: Area tra una parabola e una retta

Troviamo l'area compresa tra le funzioni:

$$f(x)=x^2$$$$g(x)=x$$

nell'intervallo in cui si intersecano.

**Passo 1: Troviamo i punti di intersezione**  
Si risolve $x^2$=x:

$$ x^2 -x =0 $$


quindi x = 0 e x = 1.

**Passo 2: Determiniamo quale funzione è maggiore**  
Per x∈(0,1), confrontiamo $x^2$ e x. Poiché $x^2 <= x$ in questo intervallo, la funzione superiore è g(x)=x  e quella inferiore è f(x)=$x^2$.

**Passo 3: Calcoliamo l'integrale**

$$A= \int_0^1 (x−x2) dxA = \int_0^1 (x - x^2) \,dx$$

Calcoliamo separatamente gli integrali:

$$ \int_0^1 x dx = \left[ \frac{x^2}{3} \right]_0^1 = \frac{1}{2} - 0 = \frac{1}{2} $$
$$ \int_0^1 x^2 dx = \left[ \frac{x^3}{3} \right]_0^1 = \frac{1}{3} - 0 = \frac{1}{3} $$

Quindi:

$$ A = \frac{1}{2} - \frac{1}{3} = \frac{3}{6} -\frac{2}{6} = \frac{1}{6}$$

L'area compresa tra le due curve è 1/6 unità quadrate.

---

## 5. Caso di intersezioni multiple

Se le due funzioni si intersecano più volte, bisogna **suddividere l'integrale** in più parti, cambiando la funzione maggiore in ogni intervallo.

Ad esempio, se una curva sta sopra in [a,c][a, c] e sotto in [c,b][c, b], allora bisogna calcolare:

$$ A = \int_a^c f(x) -g(x) dx + \int_ c^d g(x)-f(x) dx$$

dove nel secondo intervallo la funzione maggiore e minore si sono scambiate di ruolo.

---

## 6. Estensione alle coordinate polari

Se una regione è espressa in coordinate polari con una curva r=f(θ), l'area è data da:


$$ A = \int_ {\alpha}^{\beta}  f^2(0) d(0)$$
A=12∫αβf2(θ) dθA = \frac{1}{2} \int_{\alpha}^{\beta} f^2(\theta) \,d\theta

Questa formula si usa quando si lavora con curve come spirali o cerchi.

---

## Conclusione

- Se vogliamo calcolare l'area tra due curve, dobbiamo sempre **prendere la funzione superiore meno quella inferiore**.
- È importante **determinare i punti di intersezione** per capire come le funzioni si dispongono rispetto all'asse xx.
- Se le funzioni si intersecano più volte, bisogna suddividere l'integrale nei vari intervalli.
- L'integrale permette di trovare non solo aree tra curve cartesiane, ma anche aree in coordinate polari.

L'integrazione è quindi uno strumento fondamentale per il calcolo delle aree in matematica, fisica e ingegneria.