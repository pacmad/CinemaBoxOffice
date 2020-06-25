/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public final class FileManager {

    private String fileName;
    private File file;
    private boolean answer = true;

    public FileManager(String fileName) {
        this.fileName = fileName;
    }

    public boolean createFile() {
        file = new File(fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Object.class.getName()).log(Level.SEVERE, null, ex);
                answer = false;
            }
        }
        return answer;
    }

    public boolean writeFile(String informationToSave) {
        createFile();
        try (FileWriter fileWriter = new FileWriter(file, true);
                PrintWriter printWriter = new PrintWriter(fileWriter)) {
            printWriter.println(informationToSave);
            printWriter.close();
            try {
                fileWriter.close();
            } catch (IOException ex) {
                Logger.getLogger(Object.class.getName()).log(Level.SEVERE, null, ex);
                answer = false;
            }
        } catch (IOException ex) {
            Logger.getLogger(Object.class.getName()).log(Level.SEVERE, null, ex);
            answer = false;
        }
        return answer;
    }

    public boolean readFile() {
        createFile();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferReader = new BufferedReader(fileReader);
            String stringData = "";
            while (stringData != null) {
                System.out.println(stringData);
                stringData = bufferReader.readLine();
            }
        } catch (IOException ex) {
            Logger.getLogger(Object.class.getName()).log(Level.SEVERE, null, ex);
            answer = false;
        }
        return answer;
    }

    public void deleteFile() {
        file = new File(fileName);
        if (file.exists()) {
            file.delete();
            System.out.println("The file " + file + " was delete");
        } else {
            System.out.println("The file " + file + " don't exist");
        }
    }

    public String[] findRecord(String seeker) {
        createFile();
        boolean flat = false;
        String linea ;
        String searchWord[] = null;
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferReader = new BufferedReader(fileReader);
            while ((linea = bufferReader.readLine()) != null) {
                searchWord = linea.split(",");
                System.out.println(searchWord);
                if (searchWord[0].equals(seeker)) {
                    flat = true;
                }

            }
            if (flat == false) {
                System.out.println("Non-existent movie or unregistered movies on "
                        + "billboard");
            }
        } catch (IOException ex) {
            Logger.getLogger(Object.class.getName()).log(Level.SEVERE, null, ex);
            answer = false;
        }
        return searchWord;
    }
}
