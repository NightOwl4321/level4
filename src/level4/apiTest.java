package level4;

import java.io.File;

public class apiTest {
	public static final void main(String [] args) throws Exception {
		File file = new File("../level4/qazwsxedcrfvtgbyhnujmik");
		System.out.println("isDirectory(): " + file.isDirectory());
		System.out.println("isFile(): " + file.isFile());
		System.out.println("canExecute(): " + file.canExecute());
		System.out.println("canRead(): " + file.canRead());
		System.out.println("canWrite(): " + file.canWrite());
		System.out.println("getAbsolutePath(): " + file.getAbsolutePath());
		System.out.println("getCanonicalPath(): " + file.getCanonicalPath());
		System.out.println("exists(): " + file.exists());
		System.out.println("getParent(): " + file.getParent());
		System.out.println("getPath(): " + file.getPath());
		System.out.println("getName(): " + file.getName());
		System.out.println("getFreeSpace(): " + file.getFreeSpace());
		System.out.println("getTotalSpace(): " + file.getTotalSpace());
		System.out.println("getUsableSpace(): " + file.getUsableSpace());
		System.out.println("isAbsolute(): " + file.isAbsolute());
		System.out.println("length(): " + file.length());
		System.out.println("toString(): " + file.toString());
		System.out.println("list(): ");
/*
		for (String fileName : file.list()) {
			System.out.println("filename: " + fileName);
		}
*/		
		System.out.println("listFiles(): ");
/*
		for (File fileName : file.listFiles()) {
			System.out.println("filename: " + fileName.toString());
		}
//*/		
//		System.out.println("listRoots(): ");
//		for (File fileName : File.listRoots()) {
//			System.out.println("filename: " + fileName.toString());
//		}
//		System.out.println("mkdir(): " + file.mkdir());
//		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
//		
//		System.out.println("lastModified(): " + sdf.format(file.lastModified()));
//		
//		file = new File("c:/users/mp99899/workspace/TestFileAPI");
//		System.out.println("isDirectory(): " + file.isDirectory());
//		System.out.println("isFile(): " + file.isFile());
//		System.out.println("canExecute(): " + file.canExecute());
//		System.out.println("canRead(): " + file.canRead());
//		System.out.println("canWrite(): " + file.canWrite());
//		System.out.println("getAbsolutePath(): " + file.getAbsolutePath());
//		System.out.println("getCanonicalPath(): " + file.getCanonicalPath());
//		System.out.println("exists(): " + file.exists());
//		System.out.println("getParent(): " + file.getParent());
//		System.out.println("getPath(): " + file.getPath());
//		System.out.println("getName(): " + file.getName());
//		System.out.println("getFreeSpace(): " + file.getFreeSpace());
//		System.out.println("getTotalSpace(): " + file.getTotalSpace());
//		System.out.println("getUsableSpace(): " + file.getUsableSpace());
//		System.out.println("isAbsolute(): " + file.isAbsolute());
//		System.out.println("length(): " + file.length());
//		System.out.println("toString(): " + file.toString());
//		System.out.println("list(): ");
//		for (String fileName : file.list()) {
//			System.out.println("filename: " + fileName);
//		}
//		System.out.println("listFiles(): ");
//		for (File fileName : file.listFiles()) {
//			System.out.println("filename: " + fileName.toString());
//		}
//		

		
		
	}


}
