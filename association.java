package association;

import java.util.List;

public class Employee {
    private String name;
    private List<Mobile> mobile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Mobile> getMobile() {
        return mobile;
    }

    public void setMobile(List<Mobile> mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", mobile=" + mobile + "]";
    }
}
