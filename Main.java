package ico.unam.fes2;

public class Main {
    public static void main(String[] args) {
        AlumnoDeportistaArtista ada = new AlumnoDeportistaArtista();
        ada.setNombre("Luis");
        ada.setArte("Pintura");
        ada.setDeporte("Tochito");
        System.out.println(ada);
        ada.ensayar("Oleo");
        ada.entrenar();
        ada.presentarCompetencia("Naucalli");
    }
}
