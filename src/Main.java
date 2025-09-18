import java.time.OffsetDateTime;

public class Main {
    public static void main (String[]args) {
        //Creiamo il primo oggetto data
        OffsetDateTime data1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        //Creiamo il secondo oggetto data
        OffsetDateTime data2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        //Verifichiamo se la prima data è precedente alla seconda
        boolean isData1BeforeData2 = data1.isBefore(data2);

        //Verifichiamo se la seconda data è successiva alla prima
        boolean isData2AfterData1 = data2.isAfter(data1);

        //Verifichiamo se le due date sono uguali
        boolean areDatesEqual = data1.isEqual(data2);

        //Stampiamo i risultati
        System.out.println("La prima data è precedente alla seconda? " + isData1BeforeData2);
        System.out.println("La seconda data è successiva alla prima? " + isData2AfterData1);
        System.out.println("Le due date sono uguali? " + areDatesEqual);

    }
}