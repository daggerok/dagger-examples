package daggerok.config;

import dagger.Module;
import dagger.Provides;
import daggerok.service.GreeterService;
import daggerok.service.impl.GreeterServiceImpl;

import javax.inject.Singleton;

@Module
public class AppModule {

  @Provides
  @Singleton
  GreeterService provideGreeterService() {
    return new GreeterServiceImpl();
  }
}
