package app.team.administration;

import app.team.specialists.promotion.SEOSpecialist;
import app.team.specialists.promotion.SMMSpecialist;
import org.springframework.beans.factory.annotation.Autowired;

public class HeadOfMarketing {
    @Autowired
    private  SEOSpecialist seoSpecialist;
    @Autowired
    private SMMSpecialist smmSpecialist;

    public void setSeoSpecialist(SEOSpecialist seoSpecialist) {
        this.seoSpecialist = seoSpecialist;
    }

    public void setSmmSpecialist(SMMSpecialist smmSpecialist) {
        this.smmSpecialist = smmSpecialist;
    }

    public void giveTasks() {
        seoSpecialist.workOnTasks();
        smmSpecialist.workOnTasks();
    }
}
