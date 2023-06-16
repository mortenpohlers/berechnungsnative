# Java Shared Library Demo

## Ziel des Projekts

1. Beinhaltet ein Java Maven Projekt, das mittels der [GraalVM](https://www.graalvm.org/) eine Shared Library aus Java erzeugt. Diese hängt von der in [...](...) erzeugten core domain ab. Der output wird nach `src/main/C` geschrieben. 
2. Unter `src/main/C` finden sich ein Programmbeispiel. Mittels `compile.sh` kann das Programm übersetzt und mittels `run.sh` ausgeführt werden. Warnung: beides sind keine guten Skripte und müssen wahrscheinlich für andere Plattformen angepasst werden. Die eingecheckten Artefakte wurden auf einem Debian 10 erzeugt.


## Platform und Abhängigkeiten

* Um die Bibliotheken zu erzeugen muss eine GraalVm auf dem System installiert und für das Projekt als JVM konfiguriert sein.
* Die Programme benötigen einen C Compiler (`gcc` wird in `compile.sh` verwendet.)

