import javax.persistence.*;

@Entity
@Table(name = "STUDENTS")
public class Student {
        private Integer id;
        private String fullname;
        private String email;
        private String password;
        private String country;

    @Column(name = "USER_ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getFullname() {
            return fullname;
        }

        public void setFullname(String fullname) {
            this.fullname = fullname;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != null ? !id.equals(student.id) : student.id != null) return false;
        if (fullname != null ? !fullname.equals(student.fullname) : student.fullname != null) return false;
        if (email != null ? !email.equals(student.email) : student.email != null) return false;
        if (password != null ? !password.equals(student.password) : student.password != null) return false;
        return country != null ? country.equals(student.country) : student.country == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (fullname != null ? fullname.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        return result;
    }
}
