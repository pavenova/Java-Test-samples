package test.main.stackoverflow.enums;

public enum SPGenderEnum {
	   MALE("Male"),
       FEMALE("Female");

       private SPGenderEnum(final String type) {
           this.type = type;
       }

       private final String type;

       public String getType() {return type;}

       @Override
       public String toString() {
           return type;
       }
}
