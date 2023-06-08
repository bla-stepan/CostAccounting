package CostAccounting.Model;

import javafx.beans.property.*;

import java.util.Calendar;
import java.util.concurrent.atomic.AtomicInteger;

public class FinRecord {
    private static final AtomicInteger COUNTER = new AtomicInteger(1);
    private IntegerProperty expCount;
    private StringProperty expName;
    private ObjectProperty<Calendar> expDate;
    private DoubleProperty expValue;

    public IntegerProperty expCountProperty() {
        if (expCount == null) expCount = new SimpleIntegerProperty();
        return expCount;
    }

    public final void setExpCount() {
        expCountProperty().set(COUNTER.getAndIncrement());
    }

    public final int getExpCount(){
        return expCountProperty().get();
    }

    public StringProperty getExpNameProperty(){
        expName = expName == null ? new SimpleStringProperty() : expName;
        return expName;
    }

    public ObjectProperty<Calendar> expDateProperty(){
        expDate = expDate == null ? new SimpleObjectProperty<>() : expDate;
        return expDate;
    }
}
