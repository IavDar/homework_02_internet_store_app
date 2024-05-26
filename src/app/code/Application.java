package app.code;

import app.team.administration.CEO;
import app.team.administration.HeadOfIT;
import app.team.administration.HeadOfMarketing;
import app.team.specialists.promotion.SEOSpecialist;
import app.team.specialists.promotion.SMMSpecialist;
import app.team.specialists.technical.QAEngineer;
import app.team.specialists.technical.WebDeveloper;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Application {
    public static void main(String[] args) {

//    Приложение было запущено без Spring:
//        WebDeveloper webDeveloper = new WebDeveloper();
//        QAEngineer qaEngineer = new QAEngineer();
//
//        SEOSpecialist seoSpecialist = new SEOSpecialist();
//        SMMSpecialist smmSpecialist = new SMMSpecialist();
//
//        HeadOfIT headOfIT = new HeadOfIT();
//        headOfIT.setWebDeveloper(webDeveloper);
//        headOfIT.setQaEngineer(qaEngineer);
//
//        HeadOfMarketing headOfMarketing = new HeadOfMarketing();
//        headOfMarketing.setSeoSpecialist(seoSpecialist);
//        headOfMarketing.setSmmSpecialist(smmSpecialist);
//
//        CEO ceo = new CEO();
//        ceo.setHeadOfIT(headOfIT);
//        ceo.setHeadOfMarketing(headOfMarketing);
//
//        ceo.manageStore();


 //       Запустила приложение на Spring:
        AbstractApplicationContext context = new AnnotationConfigApplicationContext("app.config");
        CEO ceo = context.getBean(CEO.class);
        ceo.manageStore();
        
    }
}
