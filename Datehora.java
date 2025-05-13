
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Datehora {

    public static void main(String[] args) {

        LocalDate dataAtual = LocalDate.now();
        System.out.println("Data atual: " +dataAtual);


        LocalTime horaAtual = LocalTime.now();
        System.out.println("Hora atual: " + horaAtual);

        LocalDateTime horaDataAtual = LocalDateTime.now();
        System.out.println("Hora e data atual: "+horaDataAtual);

        DateTimeFormatter horaDataAtualFormatado = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        DateTimeFormatter horaAtualFormatado = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter dataAtualFormatado = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Data e hora formatados: "+horaDataAtualFormatado.format(horaDataAtual));
        System.out.println("Hora formatado: "+ horaAtualFormatado.format(horaAtual));
        System.out.println("Data formatado: "+dataAtualFormatado.format(dataAtual));

    }

}
