package Iterator_Pattern;

public class NameRepository implements Container{
    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator(){
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int idx;
        @Override
        public boolean hasNext(){
            if(idx < names.length) return true;
            else return false;
        }

        @Override
        public Object next(){
            if(this.hasNext()){
                return names[idx++];
            }
            return null;
        }
    }
}
