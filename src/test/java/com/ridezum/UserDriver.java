package com.ridezum;

public class UserDriver {

        private String firstName;
        private String lastName;
        private  String email;
        private String phone;
        private String zipcode;
        private String refcode;

        public UserDriver(){
            firstName = "Ivan";
            lastName = "Petrov";
            email = "my@gmail.com";
            phone = "(444) 333-2222";
            zipcode = "95000";
            refcode = "6565";

        }

        public String getEmail() {
            return email;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getPhone(){ return phone; }

        public String getZipcode() {
            return zipcode;
        }

        public  String getRefcode(){ return refcode; }

    }
