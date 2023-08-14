package records;

public record MyRecords(int age, String name) {

    public static final String DEFAULT_NAME = "rokib ru cse";

//    public String instance_variable_is_not_allowed_in_record = "rokib ru cse";

    // record cannot extends any other clsss.
    // all java records implicitly extends Record class,
    // record can implement interface
    // record are implicitly final , no other can extends it

    public MyRecords{
        //this is compact constructor specially in record.
    }
    public String nameInUpperCase() {
        return name.toUpperCase();
    }

    public static String getDefaultName() {
        return DEFAULT_NAME.toUpperCase();
    }
}
