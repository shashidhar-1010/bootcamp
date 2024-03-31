import java.util.Comparator;

public class nameCom implements Comparator<student> {

    @Override
    public int compare(student o1, student o2) {
        return o1.getStuName().compareTo(o2.getStuName());

    }
}
