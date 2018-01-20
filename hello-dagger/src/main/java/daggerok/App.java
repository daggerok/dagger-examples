package daggerok;

import dagger.Component;
import daggerok.config.AppModule;
import daggerok.service.GreeterService;
import lombok.Data;

import javax.inject.Singleton;

@Data
public class App {

  @Singleton
  @Component(modules = { AppModule.class, })
  public interface AppComponent {
    GreeterService maker();
  }

  public static void main(String[] args) {
    final AppComponent appComponent = DaggerApp_AppComponent.builder().build();
    final GreeterService service = appComponent.maker();
    System.out.println(service.hello("Max"));
  }
}
