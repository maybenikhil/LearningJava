package Chapter5;

public class Chapter5 {
    public static class Name {
        private String first;
        private String middle;
        private String last;

        //Constructor Method
        public Name(String f, String m, String l) {
            first = f;
            middle = m;
            last = l;
        }

        public Name(String f, String l) {
            this(f, "", l);
        }

        public Name(String l) {
            this("", l);
        }

        public Name() {
        }

        public String displayName() {
            return first + " " + middle + " " + last;
        }

        public String getInitial() {
            return first.substring(0, 1) + middle.substring(0, 1) + last.substring(0, 1);
        }

        public String getFirst() {
            return first;
        }

        public String getMiddle() {
            return middle;
        }

        public String getLast() {
            return last;
        }

        public void setFirst(String first) {
            this.first = first;
        }

        public void setMiddle(String middle) {
            this.middle = middle;
        }

        public void setLast(String last) {
            this.last = last;
        }

        public void setName(String first, String middle, String last) {
            this.first = first;
            this.middle = middle;
            this.last = last;
        }
    }

    public static void main(String[] args) {
        //Instantiation
        Name myName = new Name("Nikhil", "Charles John", "Parikh");
        Name yourName = new Name("Ajay", "Parikh");
        Name aName = new Name("Mariani");
        Name someName = new Name();
        System.out.println("MyName: " + myName.displayName());
        System.out.println("YourName: " + yourName.displayName());
        System.out.println("MyName first name: " + myName.getFirst());
        yourName.setMiddle("Ashish");
        System.out.println("YourWholeName: " + yourName.displayName());
        someName.setName("John", "Quincy", "Adams");
        System.out.println("SomeName: " + someName.displayName());
    }
}
