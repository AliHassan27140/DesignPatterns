package Prototype.selfExample;

import java.io.File;
import java.io.Serializable;
import java.lang.Object;

import org.apache.commons.lang3.SerializationUtils;

public class RarArchiver implements Archiver, Serializable {

	@Override
	public void archive(File directory) {
		System.out.println("Rar archiver");
	}
	
	@Override
	public Archiver clone() {
		return (Archiver) SerializationUtils.clone(this);
	}

}
