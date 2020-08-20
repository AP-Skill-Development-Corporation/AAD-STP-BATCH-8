package com.muneiah.studentslogwithroomdb;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = Students_entity.class,version = 1,exportSchema = false)
public abstract class StudentDataBase extends RoomDatabase {
    public abstract StudentDAO studentDAO();
}
