package es6;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaSrciptApi<E> extends ArrayList<E> {

    public int length;


    public int length() {

        return this.size();

    }


    public void push(E o) {

        this.add(o);
        this.length += 1;

    }

    public String join(String delimiter) {

        List<String> list = new ArrayList<>();
        for (Object o : this) {
            list.add((String) o);
        }

        return String.join(delimiter, list);

    }

    public Array<E> concat(Array<E> arraylist) {

        Array<E> al = new Array<E>();

        al.addAll(this);
        al.addAll(arraylist);
        al.length = this.length + arraylist.length;

        return al;


    }

    public Object pop() {

        return this.remove(this.length() - 1);

    }

    // https://blog.csdn.net/guyuealian/article/details/51113133
    public void reverse() {

        Collections.reverse(this);

    }

    public Object shift() {

        return this.remove(0);

    }

    /**
     * @param from 开始截取index
     * @param to   截取的长度
     * @return
     */
    public Array<E> slice(int from, int to) {

        // { 10, 5, 3, 2, 6, 8, 7, 9, 1, 4 }

        Object[] ss = this.stream().toArray(Object[]::new);
        // [3, 2, 6, 8]


        Object[] objects = Arrays.copyOfRange(ss, from, to);// 截取索引2（包括）到索引6（不包括）的元素


        Array<E> list = new Array<>();

        for (Object object : objects) {

            list.push((E) object);

        }

        return list;
    }

    public void splice(int index, int howmany) {

        for (int i = index; i < index + howmany; i++) {

            this.remove(i);
            this.length -= 1;

        }

    }

    public static <T> Array<T> $(List<T> list) {
        Array<T> es6Array = new Array<>();
        for (T item : list) {
            es6Array.push(item); // 假设 es6.Array 有一个 push 方法
        }
        return es6Array;
    }
}
