
public class Epic extends Task {
    protected int idStask;

    public Epic(int id, String title, String descript, Status statusTask, Integer idStask) {
        super(id, title, descript, statusTask);
        this.idStask = idStask;
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

    public int getIdStask(){
        return idStask;
    }

    public void setIdStask(int idStask) {
        this.idStask = idStask;
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

    @Override
    public void setStatusTask(Status statusTask) {
        super.setStatusTask(statusTask);
    }
}