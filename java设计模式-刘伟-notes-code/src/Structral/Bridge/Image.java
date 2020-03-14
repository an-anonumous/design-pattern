package Structral.Bridge;

public abstract class Image {

    protected ImageImp imageImp;
    protected String fileName;

    public Image(ImageImp imageImp, String fileName) {
        this.imageImp = imageImp;
        this.fileName = fileName;
    }

    public Image() {
    }

    public ImageImp getImageImp() {
        return imageImp;
    }

    public void setImageImp(ImageImp imageImp) {
        this.imageImp = imageImp;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public abstract void parseAndShowImage();

}
