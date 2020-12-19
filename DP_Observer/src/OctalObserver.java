public  class OctalObserver implements Observer,DisplayElement{
    private Observable StateObservable;
    private int State;
    public OctalObserver(Observable StateObservable) {
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
        System.out.println("Octal String: "
                + Integer.toOctalString(State));
    }

}