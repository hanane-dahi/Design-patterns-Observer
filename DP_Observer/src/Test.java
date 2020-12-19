public class Test {
            public static void main(String[] args) {
                ObservableImpl observableImpl =new ObservableImpl();
                BinaryObserver binaryObserver = new BinaryObserver(observableImpl);
                OctalObserver octalObserver = new OctalObserver(observableImpl);
                hexaObserver hex = new hexaObserver(observableImpl);


                observableImpl.setState(2);
                System.out.println("\nNow, Data is changed.\n");
                observableImpl.setState(14);


            }
        }