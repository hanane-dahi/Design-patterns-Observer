public class BinaryObserver implements Observer,DisplayElement{
    private Observable StateObservable;
    private int State;
    public BinaryObserver(Observable StateObservable) {
        this.StateObservable = StateObservable;
        StateObservable.subscribe(this);
    }

    @Override
    public void update() {
        ObservableImpl decimalData = null;
        if (StateObservable instanceof ObservableImpl) {
            decimalData = (ObservableImpl) StateObservable;
            State = decimalData.getState();
        }
        display();
    }


    @Override
    public void display() {
        System.out.println("Binary String: "
                + Integer.toBinaryString(State));
    }

}