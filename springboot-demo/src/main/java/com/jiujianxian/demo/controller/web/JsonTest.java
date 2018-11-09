/**
 * 
 */
package com.jiujianxian.demo.controller.web;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.jiujianxian.demo.domain.User;

/**
 * @author (︶︹︺)
 *
 */
public class JsonTest {
	public static Integer ageInteger;
	public static final int ENDNUM = Integer.MAX_VALUE+3;
	public static final int STARTNUM = ENDNUM -2;
	public static void main(String[] args) {
//		User user = new User();
//		user.setAge("12");
//		user.setName("join");
//		user.setId(1001);
//		user.setSex(false);
//		changeUser(user);
//		System.out.println(user.toString());
//		
//		 ageInteger = 12;
//		changeAge(ageInteger);
//		System.out.println(ageInteger);
//		
//		String[] array=new String[]{"lisi","xiaoliu","zhangsan","wangwu"};
//		List<String> list = Arrays.asList(array);
//		for (String string : list) {
//			System.out.println(string);
//		}
////		list.add("zhangliu");
//		System.out.println(list.size());
//		
//		List<String> arrlistList = new ArrayList<String>();
//		arrlistList.add("001");
//		arrlistList.add("002");
//		arrlistList.add("003");
//		arrlistList.add("004");
//		String removeNumString = "005";
//		for (String num : arrlistList) {
//			if (removeNumString.equals(num)) {
//				arrlistList.remove("004");
//			}
//		}
//		
//		String path ="D:/home/wasadmin/file";
//		new File(path).mkdir();
//		String pathname = "D:/homes/wasadmin/file";
//		new File(pathname).mkdirs();
//		
//		int count = 0;
//		for (int i = STARTNUM; i <= ENDNUM; i++) {
//			count++;
//			System.out.println(count);
//		}
		
		System.out.println(findRes());
		
	}

	/**
	 * @return
	 */
	@SuppressWarnings("finally")
	private static int findRes() {
		try {
			return 0;
		}catch (Exception e) {
			return 1;
		} finally {
			return 2;
		}
	}

	/**
	 * @param ageInteger
	 */
	private static Integer changeAge(Integer ageInteger) {
		return ageInteger +=1;
	}

	/**
	 * @param user
	 */
	private static void changeUser(User user) {
		user.setAge("22");
	}
}
