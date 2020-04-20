class Grass{
    private String format;
    public String get_format(){
        return this.format;
    }
    public void setFormat(String grass_format){
        grass_format = format;
        System.out.println(grass_format);
    }
    public static void main (String [] arg) {
        Grass grass = new Grass ();
        grass.setFormat("Hello bright sides");

    }
}