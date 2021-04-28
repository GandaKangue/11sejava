package se11.dnekcab.accesso.accessoPredefinita;
import se11.dnekcab.accesso.accessoProtetto.AccessoProtetto;

public class AccessoPredefinita extends AccessoProtetto {
    public static void main(String[] args) {
        AccessoPredefinita _accessoPredefinita = new AccessoPredefinita();
        _accessoPredefinita.metodoProtetto();
        System.out.println(_accessoPredefinita.numeroProtetto);
    }
}
