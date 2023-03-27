package Lv10_clone;

import java.util.ArrayList;

class MyArrayList<E> {
	private int size;
	private Object list[];

	public boolean add(E element) {
		Object temp[] = this.list;
		this.list = new Object[this.size + 1];
		for (int i = 0; i < this.size; i++)
			this.list[i] = temp[i];
		this.list[this.size] = element;
		this.size++;
		return true;
	}

	public void add(int index, E element) {
		if (index >= 0 && index < this.size) {
			Object temp[] = this.list;
			this.list = new Object[this.size + 1];
			for (int i = 0; i < this.size; i++) {
				if (i < index) {
					this.list[i] = temp[i];
				} else
					this.list[i + 1] = temp[i];
			}
			this.list[index] = element;
			this.size++;
		}
	}

	public int remove(int index) {
		int target = -1;
		if (index >= 0 && index < this.size) {
			target = index;
			Object temp[] = this.list;
			this.list = new Object[this.size - 1];

			int n = 0;
			for (int i = 0; i < this.size; i++) {
				if (i != target) 
					this.list[n++] = temp[i];
				}
				this.size--;

				if (this.size == 0) 
					this.list = null;
		}
		return target;
	}

	public void remove(E element) {
		int target = indexOf(element);
		remove(target);
	}

	public int indexOf(E element) {
		int index = -1;
		for (int i = 0; i < this.size; i++) {
			if (this.list[i].equals(element))
				index = i;
		}
		return index;
	}

	public int size() {
		return this.size;
	}

	public void clear() {
		this.list = null;
		this.size = 0;
	}

	public boolean isEmpty() {
		return this.list == null;
	}

	public ArrayList<E> clone() {
		ArrayList<E> result = null;
		if (this.list != null) {
			result = new ArrayList<E>();
			for (int i = 0; i < this.size; i++) {
				result.add((E) this.list[i]);
			}
		}
		return result;
	}

//	public String toStirng() {
//		String result = "[";
//		for (int i = 0; i < this.size; i++) {
//			result += this.list[i] + ", ";
//		}
//		result = result.substring(0, result.length() - 2);
//		result += "]";
//		return result;
//	}
	public String toString() {
        String result = "[";
        for (int i = 0; i < this.size; i++) {
            result += this.list[i] + ", ";
        }
        if (this.size > 0) {
            result = result.substring(0, result.length() - 2);
        }
        result += "]";
        return result;
    }
}

class People {
	private String name;

    public People(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

public class Day61_ex04_Generic_Class {
	public static void main(String[] args) {
		// 1. Type : Wrapper Class - Integer
		MyArrayList<Integer> list = new MyArrayList<>();

		Integer number = 10;
		list.add(number);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1, 4);
		System.out.println(list);

		list.remove(number);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.isEmpty());

		list.remove(1);
		System.out.println(list);
		System.out.println(list.indexOf(number));

		// 2. Type : Pelple Class
		MyArrayList<People> plist = new MyArrayList<>();

		People people = new People("곰돌이");
		People fish = new People("물고기");

		plist.add(people);
		plist.add(new People("쿼카"));
		plist.add(new People("벨루가"));
		plist.add(fish);
		plist.add(1, new People("기린"));
		System.out.println(plist);

		plist.remove(people);
		System.out.println(plist);
		System.out.println(plist.size());
		System.out.println(plist.isEmpty());

		plist.remove(1);
		System.out.println(plist);
		System.out.println(plist.indexOf(fish));
	}
}
