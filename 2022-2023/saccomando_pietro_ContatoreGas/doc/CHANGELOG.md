# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [1.0] 2023-01-23
## Added
Creo la classe model *ContatoreGas*,l'applicazione *BollettaCalculator*, e il main *BollettaTest*.

Classe **ContatoreGas**
| Method | Visibility | Purpose|
|-|-|-|
**setRivelazionePrecedente** | **public** | **Dà un valore alla variabile di istanza rivelazionePrec.**
**getRivelazionePrecedente** | **public** | **Resistuisce il valore della variabile di istanza rivelazionePrec.**
**setRivelazioneAttuale** | **public** | **Dà un valore alla variabile di istanza rivelazioneAtt.**
**getRivelazioneAttuale** | **public** | **Resistuisce il valore della variabile di istanza rivelazioneAtt.**
**toString** | **public** | **Resistuisce una stringa con i valori delle variabili rivelazionePrec e rivelazioneAtt.**


Classe **BollettaCalculator**
|Method	|Visibility|Purpose|
|-|-|-|
**start** | **public** | **Richiama i metodi che servono per far funzionare l'applicazione avviandola.**
**descrizioneApp** | **public** | **Dà una breve descrizione del programma.**
**visualizzaRisultati** | **public** | **Visualizza a schermo i risultati.**
**prendiInput** | **public** | **Prende in input i valori delle variabili rivelazionePrec e rivelazioneAtt.**