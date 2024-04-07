package three;

interface Iterator {
    boolean hasNext();
    Object next();
}
interface Container {
    Iterator getIterator();
}
class NameRepository implements Container {
    private String[] names = {"A", "B", "C"};
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }
    private class NameIterator implements Iterator {
        int index;
        @Override
        public boolean hasNext() {
            return index < names.length;
        }
        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
