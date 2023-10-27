package uk.ac.ucl.model;

import org.apache.tomcat.jni.Global;

import javax.imageio.IIOException;
import java.io.*;
import java.util.*;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;


public class Model {
  // The example code in this class should be replaced by your Model class code.
  // The data should be stored in a suitable data structure.
  public List<Patient> PatientKey = new ArrayList<>();
  public List<String> PatientName = new ArrayList<String>();
  public List<String> PatientWholeName = new ArrayList<String>();
  public List<String> PatientDetails = new ArrayList<String>();
  public List<String> Title = new ArrayList<String>();
  public String[] title;
  public String[] value;

  public class Patient{
    private String name;
    private String id;
    private String drivers;
    private String ssn;
    private String passport;
    public Patient(String name, String id, String drivers, String ssn, String passport) {
      this.name = name;
      this.id = id;
      this.drivers = drivers;
      this.ssn = ssn;
      this.passport = passport;
    }
    public String getName() {
      return name;
    }
    public String getId() {
      return id;
    }
    public String getDrivers() {
      return drivers;
    }
    public String getSsn() {
      return ssn;
    }
    public String getPassport() {
      return passport;
    }

  }




  public void readFile(File file) {
    // Read a data file and store the data in your data structure.
    String CSVfile = "data/patients.csv";
    String line;
    int a = 0;

    try {
      BufferedReader br = new BufferedReader(new FileReader(CSVfile));

      while ((line = br.readLine()) != null) {
        if (a == 0) {
          title = line.split(",");
          for (int i = 0; i < title.length; i++) {
            Title.add(title[i] + ":");
          }
          a += 1;
        }
        else {
          value = line.split(",");
          PatientName.add(value[1] + " " + value[2]);
          PatientKey.add((new Patient(PatientName.get(a-1), value[3], value[4], value[5], value[6])));
          PatientWholeName.add(value[0] + " " + value[1] + " " + value[2]);
          PatientDetails.add(Title.get(3) + " " + value[3] + "  " + Title.get(4) + " " + value[4]
                  + "  " + Title.get(5) + " " + value[5] + "  " + Title.get(6) + " " + value[6]
                  + "  " + Title.get(7) + " " + value[7] + "  " + Title.get(8) + " " + value[8]
                  + "  " + Title.get(9) + " " + value[9] + "  " + Title.get(10) + " " + value[10]
                  + "  " + Title.get(11) + " " + value[11] + "  " + Title.get(12) + " " + value[12]
                  + "  " + Title.get(13) + " " + value[13] + "  " + Title.get(14) + " " + value[14]
                  + "  " + Title.get(15) + " " + value[15] + "  " + Title.get(16) + " " + value[16]
                  + "  " + Title.get(17) + " " + value[17] + "  " + Title.get(18) + " " + value[18]
                  + "  " + Title.get(19) + " " + value[19]);
          a += 1;
        }
      }
      br.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }




  public List<Integer> search_PatientName(String searchString) {
    Set<Integer> index = new HashSet<>();
    List<Integer> ResultIndex = new ArrayList<>();
    index.clear();
    ResultIndex.clear();
    for (int i = 0; i < PatientKey.size(); i++) {
      Patient details = PatientKey.get(i);

      if (details.getName().contains(searchString)) {
        index.add(i);
      }
    }
    ResultIndex.addAll(index);
    return ResultIndex;
  }

  public List<Integer> search_PatientDriver(String searchString) {
    Set<Integer> index = new HashSet<>();
    List<Integer> ResultIndex = new ArrayList<>();
    index.clear();
    ResultIndex.clear();
    for (int i = 0; i < PatientKey.size(); i++) {
      Patient details = PatientKey.get(i);

      if (details.getDrivers().contains(searchString)) {
        index.add(i);
      }
    }
    ResultIndex.addAll(index);
    return ResultIndex;
  }

  public List<Integer> search_PatientID(String searchString) {
    Set<Integer> index = new HashSet<>();
    List<Integer> ResultIndex = new ArrayList<>();
    index.clear();
    ResultIndex.clear();
    for (int i = 0; i < PatientKey.size(); i++) {
      Patient details = PatientKey.get(i);

      if (details.getId().contains(searchString)) {
        index.add(i);
      }
    }
    ResultIndex.addAll(index);
    return ResultIndex;
  }

  public List<Integer> search_PatientSsn(String searchString) {
    Set<Integer> index = new HashSet<>();
    List<Integer> ResultIndex = new ArrayList<>();
    index.clear();
    ResultIndex.clear();
    for (int i = 0; i < PatientKey.size(); i++) {
      Patient details = PatientKey.get(i);

      if (details.getSsn().contains(searchString)) {
        index.add(i);
      }
    }
    ResultIndex.addAll(index);
    return ResultIndex;
  }

  public List<Integer> search_PatientPassport(String searchString) {
    Set<Integer> index = new HashSet<>();
    List<Integer> ResultIndex = new ArrayList<>();
    index.clear();
    ResultIndex.clear();
    for (int i = 0; i < PatientKey.size(); i++) {
      Patient details = PatientKey.get(i);

      if (details.getPassport().contains(searchString)) {
        index.add(i);
      }
    }
    ResultIndex.addAll(index);
    return ResultIndex;
  }



  public List<String> Result(List<Integer> index){
    List<String> Result = new ArrayList<>();
    for(int i = 0; i < index.size(); i++ ){
      Integer a = index.get(i);
      Result.add(PatientName.get(a));
    }
    return Result;
  }


  public void addPatient(List<String> newPatientInfo){
    String newPatientWholeName =  newPatientInfo.get(0) + " " + newPatientInfo.get(1)+ " " + newPatientInfo.get(2);
    String newPatientName = newPatientInfo.get(1)+ " " + newPatientInfo.get(2);
    String newPatientDetails = Title.get(3) + " " + newPatientInfo.get(3) + "  "
            +Title.get(4) + " " + newPatientInfo.get(4) + "  "
            +Title.get(5) + " " + newPatientInfo.get(5) + "  "
            +Title.get(6) + " " + newPatientInfo.get(6) + "  "
            +Title.get(7) + " " + newPatientInfo.get(7) ;

    PatientKey.add((new Patient(newPatientName, newPatientInfo.get(3), newPatientInfo.get(4), newPatientInfo.get(5), newPatientInfo.get(6))));
    PatientName.add(newPatientName);
    PatientWholeName.add(newPatientWholeName);
    PatientDetails.add(newPatientDetails);
  }

  public void deletePatient(Integer index){
    PatientKey.remove(0);
    PatientName.remove(0);
    PatientWholeName.remove(0);
    PatientDetails.remove(0);
  }

  public void edit(Integer index, String content){
    String newContent = content;
    PatientDetails.set(index, newContent);
  }

  public List<String> getPatientNames () {
    return PatientName;
  }

  public List<String> getPatientWholeNames () {
    return PatientWholeName;
  }

  public List<String> getPatientDetails () {
    return PatientDetails;
  }

}