package rshu.example.grpc.server;

import net.devh.boot.grpc.server.interceptor.GlobalServerInterceptorConfigurer;
import net.devh.boot.grpc.server.interceptor.GlobalServerInterceptorRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GlobalInterceptorConfiguration {
    @Bean
    public GlobalServerInterceptorConfigurer globalServerInterceptorConfigurerAdapter(){
        return registry -> registry.addServerInterceptors(new LogGrpcInterceptor());
    }
}
