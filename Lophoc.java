/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author nhatm
 */
public class Lophoc {

    /**
     * @param args the command line arguments
     */
    public class Student{
        public String stID;
        public String stName;
        public String stClass;
        
    Student Student =new Student();
    public String getStID(String stID){
        return stID;
    }
    public String getStName(String stName){
        return stName;
    }
    public String getStClas(String stClass){
        return stClass;
    }
    public void setStID(String id){
        this.stID=id;
    }
    public void setStName(String name){
        this.stName=name;
    }
    public void setStClass(String lop)
    {
        this.stClass=lop;
    }
    public String toString(String toString){
        return toString;
    }
    public void Student(String stID,String stName,String stClass)
    {
        Student.setStClass(stClass);
        Student.setStID(stID);
        Student.setStName(stName);
        Student.getStName(stName);
        Student.getStID(stID);
        Student.getStClas(stClass);
    }
    }
public class Book{
    String boCode;
    String boTitle;
    String boAuthor;
    Book Book =new Book();
    public String getBocode(String boCode)
    {
        return boCode;
    }
    public String getBotitle(String boTitle)
    {
        return boTitle;
    }
    public String getBoAuthor(String boAuthor)
    {
        return boAuthor;
    }
    public void setBoCode(String Code)
    {
        this.boCode=Code;
    }
    public void setBotitle(String Title)
    {
        this.boTitle=Title;
    }
    public void setBoAuthor(String Author)
    {
        this.boAuthor=Author;
    }
    public String toString(String to)
    {
        return to;
    }
    public void Book(String boCode, String boTitle ,String boAuthor)
    {
        Book.setBoAuthor(boAuthor);
        Book.setBotitle(boTitle);
        Book.setBoCode(boCode);
        Book.getBoAuthor(boAuthor);
        Book.getBocode(boCode);
        Book.getBotitle(boTitle);
    }
}        
public class LibraryCard
{
    long ibCode;
    String owner;
    int borrowCount;
    LibraryCard librarycard=new LibraryCard();
    public long getLBCode(long ibCode)
    {
        return ibCode;
    }
    public String getOwner(String owner)
    {
        return owner;
    }
    public int getBorrow(int borrowCount)
    {
        return borrowCount;
    }
    public void setLbCode(long code)
    {
        this.ibCode=code;
    }
    public void setOwner(String owner)
    {
        this.owner=owner;
    }
    public void checkout(int num)
    {
        this.borrowCount=num;
    }
    public String toString(String to)
    {
        return to;
    }
    public void LibraryCard(long ibCode,String owner,int borrowCount)
    {
        librarycard.setLbCode(ibCode);
        librarycard.setOwner(owner);
        librarycard.checkout(borrowCount);
        librarycard.getLBCode(ibCode);
        librarycard.getOwner(owner);
        librarycard.getBorrow(borrowCount);
    }
}

}
