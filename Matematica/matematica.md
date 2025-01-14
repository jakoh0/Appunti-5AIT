<h1 align="center">INTEGRALI DEFINITI</h1>
<img src= "https:////upload.wikimedia.org/wikipedia/commons/thumb/c/c0/%D0%A7%D1%82%D0%BE_%D1%82%D0%B0%D0%BA%D0%BE%D0%B5_%D0%B8%D0%BD%D1%82%D0%B5%D0%B3%D1%80%D0%B0%D0%BB_%D0%90%D0%BD%D0%B8%D0%BC%D0%B0%D1%86%D0%B8%D1%8F.gif/220px-%D0%A7%D1%82%D0%BE_%D1%82%D0%B0%D0%BA%D0%BE%D0%B5_%D0%B8%D0%BD%D1%82%D0%B5%D0%B3%D1%80%D0%B0%D0%BB_%D0%90%D0%BD%D0%B8%D0%BC%D0%B0%D1%86%D0%B8%D1%8F.gif">
<p>L'integrale definito nasce con lo scopo di determinare le aree di figure piane aventi contorno curivilieo chiuso.</p>

<h2>IL TRAPEZOIDE</h2>
<img width="50%"src="https://matematicaoltre.altervista.org/wp-content/uploads/2021/11/Area-del-trapezoide-in-python-1-1.png">
Il trapezoide è una figura piana delimitata dall'asse x, dalle rette x = a e x = b.
a e b rappresentano l'intevallo sul quale andremo a calcolare l'area.
<p>
<li>Andiamo a suddividere l'intervallo in parti uguali di ampiezza h = b-a/n</li>

<li>Fisso il minimo per ogni intervallo creando dei rettangoli approssimati per difetto.
<img height="25%"src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ9f-MIub7lTrwcXI_wW0KrrJ6olrOi0r_JXQ&s"></li>

<li>Indichiamo con sn la somma delle aree dei n rettangoli:</li>
<p>sn = m1h+m2h+....mnh = </p>


<h2>TEOREMA DELLA MEDIA</h2>

<p>Sia f(x) una funzione continua in un intervallo [a;b], allora esiste almeno un punto Z nell'intervallo tale che l'integrale definito della funzione sia uguale a f(z)(b-a).</p>

Essendo f continua in [a;b] vale il T. di Weiestrass quindi f ammette max e min assoluti-
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
<img width="65%" src="https://www.geogebra.org/resource/psmruunp/PQ5FfBUtLeMfdtK7/material-psmruunp.png"></p>

><h3>TEOREMA TORRIICELLI-BARROW</h3>

Sia f(x) una funzione continua in [a;b], allora esiste la derivata della funzione integrale.




## Formula di Leibniz-Newton
La formula di Leibniz-Newton fornisce un metodo per calcolare un integrale definito utilizzando una primitiva \( F(x) \) della funzione \( f(x) \):

$$
\int_a^b f(x) \, dx = F(b) - F(a)
$$

dove \( F'(x) = f(x) \).



## Esempio di Calcolo
Consideriamo la funzione \( f(x) = x^2 \) e gli estremi di integrazione \( a = 1 \) e \( b = 2 \). L'integrale definito si calcola come segue:

$$
\int_1^2 x^2 \, dx = \left[ \frac{x^3}{3} \right]_1^2 = \frac{2^3}{3} - \frac{1^3}{3} = \frac{8}{3} - \frac{1}{3} = \frac{7}{3} \approx 2.3333
$$
