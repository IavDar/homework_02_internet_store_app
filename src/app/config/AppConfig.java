package app.config;

import app.team.administration.CEO;
import app.team.administration.HeadOfIT;
import app.team.administration.HeadOfMarketing;
import app.team.specialists.promotion.SEOSpecialist;
import app.team.specialists.promotion.SMMSpecialist;
import app.team.specialists.technical.QAEngineer;
import app.team.specialists.technical.WebDeveloper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public CEO ceo() {
        return new CEO();
    }

    @Bean
    public HeadOfIT headOfIT() {
        return new HeadOfIT();
    }

    @Bean
    public HeadOfMarketing headOfMarketing() {
        return new HeadOfMarketing();
    }

    @Bean
    public WebDeveloper webDeveloper() {
        return new WebDeveloper();
    }

    @Bean
    public QAEngineer qaEngineer() {
        return new QAEngineer();
    }

    @Bean
    public SEOSpecialist seoSpecialist() {
        return new SEOSpecialist();
    }

    @Bean
    public SMMSpecialist smmSpecialist() {
        return new SMMSpecialist();
    }

}
