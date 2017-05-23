# google-cloud-storage-java

Stores audio files (.flac and mono audio channel) in google cloud storage 
("flacfiles": bucket name).

Also gets the list of all audio files in the bucket(flacfiles).

For the purpose of this assignment, the name of the bucket has been hardcoded in the project. 

While deploying the build, make sure that you do have a public bucket by the name of 
"flacfiles" associated with your storage account.

** In order to run this module, you need to have sbt, google cloud sdk and speech_transcripter project running in your system. You should also have a google bucket (global access) by the name of "flacfiles" in your default google cloud account.**

steps:
  git clone <url>
  cd google-cloud-storage-java
  sbt;
    clean;
    run 9090;

Make sure you have running your Speech Trancripter before you run this project.

Make sure while setting up a google cloud account you also set up a service account and generate a Credential JSON. Use the local path of this JSON file as the value of env variable GOOGLE_AAPLICATION_CREDENTIALS.
