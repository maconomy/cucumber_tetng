#mvn -f c:\\Users\\AlexanderReyes\\git\\cucumber_testng_pom\\cucumber_testng -DUsername=$Username -DWeb=$WebClientURL -DSuiteName=$SuiteName -DBrowser=$Browser -DPassword=$maconomypass test
set -x 
mvn -f c:\\Users\\AlexanderReyes\\git\\maconomy\\maconomy -DUsername=$Username -DWebClientURL=$WebClientURL -DSuiteName=$SuiteName -DBrowser=$Browser -DPassword=$maconomypass test
