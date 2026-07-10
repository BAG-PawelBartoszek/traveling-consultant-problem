# Traveling Consultant Problem

# 🧳 Routenplanung eines Consultants

## Kontext

Du arbeitest als Softwareentwickler in einem Unternehmen, das interne Tools für die Einsatzplanung von Consultants entwickelt.  
Ein Consultant soll mehrere Kundenstandorte besuchen und am Ende wieder zu seinem Ausgangspunkt zurückkehren.

Ziel ist es, eine Route zu bestimmen, die alle Standorte genau einmal besucht und dabei möglichst geringe Gesamtkosten verursacht.

---

## Gegeben

### Kundenstandorte

Jeder Standort ist durch Koordinaten in einem zweidimensionalen Raum beschrieben:

| Standort   | x  | y  |
|------------|----|----|
| Lünen      | 1  | 3  |
| Dortmund   | 2  | -1 |
| Münster    | -2 | 4  |
| Hamburg    | 0  | -3 |
| München    | -3 | -2 |
| Düsseldorf | 4  | 1  |
| Wuppertal  | -1 | 0  |

---

## Kostenmodell

Die Reisekosten zwischen zwei verschiedenen Standorten ergeben sich aus einer unternehmensinternen Bewertungsfunktion, die verschiedene Faktoren wie Entfernung, Infrastruktur und vertragliche Rahmenbedingungen abstrahiert.

Für zwei unterschiedliche Standorte \( i \) und \( j \) mit den Koordinaten \( (x<sub>i</sub>, y<sub>i</sub>) \) und \( (x<sub>j</sub>, y<sub>j</sub>) \) gelten die Kosten:

<p align="center">w(i,j) = x<sub>i</sub>  x<sub>j</sub> + y<sub>i</sub>  y<sub>j</sub> + 15</p>


---

## Aufgabenstellung

1. Implementiere eine Datenstruktur zur Repräsentation der Standorte.
2. Berechne die vollständige Kostenmatrix für alle Standortpaare.
3. Implementiere eine Funktion zur Berechnung der Gesamtkosten einer Route.
4. Entwickle einen Algorithmus, der eine Route erzeugt, welche:
    - bei einem beliebigen Standort startet,
    - jeden Standort genau einmal besucht,
    - zum Startpunkt zurückkehrt.
5. Versuche, die Gesamtkosten der Route zu minimieren.

---

## Erwartetes Ergebnis

Eine gültige Lösung besteht aus:
- einer vollständigen Rundreise (Start- und Endpunkt identisch),
- einer Reihenfolge aller Standorte ohne Wiederholungen (außer Start/Ende),
- sowie den berechneten Gesamtkosten dieser Route.