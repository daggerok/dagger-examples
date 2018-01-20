package daggerok.service.impl;

import daggerok.service.UpperService;

import javax.inject.Singleton;

@Singleton
public class UpperServiceImpl implements UpperService {

  @Override public String up(final String input) {
    return input == null ? "NULL" : input.toUpperCase();
  }
}
