package com.DataPatchApp.files;

public class GenericData<T> {

	private T content;
	 
    // Constructor
 
    public GenericData(T content) {
 
        this.content = content;
 
    }
 
    public T getContent() {
 
        return content;
 
    }
 
    public void setContent(T content) {
 
        this.content = content;
 
    }
 
    public String toString() {
 
        return content + " (" + content.getClass() + ")";
 
    }
    

}
