package daggerok.service.impl;

import daggerok.service.GreeterService;

import static java.lang.String.format;

public class GreeterServiceImpl implements GreeterService {

  @Override public String hello(final String name) {
    return format("hello, %s!", name);
  }
}
