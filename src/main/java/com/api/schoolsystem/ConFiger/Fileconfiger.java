package com.api.schoolsystem.ConFiger;
        import org.springframework.beans.factory.annotation.Value;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
        import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
                        //             Configuration Path Image Store
@Configuration
public class Fileconfiger implements WebMvcConfigurer
{
                        //              Path Image
        @Value("${file.upload.server.path}")
        private String Server;
                        //              Path File Image
        @Value("${file.upload.client.path}")
        private String Client;
                        //              Path Image Go To Server
        @Override
        public void addResourceHandlers(ResourceHandlerRegistry registry)
        {
            registry.addResourceHandler(Client).addResourceLocations("file:"+Server);
        }
}
