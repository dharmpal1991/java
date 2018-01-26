package com.java.datastructure;

public class MyHashMap {
	private static Entry[] element;
	private int capacity = 0;

	public MyHashMap() {
		capacity = 16;
		element = new Entry[capacity];
	}

	static class Entry {
		final String key;
		String value;
		Entry next;

		public Entry(String key, String value) {
			this.key = key;
			this.value = value;
			next = null;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return key;
		}
	}

		public void put(String key, String value) {
			if (key == null) {
				putForNullkey(key, value);
			}
			int hash = hash(key.hashCode());
			int index = indexForBucket(hash, element.length);
			Entry oldEntry = element[index];
			while (oldEntry != null) {
				if (oldEntry.getKey().equals(key)) {
					oldEntry.value = value;
					return;
				}
				oldEntry = oldEntry.next;
			}
			Entry newEntry = new Entry(key, value);
			newEntry = element[index];
			element[index] = newEntry;
		}

		static int hash(int h) {
			h ^= (h >>> 20) ^ (h >>> 12);
			return h ^ (h >>> 7) ^ (h >>> 4);
		}

		private int indexForBucket(int h, int length) {
			return h & (length - 1);
		}

		private void putForNullkey(String key2, String value2) {
			Entry newEntry = new Entry(key2, value2);
			element[0] = newEntry;

		}

		public Entry get(String key) {
			if (key == null)
				return getForNullkey();
			int hash = hash(key.hashCode());
			int index = indexForBucket(hash, element.length);
			Entry oldEntry = element[index];
			while (oldEntry != null) {
				if (oldEntry.key.equals(key)) {
					return oldEntry;
				}
				oldEntry = oldEntry.next;
			}
			return null;
		}

		private Entry getForNullkey() {
			for (Entry e = element[0]; e != null; e = e.next) {
				if (e.key == null)
					return e;
			}
			return null;
		}

		public void print() {
			int i = 1;
			Object temp = element[0].getKey();
			while (temp != null) {
				System.out.println(" " + temp);
				++i;
				temp = element[i].getKey();
			}
		}
	public static void main(String[] args) {
		MyHashMap map = new MyHashMap();
		map.put("dk", "dharmpal");
		map.put("kd", "dharmpal");
		map.put("pk", "dharmpal");
		map.put("kp", "dharmpal");
		map.put("rd", "dharmpal");
		map.print();
	}

}
