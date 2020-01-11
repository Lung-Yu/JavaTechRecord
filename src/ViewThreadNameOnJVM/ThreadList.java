package ViewThreadNameOnJVM;

import java.util.ArrayList;
import java.util.List;

public class ThreadList {

	private static ThreadGroup getRootThreadGroups() {
		ThreadGroup rootGroup = Thread.currentThread().getThreadGroup();
		
		while(rootGroup.getParent() != null)
			rootGroup = rootGroup.getParent();
		
		return rootGroup;
	}
	
	public static List<String> getThreads(ThreadGroup group){
		List<String> threaList = new ArrayList<String>();
		Thread[] threads = new Thread[group.activeCount()];
		int count = group.enumerate(threads,false);
		for(int i=0;i<count;i++) 
			threaList.add(group.getName() + " °õ¦æÄò²Õ : " + threads[i].getName()); 
		
		return threaList;
	}

	public static List<String> getThreadGroups(ThreadGroup group){
		List<String> threadList = getThreads(group);
		ThreadGroup[] groups = new ThreadGroup[group.activeGroupCount()];
		int count = group.enumerate(groups,false);
		for(int i=0;i<count;i++)
			threadList.addAll(getThreads(groups[i]));
		return threadList;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(String string : getThreadGroups(getRootThreadGroups()))
			System.out.println(string);
	}

}
