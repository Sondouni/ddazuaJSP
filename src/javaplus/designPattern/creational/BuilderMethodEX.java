package javaplus.designPattern.creational;

public class BuilderMethodEX {
    public static void main(String[] args) {
        Rect1 rect = new Rect1.Builder(200,100) //asdads
                .margin(5)
                .padding(10)
                .build();

        rect = new Rect1.Builder(111,111) //aaaaaa
                .margin(123)
                .build();
    }
}
class Rect1{
    private final int width;
    private final int height;
    private final int margin;
    private final int padding;

    public static class Builder{
        private final int width;
        private final int height;
        private int margin;
        private int padding;

        public Builder(int width,int height){
            this.width = width;
            this.height = height;
        }

        public Builder margin(int margin){
            this.margin = margin;
            return this;
        }
        public Builder padding(int padding){
            this.padding = padding;
            return this;
        }
        public Rect1 build(){
            return new Rect1(this);
        }

    }
    public Rect1(Builder builder){
        width = builder.width;
        height = builder.height;
        margin = builder.margin;
        padding = builder.padding;
    }
}
