# ev3devJavaSamples
Projet test pour mascotte Lego avec ev3dev


## Erreurs rencontr�es

### Version de JDK par d�faut
Erreur :
* Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:2.3.2:compile (default-compile) on project lego2java: Compilation failure
* Error:  error: invalid target release: 1.11

Element de r�ponse :
* https://stackoverflow.com/questions/59931706/maven-build-fail-invalid-target-release-only-in-gitlab-ci
* Correction du MavenCompilerPlugin : utilisation d'une version r�cente et passage de "1.11" � "11" pour la version