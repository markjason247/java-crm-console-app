public class Lead {
        String custName;
        String custEmail;
        String custStatus;
    
    public Lead(String name, String email, String status) {
       custName = name;
       custEmail = email;
       custStatus = status;
    }
     @Override
    public String toString() {
        return "name='" + custName + "', email='" + custEmail + "', status='" + custStatus + "'";
    }
}