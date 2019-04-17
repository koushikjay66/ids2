# Introduction to Distributed Systems - Assignment Template

## General Information

The following template is structured as a multi-project build using gradle as a build tool.
By the way, gradle is the only tool supporting multi-project builds.
The main project _idistrysys_ specifies all included subprojects in the _settings.gradle_ file. 
_client_ and _server_ are dependent on the _shared_ project since all the model classes are included in this project.

## How to get the server and client running?

### Starting the server

1. Within the _idistrysys_ folder start a CMD.
2. Run the server via **gradle server:run**

The _shared_ project is automatically build before the server is started. 
Look at the dependencies block in the server/build.gradle.

### Starting the client

1. Within the _idistrysys_ folder start a CMD.
2. Run the server via **gradle client:run** 

The _shared_ project is automatically build before the server is started. 
Look at the dependencies block in the client/build.gradle.