package hello.Models;



public class Usuario {

    public String id;

    public String firstName;
    public String lastName;
    public String rol ;

    public Usuario() {}

    public String getRol() {
        return rol;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Usuario(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "{id:%s, firstName:'%s', lastName:'%s'}", id, firstName, lastName);
    }

}
