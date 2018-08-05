package com.example.android.pets.pets;

import android.net.Uri;
import android.provider.BaseColumns;

//Class is final because it's just a class to providing constants and there no need to import or extend
public final class PetContract {
    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private PetContract() {}
    // we set this up as a string constant whose value is the same as that from the AndroidManifest
    public static final String CONTENT_AUTHORITY = "com.example.android.pets";
    //we concatenate the CONTENT_AUTHORITY constant with the scheme “content://” we will create the BASE_CONTENT_URI which will be shared by every URI associated with PetContract:
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    //This constants stores the path for each of the tables which will be appended to the base content URI.
    public static final String PATH_PETS = "pets";


    public static abstract class PetEntry implements BaseColumns {
        public static final String TABLE_NAME = "pets";
        public static final String _ID = BaseColumns._ID;
        public final static String COLUMN_PET_NAME = "name";
        public final static String COLUMN_PET_BREED = "breed";
        public final static String COLUMN_PET_GENDER = "gender";
        public final static String COLUMN_PET_WEIGHT = "weight";
        //inside each of the Entry classes in the contract, we create a full URI for the class as a constant called CONTENT_URI.
        // The Uri.withAppendedPath() method appends the BASE_CONTENT_URI (which contains the scheme and the content authority) to the path segment.
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PETS);

        // Possible values

        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
        public static final int GENDER_UNKNOWN = 0;
    }
}
