public class Ifstatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int fileSended = 3;

        if (isBluetoothEnabled){
            //Send File
            fileSended++;
            System.out.println("Archivo Enviado");
        }
    }
}
