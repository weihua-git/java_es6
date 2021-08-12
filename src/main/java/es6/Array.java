package es6;


public class Array<E> extends JavaSrciptApi<E> {


    // each
    public interface EachOneCallback<E> {
        void callback(E item);
    }

    public interface EachTwoCallback<E> {
        void callback(E item, int i);
    }

    public interface EachThreeCallback<E> {

        void callback(E item, int i, Array b);

    }


    // sort
    public interface SortCallback<E> {
        Integer callback(E sort1, E sort2);
    }

    // map
    public interface MapOneCallback<E, T> {

        T callback(E item);

    }

    public interface MapTwoCallback<E, T> {

        T callback(E item, int i);

    }

    public interface MapThreeCallback<E, T> {

        T callback(E item, int i, Array<E> b);

    }

    // evel
    public interface EvelOneParamsCallback<E> {

        boolean callback(E item);

    }

    // filter
    public interface FilterOneCallback<E> {

        boolean callback(E item);
    }

    public interface FilterTwoCallback<E> {

        boolean callback(E item, int i);
    }

    public interface FilterThreeCallback<E> {

        boolean callback(E item, int i, Array<E> b);


    }

    // some
    public interface SomeOneParamsCallback<E> {

        boolean callback(E item);

    }

    public interface SomeTwoParamsCallback<E> {

        boolean callback(E item, int i);

    }

    public interface SomeThreeParamsCallback<E> {

        boolean callback(E item, int i, Array<E> b);

    }

    // find
    public interface FindOneCallback<E> {

        boolean callback(E item);

    }

    // findIndex
    public interface FindIndexCallback<E> {

        boolean callback(E item);

    }


    public void print() {
        for (int i = 0; i < this.size(); i++) {

            console.log("内容：", this.get(i));

        }

        console.log("===================华丽分割线=====================");

    }

    public void each(EachOneCallback<E> action) {


        for (int i = 0; i < this.size(); i++) {

            action.callback(this.get(i));

        }


    }

    public void each(EachThreeCallback<E> action) {


        for (int i = 0; i < this.size(); i++) {
            action.callback(this.get(i), i, this);
        }


    }

    public void sort_(SortCallback<E> action) {

        //默认根据字符串大小比较 我采用的是冒泡排序 默认是升序
        for (int i = 0; i < this.size(); i++) {

            for (int j = 0; j < this.size() - i - 1; j++) {

                //cb()>0 升序 cb() <0降序
                //不再直接比较两项元素。而是通过将元素传入回调函数，获得的返回值进行排序
                boolean flat = action.callback(this.get(j), this.get(j + 1)) > 0;
                E temp;

                if (flat) {

                    temp = this.get(1 + j);
                    this.set(1 + j, this.get(j));

                } else {

                    temp = this.get(j);
                    this.set(j, this.get(j + 1));

                }

                this.set(j, temp);

            }

        }

    }

    public Array<E> filter(FilterOneCallback<E> action) {
        Array<E> obj = new Array<>();

        for (int i = 0; i < this.size(); i++) {

            if (action.callback(this.get(i))) {

                obj.add(this.get(i));

            }

        }

        return obj;
    }

    public Array<E> filter(FilterThreeCallback<E> action) {
        Array<E> obj = new Array<>();

        for (int i = 0; i < this.size(); i++) {

            if (action.callback(this.get(i), i, this)) {

                obj.add(this.get(i));

            }

        }

        return obj;
    }

    public <T> Array<T> map(MapThreeCallback<E, T> action) {
        Array<T> obj = new Array();

        for (int i = 0; i < this.size(); i++) {

            T o = (T) action.callback(this.get(i), i, this);

            if (o != null) {

                obj.add(o);

            }

        }

        return obj;
    }

    public <T> Array<T> map(MapOneCallback<E, T> action) {
        Array<T> obj = new Array();

        for (int i = 0; i < this.size(); i++) {

            T o = (T) action.callback(this.get(i));

            if (o != null) {

                obj.add(o);

            }

        }

        return obj;
    }


    public boolean some(SomeOneParamsCallback<E> action) {

        for (E e : this) {

            boolean flat = action.callback(e);

            if (flat) {

                return true;

            }

        }
        return false;
    }

    public boolean some(SomeTwoParamsCallback<E> action) {

        for (int i = 0; i < this.size(); i++) {

            boolean flat = action.callback(this.get(i), i);

            if (flat) {

                return true;

            }

        }
        return false;
    }

    public boolean some(SomeThreeParamsCallback<E> action) {

        for (int i = 0; i < this.size(); i++) {

            boolean flat = action.callback(this.get(i), i, this);

            if (flat) {

                return true;

            }

        }
        return false;
    }

    public boolean evel(EvelOneParamsCallback<E> action) {
        Array<E> obj = new Array<>();

        for (E e : this) {

            boolean flat = action.callback(e);

            if (!flat) {

                return true;

            }

        }
        return false;
    }


    public E find(FindOneCallback<E> action) {

        for (E e : this) {

            boolean flat = action.callback(e);

            if (flat) {

                return e;

            }

        }
        return null;
    }

    public Object find_(FindOneCallback action) {

        for (Object e : this) {

            boolean flat = action.callback(e);

            if (flat) {

                return e;

            }

        }
        return null;
    }


    public int findIndex(FindIndexCallback<E> action) {


        for (int i = 0; i < this.size(); i++) {

            boolean flat = action.callback(this.get(i));

            if (flat) {

                return i;

            }

        }

        return -1;

    }


}
