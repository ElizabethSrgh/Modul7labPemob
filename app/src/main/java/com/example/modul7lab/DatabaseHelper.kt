package com.example.modul7lab

class DatabaseHelper(context: Context) : SqLiteOpenHelper(context, DATABASE_NAME, factory null, DATABASE_VERSION) {
    companion object {
        private const val DATABASE_NAME = "dbhomework"
        private const val DATABASE_VERSION = 1
        private const val SQL_CREATE_TABLE_NOTE = "CREATE TABLE $TABLE_NAME"
        " (${HomeworkColums._ID} INTEGER PRIMARY KEY AUTOINCREMENT,"
        " ${HomeworkColumns.TITLE} TEXT NOT NULL,"
        "${HomeworkColumns.DESCRIPTION} TEXT NOT NULL"
        "${HomeworkColumns.DATE} TEXT NOT NULL"

    }

    override fun onCreate(db: SQLiteDatabase){
        db.execSQL(SQL_CREATE_TABLE_NOTE)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: INt) {
        db.execSQL( sql: "DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    }
}