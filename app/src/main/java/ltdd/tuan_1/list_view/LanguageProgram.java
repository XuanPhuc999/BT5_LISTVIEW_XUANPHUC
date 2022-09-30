package ltdd.tuan_1.list_view;

public class LanguageProgram {
    private String nameLanguage;
    private String descrep;
    private int image;

    public LanguageProgram(String nameLanguage, String descrep, int image) {
        this.nameLanguage = nameLanguage;
        this.descrep = descrep;
        this.image = image;
    }

    public String getNameLanguage() {
        return nameLanguage;
    }

    public void setNameLanguage(String nameLanguage) {
        this.nameLanguage = nameLanguage;
    }

    public String getDescrep() {
        return descrep;
    }

    public void setDescrep(String descrep) {
        this.descrep = descrep;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
