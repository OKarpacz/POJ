package lab7;

public class Osoba {
    private String name;
    private String surname;
    private int yearOfBirth;

    public Osoba(String name, String surname, int yearOfBirth) throws Exception {
        sprawdzDaneOsoby(name, surname, yearOfBirth);

        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }

    private void sprawdzDaneOsoby(String name, String surname, int yearOfBirth) throws Exception {
        if(name.isEmpty()){
            throw new Exception("There is a problem with your name!");
        }
        if(surname.isEmpty()){
            throw new Exception("There is a problem with your surname!");
        }
        if(yearOfBirth < 1900 || yearOfBirth > 2020){
            throw new Exception("There is a problem with your year of birth!");
        }
    }

    public String toString() {
        return "Osoba{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
