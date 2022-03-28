package Lockers.pvt;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Options {
	public static void main(String[] args) throws IOException {
		String path="D:\\Lockers\\";
		Scanner sc=new Scanner(System.in);
		ArrayList<String> filesin=new ArrayList<>();
		
		while(true) {
			//Options
			System.out.println("enter your choice 1.Add file 2.Delete file 3.Search file 4.display main menu 5.exit");
			int choice=sc.nextInt();
			
			switch(choice) {
			//Adding a file
			case 1:System.out.println("enter the file name to Add");
			String filename=sc.next();
			String finalfile=path+filename;
			File f=new File(finalfile);	
			boolean res=f.createNewFile();
			if(res==false) {
				System.out.println("file not created");
			}
			else {
				filesin.add(filename);
				System.out.println("file is created");
			}
			System.out.println(filesin);

			break;
			//deleting a file
			case 2:System.out.println("Enter file name for deletion");
			String todel=sc.next();
			String files=path+todel;
			File fi=new File(files);
			fi.delete();
			break;
			//Search for a file
			case 3:File fit=new File(path);
			System.out.println("enter the file name");
			String filesearch=sc.next();
			File filen[]=fit.listFiles();
			int flag=0;
			for(File ff:filen) {
				if(ff.getName().equals(filesearch)) {
					flag=1;
					break;
				}
				else {
					flag=0;
				}
			}
			if(flag==1) {
				System.out.println("file is found");
			}
			else {
				System.out.println("file is not found");
			}
			break;

			//Navigate to main menu
			case 4:File fo=new File(path);
			File p[]=fo.listFiles();
			for(File ff:p) {
				String s=ff+"";
				String q[]=s.split("\\\\");
				System.out.println(q[q.length-1]);
			}
			break;
			//exit
			case 5:System.exit(0);
			break;
			
			default:System.out.println("check with the option and retry");
			break;
			}
		}
		
		
	}
	}

