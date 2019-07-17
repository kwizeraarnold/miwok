package com.example.android.miwok;

public class Color {
    private String cDefaultTranslation;
    private String cMiwokTranslation;
    private  int cAudioResourceId;
    private int cImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    public Color(String DefaultTranslation, String MiwokTranslation, int AudioResourceId ){
        cDefaultTranslation = DefaultTranslation;
        cMiwokTranslation = MiwokTranslation;
        cAudioResourceId = AudioResourceId;
    }
    public Color(String cDefaultTranslation, String cMiwokTranslation, int cAudioResourceId,
                 int cImageResourceId){
        this.cDefaultTranslation = cDefaultTranslation;
        this.cMiwokTranslation = cMiwokTranslation;
        this.cAudioResourceId = cAudioResourceId;
        this.cImageResourceId = cImageResourceId;
    }
    public String getcDefaultTranslation(){return cDefaultTranslation;}
    public  String getcMiwokTranslation(){return cMiwokTranslation;}
    public int getcImageResourceId(){return  cImageResourceId;}
    public boolean HasImage(){return cImageResourceId != NO_IMAGE_PROVIDED;}
    public int getcAudioResourceId(){return cAudioResourceId;}
}
