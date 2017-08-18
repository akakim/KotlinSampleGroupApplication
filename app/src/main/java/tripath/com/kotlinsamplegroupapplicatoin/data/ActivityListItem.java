package tripath.com.kotlinsamplegroupapplicatoin.data;

/**
 * Created by SSLAB on 2017-06-08.
 */

public class ActivityListItem {
    private Class clazz;
    private String clazzSimpleName;

    public ActivityListItem(Class clazz) {
        this.clazz = clazz;
        this.clazzSimpleName = clazz.getSimpleName();
    }


    public ActivityListItem(Class clazz, String clazzSimpleName) {
        this.clazz = clazz;
        this.clazzSimpleName = clazzSimpleName;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    public String getClazzSimpleName() {
        return clazzSimpleName;
    }

    public void setClazzSimpleName(String clazzSimpleName) {
        this.clazzSimpleName = clazzSimpleName;
    }
}
