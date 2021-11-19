package com.company;

 class AppRunner {

    public static void main(String[] args)
    {
        ManageFiles manageFiles= new ManageFiles();
        manageFiles.fileCreate();
        manageFiles.fileWrite();
        manageFiles.fileRead();
        manageFiles.count();
    }
}
