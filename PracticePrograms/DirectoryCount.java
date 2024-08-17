public class DirectoryCount {

    public int process(String input1) {
        int count = 0;

        for (int i = 0; i < input1.length() - 1; i++) {
               char ch = input1.charAt(i);
               char ch1 = input1.charAt(i + 1);


               if (ch == '/') continue;

               if (ch == 'x') {
                   count += 1;
               }

               if (ch == '.') {
                   if (ch1 == '.') {
                       count--;
                       i = i + 1;
                   }
               }
        }

        return count + 1;
    }

    public static void main(String[] args) {
        DirectoryCount obj = new DirectoryCount();
        System.out.println(obj.process("x/../x"));
    }
}
