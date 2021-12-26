package Util;

public class MyVar {
    public static MyVar VOID = new MyVar(new Object());

    final Object value;

    public MyVar(Object value) {
        this.value = value;
    }

    public Boolean asBoolean() {
        return (Boolean)value;
    }

    public Integer asInt() {
        return (Integer)value;
    }

    public String asString() {
        return String.valueOf(value);
    }

    public boolean isInt() {
        return value instanceof Integer;
    }

    @Override
    public int hashCode() {

        if(value == null) {
            return 0;
        }

        return this.value.hashCode();
    }

    @Override
    public boolean equals(Object o) {

        if(value == o) {
            return true;
        }

        if(value == null || o == null || o.getClass() != this.getClass()) {
            return false;
        }

        MyVar that = (MyVar)o;

        return this.value.equals(that.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
