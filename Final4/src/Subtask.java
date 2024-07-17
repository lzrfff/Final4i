
public class Subtask extends Task {
    //public boolean IdEpic;
    private int idEpic;

    public Subtask(int id, String title, String descript, Status statusTask, int idEpic) {
        super(id, title, descript, statusTask);
        this.idEpic = idEpic;
    }

   /* public Subtask(Task task, int idEpic) {
        super(task.id, task.title, task.descript, task.statusTask);
        this.idEpic = idEpic;
    }*/

    public int getIdEpic() {
        return idEpic;
    }

    @Override
    public Status getStatusTask() {
        return super.getStatusTask();
    }

    @Override
    public String toString() {
        return "Subtask{" +
                "idEpic=" + idEpic +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", descript='" + descript + '\'' +
                ", statusTask=" + statusTask +
                '}';
    }
}


