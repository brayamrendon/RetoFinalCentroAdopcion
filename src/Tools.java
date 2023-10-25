import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Tools {
    // Ruta del archivo de Excel en el escritorio
    private static final String EXCEL_FILE_PATH = "C:\\Users\\Brayan\\Desktop\\AdopcionAnimales.xlsx";
    // Crear una hoja para animal en Excel
    public static void saveAnimalToExcel(Animal animal) {
        try {
            // Abre el archivo existente o crea uno nuevo si no existe
            Workbook workbook;
            File file = new File(EXCEL_FILE_PATH);

            if (file.exists()) {
                FileInputStream fis = new FileInputStream(EXCEL_FILE_PATH);
                workbook = new XSSFWorkbook(fis);
            } else {
                workbook = new XSSFWorkbook();
            }

            // Obtiene o crea la hoja "Animals"
            Sheet sheet = workbook.getSheet("Animals");
            if (sheet == null) {
                sheet = workbook.createSheet("Animals");
            }

            // Crea un encabezado si la hoja está vacía
            if (sheet.getPhysicalNumberOfRows() == 0) {
                Row headerRow = sheet.createRow(0);
                String[] headers = {"ID", "Nombre", "Edad", "Especie", "Raza", "Estado de Salud", "Descripción"};
                for (int i = 0; i < headers.length; i++) {
                    Cell headerCell = headerRow.createCell(i);
                    headerCell.setCellValue(headers[i]);
                }
            }

            // Crear una nueva fila para el animal
            Row row = sheet.createRow(sheet.getLastRowNum() + 1);

            //código para llenar los datos del animal en la fila

            Cell idCell = row.createCell(0);
            idCell.setCellValue(animal.getId());

            Cell nameCell = row.createCell(1);
            nameCell.setCellValue(animal.getName());

            Cell ageCell = row.createCell(2);
            ageCell.setCellValue(animal.getAge());

            Cell speciesCell = row.createCell(3);
            speciesCell.setCellValue(animal.getSpecies());

            Cell raceCell = row.createCell(4);
            raceCell.setCellValue(animal.getRace());

            Cell healthStatusCell = row.createCell(5);
            healthStatusCell.setCellValue(animal.getHealthStatus());

            Cell descriptionCell = row.createCell(6);
            descriptionCell.setCellValue(animal.getDescription());

            // Guarda el archivo Excel
            FileOutputStream outputStream = new FileOutputStream(EXCEL_FILE_PATH);
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
