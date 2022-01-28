public class User {
    public String publicName;
    protected String protectedcName;
    private String privatecName;
    String defaultName;

    public void testModifier(){
        System.out.println(publicName);
        System.out.println(protectedcName);
        System.out.println(privatecName);
        System.out.println(defaultName);
    }

}
