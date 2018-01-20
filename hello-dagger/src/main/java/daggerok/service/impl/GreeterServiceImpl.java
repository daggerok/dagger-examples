package daggerok.service.impl;

import daggerok.service.GreeterService;

import javax.inject.Singleton;

import static java.lang.String.format;

@Singleton
public class GreeterServiceImpl implements GreeterService {

  public String hello(final String name) {
    return format("hello, %s!", name);
  }
}
