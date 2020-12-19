public class hexaObserver implements Observer,DisplayElement{
    private Observable StateObservable;
    private int State;
    public hexaObserver(Observable StateObservable) {
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
        System.out.println("Hexa String: "
                + Integer.toHexString(State));
    }

}