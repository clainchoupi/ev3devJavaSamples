# ev3devJavaSamples
Projet test pour mascotte Lego avec ev3dev


## Erreurs rencontrées

### Version de JDK par défaut
Erreur :
* Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:2.3.2:compile (default-compile) on project lego2java: Compilation failure
* Error:  error: invalid target release: 1.11

Element de réponse :
* https://stackoverflow.com/questions/59931706/maven-build-fail-invalid-target-release-only-in-gitlab-ci
* Correction du MavenCompilerPlugin : utilisation d'une version récente et passage de "1.11" à "11" pour la version