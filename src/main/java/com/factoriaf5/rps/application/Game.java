package com.factoriaf5.rps.application;

public interface Game{
    String getName();
    boolean beats(Game other);
}