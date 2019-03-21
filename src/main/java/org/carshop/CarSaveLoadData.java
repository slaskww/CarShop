package org.carshop;

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CarSaveLoadData implements Serializable {

    private static final long serialVersionUID = 1L;
    private CarSaveLoadData()  {
    }


    public static void writeCurrentStateToFile(List<Car> carsToSave, List<AccountHistoryObject> historyToSave, BigDecimal balance){

        try {
            FileOutputStream fOutput = new FileOutputStream(new File("SavedData.txt"));
            ObjectOutputStream objOutput = new ObjectOutputStream(fOutput);

            objOutput.writeObject(carsToSave);
            objOutput.writeObject(historyToSave);
            objOutput.writeObject(balance);

            fOutput.close();
            objOutput.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }catch(IOException e){
            System.out.println("Error initializing stream");
        }
    }

    public static List<Car> readCarListFromFile() {

        List<Car> loadedCarList = new ArrayList<>();
        try {
            FileInputStream fInput = new FileInputStream(new File("SavedData.txt"));
            ObjectInputStream objInput = new ObjectInputStream(fInput);

            loadedCarList.addAll((ArrayList<Car>) objInput.readObject());
            fInput.close();
            objInput.close();

            return loadedCarList;

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return loadedCarList;
        } catch (IOException e) {
            System.out.println("Error initializing stream");
            return loadedCarList;
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
            return loadedCarList;
        }
    }

    public static List<AccountHistoryObject> loadHistoryStateAfterStart(){

        List<AccountHistoryObject> loadedHistory = new ArrayList<>();
        try {
            FileInputStream fInput = new FileInputStream(new File("SavedData.txt"));
            ObjectInputStream objInput = new ObjectInputStream(fInput);

            loadedHistory = (List<AccountHistoryObject>) objInput.readObject();
            fInput.close();
            objInput.close();

            return loadedHistory;

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return loadedHistory;
        } catch (IOException e) {
            System.out.println("Error initializing stream");
            return loadedHistory;
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
            return loadedHistory;
        }
    }
    public static BigDecimal loadBalanceStateAfterStart(){
        BigDecimal loadedBalance =  new BigDecimal("0");
        try {
            FileInputStream fInput = new FileInputStream(new File("SavedData.txt"));
            ObjectInputStream objInput = new ObjectInputStream(fInput);

            loadedBalance = (BigDecimal) objInput.readObject();
            fInput.close();
            objInput.close();

            return loadedBalance;

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return loadedBalance;
        } catch (IOException e) {
            System.out.println("Error initializing stream");
            return loadedBalance;
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
            return loadedBalance;
        }

    }


    }

