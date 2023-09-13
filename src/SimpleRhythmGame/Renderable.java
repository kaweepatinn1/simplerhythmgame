package SimpleRhythmGame;

import java.awt.Image;

// Initialize and read and write class

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.imgscalr.Scalr;

// Use 1920/1080 for best performance.

public class Renderable {
	private String function;
	private String name;
    private String imagePath;
    private int x;
    private int y;
    private int xSize;
    private int ySize;
    private int opacity;
    private File file;
    private BufferedImage image;

    public Renderable(String function, String name, String imagePath, int x, int y,
    		int xSize, int ySize, int opacity) {
        this.function = function;
    	this.name = name;
    	this.imagePath = imagePath;
        this.x = x;
        this.y = y;
        this.xSize = xSize;
        this.ySize = ySize;
        this.opacity = opacity;
        this.file = new File(imagePath);
        try {
        	BufferedImage originalImage = ImageIO.read(file);
        	this.image = Scalr.resize(originalImage, Scalr.Method.QUALITY, Scalr.Mode.FIT_EXACT,
                    xSize, ySize, Scalr.OP_ANTIALIAS);
        } catch(IOException e){
        	this.image = null;
            System.out.println (e.toString());
            System.out.println("Could not find file: " + file);
        }
    }
    
    public Renderable(String name, String imagePath, int x, int y, 
    		int xSize, int ySize, int opacity) {
        this.function = null;
    	this.name = name;
    	this.imagePath = imagePath;
        this.x = x;
        this.y = y;
        this.xSize = xSize;
        this.ySize = ySize;
        this.opacity = opacity;
        this.file = new File(imagePath);
        try {
        	BufferedImage originalImage = ImageIO.read(file);
        	this.image = Scalr.resize(originalImage, Scalr.Method.QUALITY, Scalr.Mode.FIT_EXACT,
                    xSize, ySize, Scalr.OP_ANTIALIAS);
        } catch(IOException e){
        	this.image = null;
            System.out.println (e.toString());
            System.out.println("Could not find file: " + file);
        }
    }
    
    public void setFunction(String function) {
    	this.function = function;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public void setX(int x) {
        this.x =  x;
        try {
        	BufferedImage originalImage = ImageIO.read(file);
        	this.image = Scalr.resize(originalImage, Scalr.Method.QUALITY, Scalr.Mode.FIT_EXACT,
                    xSize, ySize, Scalr.OP_ANTIALIAS);
        } catch(IOException e){
        	this.image = null;
            System.out.println (e.toString());
            System.out.println("Could not find file: " + file);
        }
    }
    
    public void setY(int y) {
        this.y = y;
        try {
        	BufferedImage originalImage = ImageIO.read(file);
        	this.image = Scalr.resize(originalImage, Scalr.Method.QUALITY, Scalr.Mode.FIT_EXACT,
                    xSize, ySize, Scalr.OP_ANTIALIAS);
        } catch(IOException e){
        	this.image = null;
            System.out.println (e.toString());
            System.out.println("Could not find file: " + file);
        }
    }
    
    public void setXSize(int xSize) {
    	this.xSize = xSize;
    }
    
    public void setYSize(int ySize) {
    	this.ySize = ySize;
    }

    public void setOpacity(int opacity) {
        this.opacity = opacity;
    }
    
    public void setFile(File file) {
    	this.file = file;
    }
    
    public void setImage(BufferedImage image) {
    	try {
        	BufferedImage originalImage = ImageIO.read(file);
        	this.image = Scalr.resize(originalImage, Scalr.Method.QUALITY, Scalr.Mode.FIT_EXACT,
                    xSize, ySize, Scalr.OP_ANTIALIAS);
        } catch(IOException e){
        	this.image = null;
            System.out.println (e.toString());
            System.out.println("Could not find file: " + file);
        }
    }
    
    public String getFunction() {
    	return function;
    }
    
    public String getName() {
    	return name;
    }
    
    public String getImagePath() {
        return imagePath;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public int getXSize() {
    	return xSize;
    }
    
    public int getYSize() {
    	return ySize;
    }

    public int getOpacity() {
        return opacity;
    }
    
    public File getFile() {
    	return file;
    }
    
    public BufferedImage getImage() {
    	return image;
    }
}

//ADD RESIZE IMAGE:
//Default code (to be changed)
/*
 BufferedImage resizeImage(BufferedImage originalImage, int targetWidth, int targetHeight) throws IOException {
 Image resultingImage = originalImage.getScaledInstance(targetWidth, targetHeight, Image.SCALE_DEFAULT);
 BufferedImage outputImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB);
 outputImage.getGraphics().drawImage(resultingImage, 0, 0, null);
 return outputImage;
}*/
