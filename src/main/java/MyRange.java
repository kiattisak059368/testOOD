public class MyRange {

    private final String input;

    public MyRange(String input){
        this.input = input;
    }
    public boolean isStartWithInclude() {
        return this.input.startsWith("[");
    }

    public int getStart() {
        if(isStartWithInclude()) {
            return Integer.parseInt(String.valueOf(this.input.charAt(1)));
        }
        return Integer.parseInt(String.valueOf(this.input.charAt(1))) + 1;
    }

    public int getEnd() {
        if(isEndWithInclude()) {
            return Integer.parseInt(String.valueOf(this.input.charAt(3)));
        }
        return Integer.parseInt(String.valueOf(this.input.charAt(3))) - 1;
    }

    public boolean isEndWithInclude() {
        return this.input.endsWith("]");
    }
}
