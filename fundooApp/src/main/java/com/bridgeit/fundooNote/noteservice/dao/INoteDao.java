package com.bridgeit.fundooNote.noteservice.dao;

import java.util.List;

import com.bridgeit.fundooNote.noteservice.model.Note;
import com.bridgeit.fundooNote.noteservice.model.UrlData;
import com.bridgeit.fundooNote.userservice.model.User;


public interface INoteDao {
	
	public long addNote(Note note,User user);
	User getUserById(int userId);
	public void deleteNode(int id);
	public void updateNode(Note notes);
	public Note getNoteById(int i);
	public List<Note> displayAllNoteOfUser(User user);
	public boolean isNotewiththatIdExist(int getId);
	public void deleteTrashedNote();
	public void updateUrlData(UrlData urlinfo);
	public UrlData getByUrlId(int id);
	public boolean deleteUrl(int id);
	
	
}
