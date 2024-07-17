import java.util.Scanner;
public class Task {
    //static TaskMahager mahager=new TaskMahager();
    static Scanner scanner;
    protected int id;
    protected String title;
    protected String descript;
    protected Status statusTask;

    public Task(int id, String title, String descript, Status statusTask) {
        this.id = id;
        this.title = title;
        this.descript = descript;
        this.statusTask = statusTask;
    }

    public int getId() {
        return id;
    }

    public String getDescript() {
        return descript;
    }

    public String getTitle() {
        return title;
    }

    public Status getStatusTask() {
        return statusTask;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public void setStatusTask(Status statusTask) {
        this.statusTask = statusTask;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", descript='" + descript + '\'' +
                ", statusTask='" + statusTask + '\'' +
                '}';
    }


}
/*public Task(String title, String descript, Status statusTask) {

        this.title=title;
        this.descript=descript;
        this.statusTask=statusTask;*/


