package app.team.administration;

import org.springframework.beans.factory.annotation.Autowired;

public class CEO {
    @Autowired
    private HeadOfIT headOfIT;
    @Autowired
    private HeadOfMarketing headOfMarketing;

    public void setHeadOfIT(HeadOfIT headOfIT) {
        this.headOfIT = headOfIT;
    }

    public void setHeadOfMarketing(HeadOfMarketing headOfMarketing) {
        this.headOfMarketing = headOfMarketing;
    }

    public void manageStore() {
        headOfIT.giveTasks();
        headOfMarketing.giveTasks();
    }
}
