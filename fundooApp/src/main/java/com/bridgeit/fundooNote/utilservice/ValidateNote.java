package com.bridgeit.fundooNote.utilservice;

import com.bridgeit.fundooNote.noteservice.model.Note;

public class ValidateNote {

	public static boolean validateNote(Note note)
	{
		if(note.getTitle()==null || note.getTitle().trim()==" " ) {
			//if(note.getColor()==null || note.getCreatedAt()==null ) {
				if(note.getDescription()==null || note.getDescription().trim()==" ") {
					
						return false;
				}
			}
		return true;
		
	}
}
