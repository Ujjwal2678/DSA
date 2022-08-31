package testr;

public class Cuboid {
	int width;
	int height;
	int depth;
	
     Cuboid(int w,int h ,int d) {
		width=w;
		height=h;
		depth=d;
	}
  	 Cuboid (int w,int h ) {
    	width=w;
		height=h;
		depth=10;
    }
    Cuboid (int dimension ) {
		width=dimension;
		height=dimension;
		depth=dimension;		
    }
    Cuboid() {
    	width=height=depth=10;
    }
    int volume() {
    	return width*height*depth;
    }
    
    public static void main(String args[]) {
    	int volume;
    	Cuboid stdCuboid=new Cuboid(10,20,15);
    	volume=stdCuboid.volume();
    	System.out.println("The Volume of the cuboid is :"+volume);
    	Cuboid cube=new Cuboid(20);
    	volume=cube.volume();
    	System.out.println("The Volume of the cube is :"+volume); 	
    }

}
