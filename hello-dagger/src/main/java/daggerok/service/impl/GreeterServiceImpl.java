package daggerok.service.impl;

import daggerok.service.GreeterService;
import daggerok.service.UpperService;
import lombok.RequiredArgsConstructor;

import javax.inject.Inject;
import javax.inject.Singleton;

import static java.lang.String.format;

@Singleton
@RequiredArgsConstructor(onConstructor = @__(@Inject))
public class GreeterServiceImpl implements GreeterService {

  final UpperService upperService;

  public String hello(final String name) {
    final String result = format("hello, %s!", name);
    return upperService.up(result);
  }
}
