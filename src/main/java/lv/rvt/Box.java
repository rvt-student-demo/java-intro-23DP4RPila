package lv.rvt;

class Box {
    public double width;
    public double height;
    public double length;
    public double side;
    public double volume;
    public double area;
    public double faceArea;
    public double topArea;
    public double sideArea;
    
    Box (double width, double height, double length) {
        
    }
    
    Box (double side) {
        
    }
    
    public double faceArea(double faceArea) {
        this.faceArea = faceArea;
        return faceArea;
    }
    
    public double topArea(double topArea) {
        this.topArea = topArea;
        return topArea;
    }
    
    public double sideArea(double sideArea) {
        this.sideArea = sideArea;
        return sideArea;
    }
    
    public double volume(double volume) {
        this.volume = volume;
        return volume;
    }
    
    public double area(double area) {
        this.area = area;
        return area;
    }
    
}


