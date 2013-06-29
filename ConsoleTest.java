class ConsoleTest {
        public static void main(String[] args){
                if ( System.console() == null ) {
                        System.out.println("System.console() is null! :(");
                        System.exit(1);
                } else {
                        System.out.println("System.console() is working! :)");
                }
        }
}
