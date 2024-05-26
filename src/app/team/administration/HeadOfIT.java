package app.team.administration;

import app.team.specialists.technical.QAEngineer;
import app.team.specialists.technical.WebDeveloper;
import org.springframework.beans.factory.annotation.Autowired;

public class HeadOfIT {
    @Autowired
    private WebDeveloper webDeveloper;
    @Autowired
    private QAEngineer qaEngineer;

    public void setWebDeveloper(WebDeveloper webDeveloper) {
        this.webDeveloper = webDeveloper;
    }

    public void setQaEngineer(QAEngineer qaEngineer) {
        this.qaEngineer = qaEngineer;
    }

    public void giveTasks() {
        webDeveloper.workOnTasks();
        qaEngineer.workOnTasks();
    }
}
