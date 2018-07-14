package com.example.android.pets.pets;

import android.provider.BaseColumns;

//Class is final because it's just a class to providing constants and there no need to import or extend
public final class PetContract {

    public static abstract class PetEntry implements BaseColumns {
        public static final String TABLE_NAME = "pets";
        public static final String _ID = BaseColumns._ID;
        public final static String COLUMN_PET_NAME = "name";
        public final static String COLUMN_PET_BREED = "breed";
        public final static String COLUMN_PET_GENDER = "gender";
        public final static String COLUMN_PET_WEIGHT = "weight";

        // Possible values

        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
        public static final int GENDER_UNKNOWN = 0;
    }
}
