package daggerok.config;

import dagger.Module;
import dagger.Provides;
import daggerok.service.GreeterService;
import daggerok.service.UpperService;
import daggerok.service.impl.GreeterServiceImpl;
import daggerok.service.impl.UpperServiceImpl;

import javax.inject.Singleton;

@Module
public class AppModule {

  @Provides
  @Singleton
  UpperService provideUpperService() {
    return new UpperServiceImpl();
  }

  @Provides
  @Singleton
  GreeterService provideGreeterService(final UpperService upperService) {
    return new GreeterServiceImpl(upperService);
  }
}
