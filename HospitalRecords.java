class Patient {
    private String name;
    private int age;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getTreatmentPlan() {
        System.out.println("Treatment plan for patient.");
    }
}

class InPatient extends Patient {
    private int roomNumber;

    public InPatient(String name, int age, int roomNumber) {
        super(name, age);
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public void getTreatmentPlan() {
        System.out.println("In-Patient Treatment Plan for " + getName() + ":");
        System.out.println("Age: " + getAge());
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Admitted to hospital. 24/7 monitoring and treatment.\n");
    }
}

class OutPatient extends Patient {
    private String appointmentDate;

    public OutPatient(String name, int age, String appointmentDate) {
        super(name, age);
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    @Override
    public void getTreatmentPlan() {
        System.out.println("Out-Patient Treatment Plan for " + getName() + ":");
        System.out.println("Age: " + getAge());
        System.out.println("Appointment Date: " + appointmentDate);
        System.out.println("Consultation with doctor and follow-up treatment.\n");
    }
}

public class HospitalRecords {
    public static void main(String[] args) {
        Patient[] patients = new Patient[4];

        patients[0] = new InPatient("Sita Rai", 45, 101);
        patients[1] = new OutPatient("Ram Thapa", 30, "2082-02-9");
        patients[2] = new InPatient("Maya Gurung", 60, 203);
        patients[3] = new OutPatient("Bikash KC", 27, "2082-02-5");

        for (Patient p : patients) {
            p.getTreatmentPlan();
        }
    }
}

